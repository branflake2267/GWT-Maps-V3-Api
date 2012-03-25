package com.google.gwt.maps.client.events.tilt;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class TiltChangeMapEvent extends MapEvent<TiltChangeMapHandler, TiltChangeMapEvent> {

  public static Type<TiltChangeMapHandler> TYPE = new Type<TiltChangeMapHandler>();
  
  public TiltChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<TiltChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(TiltChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
