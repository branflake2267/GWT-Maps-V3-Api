package com.google.gwt.maps.client.events.tiles;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class TilesLoadedEventFormatter implements MapEventFormatter<TilesLoadedMapEvent> {

  @Override
  public TilesLoadedMapEvent createEvent(Properties properties) {
    return new TilesLoadedMapEvent(properties);
  }

}
