package entity.building.template;

import entity.building.*;
import entity.building.template.FoundationB;
import entity.building.template.RoofB;
import entity.building.template.WallB;

/**
 * 马厩建造者
 */
public class StableBuilder implements BuildingMaterialFactory {

    @Override
    public Foundation getFoundation() {
        return new FoundationB();
    }

    @Override
    public Wall getWall() {
        return new WallB();
    }

    @Override
    public Door getDoor() {
        return new DoorB();
    }

    @Override
    public Roof getRoof() {
        return new RoofB();
    }

}
