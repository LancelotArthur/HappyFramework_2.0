package entity;

import application.Printable;


public abstract class Entity implements Printable, Cloneable {

    private static long number = 0;
    private long id;

    protected Entity() {
        id = number++;
    }

    public long getId() {
        return this.id;
    }


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
