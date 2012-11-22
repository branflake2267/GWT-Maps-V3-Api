package com.google.gwt.maps.client.events.zindex;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class ZindexChangeEventFormatter implements MapEventFormatter<ZindexChangeMapEvent> {

  @Override
  public ZindexChangeMapEvent createEvent(Properties properties) {
    return new ZindexChangeMapEvent(properties);
  }

}
