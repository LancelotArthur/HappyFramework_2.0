package entity;

import application.Printable;
import entity.memento.Memento;
import entity.entityState.ActiveState;
import entity.entityState.State;

public abstract class Entity implements Printable, Cloneable {

    protected static long number = 0;
    protected long id;
    protected State state = null;

    protected Entity() {
        id = number++;
        state = new ActiveState();
    }

    public long getId() {
        return this.id;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }

    @Override
    public Object clone() {

        Object result = null;

        try {
            print("Cloning");
            result = super.clone();
            ((Entity) result).id = number++;

        } catch (CloneNotSupportedException e) {
            print("Oops, clone not supported");
        }

        return result;
    }

    public void weak() {
        this.state.handleWeak(this);
    }

    public void recover() {
        this.state.handleRecover(this);
    }

    public void diagnosis() {
        this.state.reportHealth(this);
    }

}
