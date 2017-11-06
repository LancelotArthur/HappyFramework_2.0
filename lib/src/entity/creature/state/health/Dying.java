package entity.creature.state.health;

import entity.creature.Creature;

/**
 * Singleton
 * Concrete Health State Dying
 * */
public class Dying implements Health {

    private static Dying instance = new Dying();

    public static Dying getInstance() {
        return instance;
    }


    /**
     * shift from dying to sick
     *
     * @param creature the Creature object to be shifted
     * */
    @Override
    public void recover(Creature creature) {
        print("Feeling Better");
        creature.setHealth(Sick.getInstance());
    }
}
