package entity.HouseBuilder;

import entity.BuildingMaterialFactory.Door.Door;
import entity.BuildingMaterialFactory.Foundation.Foundation;
import entity.BuildingMaterialFactory.Roof.Roof;
import entity.BuildingMaterialFactory.Wall.Wall;

/**
 * 马厩
 */
public class Stable extends House {

    public Stable(Foundation foundation, Wall wall, Door door, Roof roof) {
        super(foundation, wall, door, roof);
    }

}
