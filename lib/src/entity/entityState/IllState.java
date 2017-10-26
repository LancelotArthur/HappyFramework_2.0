package entity.entityState;

import entity.Entity;


public class IllState implements State {

    @Override
    public void reportHealth(Entity entity){
        print("I'm ill, someone come to help me!");
    }

    @Override
    public void handleWeak(Entity entity) {
        print("I'm dieing... Change state to dead.");
        entity.setState(new DeadState());
    }

    @Override
    public void handleRecover(Entity entity) {
        print("I'm recovered. Change state to Active.");
        entity.setState(new ActiveState());
    }
}
