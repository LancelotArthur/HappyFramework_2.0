package entity.creature.animal;

import behavior.animal.AnimalBehavior;
import entity.creature.Creature;
import entity.creature.state.pregnancy.Male;
import entity.creature.state.pregnancy.NonPregnant;
import entity.creature.state.pregnancy.Pregnancy;
import entity.creature.state.pregnancy.Pregnant;

import java.util.Random;

public abstract class Animal extends Creature implements AnimalBehavior {

    private boolean gender;
    private String name;
    private double age;
    private Pregnancy pregnancy = NonPregnant.getInstance();


    protected Animal(String name, boolean gender) {
        this(name, gender, 0);
    }

    protected Animal(String name, boolean gender, double age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        if (gender) {
            pregnancy = Male.getInstance();
        }
    }

    protected Animal(String name) {
        this(name, true, 0);
    }

    protected Animal() {
        this("", true, 0);
    }

    protected Animal(boolean gender) {
        this("", gender, 0);
    }

    public boolean isMale() {
        return gender;
    }

    void setGender(boolean isMale) {
        this.gender = isMale;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    void setAge(double age) {
        this.age = age;
    }

    //TODO MAKE PRIVATE
    public void setPregnancy(Pregnancy pregnancy) {
        this.pregnancy = pregnancy;
    }

    public boolean isPregnant() {
        return (pregnancy == Pregnant.getInstance());
    }


    public void pair() {
        pregnancy.pair(this);
    }

    public Animal giveBirth() {
        return pregnancy.giveBirth(this);
    }


    @Override
    public Object clone() {
        Object object = super.clone();
        ((Animal) object).gender = new Random().nextBoolean();
        return object;
    }
}
