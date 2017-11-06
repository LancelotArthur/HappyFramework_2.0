package entity.creature.plant.template;

import entity.creature.Product;
import entity.creature.plant.Plant;
import entity.creature.plant.template.product.Corn;
import entity.group.Group;

public class Crop extends Plant {

    public Crop() {
        super();
    }

    @Override
    public void grow() {
        print("Bathing in the sun.");
    }


    @Override
    public Group<Product> yield(int count) {
        print("Great Harvest This Year !");
        return new Group<>(new Corn(), count);

    }

}
