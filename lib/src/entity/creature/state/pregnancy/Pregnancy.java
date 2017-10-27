package entity.creature.state.pregnancy;

import application.Printable;
import entity.creature.animal.Animal;

public interface Pregnancy extends Printable {
    default Animal giveBirth(Animal animal) {
        print("Not Pregnant");
        return null;
    }

    default void pair(Animal animal) {
        print("Already Pregnant");
    }
}
