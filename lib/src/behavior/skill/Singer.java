package behavior.skill;

public class Singer extends Skill {

    /**
     * Constructor
     *
     * @param performable the entity to add the dancer skill
     */
    public Singer(Performable performable) {
        super(performable);
    }


    /**
     * Perform the inherited action
     * Perform dancer action
     */
    @Override
    public void performAction() {
        super.performAction();
        print("Singing.");
    }
}
