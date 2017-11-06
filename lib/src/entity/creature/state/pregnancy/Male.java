package entity.creature.state.pregnancy;

import entity.creature.animal.Animal;


/**
 * Singleton
 * Concrete Pregnancy State Male
 * */
public class Male implements Pregnancy {
    private static Male instance = new Male();

    public static Male getInstance() {
        return instance;
    }


    /**
     * giveBirth method, invalid for male animals
     *
     * @param animal the animal object to be shifted
     * */
    @Override
    public Animal giveBirth(Animal animal) {
        print("Male animals do not reproduce.");
        return null;
    }

    /**
     * pair method, invalid for male animals
     *
     * @param animal the animal object to be shifted
     * */
    @Override
    public void pair(Animal animal) {
        print("Paired. The partner is pregnant!");

    }
}
