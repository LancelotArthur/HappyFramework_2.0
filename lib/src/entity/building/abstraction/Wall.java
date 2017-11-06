package entity.building.abstraction;


/**
 * Abstract Class Wall
 * */
public abstract class Wall extends Part {
    Material material;
    int height;
    Color color;

    public Wall() {
        super();
        this.material = Material.WOOD;
        this.height = 0;
        color = Color.BLUE;
    }

    public Wall(Material material, int height, Color color) {
        super();
        this.material = material;
        this.height = height;
        this.color = color;
    }
}
