package scene.template;

import scene.Scene;

public class SampleScene extends Scene {
    public SampleScene() {
        super();
    }

    @Override
    public void init() {
        print("Initializing scene...");
    }

    @Override
    public void action() {
        print("Scene acts...");
        // Write your code here.

//        // Timer test
//        Timer timer = Timer.getInstance();
//        long deltaTime = timer.getDeltaTime();
//        System.out.println(deltaTime);

//        // Allocator test
//        Allocator<Dog> dogAllocator = new Allocator<>();
//        dogAllocator.setObtainArguments(ObtainStrategy.PURCHASE);
//        Dog doggy = dogAllocator.obtain();
//        dogAllocator.setMother(doggy);
//        dogAllocator.setObtainArguments(ObtainStrategy.REPRODUCE);
//        Dog doggyChild = dogAllocator.obtain();
//
//        System.out.println(doggyChild.getClass());


        // TODO: Create entity using factory method or abstract factory method


//        // Transform test
//        Dog doggy = new Dog();
//        Transform<Dog, Dog> dogDogTransform = new Transform<>(doggy);
//        dogDogTransform.transform();
//        System.out.println(dogDogTransform.getTarget());


//        Staff staff = new Supervisor("a", true);
//        Iterator iterator =  staff.iterator();
//        iterator.hasNext()

    }
}
