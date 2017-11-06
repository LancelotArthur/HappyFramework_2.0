package entity.creature.state.health;

import entity.creature.Creature;


/**
 * Singleton
 * Concrete Health State Sick
 * */
public class Sick implements Health {

    private static Sick instance = new Sick();

    public static Sick getInstance() {
        return instance;
    }


    /**
     * Shift from sick to well
     *
     * @param creature the Creature object to be shifted
     * */
    @Override
    public void recover(Creature creature) {
        print("Recovered!");
        creature.setHealth(Well.getInstance());
    }

    /**
     * Shift from sick to dying
     *
     * @param creature the Creature object to be shifted
     * */
    @Override
    public void decline(Creature creature) {
        print("Feeling Worse");
        creature.setHealth(Dying.getInstance());
    }
}
