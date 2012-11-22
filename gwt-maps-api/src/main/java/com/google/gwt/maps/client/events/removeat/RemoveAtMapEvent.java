package com.google.gwt.maps.client.events.removeat;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.events.MapEvent;

public class RemoveAtMapEvent extends MapEvent<RemoveAtMapHandler, RemoveAtMapEvent> {

  public static Type<RemoveAtMapHandler> TYPE = new Type<RemoveAtMapHandler>();
  
  public RemoveAtMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<RemoveAtMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(RemoveAtMapHandler handler) {
    handler.onEvent(this);
  }
  
  public int getIndex() {
    int index = -1;
    try {
      index = properties.getNumber("index").intValue();
    } catch (TypeException e) {
    }
    return index;
  }
  
}
