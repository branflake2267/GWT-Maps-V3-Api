package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * Describes a single cell from a Fusion Tables table. 
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#FusionTablesCell">FusionTablesCell API Doc</a>
 */
public class FusionTablesCell extends MVCObject<FusionTablesCell> {
  
  /**
   * created from event
   * use newInstance();
   */
  protected FusionTablesCell() {}
  
  /**
   * Describes a single cell from a Fusion Tables table.
   */
  public final static FusionTablesCell newInstance() {
    return JavaScriptObject.createObject().cast();
  } 
  
  /**
   * The name of the column in which the cell was located.
   * @param columnName
   */
  public final native void setColumnName(String columnName) /*-{
    this.columnName = columnName;
  }-*/;
  
  /**
   * The name of the column in which the cell was located.
   */
  public final native String getColumnName() /*-{
    return this.columnName;
  }-*/;
  
  /**
   * The contents of the cell.
   * @param value
   */
  public final native void setValue(String value) /*-{
    this.value = value;
  }-*/;
  
  /**
   * The contents of the cell.
   */
  public final native String getValue() /*-{
    return this.value;
  }-*/;

}
