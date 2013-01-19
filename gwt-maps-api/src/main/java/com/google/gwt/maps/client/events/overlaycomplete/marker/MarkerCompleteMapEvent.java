package com.google.gwt.maps.client.events.overlaycomplete.marker;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.drawinglib.OverlayType;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.overlays.Marker;

public class MarkerCompleteMapEvent extends MapEvent<MarkerCompleteMapHandler, MarkerCompleteMapEvent> {

  public static Type<MarkerCompleteMapHandler> TYPE = new Type<MarkerCompleteMapHandler>();

  public MarkerCompleteMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<MarkerCompleteMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MarkerCompleteMapHandler handler) {
    handler.onEvent(this);
  }

  public Marker getMarker() {
    Marker overlay = null;
    try {
      overlay = (Marker) properties.getObject("overlay");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return overlay;
  }

  public OverlayType getOverlayType() {
    String type = null;
    try {
      type = properties.getString("type");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    if (type == null) {
      return null;
    }
    return OverlayType.fromValue(type);
  }

}
