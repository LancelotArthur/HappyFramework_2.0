package entity.animal.behavior;

public interface Transformable<T> {

    /**
     * get current type of entity
     * @return the Entity
     */
    String getCurrentEntity();

    /**
     * activate the transformation, change the type of current class
     * @param newEntity the destination class, use new Class()
     * @return the result of the transformation, usually true
     */
    boolean transform(T newEntity);

    /**
     * get the previous type of the entity
     * @return the previous class name of this entity
     */
    String getPreviousEntity();

}
