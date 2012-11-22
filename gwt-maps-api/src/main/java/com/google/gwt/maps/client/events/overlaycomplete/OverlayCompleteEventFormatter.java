package com.google.gwt.maps.client.events.overlaycomplete;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class OverlayCompleteEventFormatter implements MapEventFormatter<OverlayCompleteMapEvent> {

  @Override
  public OverlayCompleteMapEvent createEvent(Properties properties) {
    return new OverlayCompleteMapEvent(properties);
  }

}
