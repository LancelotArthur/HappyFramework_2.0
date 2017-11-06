package entity.creature.state.pregnancy;

import entity.creature.animal.Animal;

/**
 * Singleton
 * Concrete Pregnancy State Pregnant
 * */
public class Pregnant implements Pregnancy {
    private static Pregnant instance = new Pregnant();

    public static Pregnant getInstance() {
        return instance;
    }


    /**
     * giveBirth method, shift a creature to non-pregnant state, returns a clone
     *
     * @param animal the animal object to be shifted
     * @return the reproduced animal
     * */
    @Override
    public Animal giveBirth(Animal animal) {
        animal.setPregnancy(NonPregnant.getInstance());
        return (Animal) animal.clone();
    }
}

