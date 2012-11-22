package com.google.gwt.maps.client.events.mapchange;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class MapChangeEventFormatter implements MapEventFormatter<MapChangeMapEvent> {

  @Override
  public MapChangeMapEvent createEvent(Properties properties) {
    return new MapChangeMapEvent(properties);
  }

}
