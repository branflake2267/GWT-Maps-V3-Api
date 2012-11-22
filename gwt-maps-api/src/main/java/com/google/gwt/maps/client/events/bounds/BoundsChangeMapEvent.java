package com.google.gwt.maps.client.events.bounds;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class BoundsChangeMapEvent extends MapEvent<BoundsChangeMapHandler, BoundsChangeMapEvent> {

  public static Type<BoundsChangeMapHandler> TYPE = new Type<BoundsChangeMapHandler>();
  
  public BoundsChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<BoundsChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(BoundsChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
