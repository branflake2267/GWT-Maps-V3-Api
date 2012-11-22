package com.google.gwt.maps.client.events.mousedown;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class MouseDownEventFormatter implements MapEventFormatter<MouseDownMapEvent> {

  @Override
  public MouseDownMapEvent createEvent(Properties properties) {
    return new MouseDownMapEvent(properties);
  }

}
