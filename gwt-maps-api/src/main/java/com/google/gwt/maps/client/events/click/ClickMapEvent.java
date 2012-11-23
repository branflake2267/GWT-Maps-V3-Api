package com.google.gwt.maps.client.events.click;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.events.MouseEvent;

public class ClickMapEvent extends MapEvent<ClickMapHandler, ClickMapEvent> {

  public static Type<ClickMapHandler> TYPE = new Type<ClickMapHandler>();
  
  public ClickMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<ClickMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ClickMapHandler handler) {
    handler.onEvent(this);
  }

  public MouseEvent getMouseEvent() {
    return new MouseEvent(properties);
  }
  
}
