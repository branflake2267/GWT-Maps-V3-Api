package com.google.gwt.maps.client.events.domready;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class DomReadyMapEvent extends MapEvent<DomReadyMapHandler, DomReadyMapEvent> {

  public static Type<DomReadyMapHandler> TYPE = new Type<DomReadyMapHandler>();
  
  public DomReadyMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<DomReadyMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(DomReadyMapHandler handler) {
    handler.onEvent(this);
  }
  
}
