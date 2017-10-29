package entity.building.template;

import entity.building.abstraction.Color;
import entity.building.abstraction.Material;
import entity.building.abstraction.Wall;

public class WallA extends Wall {
    public WallA() {
        super(Material.WOOD, 3, Color.GREEN);
    }
}
