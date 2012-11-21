package com.google.gwt.maps.client.events.center;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class CenterChangeEventFormatter implements MapEventFormatter<CenterChangeMapEvent> {

  @Override
  public CenterChangeMapEvent createEvent(Properties properties) {
    return new CenterChangeMapEvent(properties);
  }

}
