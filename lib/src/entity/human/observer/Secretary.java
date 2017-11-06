package entity.human.observer;

import behavior.observe.Subscriber;
import entity.human.Human;


public class Secretary extends Human implements Subscriber {
    public Secretary(String name, boolean gender) {
        super(name, gender);
    }

    public Secretary(String name, boolean gender, double age) {
        super(name, gender, age);
    }

    @Override
    public void performAction() {
        print("Copy That! I am On It: " + getName());

    }

}
