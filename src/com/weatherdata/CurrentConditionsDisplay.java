package com.weatherdata;

public class CurrentConditionsDisplay implements  Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject subject) {
        this.weatherData = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;

        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature  + "F degrees and " + humidity + "% humidity");
    }
}

