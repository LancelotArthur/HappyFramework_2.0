package entity.AnimalFactory;

import entity.Entity;

import java.util.ArrayList;

/**
 * 抽象工厂
 */
public abstract class AnimalFactory extends Entity {

    private int index = 0;

    public AnimalFactory() {
        index = 0;
    }

    public Animal getAnimal(String name, int life, int sex) {
        return createAnimal(name, life, sex);
    }

    public abstract Animal createAnimal(String name, int life, int sex);
}
