package javagoodpatterns.observer.weatherforecastobserver.weatherforecast;

import javagoodpatterns.observer.weatherforecastobserver.notifications.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
