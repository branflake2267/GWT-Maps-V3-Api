package com.google.gwt.maps.client.events.mouseout;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.events.MouseEvent;

public class MouseOutMapEvent extends MapEvent<MouseOutMapHandler, MouseOutMapEvent> {

  public static Type<MouseOutMapHandler> TYPE = new Type<MouseOutMapHandler>();
  
  public MouseOutMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<MouseOutMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MouseOutMapHandler handler) {
    handler.onEvent(this);
  }

  public MouseEvent getMouseEvent() {
    return new MouseEvent(properties);
  }
  
}
