package entity.building;

import entity.building.Foundation;
import entity.building.Roof;
import entity.building.Wall;

/**
 * 所有建筑材料的抽象工厂
 */
public interface BuildingMaterialFactory {
    Door getDoor();
    Foundation getFoundation();
    Roof getRoof();
    Wall getWall();
}
