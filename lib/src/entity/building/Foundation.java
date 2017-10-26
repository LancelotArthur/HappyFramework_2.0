package entity.building;

/**
 * 楼板的抽象基类
 * material: 0-木质；1-水泥；2-金属
 * area：面积
 */
public abstract class Foundation {

    protected int material = 0;
    protected int area = 0;

    public Foundation() {
        this.material = 0;
        this.area = 0;
    }

    public Foundation(int material, int area) {
        this.material = material;
        this.area = area;
    }

}
