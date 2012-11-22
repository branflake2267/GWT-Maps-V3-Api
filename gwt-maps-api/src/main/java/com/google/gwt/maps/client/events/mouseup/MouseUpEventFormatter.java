package com.google.gwt.maps.client.events.mouseup;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class MouseUpEventFormatter implements MapEventFormatter<MouseUpMapEvent> {

  @Override
  public MouseUpMapEvent createEvent(Properties properties) {
    return new MouseUpMapEvent(properties);
  }

}
