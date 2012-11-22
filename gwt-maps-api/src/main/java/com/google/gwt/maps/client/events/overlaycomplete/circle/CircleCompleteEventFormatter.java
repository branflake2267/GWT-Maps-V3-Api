package com.google.gwt.maps.client.events.overlaycomplete.circle;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class CircleCompleteEventFormatter implements MapEventFormatter<CircleCompleteMapEvent> {

  @Override
  public CircleCompleteMapEvent createEvent(Properties properties) {
    return new CircleCompleteMapEvent(properties);
  }

}
