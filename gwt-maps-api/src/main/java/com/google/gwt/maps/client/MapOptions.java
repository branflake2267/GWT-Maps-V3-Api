package com.google.gwt.maps.client;

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

/**
 * Map rendering options<br>
 * <b>Note:</b> Defaults to LatLng(26.4,-9) <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#MapOptions" >MapOptions API
 * Doc</a>
 */
public class MapOptions extends JavaScriptObject {

  /**
   * This will tell the map how to render and with with what features<br>
   * Use newInstance();
   */
  protected MapOptions() {
  }

  public static final double DEFAULT_LATLNG_LAT = 26.4d;
  public static final double DEFAULT_LATLNG_LNG = -9d;

  /**
   * Create a new Instance of the MapOptions This will also create a defaults center, mapTypeId and Zoom
   * 
   * @return MapOptions
   */
  public final static MapOptions newInstance() {
    MapOptions options = newInstanceDefault();
    setDefaults(options);
    return options;
  }

  /**
   * Create a new Instance of the MapOptions
   * 
   * @param withdefaults - [true]= setup required defaults, center, mapTypeId and Zoom. [false]= will not use defaults
   * @return MapOptions
   */
  public final static MapOptions newInstance(boolean withdefaults) {
    MapOptions options = newInstanceDefault();
    if (withdefaults == true) {
      setDefaults(options);
    }
    return options;
  }

  /**
   * Set the Required defaults, this should help prevent setup errors<br>
   * NOTE: These are the defaults as would be applied to a map if no options were used. They are set here so that NPE's
   * are not thrown if you access an unset field.
   * 
   * @param options
   */
  private static void setDefaults(MapOptions options) {
    options.setCenter(LatLng.newInstance(DEFAULT_LATLNG_LAT, DEFAULT_LATLNG_LNG));
    options.setMapTypeId(MapTypeId.ROADMAP);
    options.setZoom(0);
    options.setDisableDefaultUi(false);
    options.setDisableDoubleClickZoom(false);
    options.setDraggable(true);
    options.setDraggableCursor(null);
    options.setDraggingCursor(null);
    options.setHeading(0);
    options.setKeyboardShortcuts(true);
    options.setMapTypeControl(true);
    options.setScrollWheel(true);
    options.setNoClear(false);
    options.setRotateControl(false);
    options.setTilt(0);
    options.setScaleControl(false);
    options.setStreetViewControl(true);
    options.setStreetViewControlOptions(null);
    options.setOverviewMapControl(false);
    options.setPanControl(true);
    options.setZoomControl(true);
    options.setMapMaker(false);
    // Max/Min zoom not set with default here because it depends on the map type in use
    // We don't want to risk overriding that
  }

