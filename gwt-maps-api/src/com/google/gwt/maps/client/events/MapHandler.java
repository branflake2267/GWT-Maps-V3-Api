package com.google.gwt.maps.client.events;

import com.google.gwt.event.shared.EventHandler;

public interface MapHandler<E> extends EventHandler {
  public void onEvent(E event);
}


