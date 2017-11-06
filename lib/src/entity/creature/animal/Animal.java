package entity.creature.animal;

import behavior.creature.animal.AnimalBehavior;
import entity.creature.Creature;
import entity.creature.state.pregnancy.Male;
import entity.creature.state.pregnancy.NonPregnant;
import entity.creature.state.pregnancy.Pregnancy;
import entity.creature.state.pregnancy.Pregnant;
import java.util.Random;

/**
 * The Abstract Animal Class
 * Base class for all animals
 *
 * @see Creature
 * */
public abstract class Animal extends Creature implements AnimalBehavior {

    private boolean gender;
    private String name;
    private double age;
    private Pregnancy pregnancy = NonPregnant.getInstance();


    /**Constructors*/
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


    /**
     * Speak the specified message, print to console
     * */
    public void speak(String speech) {
        print(speech);
    }


    /**
     * @return if the animal is male.
     * */
    public boolean isMale() {
        return gender;
    }

    void setGender(boolean isMale) {
        this.gender = isMale;
    }


    /**
     * @return the animal's name
     * */
    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }


    /**
     * @return the animal's age
     * */
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

    /**
     * @return if the animal is pregnant
     * */
    public boolean isPregnant() {
        return (pregnancy == Pregnant.getInstance());
    }


    /**
     * Pair the animal,
     * making it pregnant, if not female and not pregnant.
     * unchanged otherwise
     * */
    public void pair() {
        pregnancy.pair(this);
    }

    /**
     * Demand the animal give birth
     * return an Animal copy, making it non-pregnant, if female and pregnant.
     * unchanged otherwise
     * @return an animal copy
     * */
    public Animal giveBirth() {
        return pregnancy.giveBirth(this);
    }


    /**
     * Override the object clone() method,
     * return the same animal, age reset, gender set randomly
     * */
    @Override
    public Object clone() {
        Object object = super.clone();
        ((Animal) object).gender = new Random().nextBoolean();
        ((Animal) object).age = 0;

        return object;
    }
}
