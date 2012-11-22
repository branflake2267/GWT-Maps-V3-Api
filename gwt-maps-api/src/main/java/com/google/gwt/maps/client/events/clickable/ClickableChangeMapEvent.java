package com.google.gwt.maps.client.events.clickable;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class ClickableChangeMapEvent extends MapEvent<ClickableChangeMapHandler, ClickableChangeMapEvent> {

  public static Type<ClickableChangeMapHandler> TYPE = new Type<ClickableChangeMapHandler>();
  
  public ClickableChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<ClickableChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ClickableChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
