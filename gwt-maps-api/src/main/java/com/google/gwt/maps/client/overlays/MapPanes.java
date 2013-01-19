package com.google.gwt.maps.client.overlays;

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
import com.google.gwt.dom.client.Element;

/**
 * This object contains the DOM elements in which overlays are rendered. They are listed below with 'Pane 0' at the
 * bottom and 'Pane 6' at the top. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MapPanes">MapPanes API Doc</a>
 */
public class MapPanes extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected MapPanes() {
  }

  /**
   * Create new {@link MapPanes} instance
   */
  public static final MapPanes newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * sets This pane contains the info window. It is above all map overlays. (Pane 6).
   * 
   * @param floatPane
   */
  public final native void setFloatPane(Element floatPane) /*-{
    this.floatPane = floatPane;
  }-*/;

  /**
   * gets This pane contains the info window. It is above all map overlays. (Pane 6).
   */
  public final native Element getFloatPane() /*-{
    return this.floatPane;
  }-*/;

  /**
   * sets This pane contains the info window shadow. It is above the overlayImage, so that markers can be in the shadow
   * of the info window. (Pane 4).
   * 
   * @param floatShadow
   */
  public final native void setFloatShadow(Element floatShadow) /*-{
    this.floatShadow = floatShadow;
  }-*/;

  /**
   * gets This pane contains the info window shadow. It is above the overlayImage, so that markers can be in the shadow
   * of the info window. (Pane 4).
   */
  public final native Element getFloatShadow() /*-{
    return this.floatShadow;
  }-*/;

  /**
   * sets This pane is the lowest pane and is above the tiles. It may not receive DOM events. (Pane 0).
   * 
   * @param mapPane
   */
  public final native void setMapPane(Element mapPane) /*-{
    this.mapPane = mapPane;
  }-*/;

  /**
   * gets This pane is the lowest pane and is above the tiles. It may not receive DOM events. (Pane 0).
   */
  public final native Element getMapPane() /*-{
    return this.mapPane;
  }-*/;

  /**
   * sets This pane contains the marker foreground images. (Pane 3).
   * 
   * @param overlayImage
   */
  public final native void setOverlayImage(Element overlayImage) /*-{
    this.overlayImage = overlayImage;
  }-*/;

  /**
   * gets This pane contains the marker foreground images. (Pane 3).
   */
  public final native Element getOverlayImage() /*-{
    return this.overlayImage;
  }-*/;

  /**
   * sets This pane contains polylines, polygons, ground overlays and tile layer overlays. It may not receive DOM
   * events. (Pane 1).
   * 
   * @param overlayLayer
   */
  public final native void setOverlayLayer(Element overlayLayer) /*-{
    this.overlayLayer = overlayLayer;
  }-*/;

  /**
   * gets This pane contains polylines, polygons, ground overlays and tile layer overlays. It may not receive DOM
   * events. (Pane 1).
   */
  public final native Element getOverlayLayer() /*-{
    return this.overlayLayer;
  }-*/;

  /**
   * sets This pane contains elements that receive DOM mouse events, such as the transparent targets for markers. It is
   * above the floatShadow, so that markers in the shadow of the info window can be clickable. (Pane 5).
   * 
   * @param overlayMouseTarget
   */
  public final native void setOverlayMouseTarget(Element overlayMouseTarget) /*-{
    this.overlayMouseTarget = overlayMouseTarget;
  }-*/;

  /**
   * gets This pane contains elements that receive DOM mouse events, such as the transparent targets for markers. It is
   * above the floatShadow, so that markers in the shadow of the info window can be clickable. (Pane 5).
   */
  public final native Element getOverlayMouseTarget() /*-{
    return this.overlayMouseTarget;
  }-*/;

  /**
   * sets This pane contains the marker shadows. It may not receive DOM events. (Pane 2).
   * 
   * @param overlayShadow
   */
  public final native void setOverlayShadow(Element overlayShadow) /*-{
    this.overlayShadow = overlayShadow;
  }-*/;

  /**
   * gets This pane contains the marker shadows. It may not receive DOM events. (Pane 2).
   */
  public final native Element getOverlayShadow() /*-{
    return this.overlayShadow;
  }-*/;

}
