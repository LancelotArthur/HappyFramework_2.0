package entity.building.template;

import entity.building.abstraction.Color;
import entity.building.abstraction.Material;
import entity.building.abstraction.Wall;

public class WallB extends Wall {
    public WallB() {
        super(Material.METAL, 2, Color.GREEN);
    }
}
