package application;

import scene.template.EndScene;
import scene.template.HomeScene;
import scene.template.WelcomeScene;


/**
 * Singleton
 * A simple director, encapsulates three commonly used scenes and allows simple shift scene methods
 */
public class ApplicationDispatcher implements Printable {

    private static ApplicationDispatcher instance = new ApplicationDispatcher();
    private HomeScene homeScene = new HomeScene();
    private WelcomeScene welcomeScene = new WelcomeScene();
    private EndScene endScene = new EndScene();

    private ApplicationDispatcher() {
    }

    /**
     * Get the instance
     */
    public static ApplicationDispatcher getInstance() {
        return instance;
    }

    /**
     * Get the cached Home Scene
     *
     * @param homeScene the homeScene to be cached
     * @return self
     */
    public ApplicationDispatcher setHomeScene(HomeScene homeScene) {
        this.homeScene = homeScene;
        return this;
    }

    /**
     * Get the cached Welcome Scene
     *
     * @param welcomeScene the welcomeScene to be cached
     * @return self
     */
    public ApplicationDispatcher setWelcomeScene(WelcomeScene welcomeScene) {
        this.welcomeScene = welcomeScene;
        return this;
    }

    /**
     * Get the cached End Scene
     *
     * @param endScene the endScene to be cached
     * @return self
     */
    public ApplicationDispatcher setEndScene(EndScene endScene) {
        this.endScene = endScene;
        return this;
    }

    /**
     * Shift to homeScene, and run
     *
     * @return self
     */
    public ApplicationDispatcher shiftHome() {
        Director.getInstance().setScene("Loading Home...", homeScene).runWithScene();
        return this;
    }

    /**
     * Shift to welcomeScene, and run
     *
     * @return self
     */
    public ApplicationDispatcher shiftWelcome() {
        Director.getInstance().setScene("Welcoming...", welcomeScene).runWithScene();
        return this;
    }

    /**
     * Shift to endScene, and run
     *
     * @return self
     */
    public ApplicationDispatcher shiftEnd() {
        Director.getInstance().setScene("Finalizing", endScene).runWithScene();
        return this;
    }
}
