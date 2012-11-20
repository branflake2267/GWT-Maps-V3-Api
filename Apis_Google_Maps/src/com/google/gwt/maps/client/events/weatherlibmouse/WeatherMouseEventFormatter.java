package com.google.gwt.maps.client.events.weatherlibmouse;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class WeatherMouseEventFormatter implements MapEventFormatter<WeatherMouseMapEvent> {

  @Override
  public WeatherMouseMapEvent createEvent(Properties properties) {
    return new WeatherMouseMapEvent(properties);
  }

}