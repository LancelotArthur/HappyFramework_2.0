package entity.building.template;

import entity.building.abstraction.Door;
import entity.building.abstraction.Material;
import entity.building.abstraction.Shape;

public class DoorA extends Door {
    public DoorA() {
        super(Material.WOOD, Shape.RECTANGLE);
    }
}
