package entity.creature.animal.template;

import entity.Product;
import entity.creature.animal.Animal;
import entity.group.Group;

public class Chicken extends Animal {

    public Chicken(String name, boolean gender, double age) {
        super(name, gender, age);
    }

    public Chicken(String name, boolean gender) {
        super(name, gender);
    }

    public Chicken(String name) {
        super(name);
    }

    public Chicken() {
        super();
    }

    public Chicken(boolean gender) {
        super(gender);
    }

    @Override
    public void speak() {
        print("Crock, Crack, Crick");
    }

    @Override
    public void move() {
        print("Noisily");
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
