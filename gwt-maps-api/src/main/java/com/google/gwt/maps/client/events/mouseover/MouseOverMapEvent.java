package com.google.gwt.maps.client.events.mouseover;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.events.MouseEvent;

public class MouseOverMapEvent extends MapEvent<MouseOverMapHandler, MouseOverMapEvent> {

  public static Type<MouseOverMapHandler> TYPE = new Type<MouseOverMapHandler>();
  
  public MouseOverMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<MouseOverMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MouseOverMapHandler handler) {
    handler.onEvent(this);
  }

  public MouseEvent getMouseEvent() {
    return new MouseEvent(properties);
  }
  
}
