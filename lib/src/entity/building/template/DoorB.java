package entity.building.template;

import entity.building.abstraction.Door;
import entity.building.abstraction.Material;
import entity.building.abstraction.Shape;

public class DoorB extends Door {
    public DoorB() {
        super(Material.METAL, Shape.CIRCLE);
    }
}
