package entity.building.template;

import entity.building.*;


public class PigpenBuilder implements BuildingMaterialFactory {

    @Override
    public Door getDoor() {
        return new DoorA();
    }

    @Override
    public Foundation getFoundation() {
        return new FoundationA();
    }

    @Override
    public Roof getRoof() {
        return new RoofA();
    }

    @Override
    public Wall getWall() {
        return new WallA();
    }

}
