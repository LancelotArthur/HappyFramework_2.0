package allocator;

import application.Printable;
import entity.Entity;
import entity.animal.Animal;
import entity.plant.Plant;

interface Obtainable {
    Entity obtain();
}

public class Allocator<T extends Entity> implements Obtainable, Printable {

    private Obtainable proxy = new PurchaseProxy<T>();
    private T mother = null;

    @SuppressWarnings(value = {"unchecked"})
    public T obtain() {
        return (T)proxy.obtain();
    }

    public void setMother(T mother) {
        this.mother = mother;
    }

    public void setObtainArguments(ObtainStrategy obtainStrategy) {
        switch (obtainStrategy) {
            case PURCHASE:
                this.proxy = new PurchaseProxy<T>();
                break;
            case REPRODUCE:
                this.proxy = new ReproduceProxy<>(mother);
                break;
            default:
                print("No such obtainStrategy.");
        }
    }
}

class PurchaseProxy<T extends Entity> implements Obtainable, Printable {
    PurchaseProxy() {
    }

    public T obtain() {
        print("Buying something...");
        return null;
    }
}

class ReproduceProxy<T extends Entity> implements Obtainable, Printable {

    private T mother = null;

    ReproduceProxy(T mother) {
        if (mother == null) {
            this.mother = null;
            return;
        }

        if (Animal.class.isAssignableFrom(mother.getClass())) {
            // if mother's class extends Animal
            if (!((Animal) mother).isMale()) {
                this.mother = mother;
            } else {
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

    @SuppressWarnings(value = {"unchecked"})
    public T obtain() {
        if (this.mother == null) {
            print("No available mother. Nothing was born.");
            return null;
        }
        print("A child was born!");
        return (T) mother.clone();
    }
}
