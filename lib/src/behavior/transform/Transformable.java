package behavior.transform;

import entity.Entity;

public interface Transformable<Target extends Entity, Source> {

    /**
     * get current type of entity
     *
     * @return the Entity
     */
    Target getTarget();

    /**
     * activate the transformation, change the type of current class
     */
    Transformable<Target, Source> transform() throws IllegalAccessException, InstantiationException;

    /**
     * get the previous type of the entity
     *
     * @return the previous class name of this entity
     */
    Source getSource();

}
