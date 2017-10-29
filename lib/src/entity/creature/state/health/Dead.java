package entity.creature.state.health;

import entity.creature.Creature;

public class Dead implements Health {

    private static Dead instance = new Dead();

    public static Dead getInstance() {
        return instance;
    }

    @Override
    public void recover(Creature creature) {
        print("Invalid: Dead");
    }

    @Override
    public void decline(Creature creature) {
        print("Invalid: Dead");
    }

    @Override
    public void report(Creature creature) {
        print("Invalid: Dead");
    }
}
