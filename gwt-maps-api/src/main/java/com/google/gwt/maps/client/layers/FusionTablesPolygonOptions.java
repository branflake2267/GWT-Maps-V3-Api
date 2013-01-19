package com.google.gwt.maps.client.layers;

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

/**
 * Options which control the appearance of polygons in a FusionTablesLayer. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#FusionTablesPolygonOptions">
 * FusionTablesPolygonOptions API Doc</a>
 */
public class FusionTablesPolygonOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTablesPolygonOptions() {
  }

  /**
   * Options which control the appearance of polygons in a FusionTablesLayer.
   */
  public final static FusionTablesPolygonOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * sets The fill color, defined by a six-digit hexadecimal number in RRGGBB format (e.g. #00AAFF).
   * 
   * @param fillColor
   */
  public final native void setFillColor(String fillColor) /*-{
    this.fillColor = fillColor;
  }-*/;

  /**
   * gets The fill color, defined by a six-digit hexadecimal number in RRGGBB format (e.g. #00AAFF).
   */
  public final native String getFillColor() /*-{
    return this.fillColor;
  }-*/;

  /**
   * sets The fill opacity between 0.0 and 1.0.
   * 
   * @param fillOpacity
   */
  public final native void setFillOpacity(double fillOpacity) /*-{
    this.fillOpacity = fillOpacity;
  }-*/;

  /**
   * gets The fill opacity between 0.0 and 1.0.
   */
  public final native double getFillOpacity() /*-{
    return this.fillOpacity;
  }-*/;

  /**
   * sets The fill color, defined by a six-digit hexadecimal number in RRGGBB format (e.g. #00AAFF).
   * 
   * @param strokeColor
   */
  public final native void setStrokeColor(String strokeColor) /*-{
    this.strokeColor = strokeColor;
  }-*/;

  /**
   * gets The fill color, defined by a six-digit hexadecimal number in RRGGBB format (e.g. #00AAFF).
   */
  public final native String getStrokeColor() /*-{
    return this.strokeColor;
  }-*/;

  /**
   * sets The stroke opacity between 0.0 and 1.0.
   * 
   * @param strokeOpacity
   */
  public final native void setStrokeOpacity(double strokeOpacity) /*-{
    this.strokeOpacity = strokeOpacity;
  }-*/;

  /**
   * gets The stroke opacity between 0.0 and 1.0.
   */
  public final native double getStrokeOpacity() /*-{
    return this.strokeOpacity;
  }-*/;

  /**
   * sets The stroke width in pixels, between 0 and 10.
   * 
   * @param strokeWeight
   */
  public final native void setStrokeWeight(int strokeWeight) /*-{
    this.strokeWeight = strokeWeight;
  }-*/;

  /**
   * gets The stroke width in pixels, between 0 and 10.
   */
  public final native int getStrokeWeight() /*-{
    return this.strokeWeight;
  }-*/;

}
