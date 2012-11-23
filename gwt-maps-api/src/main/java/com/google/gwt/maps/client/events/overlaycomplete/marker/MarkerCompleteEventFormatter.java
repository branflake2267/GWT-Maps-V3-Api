package com.google.gwt.maps.client.events.overlaycomplete.marker;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class MarkerCompleteEventFormatter implements MapEventFormatter<MarkerCompleteMapEvent> {

  @Override
  public MarkerCompleteMapEvent createEvent(Properties properties) {
    return new MarkerCompleteMapEvent(properties);
  }

}
