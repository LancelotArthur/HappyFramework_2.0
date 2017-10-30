package entity.creature.state.pregnancy;

import application.Printable;
import entity.creature.animal.Animal;
import entity.creature.state.abstraction.State;


/**
 * Pregnancy State Interface
 * */
public interface Pregnancy extends Printable, State {

    /**
     * giveBirth method, shift a creature to non-pregnant state, returns a clone
     *
     * @param animal the animal object to be shifted
     * @return the reproduced animal
     * */
    default Animal giveBirth(Animal animal) {
        print("Not Pregnant");
        return null;
    }


    /**
     * pair method, shift a creature to pregnant state
     *
     * @param animal the animal object to be shifted
     * */
    default void pair(Animal animal) {
        print("Already Pregnant");
    }
}
