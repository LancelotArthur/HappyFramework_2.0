package entity.HouseBuilder;

import entity.BuildingMaterialFactory.BuildingMaterialFactory;
import entity.BuildingMaterialFactory.Door.*;
import entity.BuildingMaterialFactory.Foundation.*;
import entity.BuildingMaterialFactory.Roof.*;
import entity.BuildingMaterialFactory.Wall.*;

/**
 * 马厩建造者
 */
public class StableBuilder implements BuildingMaterialFactory {

    @Override
    public Foundation getFoundation() {
        return new Foundation_2();
    }

    @Override
    public Wall getWall() {
        return new Wall_2();
    }

    @Override
    public Door getDoor() {
        return new Door_2();
    }

    @Override
    public Roof getRoof() {
        return new Roof_2();
    }

}
