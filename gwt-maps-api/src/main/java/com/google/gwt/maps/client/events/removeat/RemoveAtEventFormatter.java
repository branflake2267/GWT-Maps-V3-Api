package com.google.gwt.maps.client.events.removeat;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class RemoveAtEventFormatter implements MapEventFormatter<RemoveAtMapEvent> {

  @Override
  public RemoveAtMapEvent createEvent(Properties properties) {
    return new RemoveAtMapEvent(properties);
  }

}
