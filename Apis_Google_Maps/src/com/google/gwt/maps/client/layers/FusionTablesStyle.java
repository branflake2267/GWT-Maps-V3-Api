package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Controls the appearance of a set of features within a FusionTablesLayer. Features which match the provided SQL predicate will be styled with the supplied options.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#FusionTablesStyle">FusionTablesStyle API Doc</a>
 */
public class FusionTablesStyle extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTablesStyle() {}
  
  /**
   * creates - Controls the appearance of a set of features within a FusionTablesLayer. Features which match the provided SQL predicate will be styled with the supplied options.
   */
  public final static FusionTablesStyle newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * sets Options which control the appearance of point features.
   * @param markerOptions
   */
  public final native void setMarkerOptions(FusionTablesMarkerOptions markerOptions) /*-{
    this.markerOptions = markerOptions;
  }-*/;
  
  /**
   * gets Options which control the appearance of point features.
   */
  public final native FusionTablesMarkerOptions getMarkerOptions() /*-{
    return this.markerOptions;
  }-*/;
  
  /**
   * sets Options which control the appearance of polygons.
   * @param polygonOptions
   */
  public final native void setPolygonOptions(FusionTablesPolygonOptions polygonOptions) /*-{
    this.polygonOptions = polygonOptions;
  }-*/;
  
  /**
   * gets Options which control the appearance of polygons.
   */
  public final native FusionTablesPolygonOptions getPolygonOptions() /*-{
    return this.polygonOptions;
  }-*/;
  
  /**
   * sets Options which control the appearance of polylines.
   * @param polylineOptions
   */
  public final native void setPolylineOptions(FusionTablesPolylineOptions polylineOptions) /*-{
    this.polylineOptions = polylineOptions;
  }-*/;
  
  /**
   * gets Options which control the appearance of polylines.
   */
  public final native FusionTablesPolylineOptions getPolylineOptions() /*-{
    return this.polylineOptions;
  }-*/;
  
  /**
   * sets The SQL predicate to be applied to the layer.
   * @param where
   */
  public final native void setWhere(String where) /*-{
    this.where = where;
  }-*/;
  
  /**
   * gets The SQL predicate to be applied to the layer.
   */
  public final native String getWhere() /*-{
    return this.where;
  }-*/;
  
}
