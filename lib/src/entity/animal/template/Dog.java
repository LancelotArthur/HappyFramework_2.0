package entity.animal.template;

import entity.animal.Animal;

public class Dog extends Animal {
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
}
