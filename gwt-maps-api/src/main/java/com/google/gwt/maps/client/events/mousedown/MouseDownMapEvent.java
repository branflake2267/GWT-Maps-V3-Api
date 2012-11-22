package com.google.gwt.maps.client.events.mousedown;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.events.MouseEvent;

public class MouseDownMapEvent extends MapEvent<MouseDownMapHandler, MouseDownMapEvent> {

  public static Type<MouseDownMapHandler> TYPE = new Type<MouseDownMapHandler>();
  
  public MouseDownMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<MouseDownMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MouseDownMapHandler handler) {
    handler.onEvent(this);
  }

  public MouseEvent getMouseEvent() {
    return new MouseEvent(properties);
  }
  
}
