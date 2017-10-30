package behavior.skill;


import java.io.Serializable;

/**
 * The Skill interface
 * The interface allows dynamic functionality addition
 * The performAction() method will be called whenever an skill action is intended,
 * Default is empty
 * Notice that the interface shares the same function as interface subscriber does, see that part for more information
 *
 * @see behavior.observe.Subscriber
 */
public interface Performable extends Serializable {
    /**
     * The skill action
     */
    default void performAction() {
    }
}
