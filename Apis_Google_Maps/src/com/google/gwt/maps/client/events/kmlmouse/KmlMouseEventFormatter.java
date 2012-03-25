package com.google.gwt.maps.client.events.kmlmouse;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class KmlMouseEventFormatter implements MapEventFormatter<KmlMouseMapEvent> {

  @Override
  public KmlMouseMapEvent createEvent(Properties properties) {
    return new KmlMouseMapEvent(properties);
  }

}
