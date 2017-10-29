package behavior.observe;

import behavior.human.Command;

public interface Publisher {
    boolean registerSubscriber(Subscriber subscriber);

    boolean deleteSubscriber(Subscriber subscriber);

    void notifyObserver(Command command);
}
