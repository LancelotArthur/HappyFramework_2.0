package entity.creature.state.health;

import entity.creature.Creature;


public class Well implements Health {

    private static Well instance = new Well();
    public static Well getInstance(){
        return instance;
    }

    @Override
    public void decline(Creature creature) {
        print("Becoming Sick");
        creature.setHealth(Sick.getInstance());
    }
}
