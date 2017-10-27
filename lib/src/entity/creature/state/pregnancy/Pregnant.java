package entity.creature.state.pregnancy;

import entity.creature.animal.Animal;


public class Pregnant implements Pregnancy {
    private static Pregnant instance = new Pregnant();

    public static Pregnant getInstance() {
        return instance;
    }

    @Override
    public Animal giveBirth(Animal animal) {
        animal.setPregnancy(NonPregnant.getInstance());
        return (Animal) animal.clone();
    }
}

