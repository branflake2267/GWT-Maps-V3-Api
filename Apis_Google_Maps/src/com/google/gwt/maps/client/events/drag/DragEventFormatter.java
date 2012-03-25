package com.google.gwt.maps.client.events.drag;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class DragEventFormatter implements MapEventFormatter<DragMapEvent> {

  @Override
  public DragMapEvent createEvent(Properties properties) {
    return new DragMapEvent(properties);
  }

}
