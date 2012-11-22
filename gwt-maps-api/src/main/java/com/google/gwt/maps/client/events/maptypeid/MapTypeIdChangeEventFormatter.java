package com.google.gwt.maps.client.events.maptypeid;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class MapTypeIdChangeEventFormatter implements MapEventFormatter<MapTypeIdChangeMapEvent> {

  @Override
  public MapTypeIdChangeMapEvent createEvent(Properties properties) {
    return new MapTypeIdChangeMapEvent(properties);
  }

}
