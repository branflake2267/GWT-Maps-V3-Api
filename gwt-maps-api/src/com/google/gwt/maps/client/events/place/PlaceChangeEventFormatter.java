package com.google.gwt.maps.client.events.place;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class PlaceChangeEventFormatter implements MapEventFormatter<PlaceChangeMapEvent> {

  @Override
  public PlaceChangeMapEvent createEvent(Properties properties) {
    return new PlaceChangeMapEvent(properties);
  }

}
