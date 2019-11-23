package javagoodpatterns.observer.weatherforecastobserver.weatherforecast;

import javagoodpatterns.observer.weatherforecastobserver.notifications.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {
    private int temperature;
    private int pressure;
    private Set<Observer> observers = new HashSet<>();


    public void updateForecast(int temperature , int pressure){
        setPressure(pressure);
        setTemperature(temperature);
        notifyObservers();
    }
    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    private void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers) {
            observer.updateForecast(this);

        }
    }

}
