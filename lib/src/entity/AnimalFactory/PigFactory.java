package entity.AnimalFactory;

public class PigFactory extends AnimalFactory {
    @Override
    public Animal createAnimal(String name, int life, int sex) {
        return new Pig(name, life, sex);
    }
}
