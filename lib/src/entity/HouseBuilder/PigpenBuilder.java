package entity.HouseBuilder;

import entity.BuildingMaterialFactory.BuildingMaterialFactory;
import entity.BuildingMaterialFactory.Door.*;
import entity.BuildingMaterialFactory.Foundation.*;
import entity.BuildingMaterialFactory.Roof.*;
import entity.BuildingMaterialFactory.Wall.*;

/**
 * 猪圈建造者
 * 要新建一个猪圈需要创建一个猪圈建造者，然后提供各个部分的材料
 */
public class PigpenBuilder implements BuildingMaterialFactory{

    @Override
    public Foundation getFoundation() {
        return new Foundation_1();
    }

    @Override
    public Wall getWall() {
        return new Wall_1();
    }

    @Override
    public Door getDoor() {
        return new Door_1();
    }

    @Override
    public Roof getRoof() {
        return new Roof_1();
    }

}
