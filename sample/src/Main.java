import allocator.Allocator;
import allocator.ObtainStrategy;
import application.Printable;
import application.SceneLoader;
import entity.Prototype;
import entity.building.Builder;
import entity.creature.animal.template.Chicken;
import entity.creature.animal.template.Cow;
import entity.creature.animal.template.Dog;
import entity.creature.animal.template.products.Egg;
import entity.creature.animal.template.products.Milk;
import entity.creature.plant.template.AppleTree;
import entity.creature.plant.template.Crop;
import entity.creature.state.health.Dead;
import entity.creature.state.health.Health;
import entity.group.AnimalGroup;
import entity.group.Group;
import entity.group.PlantGroup;
import scene.Scene;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

//        Scene scene = SceneLoader.getInstance().load("Default_0.scene");
//        scene.addChild(Prototype.getInstance().getByPrototype("Cow"));
//        scene.addChild(Builder.getInstance().build("Field"));
//        SceneLoader.getInstance().save(scene,"hello");
//        scene = null;
//        scene = SceneLoader.getInstance().load("Default_0.scene");
//        scene.print("Description");

        Allocator<Cow> cowAllocator = new Allocator<>(Cow.class);
        cowAllocator.setObtainArguments(ObtainStrategy.PURCHASE, new Object[]{"Name", false});
        AnimalGroup<Cow> cowGroup = new AnimalGroup<>(cowAllocator.obtain(), 5);

        Builder.getInstance().build("Cow lair");

        Allocator<Chicken> chickenAllocator = new Allocator<>(Chicken.class);
        chickenAllocator.setObtainArguments(ObtainStrategy.PURCHASE, new Object[]{"Name", false});
        AnimalGroup<Chicken> chickenGroup = new AnimalGroup<>(chickenAllocator.obtain(), 30);

        Allocator<AppleTree> appleTreeAllocator = new Allocator<>(AppleTree.class);
        appleTreeAllocator.setObtainArguments(ObtainStrategy.PURCHASE);
        PlantGroup<AppleTree> appleTreeGroup = new PlantGroup<>(appleTreeAllocator.obtain(), 10);

        Allocator<Crop> cropAllocator = new Allocator<>(Crop.class);
        cropAllocator.setObtainArguments(ObtainStrategy.PURCHASE);
        PlantGroup<Crop> cropGroup = new PlantGroup<>(cropAllocator.obtain(), 100);

        Builder.getInstance().build("Chicken coop 1");
        Builder.getInstance().build("Chicken coop 2");
        Builder.getInstance().build("Crop field");

        cowGroup.yield(new Random().nextInt(3) + 5);
        cropGroup.grow();
        appleTreeGroup.grow();

        appleTreeGroup.yield(new Random().nextInt(15) + 50);
        cropGroup.yield(new Random().nextInt(100) + 500);

        Collection<Chicken>
        for (Chicken chicken: chickenGroup.getGroup(10)) {
            chicken.setHealth(new Dead());
        }

        chickenGroup.yield(5);
        chickenAllocator.setObtainArguments(ObtainStrategy.REPRODUCE, new Object[]{"Name", false});
        chickenAllocator.setMother((Chicken) chickenGroup.getGroup(1).toArray()[0]);
        chickenAllocator.obtain();

//        chickenGroup.getGroup().removeIf(chicken -> chicken.getHealth().equals(new Dead()));

    }

}
