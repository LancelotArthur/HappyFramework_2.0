package entity.building.abstraction;


/**
 * Abstract Class Foundation
 * */
public abstract class Foundation extends Part {

    Material material;
    int area;

    public Foundation() {
        super();
        this.material = Material.WOOD;
        this.area = 100;
    }

    public Foundation(Material material, int area) {
        super();
        this.material = material;
        this.area = area;
    }

}
