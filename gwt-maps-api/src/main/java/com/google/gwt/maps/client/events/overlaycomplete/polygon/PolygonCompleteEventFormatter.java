package com.google.gwt.maps.client.events.overlaycomplete.polygon;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class PolygonCompleteEventFormatter implements MapEventFormatter<PolygonCompleteMapEvent> {

  @Override
  public PolygonCompleteMapEvent createEvent(Properties properties) {
    return new PolygonCompleteMapEvent(properties);
  }

}
