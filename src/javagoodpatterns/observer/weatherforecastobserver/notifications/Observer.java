package javagoodpatterns.observer.weatherforecastobserver.notifications;

import javagoodpatterns.observer.weatherforecastobserver.weatherforecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
