package com.google.gwt.maps.client.events.cursor;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class CursorChangeEventFormatter implements MapEventFormatter<CursorChangeMapEvent> {

  @Override
  public CursorChangeMapEvent createEvent(Properties properties) {
    return new CursorChangeMapEvent(properties);
  }

}
