package behavior.creature;

import entity.creature.Product;
import entity.group.Group;


public interface Yielding {
    //Yielding fruits... etc.
    Group<Product> yield(int count);
}
