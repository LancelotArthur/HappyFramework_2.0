package allocator;

import application.Printable;
import entity.Entity;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Abstract Class Proxy, extended by all proxies
 */
public abstract class Proxy<T extends Entity> implements Obtainable, Printable {

    private Type type;

    Proxy() {
        Type superclassType = getClass().getGenericSuperclass();
        if (ParameterizedType.class.isAssignableFrom(superclassType.getClass())) {
            type = ((ParameterizedType) superclassType).getActualTypeArguments()[0];
        }
    }

    /**
     * @return Entity, of class T
     */
    @Override
    public Entity obtain() {
        return null;
    }


    /**
     * @return The typename of class T
     */
    protected String getTypename() {
        return type.getTypeName();
    }

}