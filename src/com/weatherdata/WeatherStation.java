package com.weatherdata;

public class WeatherStation {

    public static void main(String[] args) {
	// write your code here

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(30,65,30.4f);
        weatherData.setMeasurements(38,30,36.4f);
        weatherData.setMeasurements(50,24,38.4f);
        weatherData.setMeasurements(67,78,40.4f);
    }
}
