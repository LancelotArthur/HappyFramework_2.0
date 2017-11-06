package application;

import scene.Scene;
import scene.template.HomeScene;

/**
 * Singleton
 * Director works as the mediator between different scenes created by users
 * It can apply scene shifts cleanups for most of the times
 */
public class Director implements Printable {

    private static Director director = new Director();
    private Scene currentRunningScene = new HomeScene();

    private Director() {

    }

    /**
     * Get singleton
     */
    public static Director getInstance() {
        return director;
    }

    /**
     * Set the current scene to scene, with an empty prompt message.
     *
     * @param scene scene to be shifted to
     */
    public Director setScene(Scene scene) {
        return setScene("", scene);
    }


    /**
     * Set the current scene to scene, with an prompt message printed tp the console.
     * The current running scene would be cleaned up, with calling the end() method.
     * The argument scene would be initialized
     *
     * @param scene scene to be shifted to
     * @return self
     */
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

    /**
     * Run the current running scene.
     *
     * @return self
     */
    public Director runWithScene() {
        currentRunningScene.action();
        return this;
    }

    /**
     * Call the end() method on the current running scene for final cleanup.
     */
    public void finalize() {
        currentRunningScene.end();
    }

}