package entity.creature.plant;

import entity.creature.Product;


/**
 * The Abstract Class Plant Product
 * Base class for all plant products
 * */
public class PlantProduct extends Product {

    private double price = 1.00;
    protected PlantProduct() {
        super();
    }

    public double getPrice() {
        return price;
    }
}
