package com.google.gwt.maps.client.events.dragstart;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class DragStartMapEvent extends MapEvent<DragStartMapHandler, DragStartMapEvent> {

  public static Type<DragStartMapHandler> TYPE = new Type<DragStartMapHandler>();
  
  public DragStartMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<DragStartMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(DragStartMapHandler handler) {
    handler.onEvent(this);
  }
  
}
