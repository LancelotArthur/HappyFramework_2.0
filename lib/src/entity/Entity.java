package entity;

import application.Printable;
import java.io.Serializable;

/**
 * The Abstract Entity Class, base class for all objects.
 * Implements the serializable interface, making it possible to be saved to file.
 * Implements the cloneable interface, override the clone() method
 * Every entity instantiated has a unique id.
 * */
public abstract class Entity implements Printable, Cloneable, Serializable {

    private static final long serialVersionUID = 551123659773121209L;
    private static long number = 0;
    private long id;

    protected Entity() {
        id = number++;
    }

    public long getId() {
        return this.id;
    }



    /**
     * return the cloned entity as an object
     * The cloned entity has a different id from the prototype.
     * */
    @Override
    public Object clone() {
        Object result = null;

        try {
            print("Cloning");
            result = super.clone();
            ((Entity) result).id = number++;

        } catch (CloneNotSupportedException e) {
            print("Oops, clone not supported");
        }

        return result;
    }
}
