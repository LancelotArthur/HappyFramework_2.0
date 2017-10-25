package entity.HouseBuilder;

import entity.BuildingMaterialFactory.Door.Door;
import entity.BuildingMaterialFactory.Foundation.Foundation;
import entity.BuildingMaterialFactory.Roof.Roof;
import entity.BuildingMaterialFactory.Wall.Wall;

/**
 * 猪圈的实体
 */
public class Pigpen extends House {

    public Pigpen(Foundation foundation, Wall wall, Door door, Roof roof) {
        super(foundation, wall, door, roof);
    }

}
