package com.google.gwt.maps.client.events.rightclick;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.events.MouseEvent;

public class RightClickMapEvent extends MapEvent<RightClickMapHandler, RightClickMapEvent> {

  public static Type<RightClickMapHandler> TYPE = new Type<RightClickMapHandler>();
  
  public RightClickMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<RightClickMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(RightClickMapHandler handler) {
    handler.onEvent(this);
  }

  public MouseEvent getMouseEvent() {
    return new MouseEvent(properties);
  }
  
}
