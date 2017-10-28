package behavior.skill;

public class Singer extends Skill {
    public Singer(Performable performable) {
        super(performable);
    }

    @Override
    public void performAction() {
        super.performAction();
        print("Singing.");
    }
}
