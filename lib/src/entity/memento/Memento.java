package entity.memento;

import entity.creature.state.health.Health;

public class Memento {
    private Health health = null;

    public Memento(Health health) {
        this.health = health;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }
}
