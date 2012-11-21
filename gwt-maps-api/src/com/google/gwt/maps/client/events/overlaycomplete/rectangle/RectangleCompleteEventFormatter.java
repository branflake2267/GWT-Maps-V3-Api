package com.google.gwt.maps.client.events.overlaycomplete.rectangle;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class RectangleCompleteEventFormatter implements MapEventFormatter<RectangleCompleteMapEvent> {

  @Override
  public RectangleCompleteMapEvent createEvent(Properties properties) {
    return new RectangleCompleteMapEvent(properties);
  }

}
