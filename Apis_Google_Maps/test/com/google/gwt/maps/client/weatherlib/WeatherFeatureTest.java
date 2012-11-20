package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class WeatherFeatureTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.WEATHER };
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherFeature.newInstance();
				
				finishTest();
			}
		});
	}
	
	public void testCurrent() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherFeature feature = WeatherFeature.newInstance();
				
				assertNull(feature.getCurrent());
				
				WeatherConditions expected = WeatherConditions.newInstance();
				expected.setDay("Monday");
				feature.setCurrent(expected);
				assertEquals("Current condiitons should match", expected.getDay(), feature.getCurrent().getDay());
				
				finishTest();
			}
		});
	}
	
	public void testLocation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherFeature feature = WeatherFeature.newInstance();
				
				String expected = "Fooville";
				feature.setLocation(expected);
				assertEquals(expected, feature.getLocation());
				
				finishTest();
			}
		});
	}
	
	public void testTemperatureUnit() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherFeature feature = WeatherFeature.newInstance();
				
				assertNull(feature.getTemperatureUnits());
				
				TemperatureUnit expected = TemperatureUnit.FAHRENHEIT;
				feature.setTemperatureUnits(expected);
				assertEquals(expected, feature.getTemperatureUnits());
				
				finishTest();
			}
		});
	}
	
	public void testWindSpeedUnit() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherFeature feature = WeatherFeature.newInstance();
				
				assertNull(feature.getWindSpeedUnits());
				
				WindSpeedUnit expected = WindSpeedUnit.METERS_PER_SECOND;
				feature.setWindSpeedUnits(expected);
				assertEquals(expected, feature.getWindSpeedUnits());
				
				finishTest();
			}
		});
	}
	
	public void testForecast() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				WeatherFeature feature = WeatherFeature.newInstance();
				
				WeatherForecast[] forecasts = new WeatherForecast[]{
						WeatherForecast.newInstance(),
						WeatherForecast.newInstance()
				};
				forecasts[0].setDescription("Foo0");
				forecasts[1].setDescription("Foo1");
				
				JsArray<WeatherForecast> forecastJsArray = ArrayHelper.toJsArray(forecasts);
				feature.setForecast(forecastJsArray);
				
				// check that we can pull them out
				JsArray<WeatherForecast> actual = feature.getForecast();
				assertEquals("Should get same array we put in", forecastJsArray.length(), actual.length());
				assertEquals(forecasts[0].getDescription(), forecastJsArray.get(0).getDescription());
				assertEquals(forecasts[1].getDescription(), forecastJsArray.get(1).getDescription());
				
				finishTest();
			}
		});
	}
}
