package entity.building.factory;

import entity.building.abstraction.Foundation;
import entity.building.template.FoundationA;
import entity.building.template.FoundationB;

public class FoundationFactory extends AbstractFactory {

    private static FoundationFactory instance = new FoundationFactory();

    private FoundationFactory() {
        super();
    }

    public static FoundationFactory getInstance() {
        return instance;
    }

    public Foundation obtain() {
        if (RANDOM.nextBoolean()) {
            return new FoundationA();
        } else {
            return new FoundationB();
        }
    }
}
