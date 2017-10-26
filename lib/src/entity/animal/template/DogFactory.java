package entity.animal.template;

import entity.animal.Animal;
import entity.animal.AnimalFactory;

/**
 * 具体工厂
 */
public class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal(String name, boolean sex, double life, boolean pregnant) {
        print("Creating Dog...");
        return new Dog(name, sex, life, pregnant);
    }

    @Override
    public Animal createAnimal(String name, boolean sex, double life) {
        print("Creating Dog...");
        return new Dog(name, sex, life);
    }

    @Override
    public Animal createAnimal(String name, boolean sex) {
        print("Creating Dog...");
        return new Dog(name, sex);
    }

    @Override
    public Animal createAnimal(String name) {
        print("Creating Dog...");
        return new Dog(name);
    }

    @Override
    public Animal createAnimal() {
        return null;
    }
}
