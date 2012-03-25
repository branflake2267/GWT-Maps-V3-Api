package com.google.gwt.maps.client.events.animation;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class AnimationChangeMapEvent extends MapEvent<AnimationChangeMapHandler, AnimationChangeMapEvent> {

  public static Type<AnimationChangeMapHandler> TYPE = new Type<AnimationChangeMapHandler>();
  
  public AnimationChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<AnimationChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(AnimationChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
