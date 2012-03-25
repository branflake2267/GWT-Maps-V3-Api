package com.google.gwt.maps.client.events.clickable;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class ClickableChangeEventFormatter implements MapEventFormatter<ClickableChangeMapEvent> {

  @Override
  public ClickableChangeMapEvent createEvent(Properties properties) {
    return new ClickableChangeMapEvent(properties);
  }

}
