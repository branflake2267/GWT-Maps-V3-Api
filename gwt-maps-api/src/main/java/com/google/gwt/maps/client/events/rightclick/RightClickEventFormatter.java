package com.google.gwt.maps.client.events.rightclick;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class RightClickEventFormatter implements MapEventFormatter<RightClickMapEvent> {

  @Override
  public RightClickMapEvent createEvent(Properties properties) {
    return new RightClickMapEvent(properties);
  }

}
