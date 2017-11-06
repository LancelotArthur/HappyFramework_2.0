package behavior.skill;

import application.Printable;
import entity.Entity;


/**
 * Abstract Skill class, implements the Performable interface
 */
public abstract class Skill extends Entity implements Performable, Printable {

    private Performable performable;

    /**
     * @param performable the entity to add functionality
     */
    protected Skill(Performable performable) {
        this.performable = performable;

    }

    /**
     * The action to be added
     */
    @Override
    public void performAction() {
        performable.performAction();
    }
}
