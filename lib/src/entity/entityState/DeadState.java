package entity.entityState;

import entity.Entity;


public class DeadState implements State {

    @Override
    public void reportHealth(Entity entity) {
        print("Die Die Die...");
    }

    @Override
    public void handleWeak(Entity entity) {
        print("I'm already dead. State is still dead.");
    }

    @Override
    public void handleRecover(Entity entity) {
        print("I'm feeling better... Change state to ill.");
        entity.setState(new IllState());
    }
}
