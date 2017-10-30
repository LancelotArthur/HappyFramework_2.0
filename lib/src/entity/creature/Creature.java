package entity.creature;

import entity.Entity;
import entity.creature.state.health.Health;
import entity.creature.state.health.Well;

/**
 * The Abstract Creature class, base classes for all animals and plants
 *
 * @see entity.creature.plant.Plant
 * @see entity.creature.animal.Animal
 */
public abstract class Creature extends Entity {

    private Health health = Well.getInstance();

    /**
     * Recover method shifts the Creature to a better health state
     *
     * @return self
     */
    public Creature recover() {
        health.recover(this);
        return this;
    }

    /**
     * Decline method shifts the Creature to a worse health state
     *
     * @return self
     */
    public Creature decline() {
        health.decline(this);
        return this;
    }

    /**
     * Report method reports the Creature's health state to the console
     *
     * @return self
     */
    public Creature report() {
        health.report(this);
        return this;
    }

    /**
     * @return the health state of this object
     * */
    public Health getHealth() {
        return this.health;
    }

    //TODO MAKE PRIVATE
    /**
     * @param health the health state (singleton) to be set
     * @return self
     * */
    public Creature setHealth(Health health) {
        this.health = health;
        return this;
    }
}
