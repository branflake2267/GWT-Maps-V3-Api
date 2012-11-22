package com.google.gwt.maps.client.events.dblclick;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class DblClickEventFormatter implements MapEventFormatter<DblClickMapEvent> {

  @Override
  public DblClickMapEvent createEvent(Properties properties) {
    return new DblClickMapEvent(properties);
  }

}
