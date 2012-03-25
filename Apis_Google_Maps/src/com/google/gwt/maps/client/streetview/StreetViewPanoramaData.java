package com.google.gwt.maps.client.streetview;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/** 
 * The representation of a panorama returned from the provider defined using registerPanoProvider.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#StreetViewPanoramaOptions}
 */
public class StreetViewPanoramaData extends JavaScriptObject {
  
  /**
   * The representation of a panorama returned from the provider defined using registerPanoProvider.
   * use newInstance();
   */
  protected StreetViewPanoramaData() {}
  
  /**
   * The representation of a panorama returned from the provider defined using registerPanoProvider.
   * @return {@link StreetViewPanoramaData}
   */
  public final static StreetViewPanoramaData newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets Specifies the copyright text for this panorama.
   * @param copyright
   */
  public final native void setCopyright(String copyright) /*-{
    this.copyright = copyright;
  }-*/;
  
  /**
   * gets Specifies the copyright text for this panorama.
   * @return
   */
  public final native String getCopyright() /*-{
    return this.copyright;
  }-*/;
  
  /**
   * sets Specifies the navigational links to adjacent panoramas.
   * @param links {@link StreetViewLink}
   */
  public final native void setLinks(JsArray<StreetViewLink> links) /*-{
    this.links = links;
  }-*/;
  
  /**
   * gets Specifies the navigational links to adjacent panoramas.
   * @return {@link StreetViewLink}
   */
  public final native JsArray<StreetViewLink> getLinks() /*-{
    return this.links;
  }-*/;
  
  /**
   * sets Specifies the location meta-data for this panorama.
   * @param location {@link StreetViewLocation}
   */
  public final native void setLocation(StreetViewLocation location) /*-{
    this.location = location;
  }-*/;
  
  /**
   * gets Specifies the location meta-data for this panorama.
   * @return {@link StreetViewLocation}
   */
  public final native StreetViewLocation getLocation() /*-{
    return this.location;
  }-*/;
  
  /**
   * sets Specifies the custom tiles for this panorama.
   * @param tiles {@link StreetViewTileData}
   */
  public final native void setTileData(StreetViewTileData tiles) /*-{
    this.tiles = tiles;
  }-*/;
  
  /**
   * gets Specifies the custom tiles for this panorama.
   * @return {@link StreetViewTileData}
   */
  public final native StreetViewTileData getTileData() /*-{
    return this.tiles;
  }-*/;
  
  
}

