package entity.HouseBuilder;

import entity.BuildingMaterialFactory.Door.Door;
import entity.BuildingMaterialFactory.Foundation.Foundation;
import entity.BuildingMaterialFactory.Roof.Roof;
import entity.BuildingMaterialFactory.Wall.Wall;

/**
 * 建筑的抽象基类
 * 保存了地基、墙体、门、屋顶这几个基本组成部分
 */
public abstract class House {

    protected Foundation foundation;
    protected Wall wall;
    protected Door door;
    protected Roof roof;

    public House(Foundation foundation, Wall wall, Door door, Roof roof) {
        this.foundation = foundation;
        this.wall = wall;
        this.door = door;
        this.roof = roof;
    }
}