  /**
   * setup a javascript object to store the values in
   * 
   * @return MapOptions
   */
  private final static MapOptions newInstanceDefault() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    // WorkAroundUtils.removeGwtObjectId(jso); TODO Still needed?
    return jso.cast();
  }

  /**
   * set Color used for the background of the Map div. This color will be visible when tiles have not yet loaded as the
   * user pans. This option can only be set when the map is initialized.
   * 
   * @param backgroundColor
   */
  public final native void setBackgroundColor(String backgroundColor) /*-{
    this.backgroundColor = backgroundColor;
  }-*/;

  /**
   * get Color used for the background of the Map div.
   */
  public final native String getBackgroundColor() /*-{
    return this.backgroundColor;
  }-*/;

  /**
   * set The initial Map center. Required.
   * 
   * @param center {@link LatLng}
   */
  public final native void setCenter(LatLng center) /*-{
    this.center = center;
  }-*/;

  /**
   * get {@link LatLng}
   * 
   * @return {@link LatLng}
   */
  public final native LatLng getCenter() /*-{
    return this.center;
  }-*/;

  /**
   * set Enables/disables all default UI. May be overridden individually.
   * 
   * @param disableDefaultUI
   */
  public final native void setDisableDefaultUi(boolean disableDefaultUI) /*-{
    this.disableDefaultUI = disableDefaultUI;
  }-*/;

  /**
   * get Enables/disables all default UI. May be overridden individually.
   * 
   * @return boolean
   */
  public final native boolean getDisableDefaultUi() /*-{
    return this.disableDefaultUI;
  }-*/;

  /**
   * set Enables/disables zoom and center on double click. Enabled by default.
   * 
   * @param disableDoubleClickZoom
   */
  public final native void setDisableDoubleClickZoom(boolean disableDoubleClickZoom) /*-{
    this.disableDoubleClickZoom = disableDoubleClickZoom;
  }-*/;

  /**
   * get enables/disables zoom and center on double click. Enabled by default.
   * 
   * @return boolean
   */
  public final native boolean getDisableDoubleClickZoom() /*-{
    return this.disableDoubleClickZoom;
  }-*/;

  /**
   * set If false, prevents the map from being dragged. Dragging is enabled by default.
   * 
   * @param draggable
   */
  public final native void setDraggable(boolean draggable) /*-{
    this.draggable = draggable;
  }-*/;

  /**
   * get If false, prevents the map from being dragged. Dragging is enabled by default.
   * 
   * @return boolean
   */
  public final native boolean getDraggable() /*-{
    return this.draggable;
  }-*/;

  /**
   * set The name or url of the cursor to display on a draggable object.
   * 
   * @param draggableCursor
   */
  public final native void setDraggableCursor(String draggableCursor) /*-{
    this.draggableCursor = draggableCursor;
  }-*/;

  /**
   * get The name or url of the cursor to display on a draggable object.
   */
  public final native String getDraggableCursor() /*-{
    return this.draggableCursor;
  }-*/;

  /**
   * set The name or url of the cursor to display when an object is dragging.
   * 
   * @param draggingCursor
   */
  public final native void setDraggingCursor(String draggingCursor) /*-{
    this.draggingCursor = draggingCursor;
  }-*/;

  /**
   * get The name or url of the cursor to display when an object is dragging.
   */
  public final native String getDraggingCursor() /*-{
    return this.draggingCursor;
  }-*/;

  /**
   * set The heading for aerial imagery in degrees measured clockwise from cardinal direction North. Headings are
   * snapped to the nearest available angle for which imagery is available.
   * 
   * @param heading
   */
  public final native void setHeading(int heading) /*-{
    this.heading = heading;
  }-*/;

  /**
   * get The heading for aerial imagery in degrees measured clockwise from cardinal direction North. Headings are
   * snapped to the nearest available angle for which imagery is available.
   * 
   * @return int
   */
  public final native int getHeading() /*-{
    return this.heading;
  }-*/;

  /**
   * set If false, prevents the map from being controlled by the keyboard. Keyboard shortcuts are enabled by default.
   * 
   * @param keyboardShortcuts
   */
  public final native void setKeyboardShortcuts(boolean keyboardShortcuts) /*-{
    this.keyboardShortcuts = keyboardShortcuts;
  }-*/;

  /**
   * get If false, prevents the map from being controlled by the keyboard. Keyboard shortcuts are enabled by default.
   * 
   * @return boolean
   */
  public final native boolean getKeyboardShortcuts() /*-{
    return this.keyboardShortcuts;
  }-*/;

  /**
   * set The initial enabled/disabled state of the Map type control.
   * 
   * @param mapTypeControl
   */
  public final native void setMapTypeControl(boolean mapTypeControl) /*-{
    this.mapTypeControl = mapTypeControl;
  }-*/;

  /**
   * get The initial enabled/disabled state of the Map type control.
   */
  public final native boolean getMapTypeControl() /*-{
    return this.mapTypeControl;
  }-*/;

  /**
   * set The initial display options for the Map type control.
   * 
   * @param mapTypeControlOptions
   */
  public final native void setMapTypeControlOptions(MapTypeControlOptions mapTypeControlOptions) /*-{
    this.mapTypeControlOptions = mapTypeControlOptions;
  }-*/;

  /**
   * get The initial display options for the Map type control.
   * 
   * @return {@link MapTypeControlOptions}
   */
  public final native MapTypeControlOptions getMapTypeControlOptions() /*-{
    return this.mapTypeControlOptions;
  }-*/;

  /**
   * The initial Map {@link MapTypeId}. Required.
   * 
   * @param mapTypeId {@link MapTypeId}
   */
  public final void setMapTypeId(MapTypeId mapTypeId) {
    setMapTypeIdJs(mapTypeId.value());
  }

  /**
   * The initial Map {@link MapTypeId}. Required.
   * 
   * @param mapTypeId String
   */
  public final void setMapTypeId(String mapTypeId) {
    setMapTypeIdStringJs(mapTypeId);
  }

  /**
   * Native Use. Use setMapTypeId(MapTypeId mapTypeId). The initial Map {@link MapTypeId}. Required.
   */
  private final native void setMapTypeIdJs(String type) /*-{
    this.mapTypeId = $wnd.google.maps.MapTypeId[type];
  }-*/;

  /**
   * Native Use. Apply a given user defined map type string. Required.
   */
  private final native void setMapTypeIdStringJs(String type) /*-{
    this.mapTypeId = type;
  }-*/;

  /**
   * Get {@link MapTypeId}
   */
  public final MapTypeId getMapTypeId() {
    String type = getMapTypeIdJs();
    return MapTypeId.fromValue(type);
  }

  /**
   * Get mapTypeId string
   */
  public final String getMapTypeIdString() {
    return getMapTypeIdJs();
  }

  /**
   * native use. get {@link MapTypeId}
   * 
   * @return String
   */
  private final native String getMapTypeIdJs() /*-{
    return this.mapTypeId;
  }-*/;

  /**
   * set The maximum zoom level which will be displayed on the map. If omitted, or set to null, the maximum zoom from
   * the current map type is used instead.
   * 
   * @param maxZoom
   */
  public final native void setMaxZoom(int maxZoom) /*-{
    this.maxZoom = maxZoom;
  }-*/;

  /**
   * get maxZoom
   * 
   * @return int
   */
  public final native int getMaxZoom() /*-{
    return this.maxZoom;
  }-*/;

  /**
   * set The minimum zoom level which will be displayed on the map. If omitted, or set to null, the minimum zoom from
   * the current map type is used instead.
   * 
   * @param minZoom
   */
  public final native void setMinZoom(int minZoom) /*-{
    this.minZoom = minZoom;
  }-*/;

  /**
   * get The minimum zoom level which will be displayed on the map. If omitted, or set to null, the minimum zoom from
   * the current map type is used instead.
   */
  public final native int getMinZoom() /*-{
    return this.minZoom;
  }-*/;

  /**
   * set If true, do not clear the contents of the Map div.
   * 
   * @param noClear
   */
  public final native void setNoClear(boolean noClear) /*-{
    this.noClear = noClear;
  }-*/;

  /**
   * get If true, do not clear the contents of the Map div.
   */
  public final native boolean getNoClear() /*-{
    return this.noClear;
  }-*/;

  /**
   * set The enabled/disabled state of the Overview Map control.
   * 
   * @param overviewMapControl
   */
  public final native void setOverviewMapControl(boolean overviewMapControl) /*-{
    this.overviewMapControl = overviewMapControl;
  }-*/;

  /**
   * get The enabled/disabled state of the Overview Map control.
   */
  public final native boolean getOverviewMapControl() /*-{
    return this.overviewMapControl;
  }-*/;

  /**
   * set The display options for the Overview Map control. {@link OverviewMapControlOptions}
   * 
   * @param overviewMapControlOptions
   */
  public final native void setOverviewMapControlOptions(OverviewMapControlOptions overviewMapControlOptions) /*-{
    this.overviewMapControlOptions = overviewMapControlOptions;
  }-*/;

  /**
   * get The display options for the Overview Map control.
   * 
   * @return {@link OverviewMapControlOptions}
   */
  public final native OverviewMapControlOptions getOverviewMapControlOptions() /*-{
    return this.overviewMapControlOptions;
  }-*/;

  /**
   * The enabled/disabled state of the Pan control.
   * 
   * @param panControl
   */
  public final native void setPanControl(boolean panControl) /*-{
    this.panControl = panControl;
  }-*/;

  /**
   * get The enabled/disabled state of the Pan control.
   * 
   * @return boolean
   */
  public final native boolean getPanControl() /*-{
    return this.panControl;
  }-*/;

  /**
   * sets The display options for the Pan control.
   * 
   * @param panControlOptions {@link PanControlOptions}
   */
  public final native void setPanControlOptions(PanControlOptions panControlOptions) /*-{
    this.panControlOptions = panControlOptions;
  }-*/;

  /**
   * gets The display options for the Pan control.
   * 
   * @return {@link PanControlOptions}
   */
  public final native PanControlOptions getPanControlOptions() /*-{
    return this.panControlOptions;
  }-*/;

  /**
   * set The enabled/disabled state of the Rotate control.
   * 
   * @param rotateControl
   */
  public final native void setRotateControl(boolean rotateControl) /*-{
    this.rotateControl = rotateControl;
  }-*/;

  /**
   * get The enabled/disabled state of the Rotate control.
   */
  public final native boolean getRotateControl() /*-{
    return this.rotateControl;
  }-*/;

  /**
   * set The display options for the Rotate control.
   * 
   * @param rotateControlOptions {@link RotateControlOptions}
   */
  public final native void setRotateControlOptions(RotateControlOptions rotateControlOptions) /*-{
    this.rotateControlOptions = rotateControlOptions;
  }-*/;

  /**
   * get set The display options for the Rotate control.
   * 
   * @return {@link RotateControlOptions}
   */
  public final native RotateControlOptions getRotateControlOptions() /*-{
    return this.rotateControlOptions;
  }-*/;

  /**
   * set The initial enabled/disabled state of the Scale control.
   * 
   * @param scaleControl
   */
  public final native void setScaleControl(boolean scaleControl) /*-{
    this.scaleControl = scaleControl;
  }-*/;

  /**
   * get The initial enabled/disabled state of the Scale control.
   * 
   * @return boolean
   */
  public final native boolean getScaleControl() /*-{
    return this.scaleControl;
  }-*/;

  /**
   * set The initial display options for the Scale control.
   * 
   * @param scaleControlOptions {@link ScaleControlOptions}
   */
  public final native void setScaleControlOptions(ScaleControlOptions scaleControlOptions) /*-{
    this.scaleControlOptions = scaleControlOptions;
  }-*/;

  /**
   * get The initial display options for the Scale control.
   * 
   * @return {@link ScaleControlOptions}
   */
  public final native ScaleControlOptions getScaleControlOptions() /*-{
    return this.scaleOptions;
  }-*/;

  /**
   * set If false, disables scrollwheel zooming on the map. The scrollwheel is enabled by default.
   * 
   * @param scrollWheel
   */
  public final native void setScrollWheel(boolean scrollWheel) /*-{
    this.scrollwheel = scrollWheel;
  }-*/;

  /**
   * get If false, disables scrollwheel zooming on the map. The scrollwheel is enabled by default.
   */
  public final native boolean getScrollWheel() /*-{
    return this.scrollwheel;
  }-*/;

  /**
   * set A StreetViewPanorama to display when the Street View Pegman is dropped on the map. If no panorama is specified,
   * a default StreetViewPanorama will be displayed in the map's div when the pegman is dropped.
   * 
   * @param streetViewControl
   */
  public final native void setStreetViewControl(boolean streetViewControl) /*-{
    this.streetViewControl = streetViewControl;
  }-*/;

  /**
   * get set A StreetViewPanorama to display when the Street View pegman is dropped on the map. If no panorama is
   * specified, a default StreetViewPanorama will be displayed in the map's div when the pegman is dropped.
   */
  public final native boolean getStreetViewControl() /*-{
    return this.streetViewControl;
  }-*/;

  /**
   * The initial enabled/disabled state of the Street View Pegman control. This control is part of the default UI, and
   * should be set to false when displaying a map type on which the Street View road overlay should not appear (e.g. a
   * non-Earth map type).
   * 
   * @param streetViewControlOptions {@link StreetViewControlOptions}
   */
  public final native void setStreetViewControlOptions(StreetViewControlOptions streetViewControlOptions) /*-{
    this.streetViewControlOptions = streetViewControlOptions;
  }-*/;

  /**
   * get The initial enabled/disabled state of the Street View Pegman control. This control is part of the default UI,
   * and should be set to false when displaying a map type on which the Street View road overlay should not appear (e.g.
   * a non-Earth map type).
   * 
   * @return {@link StreetViewControlOptions}
   */
  public final native StreetViewControlOptions getStreetViewControlOptions() /*-{
    return this.streetViewControlOptions;
  }-*/;

  public final void setMapTypeStyles(MapTypeStyle[] styles) {
    JsArray<MapTypeStyle> arr = ArrayHelper.toJsArray(styles);
    setMapTypeStyles(arr);
  }

  /**
   * set Styles to apply to each of the default map types. Note that styles will apply only to the labels and geometry
   * in Satellite/Hybrid and Terrain modes.
   */
  private final native void setMapTypeStyles(JsArray<MapTypeStyle> styles) /*-{
    this.styles = styles;
  }-*/;

  /**
   * get set Styles to apply to each of the default map types. Note that styles will apply only to the labels and
   * geometry in Satellite/Hybrid and Terrain modes.
   */
  public final MapTypeStyle[] getMapTypeStyles() {
    JsArray<MapTypeStyle> arr = getMapTypeStylesJs();
    MapTypeStyle[] r = new MapTypeStyle[arr.length()];
    for (int i = 0; i < arr.length(); i++) {
      r[i] = arr.get(i);
    }
    return r;
  }

  /**
   * get set Styles to apply to each of the default map types. Note that styles will apply only to the labels and
   * geometry in Satellite/Hybrid and Terrain modes.
   */
  private final native JsArray<MapTypeStyle> getMapTypeStylesJs() /*-{
    return this.styles;
  }-*/;

  /**
   * sets The angle of incidence of the map as measured in degrees from the viewport plane to the map plane. The only
   * currently supported values are 0, indicating no angle of incidence (no tilt), and 45, indicating a tilt of 45&deg;.
   * 45&deg; imagery is only available for SATELLITE and HYBRID map types, within some locations, and at some zoom
   * levels.
   */
  public final native void setTilt(int tilt) /*-{
    this.tilt = tilt;
  }-*/;

  /**
   * gets The angle of incidence of the map as measured in degrees from the viewport plane to the map plane. The only
   * currently supported values are 0, indicating no angle of incidence (no tilt), and 45, indicating a tilt of 45&deg;.
   * 45&deg; imagery is only available for SATELLITE and HYBRID map types, within some locations, and at some zoom
   * levels.
   */
  public final native int getTilt() /*-{
    return this.tilt;
  }-*/;

  /**
   * The initial Map zoom level. Required.
   * 
   * @param zoom
   */
  public final native void setZoom(int zoom) /*-{
    this.zoom = zoom;
  }-*/;

  /**
   * get Map zoom level
   * 
   * @return int
   */
  public final native int getZoom() /*-{
    return this.zoom;
  }-*/;

  /**
   * sets The enabled/disabled state of the Zoom control.
   * 
   * @param zoomControl
   */
  public final native void setZoomControl(boolean zoomControl) /*-{
    this.zoomControl = zoomControl;
  }-*/;

  /**
   * gets The enabled/disabled state of the Zoom control.
   */
  public final native boolean getZoomControl() /*-{
    return this.zoomControl;
  }-*/;

  /**
   * Sets Map Maker usage.
   * 
   * @param mapMaker True if Map Maker tiles should be used instead of regular tiles.
   */
  public final native void setMapMaker(boolean mapMaker) /*-{
    this.mapMaker = mapMaker;
  }-*/;

  /**
   * Gets Map Maker usage.
   * 
   * @return True if Map Maker tiles are used instead of regular tiles.
   */
  public final native boolean getMapMaker() /*-{
    return this.mapMaker;
  }-*/;

  /**
   * sets The display options for the Zoom control.
   * 
   * @param zoomControlOptions
   */
  public final native void setZoomControlOptions(ZoomControlOptions zoomControlOptions) /*-{
    this.zoomControlOptions = zoomControlOptions;
  }-*/;

  /**
   * gets The display options for the Zoom control.
   */
  public final native ZoomControlOptions getZoomControlOptions() /*-{
    return this.zoomControlOptions;
  }-*/;

}
