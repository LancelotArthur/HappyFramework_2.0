package entity.building;

import application.Printable;
import entity.building.abstraction.Location;
import entity.building.abstraction.PartType;
import entity.building.factory.*;


/**
 * Singleton
 * Builder class for building locations
 * */
public class Builder implements Printable {
    private static Builder instance = new Builder();

    private Builder() {

    }

    /**
     * Get instance
     * */
    public static Builder getInstance() {
        return instance;
    }

    /**
     * The Location Builder method, build a location based on partFactory
     * */
    public Location build(String name) {
        AbstractFactory abstractFactory = AbstractFactory.getInstance();
        RoofFactory roofFactory =
                (RoofFactory) abstractFactory.getFactory(PartType.ROOF);
        FoundationFactory foundationFactory =
                (FoundationFactory) abstractFactory.getFactory(PartType.FOUNDATION);
        WallFactory wallFactory =
                (WallFactory) abstractFactory.getFactory(PartType.WALL);
        DoorFactory doorFactory =
                (DoorFactory) abstractFactory.getFactory(PartType.DOOR);
        return new Location(
                name,
                foundationFactory.obtain(),
                wallFactory.obtain(),
                doorFactory.obtain(),
                roofFactory.obtain());
    }
}


