package behavior.skill;

public class Coder extends Skill {
    public Coder(Performable performable) {
        super(performable);
    }

    @Override
    public void performAction() {
        super.performAction();
        print("Coding.");
    }
}
