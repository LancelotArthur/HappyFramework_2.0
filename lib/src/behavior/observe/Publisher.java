package behavior.observe;

import behavior.human.Command;

/**
 * The Observer mechanism interface, Publisher is a alias for the subject
 *
 * @see Subscriber
 * @see entity.human.Human
 * @see entity.human.observer.Manager
 */
public interface Publisher {
    /**
     * Register a subscriber, whom the publisher is responsible to notify when a stated change occurs.
     *
     * @param subscriber the subscriber to be registered
     * @return if the registration succeeded
     */
    boolean registerSubscriber(Subscriber subscriber);

    /**
     * Delete a subscriber, whom the publisher will no longer notify when a stated change occurs.
     *
     * @param subscriber the subscriber to be deleted
     * @return if the un-subscription succeeded
     */
    boolean deleteSubscriber(Subscriber subscriber);

    /**
     * When the stated change occurs, the notifyObserver() method will be called.
     *
     * @param command the command to be sent to be subscribers, which might be used to perform further action.
     */
    void notifyObserver(Command command);
}
