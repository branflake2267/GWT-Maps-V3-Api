package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class WeatherConditionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.WEATHER };
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherConditions.newInstance();
				
				finishTest();
			}
		});
	}
	
	public void testDay() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherConditions conditions = WeatherConditions.newInstance();
				
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
				WeatherConditions conditions = WeatherConditions.newInstance();
				
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
				WeatherConditions conditions = WeatherConditions.newInstance();
				
				assertNull("Should be empty", conditions.getDescription());
				
				String expected = "Foo Description";
				conditions.setDescription(expected );
				assertEquals(expected, conditions.getDescription());
				
				finishTest();
			}
		});
	}
	
	public void testWindDirection() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherConditions conditions = WeatherConditions.newInstance();
				
				assertNull("Should be empty", conditions.getDescription());
				
				String expected = "NNE";
				conditions.setWindDirection(expected );
				assertEquals(expected, conditions.getWindDirection());
				
				finishTest();
			}
		});
	}
	
	public void testHigh() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherConditions conditions = WeatherConditions.newInstance();

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
				WeatherConditions conditions = WeatherConditions.newInstance();
				
				double expected = -12d;
				conditions.setLow(expected);
				assertEquals(expected, conditions.getLow());
				
				finishTest();
			}
		});
	}
	
	public void testHumidity() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherConditions conditions = WeatherConditions.newInstance();
				
				double expected = 0.45d;
				conditions.setHumidity(expected);
				assertEquals(expected, conditions.getHumidity(),1e-6);
				
				finishTest();
			}
		});
	}
	
	public void testTemperature() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherConditions conditions = WeatherConditions.newInstance();
				
				double expected = 45d;
				conditions.setTemperature(expected);
				assertEquals(expected, conditions.getTemperature(),1e-6);
				
				finishTest();
			}
		});
	}
	
	public void testWindSpeed() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherConditions conditions = WeatherConditions.newInstance();
				
				double expected = 345.4d;
				conditions.setWindSpeed(expected);
				assertEquals(expected, conditions.getWindSpeed(),1e-6);
				
				finishTest();
			}
		});
	}
}
