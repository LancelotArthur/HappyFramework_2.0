package entity.building;

/**
 * 屋顶的抽象基类
 * material: 0-木质；1-水泥；2-金属
 * area：面积
 */
public abstract class Roof {

    protected int material = 0;
    protected int area = 0;

    public Roof() {
        this.material = 0;
        this.area = 0;
    }

    public Roof(int material, int area) {
        this.material = material;
        this.area = area;
    }

}
