package com.google.gwt.maps.client.events.heading;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class HeadingChangeEventFormatter implements MapEventFormatter<HeadingChangeMapEvent> {

  @Override
  public HeadingChangeMapEvent createEvent(Properties properties) {
    return new HeadingChangeMapEvent(properties);
  }

}
