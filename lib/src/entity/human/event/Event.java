package entity.human.event;

import application.Printable;
import entity.human.handler.Handler;

public abstract class Event implements Printable {

    private final int level;
    private boolean settled = false;

    public Event(int level) {
        this.level = level;
    }


    public abstract void happen();

    public void requestHandler(Handler handler) {
        if (settled) {
            return;
        }
        handler.handleRequest(this);
    }

    public void settle() {
        settled = true;
    }

    public int getLevel() {
        return level;
    }

    public boolean isSettled() {
        return settled;
    }
}
