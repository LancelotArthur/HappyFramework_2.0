package behavior.skill;

public class Dancer extends Skill {

    /**
     * Constructor
     *
     * @param performable the entity to add the dancer skill
     */
    public Dancer(Performable performable) {
        super(performable);
    }


    /**
     * Perform the inherited action
     * Perform dancer action
     */
    @Override
    public void performAction() {
        super.performAction();
        print("Dancing.");
    }
}
