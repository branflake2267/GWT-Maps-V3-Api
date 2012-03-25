package com.google.gwt.maps.client;

import java.math.BigDecimal;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.controls.MapTypeControlOptions;
import com.google.gwt.maps.client.controls.MapTypeStyle;
import com.google.gwt.maps.client.controls.OverviewMapControlOptions;
import com.google.gwt.maps.client.controls.PanControlOptions;
import com.google.gwt.maps.client.controls.RotateControlOptions;
import com.google.gwt.maps.client.controls.ScaleControlOptions;
import com.google.gwt.maps.client.controls.StreetViewControlOptions;
import com.google.gwt.maps.client.controls.ZoomControlOptions;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * Map rendering options
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#MapOptions}
 */
public class MapOptions extends JavaScriptObject {
  
  /**
   * This will tell the map how to render and with with what features
   * use newInstance();
   */
  protected MapOptions() {}
  
  /**
   * Create a new Instance of the MapOptions
   * This will also create a defaults center, mapTypeId and Zoom
   * @return MapOptions
   */
  public final static MapOptions newInstance() {
    MapOptions options = newInstanceDefault();
    getDefaults(options);
    return options;
  }

  /**
   * Create a new Instance of the MapOptions
   * @param withdefaults - [true]= setup required defaults, center, mapTypeId and Zoom. [false]= will not use defaults
   * @return MapOptions
   */
  public final static MapOptions newInstance(boolean withdefaults) {
    MapOptions options = newInstanceDefault();
    if (withdefaults == true) {
      getDefaults(options);
    }
    return options;
  }
  
  /**
   * get the Required defaults, this should help prevent setup errors
   * @param options 
   */
  private static void getDefaults(MapOptions options) { 
    options.setCenter(LatLng.newInstance(new BigDecimal(26.4), new BigDecimal(-9)));
    options.setMapTypeId(MapTypeId.ROADMAP);
    options.setZoom(0);
  }
  
  /**
   * setup a javascript object to store the values in
   * @return MapOptions
   */
  private final static MapOptions newInstanceDefault() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    //WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }
  
  /**
   * set Color used for the background of the Map div. This color will be visible when tiles have not yet loaded as the user pans. This option can only be set when the map is initialized.
   * @param backgroundColor
   */
  public final native void setBackgroundColor(String backgroundColor) /*-{
    this.backgroundColor = backgroundColor;
  }-*/;
  
  /**
   * get Color used for the background of the Map div.
   * @return
   */
  public final native String getBackgroundColor() /*-{
    return this.backgroundColor;
  }-*/;
  
  /**
   * set The initial Map center. Required.
   * @param center {@link center}
   */
  public final native void setCenter(LatLng center) /*-{
    this.center = center;
  }-*/; 
  
  /**
   * get {@link LatLng}
   * @return {@link LatLng}
   */
  public final native LatLng getCenter() /*-{
    return this.center;
  }-*/;
  
  /**
   * set Enables/disables all default UI. May be overridden individually.
   * @param disableDefaultUI
   */
  public final native void setDisableDefaultUi(boolean disableDefaultUI) /*-{
    this.disableDefaultUI = disableDefaultUI;
  }-*/;
  
  /**
   * get Enables/disables all default UI. May be overridden individually.
   * @return boolean
   */
  public final native boolean getDisableDefaultUi() /*-{
    return this.disableDefaultUI;
  }-*/;
  
  /**
   * set Enables/disables zoom and center on double click. Enabled by default.
   * @param disableDoubleClickZoom
   */
  public final native void setDisableDoubleClickZoom(boolean disableDoubleClickZoom) /*-{
    this.disableDoubleClickZoom = disableDoubleClickZoom;
  }-*/;
  
  /**
   * get nables/disables zoom and center on double click. Enabled by default.
   * @return boolean
   */
  public final native boolean getDisableDoubleClickZoom() /*-{
    return this.disableDoubleClickZoom;
  }-*/;
  
  /**
   * set If false, prevents the map from being dragged. Dragging is enabled by default.
   * @param draggable
   */
  public final native void setDraggable(boolean draggable) /*-{
    this.draggable = draggable;
  }-*/;
  
  /**
   * get If false, prevents the map from being dragged. Dragging is enabled by default.
   * @return boolean
   */
  public final native boolean getDraggable() /*-{
    return this.draggable;
  }-*/;
 
  /**
   * set The name or url of the cursor to display on a draggable object.
   * @param draggableCursor
   */
  public final native void setDraggableCursor(boolean draggableCursor) /*-{
    this.draggableCursor = draggableCursor;
  }-*/;
  
