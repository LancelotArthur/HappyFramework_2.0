package entity.entityState;

import application.Printable;
import entity.Entity;


public interface State extends Printable{
    void reportHealth(Entity entity);
    void handleWeak(Entity entity);
    void handleRecover(Entity entity);
}