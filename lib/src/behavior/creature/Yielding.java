package behavior.creature;

import entity.creature.Product;
import entity.group.Group;


/**
 * Defines a yield() function which returns a Group of Products
 *
 * @see Product
 * @see Group
 */
public interface Yielding {
    //Yielding fruits... etc.
    Group<Product> yield(int count);
}
