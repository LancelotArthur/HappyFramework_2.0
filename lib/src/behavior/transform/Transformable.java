package behavior.transform;

import entity.Entity;


/**
 * The Adapter interface, transforms Target class to Source class
 */
public interface Transformable<Target extends Entity, Source> {

    /**
     * Get entity of current type
     *
     * @return the Entity
     */
    Target getTarget();

    /**
     * activate the transformation, change the type of current class
     *
     * @throws IllegalAccessException innate
     * @throws InstantiationException innate
     */
    Transformable<Target, Source> transform() throws IllegalAccessException, InstantiationException;

    /**
     * get the previous type of the entity
     *
     * @return the previous class name of this entity
     */
    Source getSource();

}
