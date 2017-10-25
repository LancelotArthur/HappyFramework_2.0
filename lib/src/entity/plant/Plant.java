package entity.plant;


import behavior.plant.PlantBehavior;
import entity.Entity;


public abstract class Plant extends Entity implements PlantBehavior {
    protected PlantType plantType;

    protected Plant() {
        super();
    }

    public PlantType getPlantType() {
        return plantType;
    }

    abstract public Plant purchaseAgain();
}



