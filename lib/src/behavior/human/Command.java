package behavior.human;

import application.Printable;
import entity.creature.Product;
import entity.group.Group;

public interface Command extends Printable {
    Group<Product> execute();

    void undo();

    Group<Product> redo();
}
