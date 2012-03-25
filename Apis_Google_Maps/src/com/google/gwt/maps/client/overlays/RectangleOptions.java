package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLngBounds;

/**
 * {@link Rectangle} Options
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#RectangleOptions} 
 */
public class RectangleOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected RectangleOptions() {}
  
  /**
   * creates Rectangle options
   * @return
   */
  public final static RectangleOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets The bounds.
   * @param bounds
   */
  public final native void setBounds(LatLngBounds bounds) /*-{
    this.bounds = bounds;
  }-*/;
  
  /**
   * gets The bounds.
   * @return
   */
  public final native LatLngBounds getBounds() /*-{
    return this.bounds;
  }-*/;
  
  /**
   * sets Indicates whether this Polyline handles click events. Defaults to true.
   * @param clickable
   */
  public final native void setClickable(boolean clickable) /*-{
    this.clickable = clickable;
  }-*/;
  
  /**
   * gets Indicates whether this Polyline handles click events. Defaults to true.
   * @return
   */
  public final native boolean getClickable() /*-{
    return this.clickable;
  }-*/;
  
  /**
   * The fill color. All CSS3 colors are supported except for extended named colors.
   * @param fillColor
   */
  public final native void setFillColor(String fillColor) /*-{
    this.fillColor = fillColor;
  }-*/;
  
  /**
   * The fill color. All CSS3 colors are supported except for extended named colors.
   * @return
   */
  public final native String getFillColor() /*-{
    return this.fillColor;
  }-*/;
  
  /**
   * The fill opacity between 0.0 and 1.0
   * @param fillOpacity
   */
  public final native void setFillOpacity(double fillOpacity) /*-{
    this.fillOpacity = fillOpacity;
  }-*/;
  
  /**
   * The fill opacity between 0.0 and 1.0
   * @return
   */
  public final native double getFillOpacity() /*-{
    return this.fillOpacity;
  }-*/;

  /**
   * sets Map on which to display Polyline.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;
  
  /**
   * gets Map on which to display Polyline.
   * @return
   */
  public final MapWidget getMapWidget() {
    return MapWidget.newInstance(getMapImpl());
  }
  
  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;
  
  /**
   * sets The stroke color. All CSS3 colors are supported except for extended named colors.
   * @param strokeColor
   */
  public final native void setStrokeColor(String strokeColor) /*-{
    this.strokeColor = strokeColor;
  }-*/;
  
  /**
   * gets The stroke color. All CSS3 colors are supported except for extended named colors.
   */
  public final native String getStrokeColor() /*-{
    return this.strokeColor;
  }-*/;
  
  /**
   * sets The stroke opacity between 0.0 and 1.0
   * @param strokeOpacity
   */
  public final native void setStrokeOpacity(double strokeOpacity) /*-{
    this.strokeOpacity = strokeOpacity;
  }-*/;
  
  /**
   * gets The stroke opacity between 0.0 and 1.0
   */
  public final native double getStrokeOpacity() /*-{
    return this.strokeOpacity;
  }-*/;
  
  /**
   * sets The stroke width in pixels.
   * @param strokeWeight
   */
  public final native void setStrokeWeight(int strokeWeight) /*-{
    this.strokeWeight = strokeWeight;
  }-*/;
  
  /**
   * gets The stroke width in pixels.
   */
  public final native int getStrokeWeight() /*-{
    return this.strokeWeight;
  }-*/;
  
  /**
   * sets The zIndex compared to other rectangles.
   * @param zIndex
   */
  public final native void setZindex(int zIndex) /*-{
    this.zIndex = zIndex;
  }-*/;
  
  /**
   * gets The zIndex compared to other rectangles.
   * @return
   */
  public final native int getZindex() /*-{
    return this.zIndex;
  }-*/;
}
