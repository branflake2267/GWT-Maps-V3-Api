package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Specifies the data to retrieve from a Fusion Tables.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#FusionTablesQuery}
 */
public class FusionTablesQuery extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTablesQuery() {}
  
  /**
   * Specifies the data to retrieve from a Fusion Tables.
   * @return {@link FusionTablesQuery}
   */
  public static final FusionTablesQuery newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * setsThe ID of the Fusion Tables table to display. This ID can be found in the tables URL, as the value of the dsrcid parameter.
   * @param from
   */
  public final native void setFrom(String from) /*-{
    this.from = from;
  }-*/;
  
  /**
   * gets The ID of the Fusion Tables table to display. This ID can be found in the tables URL, as the value of the dsrcid parameter.
   * @return
   */
  public final native String getFrom() /*-{
    return this.from;
  }-*/;
  
  /**
   * sets A column, containing geographic features to be displayed on the map. See Fusion Table Setup in the Maps API documentation for information about valid columns.
   * @param select
   */
  public final native void setSelect(String select) /*-{
    this.select = select;
  }-*/;
  
  /**
   * gets A column, containing geographic features to be displayed on the map. See Fusion Table Setup in the Maps API documentation for information about valid columns.
   * @return
   */
  public final native String getSelect() /*-{
    return this.select;
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
   * @return
   */
  public final native String getWhere() /*-{
    return this.where;
  }-*/;
  
}
