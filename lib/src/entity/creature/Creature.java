package entity.creature;

import entity.Entity;
import entity.creature.state.health.Health;
import entity.creature.state.health.Well;
import entity.memento.Memento;

public abstract class Creature extends Entity {
    private Health health = Well.getInstance();


    public void recover() {
        health.recover(this);
    }

    public void decline() {
        health.decline(this);
    }

    public void report() {
        health.report(this);
    }

    public Health getHealth() {
        return this.health;
    }

    //TODO MAKE PRIVATE
    public void setHealth(Health health) {
        this.health = health;
    }

    public Memento saveStateToMemento() {
        return new Memento(health);
    }

    public void getStateFromMemento(Memento Memento) {
        health = Memento.getHealth();
    }
}
