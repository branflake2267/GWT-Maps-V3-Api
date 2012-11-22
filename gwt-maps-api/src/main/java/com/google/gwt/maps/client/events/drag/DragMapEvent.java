package com.google.gwt.maps.client.events.drag;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class DragMapEvent extends MapEvent<DragMapHandler, DragMapEvent> {

  public static Type<DragMapHandler> TYPE = new Type<DragMapHandler>();
  
  public DragMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<DragMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(DragMapHandler handler) {
    handler.onEvent(this);
  }
  
}
