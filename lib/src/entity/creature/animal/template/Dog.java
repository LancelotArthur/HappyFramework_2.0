package entity.creature.animal.template;

import entity.Product;
import entity.creature.animal.Animal;
import entity.group.Group;

public class Dog extends Animal {

    public Dog(String name, boolean gender, double age) {
        super(name, gender, age);
    }

    public Dog(String name, boolean gender) {
        super(name, gender);
    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    public Dog(boolean gender) {
        super(gender);
    }

    @Override
    public void speak() {
        print("Woof! Woof! Woof!");
    }

    @Override
    public void move() {
        print("Very fast.");
    }


    @Override
    public Group<Product> yield(int count) {
        print("A dog does not produce any products");
        if (!this.isMale()) {
            // TODO: return what?
            return null;
        } else {
            return null;
        }
    }
}
