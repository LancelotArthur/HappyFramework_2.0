package entity.memento;

import entity.entityState.State;

public class Memento {
    private State state = null;

    public Memento(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
