package entity.creature.animal.template;

import entity.Product;
import entity.creature.animal.Animal;
import entity.group.Group;

public class Pig extends Animal {

    public Pig(String name, boolean gender, double age) {
        super(name, gender, age);
    }

    public Pig(String name, boolean gender) {
        super(name, gender);
    }

    public Pig(String name) {
        super(name);
    }

    public Pig() {
        super();
    }

    public Pig(boolean gender) {
        super(gender);
    }

    @Override
    public void speak() {
        print("Huh! Huh!");
    }

    @Override
    public void move() {
        print("Moving around looking around is the pig");
    }


    @Override
    public Group<Product> yield(int count) {
        print("Producing");
        if (!this.isMale()) {
            // TODO: return what?
            return null;
        } else {
            return null;
        }
    }
}
