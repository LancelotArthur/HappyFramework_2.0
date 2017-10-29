package entity.building.factory;

import entity.building.abstraction.Door;
import entity.building.template.DoorA;
import entity.building.template.DoorB;

public class DoorFactory extends AbstractFactory {

    private static DoorFactory instance = new DoorFactory();

    private DoorFactory() {
        super();
    }

    public static DoorFactory getInstance() {
        return instance;
    }

    public Door obtain() {
        if (RANDOM.nextBoolean()) {
            return new DoorA();
        } else {
            return new DoorB();
        }

    }
}
