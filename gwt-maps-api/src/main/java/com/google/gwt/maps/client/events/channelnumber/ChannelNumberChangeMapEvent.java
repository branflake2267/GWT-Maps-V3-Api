package com.google.gwt.maps.client.events.channelnumber;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class ChannelNumberChangeMapEvent extends MapEvent<ChannelNumberChangeMapHandler, ChannelNumberChangeMapEvent> {

  public static Type<ChannelNumberChangeMapHandler> TYPE = new Type<ChannelNumberChangeMapHandler>();
  
  public ChannelNumberChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<ChannelNumberChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ChannelNumberChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
