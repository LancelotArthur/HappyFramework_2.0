package scene.template;

import scene.Scene;


/**
 * Template End Scene
 * */
public class EndScene extends Scene {

    public EndScene() {
        super();
    }

    public EndScene(String name) {
        super(name);
    }

    @Override
    public void init() {
        print("The Story is about to end.");
    }

    @Override
    public void action() {

    }

    @Override
    public void end() {
        print("Goodbye!");
    }
}
