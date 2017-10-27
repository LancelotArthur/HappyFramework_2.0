package allocator;

import application.Printable;
import entity.Entity;


public class Allocator<T extends Entity> implements Obtainable, Printable {

    private Obtainable proxy;
    private T mother = null;
    private Class type = null;

    public Allocator(Class type) {
        this.type = type;
        proxy = new PurchaseProxy<T>(type);
    }

    @SuppressWarnings(value = {"unchecked"})
    public T obtain() {
        return (T) proxy.obtain();
    }

    public Allocator<T> setMother(T mother) {
        this.mother = mother;
        return setObtainArguments(ObtainStrategy.REPRODUCE);
    }

    public Allocator<T> setObtainArguments(ObtainStrategy obtainStrategy) {
        switch (obtainStrategy) {
            case PURCHASE:
                this.proxy = new PurchaseProxy<T>(type);
                break;
            case REPRODUCE:
                this.proxy = new ReproduceProxy<>(mother);
                break;
            default:
                print("No such obtainStrategy.");
        }
        return this;
    }
}


