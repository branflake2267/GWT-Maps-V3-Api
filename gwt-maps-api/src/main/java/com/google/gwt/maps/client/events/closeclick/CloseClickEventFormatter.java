package com.google.gwt.maps.client.events.closeclick;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class CloseClickEventFormatter implements MapEventFormatter<CloseClickMapEvent> {

  @Override
  public CloseClickMapEvent createEvent(Properties properties) {
    return new CloseClickMapEvent(properties);
  }

}
