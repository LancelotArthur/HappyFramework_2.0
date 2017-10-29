package entity.memento;

import entity.Entity;

import java.util.HashMap;
import java.util.Map;

public class ECMap {
    private Map<Entity, CareTaker> map = new HashMap<>();

    public CareTaker getCareTaker(Entity entity) {
        return map.get(entity);
    }

    public void insert(Entity entity, CareTaker careTaker) {
        map.put(entity, careTaker);
    }
}
