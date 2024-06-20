package org.example;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    List<Observer> observerList;
    double temperature;
    double humidity;
    double pressure;

    WeatherStation(){
        observerList=new ArrayList<>();
        this.temperature=0;
        this.humidity=0;
        this.pressure=0;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
    void  updateWeather(double temperature, double humidity, double pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;

        notifyALl();
    }

    @Override
    public void notifyALl(){
        for(Observer observer : observerList){
            observer.update(this.temperature,this.humidity,this.pressure);
        }
    }
}
