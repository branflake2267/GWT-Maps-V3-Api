package com.google.gwt.maps.client.events.title;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class TitleChangeMapEvent extends MapEvent<TitleChangeMapHandler, TitleChangeMapEvent> {

  public static Type<TitleChangeMapHandler> TYPE = new Type<TitleChangeMapHandler>();
  
  public TitleChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<TitleChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(TitleChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
