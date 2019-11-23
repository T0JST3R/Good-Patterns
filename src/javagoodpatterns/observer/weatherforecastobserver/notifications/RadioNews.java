package javagoodpatterns.observer.weatherforecastobserver.notifications;

import javagoodpatterns.observer.weatherforecastobserver.weatherforecast.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Your RadioNews- Weather temperature is now "+ weatherForecast.getTemperature() + " and the pressure is: " + weatherForecast.getPressure() + "Best wishes :)");
    }
}
