package com.google.gwt.maps.client.events.tiles;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class TilesLoadedMapEvent extends MapEvent<TilesLoadedMapHandler, TilesLoadedMapEvent> {

  public static Type<TilesLoadedMapHandler> TYPE = new Type<TilesLoadedMapHandler>();
  
  public TilesLoadedMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<TilesLoadedMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(TilesLoadedMapHandler handler) {
    handler.onEvent(this);
  }
  
}
