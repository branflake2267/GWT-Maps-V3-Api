package com.google.gwt.maps.client.events.flat;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class FlatChangeEventFormatter implements MapEventFormatter<FlatChangeMapEvent> {

  @Override
  public FlatChangeMapEvent createEvent(Properties properties) {
    return new FlatChangeMapEvent(properties);
  }

}
