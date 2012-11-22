package com.google.gwt.maps.client.events.content;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class ContentChangeEventFormatter implements MapEventFormatter<ContentChangeMapEvent> {

  @Override
  public ContentChangeMapEvent createEvent(Properties properties) {
    return new ContentChangeMapEvent(properties);
  }

}
