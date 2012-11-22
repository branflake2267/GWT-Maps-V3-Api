package com.google.gwt.maps.client.events.animation;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class AnimationChangeEventFormatter implements MapEventFormatter<AnimationChangeMapEvent> {

  @Override
  public AnimationChangeMapEvent createEvent(Properties properties) {
    return new AnimationChangeMapEvent(properties);
  }

}
