package entity.entityState;

import entity.Entity;


public class ActiveState implements State {

    @Override
    public void reportHealth(Entity entity) {
        print("I'm fine.");
    }

    @Override
    public void handleWeak(Entity entity) {
        print("I'm getting weaker... Change state to Ill.");
        entity.setState(new IllState());
    }

    @Override
    public void handleRecover(Entity entity) {
        print("I'm healthy... State is still Active");
    }
}
