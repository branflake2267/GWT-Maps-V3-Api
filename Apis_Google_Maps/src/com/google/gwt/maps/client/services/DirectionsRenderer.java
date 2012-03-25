package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.directions.DirectionsChangeEventFormatter;
import com.google.gwt.maps.client.events.directions.DirectionsChangeMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * Renders directions retrieved in the form of a DirectionsResult object retrieved from the DirectionsService. This class extends MVCObject. 
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DirectionsRenderer}
 */
public class DirectionsRenderer extends MVCObject<DirectionsRenderer> {
  
  /**
   * use newInstance();
   */
  protected DirectionsRenderer() {}
  
  /**
   * Renders directions retrieved in the form of a DirectionsResult object retrieved from the DirectionsService. This class extends MVCObject.
   * @param options
   * @return
   */
  public static final DirectionsRenderer newInstance(DirectionsRendererOptions options) {
    return createJso(options).cast();
  }

  private static final native JavaScriptObject createJso(DirectionsRendererOptions options) /*-{
    return new $wnd.google.maps.DirectionsRenderer(options);
  }-*/;
  
  /**
   * Returns the renderer's current set of directions.
   * @return
   */
  public final native DirectionsResult getDirections() /*-{
    return this.getDirections();
  }-*/;
  
  /**
   * This method specifies the map on which directions will be rendered. Pass null to remove the directions from the map.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.setMap(map);
  }-*/;

  /**
   * Returns the map on which the DirectionsResult is rendered.
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * Returns the panel <div> in which the DirectionsResult is rendered.
   * @return
   */
  public final native Element getPanel() /*-{
    return this.getPanel();
  }-*/;
  
  /**
   * Returns the current (zero-based) route index in use by this DirectionsRenderer object.
   * @return
   */
  public final native int getRouteIndex() /*-{
    return this.getRouteIndex();
  }-*/;
  
  /**
   * Set the renderer to use the result from the DirectionsService. Setting a valid set of directions in this manner will display the directions on the renderer's designated map and panel.
   * @param directions
   */
  public final native void setDirections(DirectionsResult directions) /*-{
    this.setDirections(directions);
  }-*/;
  
  /**
   * Change the options settings of this DirectionsRenderer after initialization.
   * @param options
   */
  public final native void setOptions(DirectionsRendererOptions options) /*-{
    this.setOptions(options);
  }-*/;
  
  /**
   * This method renders the directions in a <div>. Pass null to remove the content from the panel.
   * @param element
   */
  public final native void setPanel(Element element) /*-{
    this.setPanel(element);
  }-*/;
  
  /**
   * Set the (zero-based) index of the route in the DirectionsResult object to render. By default, the first route in the array will be rendered.
   * @param route
   */
  public final native void setRouteIndex(int routeIndex) /*-{
    this.setRouteIndex(routeIndex);
  }-*/;
  
  /**
   * This event is fired when the rendered directions change, either when a new DirectionsResult is set or when the user finishes dragging a change to the directions path.
   * @param handler
   * @return
   */
  public final HandlerRegistration addDirectionsChangeHandler(DirectionsChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DIRECTIONS_CHANGED, handler, new DirectionsChangeEventFormatter());
  }
  
}
