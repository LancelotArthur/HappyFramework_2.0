package entity.human.event;

import application.Printable;
import entity.human.handler.Handler;

/**
 * The abstract event class
 * */
public abstract class Event implements Printable {

    private final int level;
    private boolean settled = false;

    /**
     * Constructor, level is the significance of the event
     * */
    public Event(int level) {
        this.level = level;
    }


    /**
     * The event happens
     * */
    public abstract void happen();


    /**
     * Request a handler to handle itself
     * */
    public void requestHandler(Handler handler) {
        if (settled) {
            return;
        }
        handler.handleRequest(this);
    }

    /**
     * Settle the event
     * */
    public void settle() {
        settled = true;
    }

    /**
     * @return the level of the event
     * */
    public int getLevel() {
        return level;
    }

    /**
     * @return if the event if settled
     * */
    public boolean isSettled() {
        return settled;
    }
}
