package entity.building.abstraction;

import application.Printable;
import entity.Entity;


public class Location extends Entity implements Printable {

    private String name;
    private Foundation foundation;
    private Wall wall;
    private Door door;
    private Roof roof;

    public Location(String name, Foundation foundation, Wall wall, Door door, Roof roof) {
        super();
        this.name = name;
        this.foundation = foundation;
        this.wall = wall;
        this.door = door;
        this.roof = roof;
    }

    public void enter() {
        print("Entering The Location...");
        print("The door: Material: " + door.material + " Shape: " + door.shape);
        print("The ground: Area: " + foundation.area + " Material: " + foundation.material);
        print("The wall: Height: " + wall.height + " Material: " + wall.material + " Color: " + wall.color);
        print("The roof: Area: " + roof.area + " Material: " + roof.material);
    }

}
