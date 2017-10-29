package entity.building.factory;


import entity.building.abstraction.Roof;
import entity.building.template.RoofA;
import entity.building.template.RoofB;

public class RoofFactory extends AbstractFactory {

    private static RoofFactory instance = new RoofFactory();

    private RoofFactory() {
        super();
    }

    public static RoofFactory getInstance() {
        return instance;
    }

    public Roof obtain() {
        if (RANDOM.nextBoolean()) {
            return new RoofA();
        } else {
            return new RoofB();
        }
    }
}
