package com.google.gwt.maps.client.events.mouseup;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.events.MouseEvent;

public class MouseUpMapEvent extends MapEvent<MouseUpMapHandler, MouseUpMapEvent> {

  public static Type<MouseUpMapHandler> TYPE = new Type<MouseUpMapHandler>();
  
  public MouseUpMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<MouseUpMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MouseUpMapHandler handler) {
    handler.onEvent(this);
  }

  public MouseEvent getMouseEvent() {
    return new MouseEvent(properties);
  }
  
}
