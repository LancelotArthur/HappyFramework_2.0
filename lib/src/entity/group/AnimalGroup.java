package entity.group;

import behavior.creature.animal.AnimalBehavior;
import entity.creature.Product;
import entity.creature.animal.Animal;


/**
 * Concrete Animal Group, can perform Animal behavior
 *
 * @see Animal
 * @see Group
 * */
public class AnimalGroup<T extends Animal> extends Group<T> implements AnimalBehavior {
    public AnimalGroup(T t, int number) {
        super(t, number);
    }


    @Override
    public void speak() {
        print("" + count + " times echoed the voice: see next line");
        entity.speak();
    }

    @Override
    public void move() {
        print("" + count + " bodies are moving together: see next line");
        entity.move();
    }

    @Override
    public Group<Product> yield(int count) {
        Group<Product> products = entity.yield(count * this.count);
        if (products != null) {
            print("" + this.count + " bodies produced " + products.count + " good products！");
        }
        return products;
    }
}

