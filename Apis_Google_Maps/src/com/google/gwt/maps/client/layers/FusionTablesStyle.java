package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Controls the appearance of a set of features within a FusionTablesLayer. Features which match the provided SQL predicate will be styled with the supplied options.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#FusionTablesStyle}
 */
public class FusionTablesStyle extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTablesStyle() {}
  
  /**
   * creates - Controls the appearance of a set of features within a FusionTablesLayer. Features which match the provided SQL predicate will be styled with the supplied options.
   * @return
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
   * @return
   */
  public final native FusionTablesMarkerOptions getMarkerOptions() /*-{
    return this.markerOptions;l
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
   * @return
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
   * @return
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
