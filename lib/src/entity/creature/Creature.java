package entity.creature;

import entity.Entity;
import entity.creature.state.health.Health;
import entity.creature.state.health.Well;
import entity.memento.Memento;

public abstract class Creature extends Entity {

    private Health health = Well.getInstance();

    public Creature recover() {
        health.recover(this);
        return this;
    }

    public Creature decline() {
        health.decline(this);
        return this;
    }

    public Creature report() {
        health.report(this);
        return this;
    }

    public Health getHealth() {
        return this.health;
    }

    //TODO MAKE PRIVATE
    public Creature setHealth(Health health) {
        this.health = health;
        return this;
    }


    public Memento saveStateToMemento() {
        return new Memento(health);
    }

    public void restoreState(Memento Memento) {
        try {
            health = (Health) Memento.getHealth();
        } catch (ClassCastException e) {
            print("Memento Type Not Compatible");
            e.printStackTrace();
        }

    }
}
