package entity.creature.animal.template;

import entity.creature.Product;
import entity.creature.animal.Animal;
import entity.group.Group;

public class Cat extends Animal {

    public Cat(String name, boolean gender, double age) {
        super(name, gender, age);
    }

    public Cat(String name, boolean gender) {
        super(name, gender);
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    public Cat(boolean gender) {
        super(gender);
    }

    @Override
    public void speak() {
        print("Mew...Mew");
    }

    @Override
    public void move() {
        print("Without sound the cat slips away");
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
