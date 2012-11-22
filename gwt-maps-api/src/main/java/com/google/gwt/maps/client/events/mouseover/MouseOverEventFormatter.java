package com.google.gwt.maps.client.events.mouseover;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class MouseOverEventFormatter implements MapEventFormatter<MouseOverMapEvent> {

  @Override
  public MouseOverMapEvent createEvent(Properties properties) {
    return new MouseOverMapEvent(properties);
  }

}
