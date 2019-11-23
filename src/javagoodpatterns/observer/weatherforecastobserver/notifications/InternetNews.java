package javagoodpatterns.observer.weatherforecastobserver.notifications;

import javagoodpatterns.observer.weatherforecastobserver.weatherforecast.WeatherForecast;

public class InternetNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Your Internet news- Weather temperature is now "+ weatherForecast.getTemperature() + " and the pressure is: " + weatherForecast.getPressure() + "Best wishes :)");
    }
}
