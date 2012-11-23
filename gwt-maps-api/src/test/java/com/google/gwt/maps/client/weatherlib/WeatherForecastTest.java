package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class WeatherForecastTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.WEATHER };
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherForecast.newInstance();
				
				finishTest();
			}
		});
	}
	
	public void testDay() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherForecast conditions = WeatherForecast.newInstance();
				
				assertNull("Should be empty", conditions.getDay());
				
				String expected = "Tuesday";
				conditions.setDay(expected );
				assertEquals("Days should match", expected, conditions.getDay());
				
				finishTest();
			}
		});
	}
	
	public void testShortDay() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherForecast conditions = WeatherForecast.newInstance();
				
				assertNull("Should be empty", conditions.getShortDay());
				
				String expected = "T";
				conditions.setShortDay(expected );
				assertEquals("Days should match", expected, conditions.getShortDay());
				
				finishTest();
			}
		});
	}
	
	public void testDescription() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherForecast conditions = WeatherForecast.newInstance();
				
				assertNull("Should be empty", conditions.getDescription());
				
				String expected = "Foo Description";
				conditions.setDescription(expected );
				assertEquals(expected, conditions.getDescription());
				
				finishTest();
			}
		});
	}
	
	public void testHigh() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherForecast conditions = WeatherForecast.newInstance();

				double expected = 95d;
				conditions.setHigh(expected);
				assertEquals(expected, conditions.getHigh());
				
				finishTest();
			}
		});
	}
	
	public void testLow() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherForecast conditions = WeatherForecast.newInstance();
				
				double expected = -12d;
				conditions.setLow(expected);
				assertEquals(expected, conditions.getLow());
				
				finishTest();
			}
		});
	}

}
