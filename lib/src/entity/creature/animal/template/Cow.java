package entity.creature.animal.template;

import entity.creature.Product;
import entity.creature.animal.Animal;
import entity.creature.animal.template.products.Milk;
import entity.group.Group;

public class Cow extends Animal {

    public Cow(String name, boolean gender, double age) {
        super(name, gender, age);
    }

    public Cow(String name, boolean gender) {
        super(name, gender);
    }

    public Cow(String name) {
        super(name);
    }

    public Cow() {
        super();
    }

    public Cow(boolean gender) {
        super(gender);
    }

    @Override
    public void speak() {
        print("Muh Muh");
    }

    @Override
    public void move() {
        print("Slowly");
    }


    @Override
    public Group<Product> yield(int count) {
        print("Producing");
        if (!this.isMale()) {
            return new Group<>(new Milk(), count);
        } else {
            return null;
        }
    }
}
