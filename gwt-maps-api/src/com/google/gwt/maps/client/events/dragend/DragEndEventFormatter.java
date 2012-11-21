package com.google.gwt.maps.client.events.dragend;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class DragEndEventFormatter implements MapEventFormatter<DragEndMapEvent> {

  @Override
  public DragEndMapEvent createEvent(Properties properties) {
    return new DragEndMapEvent(properties);
  }

}
