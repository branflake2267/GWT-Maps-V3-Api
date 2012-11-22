package com.google.gwt.maps.client.events.domready;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class DomReadyEventFormatter implements MapEventFormatter<DomReadyMapEvent> {

  @Override
  public DomReadyMapEvent createEvent(Properties properties) {
    return new DomReadyMapEvent(properties);
  }

}
