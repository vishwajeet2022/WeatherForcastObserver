package org.example;

public class MobileDisplayObserver implements Observer{
    WeatherStation weatherStation;
    MobileDisplayObserver(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(double temperature, double humidity, double pressure){
        System.out.println("For mobile:"+"\nTemperature "+temperature+"\nHumidity "+humidity+"\nPressure "+pressure);
        }


}
