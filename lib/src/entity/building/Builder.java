package entity.building;

import application.Printable;
import entity.building.abstraction.Location;
import entity.building.factory.DoorFactory;
import entity.building.factory.FoundationFactory;
import entity.building.factory.RoofFactory;
import entity.building.factory.WallFactory;

public class Builder implements Printable {
    private static Builder instance = new Builder();

    private Builder() {

    }

    public static Builder getInstance() {
        return instance;
    }

    public Location build(String name) {
        return new Location(
                name,
                FoundationFactory.getInstance().obtain(),
                WallFactory.getInstance().obtain(),
                DoorFactory.getInstance().obtain(),
                RoofFactory.getInstance().obtain()
        );
    }
}


