package entity.animal.template;

import entity.Product;
import entity.animal.Animal;
import entity.group.Group;

public class Cow extends Animal {
    @Override
    public void move() {
        print("A walking cow seems relaxed");
    }

    @Override
    public void speak() {
        print("Mow----");
    }

    @Override
    public Group<Product> yield(int count) {
        print("The cow was milked, " + count + " units of milk were produced");
        return new Group<>(new Milk(), count);
    }
}
