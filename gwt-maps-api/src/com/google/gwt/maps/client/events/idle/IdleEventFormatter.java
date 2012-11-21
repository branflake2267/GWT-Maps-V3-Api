package com.google.gwt.maps.client.events.idle;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class IdleEventFormatter implements MapEventFormatter<IdleMapEvent> {

  @Override
  public IdleMapEvent createEvent(Properties properties) {
    return new IdleMapEvent(properties);
  }

}
