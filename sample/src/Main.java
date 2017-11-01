import allocator.Allocator;
import allocator.ObtainStrategy;
import application.Director;
import application.Printable;
import application.SceneLoader;
import entity.Prototype;
import entity.building.Builder;
import entity.creature.Product;
import entity.creature.animal.template.Chicken;
import entity.creature.animal.template.Cow;
import entity.creature.animal.template.Dog;
import entity.creature.animal.template.products.Egg;
import entity.creature.animal.template.products.Milk;
import entity.creature.plant.template.AppleTree;
import entity.creature.plant.template.Crop;
import entity.creature.state.health.Dead;
import entity.creature.state.health.Health;
import entity.creature.state.pregnancy.Pregnancy;
import entity.creature.state.pregnancy.Pregnant;
import entity.group.AnimalGroup;
import entity.group.Group;
import entity.group.PlantGroup;
import scene.Scene;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Double money = 50000.0;
        Director director = Director.getInstance();

        Allocator<Cow> cowAllocator = new Allocator<>(Cow.class);
        cowAllocator.setObtainArguments(ObtainStrategy.PURCHASE, new Object[]{"Name", false});
        int cowNum = 5, cowCost = 50;
        AnimalGroup<Cow> cowGroup = new AnimalGroup<>(cowAllocator.obtain(), cowNum);
        money -= cowNum * cowCost;
        director.print("Buy " + cowNum + " eggs for $" + cowCost);
        director.print("Money left: $" + money);

        Builder builder = Builder.getInstance();
        builder.build("Cow lair").enter();
        money -= 5000;
        director.print("Money left: $" + money);

        Allocator<Chicken> chickenAllocator = new Allocator<>(Chicken.class);
        chickenAllocator.setObtainArguments(ObtainStrategy.PURCHASE, new Object[]{"Name", false});
        AnimalGroup<Chicken> chickenGroup = new AnimalGroup<>(chickenAllocator.obtain(), 30);
        money -= 30 * 5;
        director.print("Money left: $" + money);

        Allocator<AppleTree> appleTreeAllocator = new Allocator<>(AppleTree.class);
        appleTreeAllocator.setObtainArguments(ObtainStrategy.PURCHASE);
        PlantGroup<AppleTree> appleTreeGroup = new PlantGroup<>(appleTreeAllocator.obtain(), 10);
        money -= 10 * 100;
        director.print("Money left: $" + money);

        Allocator<Crop> cropAllocator = new Allocator<>(Crop.class);
        cropAllocator.setObtainArguments(ObtainStrategy.PURCHASE);
        PlantGroup<Crop> cropGroup = new PlantGroup<>(cropAllocator.obtain(), 100);
        money -= 100 * 2;
        director.print("Money left: $" + money);

        builder.build("Chicken coop 1").enter();
        money -= 5000;
        director.print("Money left: $" + money);

        builder.build("Chicken coop 2").enter();
        money -= 5000;
        director.print("Money left: $" + money);

        builder.build("Crop field").enter();
        money -= 10000;
        director.print("Money left: $" + money);

        cowGroup.yield(new Random().nextInt(3) + 5);
        cropGroup.grow();
        appleTreeGroup.grow();

        appleTreeGroup.yield(new Random().nextInt(15) + 50);
        cropGroup.yield(new Random().nextInt(100) + 500);

        Collection<Chicken> chickenCollection = chickenGroup.getGroup(3);
        for (Chicken chicken: chickenCollection) {
            chicken.setHealth(Dead.getInstance());
        }

        Group<Product> eggGroup = chickenGroup.yield(5);
        chickenAllocator.setObtainArguments(ObtainStrategy.REPRODUCE, new Object[]{"Name", false});
        Chicken motherChicken = (Chicken) chickenCollection.toArray()[0];
        motherChicken.setPregnancy(Pregnant.getInstance());
        chickenAllocator.setMother(motherChicken);
        chickenAllocator.obtain();

        director.print("Sell eggs for: $" + money);
        money += eggGroup.getGroupSize() * 1;
        eggGroup = null;
        director.print("Money left: $" + money);

        builder.build("villa").enter();
        money -= 100000;

        if (money < 0) {
            director.print("You are broken!");
        }

    }

}
