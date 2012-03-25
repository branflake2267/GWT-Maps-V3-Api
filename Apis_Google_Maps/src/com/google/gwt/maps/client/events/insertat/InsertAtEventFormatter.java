package com.google.gwt.maps.client.events.insertat;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class InsertAtEventFormatter implements MapEventFormatter<InsertAtMapEvent> {

  @Override
  public InsertAtMapEvent createEvent(Properties properties) {
    return new InsertAtMapEvent(properties);
  }

}
