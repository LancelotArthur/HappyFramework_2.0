package entity.building.template;

import entity.building.*;

/**
 * 马厩建造者
 */
public class StableBuilder implements BuildingMaterialFactory {

    @Override
    public Door getDoor() {
        return new DoorB();
    }

    @Override
    public Foundation getFoundation() {
        return new FoundationB();
    }

    @Override
    public Roof getRoof() {
        return new RoofB();
    }

    @Override
    public Wall getWall() {
        return new WallB();
    }

}
