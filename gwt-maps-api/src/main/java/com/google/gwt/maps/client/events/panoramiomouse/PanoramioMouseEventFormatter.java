package com.google.gwt.maps.client.events.panoramiomouse;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class PanoramioMouseEventFormatter implements MapEventFormatter<PanoramioMouseMapEvent> {

  @Override
  public PanoramioMouseMapEvent createEvent(Properties properties) {
    return new PanoramioMouseMapEvent(properties);
  }

}
