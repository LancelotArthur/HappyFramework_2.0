package entity.building;


public interface BuildingMaterialFactory {
    Door getDoor();

    Foundation getFoundation();

    Roof getRoof();

    Wall getWall();
}
