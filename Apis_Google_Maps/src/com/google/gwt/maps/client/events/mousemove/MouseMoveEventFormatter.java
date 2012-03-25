package com.google.gwt.maps.client.events.mousemove;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class MouseMoveEventFormatter implements MapEventFormatter<MouseMoveMapEvent> {

  @Override
  public MouseMoveMapEvent createEvent(Properties properties) {
    return new MouseMoveMapEvent(properties);
  }

}
