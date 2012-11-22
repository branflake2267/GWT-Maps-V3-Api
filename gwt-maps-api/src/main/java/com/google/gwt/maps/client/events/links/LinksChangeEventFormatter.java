package com.google.gwt.maps.client.events.links;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class LinksChangeEventFormatter implements MapEventFormatter<LinksChangeMapEvent> {

  @Override
  public LinksChangeMapEvent createEvent(Properties properties) {
    return new LinksChangeMapEvent(properties);
  }

}
