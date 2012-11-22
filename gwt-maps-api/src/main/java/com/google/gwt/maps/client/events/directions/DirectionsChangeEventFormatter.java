package com.google.gwt.maps.client.events.directions;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class DirectionsChangeEventFormatter implements MapEventFormatter<DirectionsChangeMapEvent> {

  @Override
  public DirectionsChangeMapEvent createEvent(Properties properties) {
    return new DirectionsChangeMapEvent(properties);
  }

}
