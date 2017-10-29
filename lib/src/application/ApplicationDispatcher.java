package application;

import scene.template.EndScene;
import scene.template.HomeScene;
import scene.template.WelcomeScene;

public class ApplicationDispatcher implements Printable {

    private static ApplicationDispatcher instance = new ApplicationDispatcher();
    private HomeScene homeScene = new HomeScene();
    private WelcomeScene welcomeScene = new WelcomeScene();
    private EndScene endScene = new EndScene();

    private ApplicationDispatcher() {
    }

    public static ApplicationDispatcher getInstance() {
        return instance;
    }

    public ApplicationDispatcher setHomeScene(HomeScene homeScene) {
        this.homeScene = homeScene;
        return this;
    }

    public ApplicationDispatcher setWelcomeScene(WelcomeScene welcomeScene) {
        this.welcomeScene = welcomeScene;
        return this;
    }

    public ApplicationDispatcher setEndScene(EndScene endScene) {
        this.endScene = endScene;
        return this;
    }

    public ApplicationDispatcher shiftHome() {
        Director.getInstance().setScene("Loading Home...", homeScene).runWithScene();
        return this;
    }

    public ApplicationDispatcher shiftWelcome() {
        Director.getInstance().setScene("Welcoming...", welcomeScene).runWithScene();
        return this;
    }

    public ApplicationDispatcher shiftEnd() {
        Director.getInstance().setScene("Finalizing", endScene).runWithScene();
        return this;
    }
}
