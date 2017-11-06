package entity.group;


import entity.Entity;
import java.util.ArrayList;
import java.util.Collection;

/**
 * The Class Group defines an encapsulation of an aggregation of entities.
 * */
public class Group<T extends Entity> extends Entity {

    protected T entity;
    protected int count;
    protected boolean realized = false;

    /**
     * Constructor, defines a group of T entity of number
     * */
    public Group(T entity, int count) {
        if (count < 0) {
            count = 0;
        }
        this.count = count;
        this.entity = entity;
    }

    /**
     * Obtain a collection of the whole group whose volume is specified by the count field
     *
     * @return Collection of class T contains all the entities
     */
    public Collection<T> getGroup() {
        return this.getGroup(this.count);
    }


    /**
     * Obtain a collection of a specific number of entities
     *
     * @param num thr number of entities
     * @return Collection of class T containing num entities
     */
    @SuppressWarnings(value = {"unchecked"})
    public Collection<T> getGroup(int num) {

        if (realized) {
            return null;
        }
        if (num >= this.count) {
            num = this.count;
        }

        Collection<T> list = new ArrayList<>();
        for (int i = 0; i < num; ++i) {
            list.add((T) entity.clone());
        }
        if (!list.isEmpty()) {
            realized = true;
        }
        return list;
    }

    /**
     * Obtain the class name of the group entity
     *
     * @return the class name
     */
    public String getEntityClass() {
        return this.entity.getClass().toString();
    }

    /**
     * Obtain the size of the group
     *
     * @return size
     */
    public int getGroupSize() {
        return this.count;
    }

    /**
     * Set or reset the size of group
     *
     * @param count the count of the group
     */
    public void setGroupSize(int count) {
        if (realized){
            print("Error Resetting: Already Instantiated");
        }
        if (count > 0) {
            this.count = count;
        }
    }
}

