package entity.building.factory;

import entity.building.abstraction.Wall;
import entity.building.template.WallA;
import entity.building.template.WallB;

public class WallFactory extends AbstractFactory {

    private static WallFactory instance = new WallFactory();

    private WallFactory() {
        super();
    }

    public static WallFactory getInstance() {
        return instance;
    }

    public Wall obtain() {
        if (RANDOM.nextBoolean()) {
            return new WallA();
        } else {
            return new WallB();
        }
    }

}
