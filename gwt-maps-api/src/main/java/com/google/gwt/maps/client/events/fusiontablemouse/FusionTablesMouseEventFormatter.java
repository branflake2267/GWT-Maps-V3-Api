package com.google.gwt.maps.client.events.fusiontablemouse;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class FusionTablesMouseEventFormatter implements MapEventFormatter<FusionTablesMouseMapEvent> {

  @Override
  public FusionTablesMouseMapEvent createEvent(Properties properties) {
    return new FusionTablesMouseMapEvent(properties);
  }

}
