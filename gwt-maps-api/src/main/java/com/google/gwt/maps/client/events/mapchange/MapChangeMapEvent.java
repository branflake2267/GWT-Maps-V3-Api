package com.google.gwt.maps.client.events.mapchange;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class MapChangeMapEvent extends MapEvent<MapChangeMapHandler, MapChangeMapEvent> {

  public static Type<MapChangeMapHandler> TYPE = new Type<MapChangeMapHandler>();
  
  public MapChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<MapChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MapChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
