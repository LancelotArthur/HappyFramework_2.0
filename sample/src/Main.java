import allocator.Allocator;
import allocator.ObtainStrategy;
import entity.Factory;
import entity.creature.animal.template.Dog;





public class Main {
    public static void main(String[] args) {
        Allocator<Dog> dogAllocator = new Allocator<>(Dog.class);
        Factory factory = new Factory();

        Dog dog1 = dogAllocator.setObtainArguments(ObtainStrategy.PURCHASE).obtain();
        Dog dog3 = (Dog) factory.create("DOG");
        Dog dog4 = (Dog) factory.create("entity.creature.animal.template.Dog",
                new Object[]{"Cutie", false});
        dog4.pair();
        Dog dog2 = dogAllocator.setObtainArguments(ObtainStrategy.REPRODUCE).setMother(dog4).obtain();

    }
}
