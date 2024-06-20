package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();
        Observer MobileDisplayObserver=new MobileDisplayObserver(weatherStation);
        Observer DesktopDisplayObserver=new DesktopDisplayObserver(weatherStation);
        weatherStation.registerObserver(MobileDisplayObserver);
        weatherStation.updateWeather(10.0,20.0,30.0);
    }
}