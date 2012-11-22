package com.google.gwt.maps.client.events.pano;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class PanoChangeEventFormatter implements MapEventFormatter<PanoChangeMapEvent> {

  @Override
  public PanoChangeMapEvent createEvent(Properties properties) {
    return new PanoChangeMapEvent(properties);
  }

}
