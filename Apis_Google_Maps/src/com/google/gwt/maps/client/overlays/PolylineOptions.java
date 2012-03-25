package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;

/**
 * polyline options
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#PolygonOptions}
 */
public class PolylineOptions extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected PolylineOptions() {}

  /**
   * creates a new instance of options
   * @return
   */
  public final static PolylineOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
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
   * sets When true, render each edge as a geodesic (a segment of a "great circle"). A geodesic is the shortest path between two points along the surface of the Earth. When false, render each edge as a straight line on screen. Defaults to false.
   * @param geodesic
   */
  public final native void setGeodesic(boolean geodesic) /*-{
    this.geodesic = geodesic;
  }-*/;
  
  /**
   * gets When true, render each edge as a geodesic (a segment of a "great circle"). A geodesic is the shortest path between two points along the surface of the Earth. When false, render each edge as a straight line on screen. Defaults to false. 
   */
  public final native boolean getGeodesic() /*-{
    return this.geodesic;
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
   * sets The ordered sequence of coordinates of the Polyline. This path may be specified using either a simple array of LatLngs, or an MVCArray of LatLngs. Note that if you pass a simple array, it will be converted to an MVCArray Inserting or removing LatLngs in the MVCArray will automatically update the polyline on the map.
   * @param path
   */
  public final native void setPath(MVCArray<LatLng> path) /*-{
    this.path = path;
  }-*/;
  
  /**
   * sets The ordered sequence of coordinates of the Polyline. This path may be specified using either a simple array of LatLngs, or an MVCArray of LatLngs. Note that if you pass a simple array, it will be converted to an MVCArray Inserting or removing LatLngs in the MVCArray will automatically update the polyline on the map.
   * @param path
   */
  public final native void setPath(JsArray<LatLng> path) /*-{
    this.path = path;
  }-*/;
  
  /**
   * gets The ordered sequence of coordinates of the Polyline. This path may be specified using either a simple array of LatLngs, or an MVCArray of LatLngs. Note that if you pass a simple array, it will be converted to an MVCArray Inserting or removing LatLngs in the MVCArray will automatically update the polyline on the map.
   * @return
   */
  public final native MVCArray<LatLng> getPath_MVCArray() /*-{
    return this.path;
  }-*/;
  
  /**
   * gets The ordered sequence of coordinates of the Polyline. This path may be specified using either a simple array of LatLngs, or an MVCArray of LatLngs. Note that if you pass a simple array, it will be converted to an MVCArray Inserting or removing LatLngs in the MVCArray will automatically update the polyline on the map.
   * @return
   */
  public final native JsArray<LatLng> getPath_JsArray() /*-{
    return this.path;
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
   * sets The zIndex compared to other polys.
   * @param zIndex
   */
  public final native void setZindex(int zIndex) /*-{
    this.zIndex = zIndex;
  }-*/;
  
  /**
   * gets The zIndex compared to other polys.
   * @return
   */
  public final native int getZindex() /*-{
    return this.zIndex;
  }-*/;
  
}
