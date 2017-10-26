package entity.building;

/**
 * 楼层的抽象基类
 * material: 0-木质；1-水泥；2-金属
 * height：楼层高度
 */
public abstract class Wall {
    protected int material = 0;
    protected int height = 0;

    public Wall() {
        this.material = 0;
        this.height = 0;
    }

    public Wall(int material, int height) {
        this.material = material;
        this.height = height;
    }
}
