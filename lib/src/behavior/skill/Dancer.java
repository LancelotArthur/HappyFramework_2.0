package behavior.skill;

public class Dancer extends Skill {
    public Dancer(Performable performable) {
        super(performable);
    }

    @Override
    public void performAction() {
        super.performAction();
        print("Dancing.");
    }
}
