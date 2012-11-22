package com.google.gwt.maps.client.events.radius;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class RadiusChangeMapEvent extends MapEvent<RadiusChangeMapHandler, RadiusChangeMapEvent> {

  public static Type<RadiusChangeMapHandler> TYPE = new Type<RadiusChangeMapHandler>();
  
  public RadiusChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<RadiusChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(RadiusChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
