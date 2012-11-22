package com.google.gwt.maps.client.events.dragstart;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class DragStartEventFormatter implements MapEventFormatter<DragStartMapEvent> {

  @Override
  public DragStartMapEvent createEvent(Properties properties) {
    return new DragStartMapEvent(properties);
  }

}
