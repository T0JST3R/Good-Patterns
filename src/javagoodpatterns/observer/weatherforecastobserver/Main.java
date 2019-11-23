package javagoodpatterns.observer.weatherforecastobserver;

import javagoodpatterns.observer.weatherforecastobserver.notifications.InternetNews;
import javagoodpatterns.observer.weatherforecastobserver.notifications.RadioNews;
import javagoodpatterns.observer.weatherforecastobserver.notifications.TvNews;
import javagoodpatterns.observer.weatherforecastobserver.weatherforecast.WeatherForecast;

public class Main {
    public static void main(String[] args) {
        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();
        WeatherForecast weatherForecast = new WeatherForecast(20 , 1030);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.updateForecast(10 , 1000);
    }
}
