package com.google.gwt.maps.client.events.zindex;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class ZindexChangeMapEvent extends MapEvent<ZindexChangeMapHandler, ZindexChangeMapEvent> {

  public static Type<ZindexChangeMapHandler> TYPE = new Type<ZindexChangeMapHandler>();
  
  public ZindexChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<ZindexChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ZindexChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
