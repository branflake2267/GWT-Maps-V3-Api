package com.google.gwt.maps.client.events.icon;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class IconChangeMapEvent extends MapEvent<IconChangeMapHandler, IconChangeMapEvent> {

  public static Type<IconChangeMapHandler> TYPE = new Type<IconChangeMapHandler>();
  
  public IconChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<IconChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(IconChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
