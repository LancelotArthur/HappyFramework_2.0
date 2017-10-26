package entity.animal.template;

import entity.Product;
import entity.animal.Animal;
import entity.animal.AnimalType;
import entity.group.Group;

public class Dog extends Animal {

    public Dog(String name, boolean sex, double life, boolean pregnant) {
        super(name, sex, life, pregnant);
    }

    public Dog(String name, boolean sex, double life) {
        super(name, sex, life);
    }

    public Dog(String name, boolean sex) {
        super(name, sex);
    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    @Override
    public void speak() {
        print("Wang! Wang! Wang!");
    }

    @Override
    public void move() {
        print("Very fast.");
    }

    @Override
    public Animal purchaseAgain() {
        return new Dog();
    }

    @Override
    public Group<Product> yield(int count) {
        if (!this.isMale()) {
            // TODO: return what?
            return null;
        } else {
          return null;
        }
    }
}
