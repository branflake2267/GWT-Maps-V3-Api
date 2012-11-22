package com.google.gwt.maps.client.events.closeclick;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class CloseClickMapEvent extends MapEvent<CloseClickMapHandler, CloseClickMapEvent> {

  public static Type<CloseClickMapHandler> TYPE = new Type<CloseClickMapHandler>();
  
  public CloseClickMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<CloseClickMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(CloseClickMapHandler handler) {
    handler.onEvent(this);
  }
  
}
