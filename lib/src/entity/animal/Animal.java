package entity.animal;

import behavior.animal.AnimalBehavior;
import entity.Entity;

public abstract class Animal extends Entity implements AnimalBehavior {
    protected AnimalType animalType;

    protected Animal() {
        super();
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    abstract public Animal purchaseAgain();
}
