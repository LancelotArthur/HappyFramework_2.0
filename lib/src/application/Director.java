package application;

import scene.Scene;
import scene.template.HomeScene;

public class Director implements Printable {

    private static Director director = new Director();
    public static Director getInstance() {
        return director;
    }

    private Scene currentRunningScene = new HomeScene();

    private Director() {

    }

    public Director setScene(Scene scene) {
        return setScene("", scene);
    }

    public Director setScene(String message, Scene scene) {
        if (currentRunningScene == scene) {
            return this;
        }
        currentRunningScene.end();
        currentRunningScene = scene;
        print(message + "Loading Scene: " + scene.getSceneName());
        scene.init();
        return this;
    }

    public Director runWithScene() {
        currentRunningScene.action();
        return this;
    }

    public void finalize() {
        currentRunningScene.end();
    }

}