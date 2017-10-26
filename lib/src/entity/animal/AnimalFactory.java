package entity.animal;

import entity.animal.Animal;
import entity.Entity;

import java.util.ArrayList;

/**
 * 抽象工厂
 */
public abstract class AnimalFactory extends Entity {

    protected int index = 0;

    public AnimalFactory() {
        index = 0;
    }

    public abstract Animal createAnimal(String name, boolean sex, double life, boolean pregnant);
    public abstract Animal createAnimal(String name, boolean sex, double life);
    public abstract Animal createAnimal(String name, boolean sex);
    public abstract Animal createAnimal(String name);
    public abstract Animal createAnimal();
}
