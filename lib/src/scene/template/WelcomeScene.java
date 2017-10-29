package scene.template;

import scene.Scene;

public class WelcomeScene extends Scene {
    public WelcomeScene() {
        super();
    }

    public WelcomeScene(String name) {
        super(name);
    }

    @Override
    public void init() {

    }

    @Override
    public void action() {
        print("Welcome To Us……");
        print("ようこそわが家へ……");
        print("欢迎来到这里……");
        print("Bienvenus Chez Nous");
    }

    @Override
    public void end() {

    }
}
