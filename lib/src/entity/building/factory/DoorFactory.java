package entity.building.factory;

import entity.building.abstraction.Door;
import entity.building.template.DoorA;
import entity.building.template.DoorB;

/**
 * Door Factory
 * */
public class DoorFactory extends PartFactory {

    private static DoorFactory instance = new DoorFactory();

    private DoorFactory() {
        super();
    }

    static DoorFactory getInstance() {
        return instance;
    }

    /**
     * @return a random door
     * */
    public Door obtain() {
        if (RANDOM.nextBoolean()) {
            return new DoorA();
        } else {
            return new DoorB();
        }

    }
}
