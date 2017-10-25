package entity.animal;

import behavior.animal.AnimalBehavior;
import entity.Entity;

public abstract class Animal extends Entity implements AnimalBehavior {

    protected Animal() {
        super();
    }
}
