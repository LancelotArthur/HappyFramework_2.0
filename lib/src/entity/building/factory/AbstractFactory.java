package entity.building.factory;

import application.Printable;
import entity.building.abstraction.Part;

import java.util.Random;


public abstract class AbstractFactory implements Printable {
    static final Random RANDOM = new Random();

    public abstract Part obtain();
}
