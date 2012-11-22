package com.google.gwt.maps.client.events.heading;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class HeadingChangeMapEvent extends MapEvent<HeadingChangeMapHandler, HeadingChangeMapEvent> {

  public static Type<HeadingChangeMapHandler> TYPE = new Type<HeadingChangeMapHandler>();
  
  public HeadingChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<HeadingChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(HeadingChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
