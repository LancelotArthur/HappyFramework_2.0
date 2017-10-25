package entity.animal;

import behavior.animal.AnimalBehavior;
import entity.Entity;
import entity.Product;
import entity.group.Group;

public abstract class Animal extends Entity implements AnimalBehavior {

    private boolean sex;
    private boolean preg;

    protected Animal() {
        super();
    }

    @Override
    public Group<Product> yield(int count) {
        return null;
    }
}
