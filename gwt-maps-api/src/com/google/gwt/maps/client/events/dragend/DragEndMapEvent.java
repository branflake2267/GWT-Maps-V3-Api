package com.google.gwt.maps.client.events.dragend;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class DragEndMapEvent extends MapEvent<DragEndMapHandler, DragEndMapEvent> {

  public static Type<DragEndMapHandler> TYPE = new Type<DragEndMapHandler>();
  
  public DragEndMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<DragEndMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(DragEndMapHandler handler) {
    handler.onEvent(this);
  }
  
}
