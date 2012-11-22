package com.google.gwt.maps.client.events.kmlviewport;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class DefaultViewportChangeEventFormatter implements MapEventFormatter<DefaultViewportChangeMapEvent> {

  @Override
  public DefaultViewportChangeMapEvent createEvent(Properties properties) {
    return new DefaultViewportChangeMapEvent(properties);
  }

}
