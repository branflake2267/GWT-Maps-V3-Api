package com.google.gwt.maps.client.events.click;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class ClickEventFormatter implements MapEventFormatter<ClickMapEvent> {

  @Override
  public ClickMapEvent createEvent(Properties properties) {
    return new ClickMapEvent(properties);
  }

}
