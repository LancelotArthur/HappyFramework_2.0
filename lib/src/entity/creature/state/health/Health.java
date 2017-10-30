package entity.creature.state.health;

import application.Printable;
import entity.creature.Creature;
import entity.creature.state.abstraction.State;


/**
 * The Health State interface
 * */
public interface Health extends State, Printable {

    /**
     * Recover method, shift a creature to a better health condition
     *
     * @param creature the Creature object to be shifted
     * */
    default void recover(Creature creature) {
        print("The creature is so healthy, running around without looking at you.");
    }

    /**
     * Decline method, shift a creature to a worse health condition
     *
     * @param creature the Creature object to be shifted
     * */
    default void decline(Creature creature) {
        print("The creature died");
        creature.setHealth(Dead.getInstance());
    }

    /**
     * Report method, send a message about the creature to console
     *
     * @param creature the Creature object to be reported
     * */
    default void report(Creature creature) {
        print("The creature is in such a health state: " + creature.getHealth().getClass().getTypeName());
    }
}