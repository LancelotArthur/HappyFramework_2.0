package entity.creature.state.health;

import entity.creature.Creature;


public class Sick implements Health {

    private static Sick instance = new Sick();

    public static Sick getInstance() {
        return instance;
    }

    @Override
    public void recover(Creature creature) {
        print("Recovered!");
        creature.setHealth(Well.getInstance());
    }

    @Override
    public void decline(Creature creature) {
        print("Feeling Worse");
        creature.setHealth(Dying.getInstance());
    }
}
