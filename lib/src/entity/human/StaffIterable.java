package entity.human;

import application.Printable;

/**
 * Staff Iterable Interface
 * */
public interface StaffIterable extends Printable {

    /**
     * @return if the collection has another entity
     * */
    boolean hasNext();

    /**
     * @return the next element
     * */
    Staff next();
}
