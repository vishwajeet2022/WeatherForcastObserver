package org.example;

public class MobileDisplayObserver implements Observer{
    WeatherStation weatherStation;
    MobileDisplayObserver(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(double temperature, double humidity, double pressure){
        System.out.println("Temperature "+temperature+"Humidity "+humidity+"Pressure "+pressure);
        }


}
