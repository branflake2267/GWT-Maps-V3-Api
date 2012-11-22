package com.google.gwt.maps.client.events.shadow;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class ShadowChangeEventFormatter implements MapEventFormatter<ShadowChangeMapEvent> {

  @Override
  public ShadowChangeMapEvent createEvent(Properties properties) {
    return new ShadowChangeMapEvent(properties);
  }

}
