package com.google.gwt.maps.client.events.insertat;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.events.MapEvent;

public class InsertAtMapEvent extends MapEvent<InsertAtMapHandler, InsertAtMapEvent> {

  public static Type<InsertAtMapHandler> TYPE = new Type<InsertAtMapHandler>();
  
  public InsertAtMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<InsertAtMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(InsertAtMapHandler handler) {
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
