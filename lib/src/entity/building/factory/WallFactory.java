package entity.building.factory;

import entity.building.abstraction.Wall;
import entity.building.template.WallA;
import entity.building.template.WallB;

/**
 * Wall Factory
 * */
public class WallFactory extends PartFactory {

    private static WallFactory instance = new WallFactory();

    private WallFactory() {
        super();
    }

    static WallFactory getInstance() {
        return instance;
    }

    /**
     * @return a random wall
     * */
    public Wall obtain() {
        if (RANDOM.nextBoolean()) {
            return new WallA();
        } else {
            return new WallB();
        }
    }

}
