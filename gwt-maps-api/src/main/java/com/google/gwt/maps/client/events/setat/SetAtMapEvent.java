package com.google.gwt.maps.client.events.setat;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.events.MapEvent;

public class SetAtMapEvent extends MapEvent<SetAtMapHandler, SetAtMapEvent> {

  public static Type<SetAtMapHandler> TYPE = new Type<SetAtMapHandler>();
  
  public SetAtMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<SetAtMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(SetAtMapHandler handler) {
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
