package com.srikar.powermock.powermock_demo;

public class Temperature {
	
	private String city;
	
	public Temperature(String city) {
		this.city = city;
	}
	
	public int getTemperature() {
		return TemperatureUtil.getTemperatureOfCityFromWeb(city);
	}
}
