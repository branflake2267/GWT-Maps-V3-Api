package com.google.gwt.maps.client.events.setat;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class SetAtEventFormatter implements MapEventFormatter<SetAtMapEvent> {

  @Override
  public SetAtMapEvent createEvent(Properties properties) {
    return new SetAtMapEvent(properties);
  }

}
