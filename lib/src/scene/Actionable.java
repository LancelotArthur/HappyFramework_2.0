package scene;


/**
 * An Actionable Interface
 * @see Scene
 * */
public interface Actionable {
    /**
     * Used when a scene should do some initialization
     * */
    void init();

    /**
     * Used when the scene should perform some specified actions.
     * Called by the director class to run the scene
     * @see application.Director
     * */
    void action();

    /**
     * Used when the scene finishes running, and needs some cleanup.
     * */
    void end();
}
