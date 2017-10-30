package entity.creature.state.health;

import entity.creature.Creature;


/**
 * Singleton
 * Concrete Health State Dead
 * */
public class Dead implements Health {

    private static Dead instance = new Dead();

    public static Dead getInstance() {
        return instance;
    }


    /**
     * State shift not valid
     *
     * @param creature the Creature object to be shifted
     * */
    @Override
    public void recover(Creature creature) {
        print("Invalid: Dead");
    }

    /**
     * State shift not valid
     *
     * @param creature the Creature object to be shifted
     * */
    @Override
    public void decline(Creature creature) {
        print("Invalid: Dead");
    }

    /**
     * State shift not valid
     *
     * @param creature the Creature object to be shifted
     * */
    @Override
    public void report(Creature creature) {
        print("Invalid: Dead");
    }
}
