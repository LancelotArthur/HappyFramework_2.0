package behavior.templates;

import behavior.Performable;
import behavior.Skill;

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
