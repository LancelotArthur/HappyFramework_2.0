package behavior;

import entity.Product;
import entity.group.Group;


public interface Yielding {
    //Yielding fruits... etc.
    Group<Product> yield(int count);
}
