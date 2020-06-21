package com.srikar.powermock.powermock_demo;

public abstract class TemperatureUtil {
	
	private TemperatureUtil() {}
	
	public static final int getTemperatureOfCityFromWeb(String city) {
		// Invoke a web service to get the real temperature
		return 24;
	}
}
