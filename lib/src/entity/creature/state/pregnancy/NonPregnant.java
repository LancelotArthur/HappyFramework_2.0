package entity.creature.state.pregnancy;

import entity.creature.animal.Animal;

public class NonPregnant implements Pregnancy {
    private static NonPregnant instance = new NonPregnant();

    public static NonPregnant getInstance() {
        return instance;
    }

    @Override
    public void pair(Animal animal) {
        print("Paired Successfully");
        animal.setPregnancy(Pregnant.getInstance());
    }
}
