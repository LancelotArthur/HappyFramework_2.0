package behavior.observe;


/**
 * The Observer mechanism interface, Subscriber is a alias for the Observer
 * This interface defines a same method as the Performable interface, implemented by all humans
 * So there is technically no reason to put it there on human class definitions.
 * However this is to clarify that the observer mechanism is being used explicitly.
 * When defining new Human classes, you should notice that if the class acts as a observer,
 * it will call performAction() method defined in the super classes, which might be irrelevant.
 * Override that function so that it does not act strangely.
 *
 * @see behavior.skill.Performable
 * @see entity.human.Human
 * @see Publisher
 * @see entity.human.observer.Secretary
 */
public interface Subscriber {
    /**
     * When the subscriber is notified about the change, it calls the performAction() method
     */
    void performAction();
}
