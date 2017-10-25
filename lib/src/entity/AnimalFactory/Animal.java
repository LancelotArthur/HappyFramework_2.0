package entity.AnimalFactory;

import entity.Entity;

/**
 * 抽象产品
 */
public abstract class Animal extends Entity {

    protected String name = "";
    protected int life = 0;
    protected int sex = 0;
    public static final int male = 0;
    public static final int female =1;

    public Animal() {
        this.name = "";
        this.life = 0;
        this.sex = 0;
    }

    public Animal(String name, int life, int sex) {
        this.name = name;
        this.life = life;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public abstract void run();
    public abstract void eat();
    public abstract void speak();
    public abstract void cost();

}
