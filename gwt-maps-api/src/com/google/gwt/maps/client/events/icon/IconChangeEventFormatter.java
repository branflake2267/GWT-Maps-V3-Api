package com.google.gwt.maps.client.events.icon;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class IconChangeEventFormatter implements MapEventFormatter<IconChangeMapEvent> {

  @Override
  public IconChangeMapEvent createEvent(Properties properties) {
    return new IconChangeMapEvent(properties);
  }

}
