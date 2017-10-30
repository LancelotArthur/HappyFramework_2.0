package behavior.human;

import application.Printable;
import entity.creature.Product;
import entity.group.Group;

/**
 * Defines a command interface
 * There is no restriction on the sequence in which these functions are called.
 * Pay close attention not to re-executing the command prior to its first execution.
 * Further, the redo command does not always revert the changes.
 * You might have to define your own command classes to fully make use of the mechanism,
 * defining a flag, using it to indicate the changes and restore them when needed.
 * All Entities are serializable, so that you are free to save their states to a memento, as we do in the scene module.
 *
 * @see entity.creature.state.abstraction.State
 * @see scene.Scene
 * @see Chasing
 * @see Milking
 */
public interface Command extends Printable {

    /**
     * Execute the command, the command might return a group of products, or null.
     *
     * @return A Group of Products, which is likely to be null
     * @see Product
     * @see Group
     */
    Group<Product> execute();


    /**
     * Undo the command, reverting the changes.
     */
    void undo();

    /**
     * Repeat the execute process, might not result in the same return value.
     *
     * @return A Group of Products, which is likely to be null
     */
    Group<Product> redo();
}
