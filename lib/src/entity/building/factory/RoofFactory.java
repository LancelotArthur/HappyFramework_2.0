package entity.building.factory;


import entity.building.abstraction.Roof;
import entity.building.template.RoofA;
import entity.building.template.RoofB;

/**
 * Roof Factory
 * */
public class RoofFactory extends PartFactory {

    private static RoofFactory instance = new RoofFactory();

    private RoofFactory() {
        super();
    }

    static RoofFactory getInstance() {
        return instance;
    }

    /**
     * @return a random roof
     * */
    public Roof obtain() {
        if (RANDOM.nextBoolean()) {
            return new RoofA();
        } else {
            return new RoofB();
        }
    }
}
