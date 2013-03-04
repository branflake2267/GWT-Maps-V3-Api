package com.google.gwt.maps.utility.markerclustererplus.client;

/*
 * #%L
 * GWT Maps API V3 - Utility API - MarkerClustererPlus
 * %%
 * Copyright (C) 2011 - 2013 GWT Maps API V3
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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.overlays.Marker;

import java.util.Collection;

public class MarkerClusterer extends JavaScriptObject {

  protected MarkerClusterer() {
  }

  public static MarkerClusterer newInstance(MapWidget widget) {
    return createJso(widget.getJso(), JavaScriptObject.createArray(), MarkerClustererOptions.newInstance());
  }

  public static MarkerClusterer newInstance(MapWidget widget, Collection<Marker> markers) {
    return createJso(widget.getJso(), JsUtil.toArray(markers), MarkerClustererOptions.newInstance());
  }

  public static MarkerClusterer newInstance(MapWidget widget, MarkerClustererOptions options) {
    return createJso(widget.getJso(), JavaScriptObject.createArray(), options);
  }

  public static MarkerClusterer newInstance(MapWidget widget, Collection<Marker> markers, MarkerClustererOptions options) {
    return createJso(widget.getJso(), JsUtil.toArray(markers), options);
  }

  private static native MarkerClusterer createJso(JavaScriptObject map, JavaScriptObject markers, JavaScriptObject options) /*-{
      return new $wnd.MarkerClusterer(map, markers, options);
  }-*/;

  public final void addMarker(Marker marker) {
    addMarker(marker, false);
  }

  public final native void addMarker(Marker marker, boolean noDraw) /*-{
      this.addMarker(marker, noDraw);
  }-*/;

  public final void addMarkers(Collection<Marker> markers) {
    this.addMarkers(markers, false);
  }

  public final void addMarkers(Collection<Marker> markers, boolean noDraw) {
    this.addMarkers(JsUtil.toArray(markers), noDraw);
  }

  public final native void addMarkers(JsArray<Marker> markers, boolean noDraw) /*-{
      this.addMarkers(markers, noDraw);
  }-*/;

  public final native void clearMarkers() /*-{
      this.clearMarkers();
  }-*/;

  public final void removeMarker(Marker marker) {
    removeMarker(marker, false);
  }

  public final native void removeMarker(Marker marker, boolean noDraw) /*-{
      this.removeMarker(marker, noDraw);
  }-*/;

  public final void removeMarkers(Collection<Marker> markers) {
    this.removeMarkers(markers, false);
  }

  public final void removeMarkers(Collection<Marker> markers, boolean noDraw) {
    this.removeMarkers(JsUtil.toArray(markers), noDraw);
  }

  public final native void removeMarkers(JsArray<Marker> markers, boolean noDraw) /*-{
      this.removeMarkers(markers, noDraw);
  }-*/;

  public final native void fitMapToMarkers() /*-{
      this.fitMapToMarkers();
  }-*/;

  public final native void repaint() /*-{
      this.repaint();
  }-*/;

}
