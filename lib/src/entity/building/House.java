package entity.building;


/**
 * 建筑的抽象基类
 * 保存了地基、墙体、门、屋顶这几个基本组成部分
 */
public abstract class House {

    private Foundation foundation;
    private Wall wall;
    private Door door;
    private Roof roof;

    public House(Foundation foundation, Wall wall, Door door, Roof roof) {
        this.foundation = foundation;
        this.wall = wall;
        this.door = door;
        this.roof = roof;
    }
}
