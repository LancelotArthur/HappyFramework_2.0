package entity.human.observer;

import behavior.human.Command;
import behavior.observe.Publisher;
import behavior.observe.Subscriber;
import entity.human.Human;

import java.util.ArrayList;
import java.util.Collection;

public class Manager extends Human implements Publisher {

    private Collection<Subscriber> subscribers = new ArrayList<>();

    public Manager(String name, boolean gender) {
        super(name, gender);
    }

    public Manager(String name, boolean gender, double age) {
        super(name, gender, age);
    }

    @Override
    public boolean registerSubscriber(Subscriber subscriber) {
        return subscribers.add(subscriber);
    }

    @Override
    public boolean deleteSubscriber(Subscriber subscriber) {
        return subscribers.remove(subscriber);
    }

    @Override
    public void notifyObserver(Command command) {
        for (Subscriber subscriber : subscribers) {
            ((Secretary) subscriber).setCommand(command).doCommand();
        }
    }
}
