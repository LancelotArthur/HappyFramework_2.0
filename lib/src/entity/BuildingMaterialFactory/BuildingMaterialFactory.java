package entity.BuildingMaterialFactory;

import entity.BuildingMaterialFactory.Door.*;
import entity.BuildingMaterialFactory.Foundation.*;
import entity.BuildingMaterialFactory.Roof.*;
import entity.BuildingMaterialFactory.Wall.*;

/**
 * 所有建筑材料的抽象工厂
 */
public interface BuildingMaterialFactory {
    Door getDoor();
    Foundation getFoundation();
    Roof getRoof();
    Wall getWall();
}
