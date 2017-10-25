package entity.animal.template;

import entity.animal.Animal;


public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(boolean sex) {
        super(sex);
    }

    @Override
    public void speak() {
        print("Woof! Woof! Woof!");
    }

    @Override
    public void move() {
        print("Very fast.");
    }

}
