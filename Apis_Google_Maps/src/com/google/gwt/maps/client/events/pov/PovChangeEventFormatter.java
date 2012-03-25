package com.google.gwt.maps.client.events.pov;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class PovChangeEventFormatter implements MapEventFormatter<PovChangeMapEvent> {

  @Override
  public PovChangeMapEvent createEvent(Properties properties) {
    return new PovChangeMapEvent(properties);
  }

}
