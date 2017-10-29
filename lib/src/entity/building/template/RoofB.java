package entity.building.template;

import entity.building.abstraction.Material;
import entity.building.abstraction.Roof;

public class RoofB extends Roof {
    public RoofB() {
        super(Material.WOOD, 50);
    }
}
