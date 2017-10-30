package behavior.human;

import entity.creature.Product;
import entity.creature.animal.Animal;
import entity.group.Group;

/**
 * The chasing command
 */
public class Chasing implements Command {

    private Animal receiver = null;

    /**
     * Constructor, receives a animal argument, whom the command will chase
     */
    public Chasing(Animal receiver) {
        this.receiver = receiver;
    }


    /**
     * Chase the receiver, the receiver will move, and speak.
     *
     * @return null
     */
    @Override
    public Group<Product> execute() {
        receiver.move();
        receiver.speak();
        return null;
    }

    /**
     * Undo the chasing command
     */
    @Override
    public void undo() {
        print("Stopped. The Animal is still panicked");
    }


    /**
     * Repeat the execute process
     */
    @Override
    public Group<Product> redo() {
        print("Again!");
        receiver.move();
        receiver.speak();
        return null;
    }
}
