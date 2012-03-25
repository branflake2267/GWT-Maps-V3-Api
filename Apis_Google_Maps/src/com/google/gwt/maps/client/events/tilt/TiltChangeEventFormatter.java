package com.google.gwt.maps.client.events.tilt;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class TiltChangeEventFormatter implements MapEventFormatter<TiltChangeMapEvent> {

  @Override
  public TiltChangeMapEvent createEvent(Properties properties) {
    return new TiltChangeMapEvent(properties);
  }

}
