package allocator;

import application.Printable;
import entity.Entity;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


public abstract class Proxy<T extends Entity> implements Obtainable, Printable {

    private Type type;

    Proxy() {
        Type superclassType = getClass().getGenericSuperclass();
        if (ParameterizedType.class.isAssignableFrom(superclassType.getClass())) {
            type = ((ParameterizedType) superclassType).getActualTypeArguments()[0];
        }
    }

    @Override
    public Entity obtain() {
        return null;
    }

    protected String getTypename() {
        return type.getTypeName();
    }

}