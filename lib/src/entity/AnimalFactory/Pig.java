package entity.AnimalFactory;

public class Pig extends Animal {

    public Pig(String name, int life, int sex)
    {
        super(name, life, sex);
    }

    @Override
    public void cost() { print("100$"); }
    public void run() { print("very slow"); }
    public void eat() { print("a great deal"); }
    public void speak() {
        print("哼哼哼");
    }
}
