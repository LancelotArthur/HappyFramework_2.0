package entity.creature.state.health;

import entity.creature.Creature;

/**
 * Singleton
 * Concrete Health State Well
 * */
public class Well implements Health {

    private static Well instance = new Well();

    public static Well getInstance() {
        return instance;
    }


    /**
     * Shift from well to sick
     *
     * @param creature the Creature object to be shifted
     * */
    @Override
    public void decline(Creature creature) {
        print("Becoming Sick");
        creature.setHealth(Sick.getInstance());
    }
}
