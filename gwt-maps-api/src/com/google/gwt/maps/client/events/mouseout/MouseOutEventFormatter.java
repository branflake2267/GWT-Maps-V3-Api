package com.google.gwt.maps.client.events.mouseout;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class MouseOutEventFormatter implements MapEventFormatter<MouseOutMapEvent> {

  @Override
  public MouseOutMapEvent createEvent(Properties properties) {
    return new MouseOutMapEvent(properties);
  }

}
