package entity.creature.plant.template;

import entity.creature.Product;
import entity.creature.plant.Plant;
import entity.creature.plant.template.product.Apple;
import entity.group.Group;

public class AppleTree extends Plant {

    public AppleTree() {
        super();
    }

    @Override
    public void grow() {
        print("I am growing... I grew up");
    }


    @Override
    public Group<Product> yield(int count) {
        print("I have many apples now!");
        return new Group<>(new Apple(), count);

    }

}
