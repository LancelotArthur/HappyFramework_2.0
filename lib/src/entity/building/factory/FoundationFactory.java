package entity.building.factory;

import entity.building.abstraction.Foundation;
import entity.building.template.FoundationA;
import entity.building.template.FoundationB;

/**
 * Foundation Factory
 * */
public class FoundationFactory extends PartFactory {

    private static FoundationFactory instance = new FoundationFactory();

    private FoundationFactory() {
        super();
    }

    static FoundationFactory getInstance() {
        return instance;
    }

    /**
     * @return a random foundation
     * */
    public Foundation obtain() {
        if (RANDOM.nextBoolean()) {
            return new FoundationA();
        } else {
            return new FoundationB();
        }
    }
}