  /**
   * get The name or url of the cursor to display on a draggable object.
   * @return
   */
  public final native boolean getDraggableCursor() /*-{
    return this.draggableCursor;
  }-*/;
  
  /**
   * set The name or url of the cursor to display when an object is dragging.
   * @param draggingCursor
   */
  public final native void setDraggingCursor(boolean draggingCursor) /*-{
    this.draggingCursor = draggingCursor;
  }-*/;
  
  /**
   * get The name or url of the cursor to display when an object is dragging.
   * @return
   */
  public final native boolean getDraggingCursor() /*-{
    return this.draggingCursor;
  }-*/;
  
  /**
   * set The heading for aerial imagery in degrees measured clockwise from cardinal direction North. Headings are snapped to the nearest available angle for which imagery is available.
   * @param heading
   */
  public final native void setHeading(int heading) /*-{
    this.heading = heading;
  }-*/;
  
  /**
   * get The heading for aerial imagery in degrees measured clockwise from cardinal direction North. Headings are snapped to the nearest available angle for which imagery is available.
   * @return int
   */
  public final native int getHeading() /*-{
    return this.heading;
  }-*/;
  
  /**
   * set If false, prevents the map from being controlled by the keyboard. Keyboard shortcuts are enabled by default.
   * @param keyboardShortcuts
   */
  public final native void setKeyboardShortcuts(boolean keyboardShortcuts) /*-{
    this.keyboardShortcuts = keyboardShortcuts;
  }-*/;
  
  /**
   * get If false, prevents the map from being controlled by the keyboard. Keyboard shortcuts are enabled by default. 
   * @return boolean
   */
  public final native boolean getKeyboardShortcuts() /*-{
    return this.keyboardShortcuts;
  }-*/;
  
  /**
   * set The initial enabled/disabled state of the Map type control.
   * @param mapTypeControl
   */
  public final native void setMapTypeControl(boolean mapTypeControl) /*-{
    this.mapTypeControl = mapTypeControl;
  }-*/;
  
  /**
   * get The initial enabled/disabled state of the Map type control.
   * @return
   */
  public final native boolean getMapTypeControl() /*-{
    return this.mapTypeControl;
  }-*/;
  
  /**
   * set The initial display options for the Map type control.
   * @param mapTypeControlOptions
   */
  public final native void setMapTypeControlOptions(MapTypeControlOptions mapTypeControlOptions) /*-{
    this.mapTypeControlOptions = mapTypeControlOptions;
  }-*/;
  
  /**
   * get The initial display options for the Map type control.
   * @return {@link MapTypeControlOptions}
   */
  public final native MapTypeControlOptions getMapTypeControlOptions() /*-{
    return this.mapTypeControlOptions;
  }-*/;
  
  /**
   * The initial Map {@Link MapTypeId}. Required.
   * @param mapTypeId {@Link MapTypeId}
   */
  public final void setMapTypeId(MapTypeId mapTypeId) {
    setMapTypeId(mapTypeId.value());
  }
  
  /**
   * Native Use. Use setMapTypeId(MapTypeId mapTypeId). The initial Map {@Link MapTypeId}. Required.
   */
  private final native void setMapTypeId(String type) /*-{
    this.mapTypeId = $wnd.google.maps.MapTypeId[type];
  }-*/;
  
  /**
   * get {@Link MapTypeId}
   * @return
   */
  public final MapTypeId getMapTypeId() {
    String type = getMapTypeIdJs();
    return MapTypeId.fromValue(type);
  }
  
  /**
   * native use. get {@Link MapTypeId}
   * @return String
   */
  private final native String getMapTypeIdJs() /*-{
    return this.mapTypeId;
  }-*/;

  /**
   * set The maximum zoom level which will be displayed on the map. If omitted, or set to null, the maximum zoom from the current map type is used instead.
   * @param maxZoom
   */
  public final native void setMaxZoom(int maxZoom) /*-{
    this.maxZoom = maxZoom;
  }-*/;
  
  /**
   * get maxZoom
   * @return int
   */
  public final native int getMaxZoom() /*-{
    return this.maxZoom;
  }-*/;
  
  /**
   * set The minimum zoom level which will be displayed on the map. If omitted, or set to null, the minimum zoom from the current map type is used instead.
   * @param minZoom
   */
  public final native void setMinZoom(int minZoom) /*-{
    this.minZoom = minZoom;
  }-*/;
  
  /**
   * get The minimum zoom level which will be displayed on the map. If omitted, or set to null, the minimum zoom from the current map type is used instead.
   * @return
   */
  public final native int getMinZoom() /*-{
    return this.minZoom;
  }-*/;
  
  /**
   * set If true, do not clear the contents of the Map div.
   * @param noClear
   */
  public final native void setNoClear(boolean noClear) /*-{
    this.noClear = noClear;
  }-*/;
  
