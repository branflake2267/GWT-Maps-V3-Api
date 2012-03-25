package com.google.gwt.maps.client.events.shape;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class ShapeChangeMapEvent extends MapEvent<ShapeChangeMapHandler, ShapeChangeMapEvent> {

  public static Type<ShapeChangeMapHandler> TYPE = new Type<ShapeChangeMapHandler>();
  
  public ShapeChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<ShapeChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ShapeChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
