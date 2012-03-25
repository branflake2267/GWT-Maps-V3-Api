package com.google.gwt.maps.client.events.pov;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class PovChangeMapEvent extends MapEvent<PovChangeMapHandler, PovChangeMapEvent> {

  public static Type<PovChangeMapHandler> TYPE = new Type<PovChangeMapHandler>();
  
  public PovChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<PovChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(PovChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
