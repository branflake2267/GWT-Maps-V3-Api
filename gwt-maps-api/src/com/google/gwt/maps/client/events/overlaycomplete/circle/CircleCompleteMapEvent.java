package com.google.gwt.maps.client.events.overlaycomplete.circle;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.overlays.Circle;

public class CircleCompleteMapEvent extends MapEvent<CircleCompleteMapHandler, CircleCompleteMapEvent> {

  public static Type<CircleCompleteMapHandler> TYPE = new Type<CircleCompleteMapHandler>();

  public CircleCompleteMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<CircleCompleteMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(CircleCompleteMapHandler handler) {
    handler.onEvent(this);
  }

  public Circle getCircle() {
    Circle circle = null;
    try {
      circle = (Circle) properties.getObject("overlay");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return circle ;
  }
  
  
}
