package behavior.human;

import entity.creature.Product;
import entity.creature.animal.template.Cow;
import entity.group.Group;

public class Milking implements Command {

    private Cow receiver = null;

    /**
     * Constructor, receives a animal argument, whom the command will milk
     */
    public Milking(Cow receiver) {
        this.receiver = receiver;
    }

    /**
     * Milk the receiver, the receiver yield
     *
     * @return A group of milk product
     */
    @Override
    public Group<Product> execute() {
        print("Some milk was produced.");
        return receiver.yield(10);
    }

    /**
     * Un-milk the receiver. The milking command cannot be undone actually. The message will show this.
     */
    @Override
    public void undo() {
        print("Giving the milk back...Emm...The cow does not seem very willing to accept.");
    }

    /**
     * Redo the milking process
     */
    @Override
    public Group<Product> redo() {
        print("No more!");
        return receiver.yield(1);
    }
}
