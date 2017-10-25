package entity.plant.template;

import entity.group.Group;
import entity.plant.Plant;
import entity.plant.PlantProduct;

public class AppleTree extends Plant {

    public AppleTree() {
        super();
    }

    @Override
    public void grow() {
        print("I am growing... I grew up");
    }


    @Override
    public Group<PlantProduct> yield(int count) {
        print("I have many apples now!");
        return new Group<>(new Apple(), count);

    }



}
