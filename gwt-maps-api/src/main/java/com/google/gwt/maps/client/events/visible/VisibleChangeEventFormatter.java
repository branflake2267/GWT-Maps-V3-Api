package com.google.gwt.maps.client.events.visible;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class VisibleChangeEventFormatter implements MapEventFormatter<VisibleChangeMapEvent> {

  @Override
  public VisibleChangeMapEvent createEvent(Properties properties) {
    return new VisibleChangeMapEvent(properties);
  }

}
