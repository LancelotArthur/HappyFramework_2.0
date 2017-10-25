package entity.group;

import behavior.plant.PlantBehavior;
import entity.Product;
import entity.plant.Plant;



class PlantGroup<T extends Plant> extends Group<T> implements PlantBehavior {
    public PlantGroup(T t, int number) {
        super(t, number);
    }

    @Override
    public void grow() {
        print("" + count + " bodies grew together: see next line");
        entity.grow();
    }

    @Override
    public Group<Product> yield(int count) {
        Group<Product> products =  entity.yield(count * this.count);
        if (products != null){
            print("" + this.count + " products were produced: see next line");
        }
        return products;
    }
}