package allocator;

import entity.Entity;
import entity.creature.animal.Animal;
import entity.creature.plant.Plant;

/**
 * Reproduce Proxy uses the underlying mother property to generate a new instance, through cloning
 */
public class ReproduceProxy<T extends Entity> extends Proxy<T> {

    private T mother = null;

    ReproduceProxy(T mother) {
        super();
        this.mother = mother;
    }

    /**
     * The mother set for Proxy should be a creature, null returned otherwise,
     * The mother set for Proxy should be female if it be animal, null returned otherwise.
     * The mother set for Proxy should return true when it be animal and calling isPregnant(), null return otherwise.
     * For plants and pregnant animals, entity cloned will be returned
     *
     * @return Entity of class T
     */
    @SuppressWarnings(value = {"unchecked"})
    public T obtain() {
        if (mother == null) {
            print("No available mother. Nothing was born.");
            return null;
        }
        T child = null;

        if (Plant.class.isAssignableFrom(mother.getClass())) {
            print("A child was born!");
            child = (T) mother.clone();
        } else if (Animal.class.isAssignableFrom(mother.getClass()) &&
                !(((Animal) mother).isMale()) &&
                ((Animal) mother).isPregnant()) {
            print("A child was born!");
            child = (T) ((Animal) mother).giveBirth();
        } else {
            print("This is a fake mother! It is either male or not pregnant, or not a creature at all");
        }
        return child;
    }
}
