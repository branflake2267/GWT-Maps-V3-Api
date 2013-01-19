package com.google.gwt.maps.client.layers;

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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * Describes a single cell from a Fusion Tables table. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#FusionTablesCell">FusionTablesCell
 * API Doc</a>
 */
public class FusionTablesCell extends MVCObject<FusionTablesCell> {

  /**
   * created from event use newInstance();
   */
  protected FusionTablesCell() {
  }

  /**
   * Describes a single cell from a Fusion Tables table.
   */
  public final static FusionTablesCell newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The name of the column in which the cell was located.
   * 
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
   * 
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
