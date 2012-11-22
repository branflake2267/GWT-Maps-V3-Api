package com.google.gwt.maps.client.events.content;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class ContentChangeMapEvent extends MapEvent<ContentChangeMapHandler, ContentChangeMapEvent> {

  public static Type<ContentChangeMapHandler> TYPE = new Type<ContentChangeMapHandler>();
  
  public ContentChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<ContentChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ContentChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
