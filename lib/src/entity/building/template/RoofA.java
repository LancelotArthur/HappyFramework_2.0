package entity.building.template;

import entity.building.abstraction.Material;
import entity.building.abstraction.Roof;

public class RoofA extends Roof {
    public RoofA() {
        super(Material.METAL, 100);
    }
}
