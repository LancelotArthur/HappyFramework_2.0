package entity.animal;

import behavior.animal.AnimalBehavior;
import entity.Entity;
import entity.Product;
import entity.group.Group;

public abstract class Animal extends Entity implements AnimalBehavior {

    private boolean sex = true;
    private boolean pregnant = false;

    protected Animal() {
        super();
    }

    protected Animal(boolean sex) {
        super();
        this.sex = sex;
    }

    @Override
    public Group<Product> yield(int count) {
        return null;
    }

    public boolean isFemale() {
        return sex;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void makePregnant() {
        pregnant = true;
    }
}
