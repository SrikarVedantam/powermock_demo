package com.srikar.powermock.powermock_demo;

import java.util.Random;

public abstract class TemperatureUtil {
	
	private TemperatureUtil() {}
	
	public static int getTemperatureOfCityFromWeb(String city) {
		// Invoke a web service to get the real temperature
		return new Random().nextInt(100);
	}
}
