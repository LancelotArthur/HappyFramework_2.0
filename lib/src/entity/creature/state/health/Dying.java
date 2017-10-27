package entity.creature.state.health;

import entity.creature.Creature;

public class Dying implements Health {

    private static Dying instance = new Dying();

    public static Dying getInstance() {
        return instance;
    }

    @Override
    public void recover(Creature creature) {
        print("Feeling Better");
        creature.setHealth(Sick.getInstance());
    }
}
