package com.google.gwt.maps.client.events.overlaycomplete.polyline;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class PolylineCompleteEventFormatter implements MapEventFormatter<PolylineCompleteMapEvent> {

  @Override
  public PolylineCompleteMapEvent createEvent(Properties properties) {
    return new PolylineCompleteMapEvent(properties);
  }

}
