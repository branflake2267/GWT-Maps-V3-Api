package com.google.gwt.maps.client.events.overlaycomplete.rectangle;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.overlays.Rectangle;

public class RectangleCompleteMapEvent extends MapEvent<RectangleCompleteMapHandler, RectangleCompleteMapEvent> {

  public static Type<RectangleCompleteMapHandler> TYPE = new Type<RectangleCompleteMapHandler>();

  public RectangleCompleteMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<RectangleCompleteMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(RectangleCompleteMapHandler handler) {
    handler.onEvent(this);
  }

  public Rectangle getRectangle() {
    Rectangle overlay = null;
    try {
      overlay = (Rectangle) properties.getObject("overlay");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return overlay ;
  }
  
}
