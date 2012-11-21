package com.google.gwt.maps.client.events.maptypeid;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class MapTypeIdChangeMapEvent extends MapEvent<MapTypeIdChangeMapHandler, MapTypeIdChangeMapEvent> {

  public static Type<MapTypeIdChangeMapHandler> TYPE = new Type<MapTypeIdChangeMapHandler>();
  
  public MapTypeIdChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<MapTypeIdChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MapTypeIdChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
