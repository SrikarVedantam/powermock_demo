package com.srikar.powermock.powermock_demo;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.srikar.powermock.powermock_demo.Temperature;
import com.srikar.powermock.powermock_demo.TemperatureUtil;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.srikar.powermock.powermock_demo.*")
class TemperatureTest {

	@Before
	public void setUp() {
		// Mock the static method of TemperatureUtil class that returns the real
		// temperature of a city
		mockStatic(TemperatureUtil.class);
		// Set the expectation to define the values the util method should return when
		// invoked
		when(TemperatureUtil.getTemperatureOfCityFromWeb("Bangalore")).thenReturn(30);
		when(TemperatureUtil.getTemperatureOfCityFromWeb("Chennai")).thenReturn(40);
	}

	// Test class should have public zero-argument constructor
	public TemperatureTest() {
	}

	@Test
	public void testTemperature() {

		Temperature bangaloreTemp = new Temperature("Bangalore");
		assertEquals(30, bangaloreTemp.getTemperature());

		Temperature chennaiTemp = new Temperature("Chennai");
		assertEquals(40, chennaiTemp.getTemperature());
	}

}
