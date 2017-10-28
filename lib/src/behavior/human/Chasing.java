package behavior.human;

import entity.Product;
import entity.creature.animal.Animal;
import entity.group.Group;

public class Chasing implements Command {

    private Animal receiver = null;
    public Chasing(Animal receiver) {
        this.receiver = receiver;
    }

    @Override
    public Group<Product> execute() {
        receiver.move();
        return null;
    }

    @Override
    public void undo() {
        print("Stopped. The Animal is still panicked");
    }

    @Override
    public Group<Product> redo() {
        print("Again!");
        receiver.move();
        return null;
    }
}
