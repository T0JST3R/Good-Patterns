package javagoodpatterns.observer.weatherforecastobserver.notifications;

import javagoodpatterns.observer.weatherforecastobserver.weatherforecast.WeatherForecast;

public class TvNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Your Tv news Weather temperature is now "+ weatherForecast.getTemperature() + " and the pressure is: " + weatherForecast.getPressure() + "Best wishes :)");
    }
}
