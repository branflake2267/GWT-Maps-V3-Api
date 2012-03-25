package com.google.gwt.maps.client.controls;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.MapTypeId;

/**
 * Options for the rendering of the map type control.
 * http://code.google.com/apis/maps/documentation/javascript/reference.html#MapTypeControlOptions
 */
public class MapTypeControlOptions extends JavaScriptObject {

  /**
   * new Instance of Options for the rendering of the map type control.
   * @return
   */
  public static MapTypeControlOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * Options for the rendering of the map type control.
   * use newInstance();
   */
  protected MapTypeControlOptions() {}

  /**
   * get IDs as {@link MapTypeId} object array
   * @return MapTypeId[]
   */
  public final MapTypeId[] getMapTypeIds() {
    JsArrayString jsarr = getMapTypeIdsJs();
    if (jsarr.length() == 0) {
      return null;
    }
    MapTypeId[] r = new MapTypeId[jsarr.length()];
    for (int i=0; i < jsarr.length(); i++) {
      String type = jsarr.get(i);
      r[i] = MapTypeId.fromValue(type);
    }
    return r;
  }

  /**
   * get MapTypeIds native
   * @return JsArrayString
   */
  private final native JsArrayString getMapTypeIdsJs() /*-{
    return this.mapTypeIds;
  }-*/;

  /**
   * Position id. Used to specify the position of the control on the map. The default position is TOP_LEFT.
   * @return
   */
  public final ControlPosition getPosition() {
    return ControlPosition.fromValue(getPositionImpl());
  }

  private final native int getPositionImpl() /*-{
    return this.position;
  }-*/;

  /**
   * set native IDs 
   * @param types - String array for $wnd.google.maps.MapTypeId[type]
   */
  private final native void setMapTypeIds(JsArrayString types) /*-{
    this.mapTypeIds = new $wnd.Array();
    for (var i=0; i < types.length; i++) {
      this.mapTypeIds[i] = $wnd.google.maps.MapTypeId[types[i]];
    }
  }-*/;
  
  /**
   * set IDs of map types to show in the control.
   * @param mapTypeId
   */
  public final void setMapTypeIds(MapTypeId[] mapTypeIds) {
    JsArrayString result = JsArrayString.createArray().cast();
    for (int i=0; i < mapTypeIds.length; i++) {
      result.set(i, mapTypeIds[i].value());
    }
    ArrayHelper.nativePatchConstructorForSafari(result);
    setMapTypeIds(result);
  }
  
  /**
   * Position id. Used to specify the position of the control on the map. The default position is TOP_LEFT.
   * @param controlPosition {@link ControlPosition}
   */
  public final void setPosition(ControlPosition position) {
    setPositionImpl(position.value());
  }

  private final native void setPositionImpl(int position) /*-{
    this.position = position;
  }-*/;
  
}
