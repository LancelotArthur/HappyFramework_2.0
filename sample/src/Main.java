import application.SceneLoader;
import entity.Prototype;
import entity.building.Builder;
import scene.Scene;


public class Main {
    public static void main(String[] args) {

        Scene scene = SceneLoader.getInstance().load("Default_0.scene");
        scene.addChild(Prototype.getInstance().getByPrototype("Cow"));
        scene.addChild(Builder.getInstance().build("Field"));
        SceneLoader.getInstance().save(scene,"hello");
        scene = null;
        scene = SceneLoader.getInstance().load("Default_0.scene");
        scene.print("Description");
    }

}
