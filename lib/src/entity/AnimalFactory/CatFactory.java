package entity.AnimalFactory;

/**
 * 具体工厂
 */
public class CatFactory extends AnimalFactory {

    @Override
    public Animal createAnimal(String name, int life, int sex) {
        return new Cat(name, life, sex);
    }
}
