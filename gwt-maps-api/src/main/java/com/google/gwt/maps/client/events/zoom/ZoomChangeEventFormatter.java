package com.google.gwt.maps.client.events.zoom;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class ZoomChangeEventFormatter implements MapEventFormatter<ZoomChangeMapEvent> {

  @Override
  public ZoomChangeMapEvent createEvent(Properties properties) {
    return new ZoomChangeMapEvent(properties);
  }

}
