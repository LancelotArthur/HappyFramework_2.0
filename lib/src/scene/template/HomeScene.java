package scene.template;

import scene.Scene;

public class HomeScene extends Scene {

    public HomeScene() {
        super();
    }

    public HomeScene(String name) {
        super(name);
    }

    @Override
    public void init() {
        print("Story Starts! ");
    }

    @Override
    public void action() {

    }

    @Override
    public void end(){
        print("Continue... Working On It");
    }
}
