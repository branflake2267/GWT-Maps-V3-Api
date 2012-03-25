package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.mvc.MVCObject;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaImpl;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;

/**
 * You can implement this class if you want to display custom types of overlay objects on the map. This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#OverlayView} 
 */
public class OverlayView extends MVCObject<OverlayView> {
  
  /**
   * use newInstance();
   */
  protected OverlayView() {}
  
  /**
   * You should inherit from this class by setting your overlay's prototype to new OverlayView.prototype. You must implement three methods: onAdd(), draw(), and onRemove(). In the add() method, you should create DOM objects and append them as children of the panes. In the draw() method, you should position these elements. In the onRemove() method, you should remove the objects from the DOM. You must call setMap() with a valid Map object to trigger the call to the onAdd() method and setMap(null) in order to trigger the onRemove() method. The setMap() method can be called at the time of construction or at any point afterward when the overlay should be re-shown after removing. The draw() method will then be called whenever a map property changes that could change the position of the element, such as zoom, center, or map type.
   * @return {@link OverlayView}
   */
  public final static OverlayView newInstance() {
    return createJso().cast();
  }

  private final static native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.OverlayView();
  }-*/; 
  
  /**
   * Implement this method to draw or update the overlay. This method is called after onAdd() and when the position from projection.fromLatLngToPixel() would return a new value for a given LatLng. This can happen on change of zoom, center, or map type. It is not necessarily called on drag or resize.
   */
  public final native void draw() /*-{
    this.draw();
  }-*/;
  
  /**
   * get mapWidget
   * @return
   */
  public final MapWidget getMapWidget() {
    return MapWidget.newInstance(getMapImpl());
  }
  
  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * Returns the panes in which this OverlayView can be rendered. Only available after draw has been called.
   * @return
   */
  public final native MapPanes getPanes() /*-{
    return this.getPanes();
  }-*/;
  
  /**
   * Returns the MapCanvasProjection object associated with this OverlayView. Only available after draw has been called.
   * @return
   */
  public final native MapCanvasProjection getProjection() /*-{
    return this.getProjection();
  }-*/;
  
  /**
   * Implement this method to initialize the overlay DOM elements. This method is called once after setMap() is called with a valid map. At this point, panes and projection will have been initialized.
   */
  public final native void onAdd() /*-{
    this.onAdd();
  }-*/;
  
  /**
   * Implement this method to remove your elements from the DOM. This method is called once following a call to setMap(null).
   */
  public final native void onRemove() /*-{
    this.onRemove();
  }-*/;
  
  /**
   * Adds the overlay to the map or panorama. 
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }
  
  private final native void setMapImpl(MapImpl map) /*-{
    this.setMap(map);
  }-*/;

  /**
   * Adds the overlay to the map or panorama. 
   * @param streetViewPanoramaWdiget
   */
  public final void setMap(StreetViewPanoramaWidget streetViewPanoramaWdiget) {
    setMapImpl(streetViewPanoramaWdiget.getJso());
  }
  
  private final native void setMapImpl(StreetViewPanoramaImpl pano) /*-{
    this.setMap(pano);
  }-*/;
  
}
