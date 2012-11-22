package com.google.gwt.maps.client.events.mousemove;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.events.MouseEvent;

public class MouseMoveMapEvent extends MapEvent<MouseMoveMapHandler, MouseMoveMapEvent> {

  public static Type<MouseMoveMapHandler> TYPE = new Type<MouseMoveMapHandler>();
  
  public MouseMoveMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<MouseMoveMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MouseMoveMapHandler handler) {
    handler.onEvent(this);
  }

  public MouseEvent getMouseEvent() {
    return new MouseEvent(properties);
  }
  
}
