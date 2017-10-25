package entity.AnimalFactory;

/**
 * 具体产品
 */
public class Cat extends Animal {

    public Cat(String name, int life, int sex){
        super(name, life, sex);
    }

    @Override
    public void cost() { print("10$"); }

    public void run() { print("fast"); }

    public void eat() { print("a little"); }

    public void speak() {
        print("喵喵喵");
    }

}
