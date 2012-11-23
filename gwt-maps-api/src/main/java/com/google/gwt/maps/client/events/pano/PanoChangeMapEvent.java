package com.google.gwt.maps.client.events.pano;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class PanoChangeMapEvent extends MapEvent<PanoChangeMapHandler, PanoChangeMapEvent> {

  public static Type<PanoChangeMapHandler> TYPE = new Type<PanoChangeMapHandler>();
  
  public PanoChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<PanoChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(PanoChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
