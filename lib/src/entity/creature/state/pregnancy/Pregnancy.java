package entity.creature.state.pregnancy;

import application.Printable;
import entity.creature.animal.Animal;
import entity.creature.state.abstraction.State;

public interface Pregnancy extends Printable, State {
    default Animal giveBirth(Animal animal) {
        print("Not Pregnant");
        return null;
    }

    default void pair(Animal animal) {
        print("Already Pregnant");
    }
}
