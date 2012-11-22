package com.google.gwt.maps.client.events.format;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class FormatChangeMapEvent extends MapEvent<FormatChangeMapHandler, FormatChangeMapEvent> {

  public static Type<FormatChangeMapHandler> TYPE = new Type<FormatChangeMapHandler>();
  
  public FormatChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<FormatChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(FormatChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
