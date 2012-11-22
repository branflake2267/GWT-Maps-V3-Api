package com.google.gwt.maps.client.events.links;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class LinksChangeMapEvent extends MapEvent<LinksChangeMapHandler, LinksChangeMapEvent> {

  public static Type<LinksChangeMapHandler> TYPE = new Type<LinksChangeMapHandler>();
  
  public LinksChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<LinksChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(LinksChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
