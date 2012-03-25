package com.google.gwt.maps.client.controls;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.maptypes.MapTypeStyleElementType;
import com.google.gwt.maps.client.maptypes.MapTypeStyleFeatureType;
import com.google.gwt.maps.client.maptypes.MapTypeStyler;

/**
 * The MapTypeStyle is a collection of selectors and stylers that define how the map should be styled. Selectors specify what map elements should be affected and stylers specify how those elements should be modified.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#MapTypeStyle}
 */
public class MapTypeStyle extends JavaScriptObject {

  /**
   * The MapTypeStyle is a collection of selectors and stylers that define how the map should be styled. Selectors specify what map elements should be affected and stylers specify how those elements should be modified.
   * use newInstance();
   */
  protected MapTypeStyle() {}

  /**
   * The MapTypeStyle is a collection of selectors and stylers that define how the map should be styled. Selectors specify what map elements should be affected and stylers specify how those elements should be modified.
   * @return {@link MapTypeStyle}
   */
  public final static MapTypeStyle newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * set Selects the element type to which a styler should be applied. An element type distinguishes between the different representations of a feature. Optional; if elementType is not specified, the value is assumed to be 'all'.
   * @param mapTypeStyleElementType {@link MapTypeStyleElementType}
   */
  public final void setElementType(MapTypeStyleElementType mapTypeStyleElementType) {
    String type = mapTypeStyleElementType.value();
    setElementType(type);
  }
  
  private final native void setElementType(String elementType) /*-{
    this.elementType = elementType;
  }-*/;
  
  /**
   * get set Selects the element type to which a styler should be applied. An element type distinguishes between the different representations of a feature. Optional; if elementType is not specified, the value is assumed to be 'all'.
   * @return {@link MapTypeStyleElementType}
   */
  public final MapTypeStyleElementType getElementType() {
    return MapTypeStyleElementType.fromValue(getElementTypeJs());
  }
  
  private final native String getElementTypeJs() /*-{
    return this.elementType;
  }-*/;
  
  /**
   * set Selects the feature, or group of features, to which a styler should be applied. Optional; if featureType is not specified, the value is assumed to be 'all'.
   * @param mapTypeStyleFeatureType {@link MapTypeStyleFeatureType}
   */
  public final void setFeatureType(MapTypeStyleFeatureType mapTypeStyleFeatureType) {
    setFeatureType(mapTypeStyleFeatureType.value());
  }
  
  private final native void setFeatureType(String featureType) /*-{
    this.featureType = featureType;
  }-*/;
  
  /**
   * get Selects the feature, or group of features, to which a styler should be applied. Optional; if featureType is not specified, the value is assumed to be 'all'.
   * @return
   */
  public final MapTypeStyleFeatureType getFeatureType() {
    return MapTypeStyleFeatureType.fromValue(getFeatureTypeJs());
  }
  
  private final native String getFeatureTypeJs() /*-{
    return this.featureType;
  }-*/;
  
  public final void setStylers(MapTypeStyler[] stylers) {
    JsArray<MapTypeStyler> arr = ArrayHelper.toJsArray(stylers);
    setStylersJs(arr);
  }
  
  private final native void setStylersJs(JsArray<MapTypeStyler> stylers) /*-{
    this.stylers = stylers;
  }-*/;
  
  
  public final MapTypeStyler[] getStylers() {
    JsArray<MapTypeStyler> arr = getStylersJs();
    if (arr == null || arr.length() == 0) {
      return null;
    }
    MapTypeStyler[] r = new MapTypeStyler[arr.length()];
    for (int i=0; i < arr.length(); i++) {
      r[i] = arr.get(i);
    }
    return r;
  }
  
  private final native JsArray<MapTypeStyler> getStylersJs() /*-{
    return this.stylers;
  }-*/;
}
