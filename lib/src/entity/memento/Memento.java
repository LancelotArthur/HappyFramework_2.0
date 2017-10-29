package entity.memento;

import entity.creature.state.abstraction.State;

public class Memento {

    private State state = null;

    public Memento(State state) {
        this.state = state;
    }

    public State getHealth() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
