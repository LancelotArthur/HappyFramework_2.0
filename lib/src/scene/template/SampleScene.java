package scene.template;

import scene.Scene;

public class SampleScene extends Scene {
    public SampleScene() {
        super();
    }

    public SampleScene(String name) {
        super(name);
    }

    @Override
    public void init() {
        print("Initializing scene...");
    }

    @Override
    public void end() {
        print("Continue...");
    }

    @Override
    public void action() {

    }
}
