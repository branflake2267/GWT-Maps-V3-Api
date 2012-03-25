package com.google.gwt.maps.client.events.center;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class CenterChangeMapEvent extends MapEvent<CenterChangeMapHandler, CenterChangeMapEvent> {

  public static Type<CenterChangeMapHandler> TYPE = new Type<CenterChangeMapHandler>();
  
  public CenterChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<CenterChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(CenterChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
