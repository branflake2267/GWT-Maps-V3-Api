package com.google.gwt.maps.client.events.draggable;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class DraggableChangedMapEvent extends MapEvent<DraggableChangeMapHandler, DraggableChangedMapEvent> {

  public static Type<DraggableChangeMapHandler> TYPE = new Type<DraggableChangeMapHandler>();
  
  public DraggableChangedMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<DraggableChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(DraggableChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
