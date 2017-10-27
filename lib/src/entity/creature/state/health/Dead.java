package entity.creature.state.health;

import entity.creature.Creature;

public class Dead implements Health {

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
