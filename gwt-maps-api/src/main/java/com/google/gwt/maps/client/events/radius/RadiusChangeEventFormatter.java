package com.google.gwt.maps.client.events.radius;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class RadiusChangeEventFormatter implements MapEventFormatter<RadiusChangeMapEvent> {

  @Override
  public RadiusChangeMapEvent createEvent(Properties properties) {
    return new RadiusChangeMapEvent(properties);
  }

}
