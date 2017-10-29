package entity.building;


public abstract class Foundation {

    private int material = 0;
    private int area = 0;

    public Foundation() {
        this.material = 0;
        this.area = 0;
    }

    public Foundation(int material, int area) {
        this.material = material;
        this.area = area;
    }

}
