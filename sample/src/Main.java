import application.ApplicationDispatcher;
import application.Director;
import application.SceneLoader;
import entity.Prototype;
import scene.Scene;


public class Main {
    public static void main(String[] args) {

        Scene scene = SceneLoader.getInstance().load("Default_0.scene");
        scene.addChild(Prototype.getInstance().getByPrototype("Cow"));
        SceneLoader.getInstance().save(scene);

        Director.getInstance().setScene(scene).runWithScene();

        ApplicationDispatcher.getInstance().shiftWelcome();
        Director.getInstance().runWithScene();

    }
}
