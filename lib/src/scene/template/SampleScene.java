package scene.template;

import application.ConcreteMediator;
import entity.human.templete.ConcreteHandler;
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

        //mediator test
        ConcreteMediator mediator = new ConcreteMediator();
        SceneA sceneA = new SceneA("sceneA",mediator);
        SceneB sceneB = new SceneB("sceneB",mediator);
        SceneC sceneC = new SceneC("sceneC",mediator);
        mediator.setSceneA(sceneA);
        mediator.setSceneB(sceneB);
        mediator.setSceneC(sceneC);
        sceneA.change("b");
        sceneB.change("c");
        sceneC.change("a");

        //Chain of Responsibility test
        ConcreteHandler handler1 = new ConcreteHandler("Ya",false,17);
        ConcreteHandler handler2 = new ConcreteHandler("Bob",false,20,7);
        ConcreteHandler handler3 = new ConcreteHandler("May",true,25,8);
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        handler1.handleRequest(5);
        handler1.handleRequest(1);



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
