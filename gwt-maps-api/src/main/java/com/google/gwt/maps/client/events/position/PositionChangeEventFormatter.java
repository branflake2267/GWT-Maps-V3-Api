package com.google.gwt.maps.client.events.position;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class PositionChangeEventFormatter implements MapEventFormatter<PositionChangeMapEvent> {

  @Override
  public PositionChangeMapEvent createEvent(Properties properties) {
    return new PositionChangeMapEvent(properties);
  }

}
