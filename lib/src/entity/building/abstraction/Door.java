package entity.building.abstraction;

public abstract class Door extends Part {

    Material material;
    Shape shape;

    public Door() {
        super();
        this.material = Material.WOOD;
        this.shape = Shape.RECTANGLE;
    }

    public Door(Material material, Shape shape) {
        super();
        this.material = material;
        this.shape = shape;
    }

}
