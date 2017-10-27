
import entity.Prototype;
import entity.creature.animal.template.Pig;



public class Main {
    public static void main(String[] args) {
        Pig pig = (Pig) Prototype.getInstance().getByPrototype("PIG");
        pig.speak();

    }
}
