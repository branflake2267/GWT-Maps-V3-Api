package com.google.gwt.maps.client.overlays.overlayhandlers;

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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.overlays.MapCanvasProjection;
import com.google.gwt.maps.client.overlays.MapPanes;

public class OverlayViewMethods extends JavaScriptObject {

  protected OverlayViewMethods() {
  }

  /**
   * Returns the MapCanvasProjection object associated with this OverlayView. Only available after draw has been called.
   * 
   * Note: Not available for onRemove().
   */
  public final native MapCanvasProjection getProjection() /*-{
    return this.getProjection();
  }-*/;

  public final native JavaScriptObject getJso() /*-{
    return this;
  }-*/;

  public final MapWidget getMap() {
    MapImpl val = getMapImpl();
    return val == null ? null : MapWidget.newInstance(val);
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * Returns the panes in which this OverlayView can be rendered. Only available after draw has been called.
   */
  public final native MapPanes getPanes() /*-{
    return this.getPanes();
  }-*/;

}
