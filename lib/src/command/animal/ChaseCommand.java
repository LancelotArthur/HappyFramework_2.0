package command.animal;

import behavior.human.Commandable;
import entity.creature.animal.Animal;

public class ChaseCommand implements Commandable {

    Animal receiver = null;

    public ChaseCommand(Animal receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.move();
    }

    @Override
    public void undo() {
        print("Undo move.");
    }

    @Override
    public void redo() {
        print("Redo move.");
        this.receiver.move();
    }
}
