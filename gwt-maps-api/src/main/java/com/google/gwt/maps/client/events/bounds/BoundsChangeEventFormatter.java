package com.google.gwt.maps.client.events.bounds;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class BoundsChangeEventFormatter implements MapEventFormatter<BoundsChangeMapEvent> {

  @Override
  public BoundsChangeMapEvent createEvent(Properties properties) {
    return new BoundsChangeMapEvent(properties);
  }

}
