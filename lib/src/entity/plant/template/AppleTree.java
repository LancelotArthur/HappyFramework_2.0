package entity.plant.template;

import entity.Product;
import entity.group.Group;
import entity.plant.Plant;

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
