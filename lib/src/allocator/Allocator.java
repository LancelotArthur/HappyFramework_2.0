package allocator;

import application.Printable;
import entity.Entity;
import entity.animal.Animal;
import entity.plant.Plant;


interface Obtainable {
    Entity obtain();
}


public class Allocator<T extends Entity> implements Obtainable, Printable {


    private Strategy strategy = Strategy.PURCHASE;
    private T mother = null;

    public T obtain() {
        T result = null;
        if (strategy == Strategy.PURCHASE) {
            PurchaseProxy<T> purchaseProxy = new PurchaseProxy<>();
            result = purchaseProxy.obtain();
        } else if (strategy == Strategy.REPRODUCE) {
            ReproduceProxy<T> reproduceProxy = new ReproduceProxy<>(mother);
            result = reproduceProxy.obtain();
        }
        return result;
    }

    public void setObtainArguments(Strategy strategy, T mother) {
        this.strategy = strategy;
        if (strategy == Strategy.REPRODUCE) {
            if (Animal.class.isAssignableFrom(mother.getClass())) {
                // if mother's class extends Animal
                if (((Animal) mother).isFemale()) this.mother = mother;
                else {
                    print("Male animals cannot reproduce children!");
                }
            } else if (Plant.class.isAssignableFrom(mother.getClass())) {
                // if mother's class extends Plant
                this.mother = mother;
            } else {
                // if mother's class extends another class
                print("Only animals and plants can reproduce children!");
            }
        }
    }
}

class PurchaseProxy<T extends Entity> implements Obtainable, Printable {
    PurchaseProxy() {
    }

    public T obtain() {
        print("Buying Something");
        //TODO To add Factory Method and Abstract Method etc.
        return null;
    }
}

class ReproduceProxy<T extends Entity> implements Obtainable, Printable {

    private T mother;

    ReproduceProxy(T mother) {
        this.mother = mother;
    }


    @SuppressWarnings(value = {"unchecked"})
    public T obtain() {
        if (mother == null) {
            print("No mother!");
            return null;
        }
        if (Animal.class.isAssignableFrom(mother.getClass())) {
            if (!((Animal) mother).isPreg()) {
                print("Wait! The mother has not been pregnant!");
                return null;
            }
        }
        print("A child was born!");
        return (T) mother.clone();
    }
}
