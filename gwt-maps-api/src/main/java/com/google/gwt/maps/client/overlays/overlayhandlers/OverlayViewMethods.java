package com.google.gwt.maps.client.overlays.overlayhandlers;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.overlays.MapCanvasProjection;
import com.google.gwt.maps.client.overlays.MapPanes;

public class OverlayViewMethods extends JavaScriptObject {
  
  protected OverlayViewMethods() {
  }
  
  /**
   * Returns the MapCanvasProjection object associated with this OverlayView.
   * Only available after draw has been called.
   */
  public final native MapCanvasProjection getProjection() /*-{
    return this.getProjection();
  }-*/;
  
  public final MapWidget getMap() {
    MapImpl val = getMapImpl();
    return val == null ? null : MapWidget.newInstance(val);
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * Returns the panes in which this OverlayView can be rendered. Only
   * available after draw has been called.
   */
  public final native MapPanes getPanes() /*-{
    return this.getPanes();
  }-*/;
  
}
