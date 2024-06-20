package org.example;

public class DesktopDisplayObserver implements Observer{
    Subject weatherStation;
    double temperature;
    double humidity;
    double pressure;

    DesktopDisplayObserver(Subject weatherStation){
        this.weatherStation=weatherStation;
        weatherStation.registerObserver(this);
    }
    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;

        display();
    }
    public void display(){
        System.out.println("Temperature "+temperature+"Humidity "+humidity+"Pressure "+pressure);
    }
}
