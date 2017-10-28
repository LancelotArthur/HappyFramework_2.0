package behavior.human;

import entity.Product;
import entity.creature.animal.template.Cow;
import entity.group.Group;

public class Milking implements Command{

    private Cow receiver = null;
    public Milking (Cow receiver) {
        this.receiver = receiver;
    }
    @Override
    public Group<Product> execute() {
        print("Some milk was produced.");
        return receiver.yield(10);
    }

    @Override
    public void undo() {
        print("Giving the milk back...Emm...The cow does not seem very willing to accept.");
    }

    @Override
    public Group<Product> redo() {
        print("No more!");
        return receiver.yield(1);
    }
}
