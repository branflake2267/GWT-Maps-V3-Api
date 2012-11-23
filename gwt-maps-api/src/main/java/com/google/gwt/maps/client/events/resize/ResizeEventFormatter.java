package com.google.gwt.maps.client.events.resize;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class ResizeEventFormatter implements MapEventFormatter<ResizeMapEvent> {

  @Override
  public ResizeMapEvent createEvent(Properties properties) {
    return new ResizeMapEvent(properties);
  }

}
