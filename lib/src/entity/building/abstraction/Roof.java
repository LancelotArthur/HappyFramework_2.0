package entity.building.abstraction;


public abstract class Roof extends Part {

    Material material;
    int area;

    public Roof() {
        super();
        this.material = Material.WOOD;
        this.area = 0;
    }

    public Roof(Material material, int area) {
        super();
        this.material = material;
        this.area = area;
    }

}
