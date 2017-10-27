package entity.creature.state.pregnancy;

import entity.creature.animal.Animal;

public class Male implements Pregnancy {
    private static Male instance = new Male();

    public static Male getInstance() {
        return instance;
    }

    @Override
    public Animal giveBirth(Animal animal) {
        print("Male animals do not reproduce.");
        return null;
    }

    @Override
    public void pair(Animal animal) {
        print("Paired. The partner is pregnant!");

    }
}
