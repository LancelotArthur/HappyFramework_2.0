package scene.template;

import allocator.Allocator;
import allocator.Strategy;
import entity.Transform;
import entity.animal.template.Dog;
import entity.plant.template.AppleTree;
import scene.Scene;

public class SampleScene extends Scene {
    public SampleScene() {
        super();
    }

    public SampleScene(String string) {
        super(string);
    }


    @Override
    public void action() {
        // TODO: Create entity using factory method or abstract factory method
        Dog doggy = new Dog();
        doggy.move();
        doggy.speak();



        AppleTree appleTree = new AppleTree();
        Allocator<AppleTree> appleTreeAllocator = new Allocator<>();
        appleTreeAllocator.setObtainArguments(Strategy.PURCHASE, null);
        AppleTree tree1 = appleTreeAllocator.obtain();
        appleTreeAllocator.setObtainArguments(Strategy.REPRODUCE, appleTree);
        AppleTree tree2 = appleTreeAllocator.obtain();


    }
}