  /**
   * get If true, do not clear the contents of the Map div.
   * @return
   */
  public final native boolean getNoClear() /*-{
    return this.noClear;
  }-*/;
  
  /**
   * set The enabled/disabled state of the Overview Map control.
   * @param overviewMapControl
   */
  public final native void setOverviewMapControl(boolean overviewMapControl) /*-{
    this.overviewMapControl = overviewMapControl;
  }-*/;
  
  /**
   * get The enabled/disabled state of the Overview Map control.
   * @return
   */
  public final native boolean getOverviewMapControl() /*-{
    return this.overviewMapControl;
  }-*/;
  
  /**
   * set The display options for the Overview Map control. {@link OverviewMapControlOptions}
   * @param overviewMapControlOptions
   */
  public final native void setOverviewMapControlOptions(OverviewMapControlOptions overviewMapControlOptions) /*-{
    this.overviewMapControlOptions = overviewMapControlOptions;
  }-*/;
 
  /**
   * get The display options for the Overview Map control.
   * @return {@link OverviewMapControlOptions}
   */
  public final native OverviewMapControlOptions getOverviewMapControlOptions() /*-{
    return this.overviewMapControlOptions;
  }-*/;
  
  /**
   * The enabled/disabled state of the Pan control.
   * @param panControl
   */
  public final native void setPanControl(boolean panControl) /*-{
    this.panControl = panControl;
  }-*/;
  
  /**
   * get The enabled/disabled state of the Pan control.
   * @return boolean
   */
  public final native boolean getPanControl() /*-{
    return this.panControl;
  }-*/;
  
  /**
   * sets The display options for the Pan control.
   * @param panControlOptions {@link PanControlOptions}
   */
  public final native void setPanControlOptions(PanControlOptions panControlOptions) /*-{
    this.panControlOptions = panControlOptions;
  }-*/;
  
  /**
   * gets The display options for the Pan control.
   * @return {@link PanControlOptions}
   */
  public final native PanControlOptions getPanControlOptions() /*-{
    return this.panControlOptions;
  }-*/;
  
  /**
   * set The enabled/disabled state of the Rotate control.
   * @param rotateControl
   */
  public final native void setRotateControl(boolean rotateControl) /*-{
    this.rotateControl = rotateControl;
  }-*/;
  
  /**
   * get The enabled/disabled state of the Rotate control.
   * @return
   */
  public final native boolean getRotateControl() /*-{
    return this.rotateControl;
  }-*/;
  
  /**
   * set The display options for the Rotate control.
   * @param rotateControlOptions {@link RotateControlOptions}
   */
  public final native void setRotateControlOptions(RotateControlOptions rotateControlOptions) /*-{
    this.rotateControlOptions = rotateControlOptions;
  }-*/;
  
  /**
   * get set The display options for the Rotate control.
   * @return {@link RotateControlOptions}
   */
  public final native RotateControlOptions getRotateControlOptions() /*-{
    return this.rotateControlOptions;
  }-*/;
  
  /**
   * set The initial enabled/disabled state of the Scale control.
   * @param scaleControl
   */
  public final native void setScaleControl(boolean scaleControl) /*-{
    this.scaleControl = scaleControl;
  }-*/;
  
  /**
   * get The initial enabled/disabled state of the Scale control.
   * @return boolean
   */
  public final native boolean getScaleControl() /*-{
    return this.scaleControl;
  }-*/;
  
  /**
   * set The initial display options for the Scale control.
   * @param scaleControlOptions {@link ScaleControlOptions}
   */
  public final native void setScaleControlOptions(ScaleControlOptions scaleControlOptions) /*-{
    this.scaleControlOptions = scaleControlOptions;
  }-*/;
  
  /**
   * get The initial display options for the Scale control.
   * @return {@link ScaleControlOptions}
   */
  public final native ScaleControlOptions getScaleControlOptions() /*-{
    return this.scaleOptions;
  }-*/;
  
  /**
   * set If false, disables scrollwheel zooming on the map. The scrollwheel is enabled by default.
   * @param scrollWheel
   */
  public final native void setScrollWheel(boolean scrollWheel) /*-{
    this.scrollWheel = scrollWheel;
  }-*/;
  
  /**
   * get If false, disables scrollwheel zooming on the map. The scrollwheel is enabled by default.
   * @return
   */
  public final native boolean getScrollWheel() /*-{
    return this.scrollWheel;
  }-*/;
  
  /**
   * set A StreetViewPanorama to display when the Street View pegman is dropped on the map. If no panorama is specified, a default StreetViewPanorama will be displayed in the map's div when the pegman is dropped.
   * @param streetViewControl
   */
  public final native void setStreetViewControl(boolean streetViewControl) /*-{
    this.streetViewControl = streetViewControl;
  }-*/;
 
