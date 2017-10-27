package allocator;

import entity.Entity;
import entity.Factory;

public class PurchaseProxy<T extends Entity> extends Proxy<T> {

    private static Factory factory = new Factory();
    private Class type;

    PurchaseProxy(Class type) {
        super();
        this.type = type;
    }

    @SuppressWarnings(value = {"unchecked"})
    public T obtain() {
        print("Buying something...");
        Entity entity = factory.create(type.getTypeName());
        return (T) entity;
    }
}
