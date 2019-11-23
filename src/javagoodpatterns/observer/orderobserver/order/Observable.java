package javagoodpatterns.observer.orderobserver.order;

import javagoodpatterns.observer.orderobserver.notifications.Observer;

public interface Observable {
    void registerObservator(Observer observer);
    void unregisterObservator(Observer observer);
    void notifyObservators();
}
