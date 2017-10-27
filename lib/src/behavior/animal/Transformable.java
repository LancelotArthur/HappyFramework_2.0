package behavior.animal;

public interface Transformable {

    /**
     * get current type of entity
     *
     * @return the Entity
     */
    String getCurrentEntity();

    /**
     * activate the transformation, change the type of current class
     *
     * @param entityName the destination class name, preferred to use class().toString()
     * @return the result of the transformation, usually true
     */
    boolean transform(String entityName);

    /**
     * get the previous type of the entity
     *
     * @return the previous class name of this entity
     */
    String getPreviousEntity();

    /**
     * return to the previous type
     *
     * @return the result of the return action
     */
    boolean returnToPrevious();
}
