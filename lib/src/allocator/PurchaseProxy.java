package allocator;

import entity.Entity;
import entity.Factory;

/**
 * Purchase Proxy deals with the details pertaining to the instantiation of classes inheriting Entity class
 */
public class PurchaseProxy<T extends Entity> extends Proxy<T> {

    Object[] objects;
    private static Factory factory = Factory.getInstance();
    private Class type;

    PurchaseProxy(Class type, Object[] objects) {
        super();
        this.type = type;
        this.objects = objects;
    }

    /**
     * Using the factory to generate a new entity
     *
     * @return Entity of class T
     */
    @SuppressWarnings(value = {"unchecked"})
    public T obtain() {
        print("Buying something...");
        Entity entity = factory.create(type.getTypeName(),objects);
        return (T) entity;
    }
}
