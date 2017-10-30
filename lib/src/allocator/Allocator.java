package allocator;

import application.Printable;
import entity.Entity;


/**
 * The Allocator class generates Entities, which includes creatures( animals and plants), buildings, and other real objects.
 * Use the setObtainArgument method to shift between different proxies to use.
 * You can obtain a creature via ReproduceProxy or PurchaseProxy, which respectively encapsulates the details of
 * creature reproduction and creature instantiation.
 * PurchaseProxy is used when the creature should be bought from the market, at some expense.
 * T should be the class of which instances are demanded
 *
 * @see PurchaseProxy
 * @see ReproduceProxy
 */
public class Allocator<T extends Entity> implements Obtainable, Printable {

    private Obtainable proxy;
    private T mother = null;
    private Class type = null;
    private Object[] objects = new Object[]{};

    /**
     * Constructor
     *
     * @param type The class type of the instances intended
     */
    public Allocator(Class type) {
        this.type = type;
        proxy = new PurchaseProxy<T>(type, objects);
    }

    /**
     * Using the specified strategy:
     *
     * @return an instance of class T
     * @see PurchaseProxy
     * @see ReproduceProxy
     */
    @Override
    @SuppressWarnings(value = {"unchecked"})
    public T obtain(){
        return (T) proxy.obtain();
    }

    /**
     * Set the mother property for ReproduceProxy
     *
     * @param mother Mother to be used.
     * @return self
     */
    public Allocator<T> setMother(T mother) {
        this.mother = mother;
        return setObtainArguments(ObtainStrategy.REPRODUCE);
    }

    /**
     * Set the strategy argument
     *
     * @param obtainStrategy one of the two strategies (valid values in ObtainStrategy enumeration)
     * @return self
     */
    public Allocator<T> setObtainArguments(ObtainStrategy obtainStrategy) {
        setObtainArguments(obtainStrategy,new Object[]{});
        return this;
    }

    public Allocator<T> setObtainArguments(ObtainStrategy obtainStrategy, Object[] objects){
        switch (obtainStrategy) {
            case PURCHASE:
                this.proxy = new PurchaseProxy<T>(type, objects);
                break;
            case REPRODUCE:
                this.proxy = new ReproduceProxy<>(mother);
                break;
            default:
                print("No such obtainStrategy.");
        }
        this.objects = objects;
        return this;
    }
}


