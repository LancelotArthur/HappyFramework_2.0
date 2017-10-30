package entity.creature.state.pregnancy;

import entity.creature.animal.Animal;


/**
 * Singleton
 * Concrete Pregnancy State Non-pregnant
 * */
public class NonPregnant implements Pregnancy {
    private static NonPregnant instance = new NonPregnant();

    public static NonPregnant getInstance() {
        return instance;
    }


    /**
     * pair method, shift a creature to pregnant state
     *
     * @param animal the animal object to be shifted
     * */
    @Override
    public void pair(Animal animal) {
        print("Paired Successfully");
        animal.setPregnancy(Pregnant.getInstance());
    }
}
