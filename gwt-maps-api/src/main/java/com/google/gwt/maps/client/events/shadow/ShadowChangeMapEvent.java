package com.google.gwt.maps.client.events.shadow;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class ShadowChangeMapEvent extends MapEvent<ShadowChangeMapHandler, ShadowChangeMapEvent> {

  public static Type<ShadowChangeMapHandler> TYPE = new Type<ShadowChangeMapHandler>();
  
  public ShadowChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<ShadowChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ShadowChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
