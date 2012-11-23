package com.google.gwt.maps.client.events.channelnumber;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class ChannelNumberChangeEventFormatter implements MapEventFormatter<ChannelNumberChangeMapEvent> {

  @Override
  public ChannelNumberChangeMapEvent createEvent(Properties properties) {
    return new ChannelNumberChangeMapEvent(properties);
  }

}
