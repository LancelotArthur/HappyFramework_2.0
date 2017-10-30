package behavior.skill;


/**
 * Concrete skill class
 */
public class Coder extends Skill {
    /**
     * Constructor
     *
     * @param performable the entity to add the coder skill
     */
    public Coder(Performable performable) {
        super(performable);
    }

    /**
     * Perform the inherited action
     * Perform coding action
     */
    @Override
    public void performAction() {
        super.performAction();
        print("Coding.");
    }
}
