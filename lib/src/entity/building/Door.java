package entity.building;

/**
 * 门的抽象基类
 * material: 0-木质；1-金属
 * shape：0-矩形；1-圆形
 */
public abstract class Door {

    protected int material = 0;
    protected int shape = 0;

    public Door() {
        this.material = 0;
        this.shape = 0;
    }

    public Door(int material, int shape) {
        this.material = material;
        this.shape = shape;
    }

}
