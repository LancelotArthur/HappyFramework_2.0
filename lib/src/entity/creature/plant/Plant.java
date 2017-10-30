package entity.creature.plant;


import behavior.creature.plant.PlantBehavior;
import entity.creature.Creature;


/**
 * The Abstract Plant Class
 * Base class for all plants
 * */
public abstract class Plant extends Creature implements PlantBehavior {
    protected Plant() {
        super();
    }
}



