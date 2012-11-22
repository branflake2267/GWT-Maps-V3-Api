package com.google.gwt.maps.client.events.shape;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class ShapeChangeEventFormatter implements MapEventFormatter<ShapeChangeMapEvent> {

  @Override
  public ShapeChangeMapEvent createEvent(Properties properties) {
    return new ShapeChangeMapEvent(properties);
  }

}
