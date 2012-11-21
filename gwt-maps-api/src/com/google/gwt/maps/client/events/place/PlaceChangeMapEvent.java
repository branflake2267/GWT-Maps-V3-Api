package com.google.gwt.maps.client.events.place;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class PlaceChangeMapEvent extends MapEvent<PlaceChangeMapHandler, PlaceChangeMapEvent> {

  public static Type<PlaceChangeMapHandler> TYPE = new Type<PlaceChangeMapHandler>();
  
  public PlaceChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<PlaceChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(PlaceChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
