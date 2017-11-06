package entity.building.factory;

import application.Printable;
import entity.building.abstraction.Part;

import java.util.Random;


/**
 * The factory method to produce a particular part
 * */
public abstract class PartFactory implements Printable {
    static final Random RANDOM = new Random();

    /**
     * @return a part entity
     * */
    public abstract Part obtain();
}
