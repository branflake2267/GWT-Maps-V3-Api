package com.google.gwt.maps.client.events.dblclick;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.events.MouseEvent;

public class DblClickMapEvent extends MapEvent<DblClickMapHandler, DblClickMapEvent> {

  public static Type<DblClickMapHandler> TYPE = new Type<DblClickMapHandler>();
  
  public DblClickMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<DblClickMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(DblClickMapHandler handler) {
    handler.onEvent(this);
  }

  public MouseEvent getMouseEvent() {
    return new MouseEvent(properties);
  }
  
}
