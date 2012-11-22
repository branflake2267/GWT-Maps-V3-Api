package com.google.gwt.maps.client.events.title;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class TitleChangeEventFormatter implements MapEventFormatter<TitleChangeMapEvent> {

  @Override
  public TitleChangeMapEvent createEvent(Properties properties) {
    return new TitleChangeMapEvent(properties);
  }

}
