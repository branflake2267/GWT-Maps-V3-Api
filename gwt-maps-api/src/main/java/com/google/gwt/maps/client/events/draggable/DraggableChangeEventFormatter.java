package com.google.gwt.maps.client.events.draggable;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class DraggableChangeEventFormatter implements MapEventFormatter<DraggableChangedMapEvent> {

  @Override
  public DraggableChangedMapEvent createEvent(Properties properties) {
    return new DraggableChangedMapEvent(properties);
  }

}
