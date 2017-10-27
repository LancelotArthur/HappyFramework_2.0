package entity.creature.state.health;

import application.Printable;
import entity.creature.Creature;


public interface Health extends Printable {

    default void recover(Creature creature) {
        print("The creature is so healthy, running around without looking at you.");
    }

    default void decline(Creature creature) {
        print("The creature died");
        creature.setHealth(new Dead());
    }

    default void report(Creature creature) {
        print("The creature is in such a health state: " + creature.getHealth().getClass().getTypeName());
    }
}