  /**
   * get set A StreetViewPanorama to display when the Street View pegman is dropped on the map. If no panorama is specified, a default StreetViewPanorama will be displayed in the map's div when the pegman is dropped.
   * @return
   */
  public final native boolean getStreetViewControl() /*-{
    return this.streetViewControl;
  }-*/;
  
  /**
   * The initial enabled/disabled state of the Street View Pegman control. This control is part of the default UI, and should be set to false when displaying a map type on which the Street View road overlay should not appear (e.g. a non-Earth map type).
   * @param streetViewControlOptions {@link StreetViewControlOptions}
   */
  public final native void setStreetViewControlOptions(StreetViewControlOptions streetViewControlOptions) /*-{
    this.streetViewControlOptions = streetViewControlOptions;
  }-*/;
  
  /**
   * get The initial enabled/disabled state of the Street View Pegman control. This control is part of the default UI, and should be set to false when displaying a map type on which the Street View road overlay should not appear (e.g. a non-Earth map type).
   * @return {@link StreetViewControlOptions}
   */
  public final native StreetViewControlOptions getStreetViewControlOptions() /*-{
    return this.streetViewcontrolOptions;
  }-*/;
  
  public final void setMapTypeStyles(MapTypeStyle[] styles) {
    JsArray<MapTypeStyle> arr = ArrayHelper.toJsArray(styles);
    setMapTypeStyles(arr);
  }
  
  /**
   * set Styles to apply to each of the default map types. Note that styles will apply only to the labels and geometry in Satellite/Hybrid and Terrain modes.
   */
  private final native void setMapTypeStyles(JsArray<MapTypeStyle> styles) /*-{
    this.styles = styles;
  }-*/;
  
  /**
   * get set Styles to apply to each of the default map types. Note that styles will apply only to the labels and geometry in Satellite/Hybrid and Terrain modes.
   * @return
   */
  public final MapTypeStyle[] getMapTypeStyles() {
    JsArray<MapTypeStyle> arr = getMapTypeStylesJs();
    MapTypeStyle[] r = new MapTypeStyle[arr.length()];
    for (int i=0; i < arr.length(); i++) {
      r[i] = arr.get(i);
    }
    return r;
  }
  
  /**
   * get set Styles to apply to each of the default map types. Note that styles will apply only to the labels and geometry in Satellite/Hybrid and Terrain modes.
   * @return
   */
  private final native JsArray<MapTypeStyle> getMapTypeStylesJs() /*-{
    return this.styles;
  }-*/;
  
  /**
   * sets The angle of incidence of the map as measured in degrees from the viewport plane to the map plane. The only currently supported values are 0, indicating no angle of incidence (no tilt), and 45, indicating a tilt of 45deg;. 45deg; imagery is only available for SATELLITE and HYBRID map types, within some locations, and at some zoom levels.
   */
  public final native void setTilt(int tilt) /*-{
    this.tilt = tilt;
  }-*/;
  
  /**
   * gets The angle of incidence of the map as measured in degrees from the viewport plane to the map plane. The only currently supported values are 0, indicating no angle of incidence (no tilt), and 45, indicating a tilt of 45deg;. 45deg; imagery is only available for SATELLITE and HYBRID map types, within some locations, and at some zoom levels.
   * @return
   */
  public final native int getTilt() /*-{
    return this.tilt;
  }-*/;
  
  /**
   * The initial Map zoom level. Required.
   * @param zoom
   */
  public final native void setZoom(int zoom) /*-{
    this.zoom = zoom;
  }-*/;
  
  /**
   * get Map zoom level
   * @return int
   */
  public final native int getZoom() /*-{ 
    return this.zoom;
  }-*/;
  
  /**
   * sets The enabled/disabled state of the Zoom control.
   * @param zoomControl
   */
  public final native void setZoomControl(boolean zoomControl) /*-{
    this.zoomControl = zoomControl;
  }-*/;
  
  /**
   * gets The enabled/disabled state of the Zoom control.
   * @return
   */
  public final native boolean getZoomControl() /*-{
    return this.zoomControl;
  }-*/;
  
  /**
   * sets The display options for the Zoom control.
   * @param zoomControlOptions
   */
  public final native void setZoomControlOptions(ZoomControlOptions zoomControlOptions) /*-{
    this.zoomControlOptions = zoomControlOptions;
  }-*/;
  
  /**
   * gets The display options for the Zoom control.
   * @return
   */
  public final native ZoomControlOptions getZoomControlOptions() /*-{
    return this.zoomControlOptions;
  }-*/;
  
}
