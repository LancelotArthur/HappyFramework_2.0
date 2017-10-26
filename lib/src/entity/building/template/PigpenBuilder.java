package entity.building.template;

import entity.building.*;
import entity.building.template.FoundationA;
import entity.building.template.RoofA;
import entity.building.template.WallA;

/**
 * 猪圈建造者
 * 要新建一个猪圈需要创建一个猪圈建造者，然后提供各个部分的材料
 */
public class PigpenBuilder implements BuildingMaterialFactory {

    @Override
    public Foundation getFoundation() {
        return new FoundationA();
    }

    @Override
    public Wall getWall() {
        return new WallA();
    }

    @Override
    public Door getDoor() {
        return new DoorA();
    }

    @Override
    public Roof getRoof() {
        return new RoofA();
    }

}
