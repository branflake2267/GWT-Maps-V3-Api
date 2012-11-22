package com.google.gwt.maps.client.events.format;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class FormatChangeEventFormatter implements MapEventFormatter<FormatChangeMapEvent> {

  @Override
  public FormatChangeMapEvent createEvent(Properties properties) {
    return new FormatChangeMapEvent(properties);
  }

}
