package com.google.gwt.maps.client.events.kmlviewport;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class DefaultViewportChangeMapEvent extends MapEvent<DefaultViewportChangeMapHandler, DefaultViewportChangeMapEvent> {

  public static Type<DefaultViewportChangeMapHandler> TYPE = new Type<DefaultViewportChangeMapHandler>();
  
  public DefaultViewportChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<DefaultViewportChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(DefaultViewportChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
