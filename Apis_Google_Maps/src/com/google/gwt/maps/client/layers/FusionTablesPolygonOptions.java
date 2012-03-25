package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options which control the appearance of polygons in a FusionTablesLayer.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#FusionTablesPolygonOptions}
 */
public class FusionTablesPolygonOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTablesPolygonOptions() {}

  /**
   * Options which control the appearance of polygons in a FusionTablesLayer.
   * @return
   */
  public final static FusionTablesPolygonOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets The fill color, defined by a six-digit hexadecimal number in RRGGBB format (e.g. #00AAFF).
   * @param fillColor
   */
  public final native void setFillColor(String fillColor) /*-{
    this.fillColor = fillColor;
  }-*/;

  /**
   * gets The fill color, defined by a six-digit hexadecimal number in RRGGBB format (e.g. #00AAFF).
   * @return
   */
  public final native String getFillColor() /*-{
    return this.fillColor;
  }-*/;

  /**
   * sets The fill opacity between 0.0 and 1.0.
   * @param fillOpacity
   */
  public final native void setFillOpacity(double fillOpacity) /*-{
   this.fillOpacity = fillOpacity;
  }-*/;

  /**
   * gets The fill opacity between 0.0 and 1.0.
   * @return
   */
  public final native double getFillOpacity() /*-{
    return this.fillOpacity;
  }-*/;

  /**
   * sets The fill color, defined by a six-digit hexadecimal number in RRGGBB format (e.g. #00AAFF).
   * @param strokeColor
   */
  public final native void setStrokeColor(String strokeColor) /*-{
    this.strokeColor = strokeColor;
  }-*/;

  /**
   * gets The fill color, defined by a six-digit hexadecimal number in RRGGBB format (e.g. #00AAFF).
   * @return
   */
  public final native String getStrokeColor() /*-{
    return this.strokeColor;
  }-*/;

  /**
   * sets The stroke opacity between 0.0 and 1.0.
   * @param strokeOpacity
   */
  public final native void setStrokeOpacity(double strokeOpacity) /*-{
    this.strokeOpacity = strokeOpacity;
  }-*/;

  /**
   * gets The stroke opacity between 0.0 and 1.0. 
   * @return
   */
  public final native double getStrokeOpacity() /*-{
    return this.strokeOpacity;
  }-*/;

  /**
   * sets The stroke width in pixels, between 0 and 10.
   * @param strokeWeight
   */
  public final native void setStrokeWeight(int strokeWeight) /*-{
    this.strokeWeight = strokeWeight;
  }-*/;

  /**
   * gets The stroke width in pixels, between 0 and 10.
   * @return
   */
  public final native int getStrokeWeight() /*-{
    return this.strokeWeight;
  }-*/;

}
