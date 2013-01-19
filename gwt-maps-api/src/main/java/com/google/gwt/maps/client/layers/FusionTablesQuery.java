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

/**
 * Specifies the data to retrieve from a Fusion Tables. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#FusionTablesQuery"
 * >FusionTablesQuery API Doc</a>
 */
public class FusionTablesQuery extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTablesQuery() {
  }

  /**
   * Specifies the data to retrieve from a Fusion Tables.
   * 
   * @return {@link FusionTablesQuery}
   */
  public static final FusionTablesQuery newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * setsThe ID of the Fusion Tables table to display. This ID can be found in the tables URL, as the value of the
   * dsrcid parameter.
   * 
   * @param from
   */
  public final native void setFrom(String from) /*-{
    this.from = from;
  }-*/;

  /**
   * gets The ID of the Fusion Tables table to display. This ID can be found in the tables URL, as the value of the
   * dsrcid parameter.
   */
  public final native String getFrom() /*-{
    return this.from;
  }-*/;

  /**
   * Limit on the number of results returned by the query.
   * 
   * @param limit
   */
  public final native void setLimit(int limit) /*-{
    this.limit = limit;
  }-*/;

  /**
   * Get the limit on the number of results returned by the query.
   */
  public final native int getLimit() /*-{
    return this.limit;
  }-*/;

  /**
   * Offset into the sorted results.
   * 
   * @param offset
   */
  public final native void setOffset(int offset) /*-{
    this.offset = offset;
  }-*/;

  /**
   * Get the offset into the sorted results.
   */
  public final native int getOffset() /*-{
    return this.offset;
  }-*/;

  /**
   * The method by which to sort the results. Accepts either of:<br>
   * <ul>
   * <li>A column name. The column name may be suffixed with ASC or DESC (e.g. col2 DESC) to specify ascending or
   * descending sort.</li>
   * <li>An ST_DISTANCE spatial relationship (sort by distance). A column and the coordinate from which to calculate
   * distance must be passed, for example, orderBy: 'ST_DISTANCE(col1, LATLNG(1.2, 3.4))'.</li>
   * </ul>
   * 
   * @param orderBy
   */
  public final native void setOrderBy(String orderBy) /*-{
    this.orderBy = orderBy;
  }-*/;

  /**
   * Get the offset into the sorted results.
   */
  public final native String getOrderBy() /*-{
    return this.orderBy;
  }-*/;

  /**
   * sets A column, containing geographic features to be displayed on the map. See Fusion Table Setup in the Maps API
   * documentation for information about valid columns.
   * 
   * @param select
   */
  public final native void setSelect(String select) /*-{
    this.select = select;
  }-*/;

  /**
   * gets A column, containing geographic features to be displayed on the map. See Fusion Table Setup in the Maps API
   * documentation for information about valid columns.
   */
  public final native String getSelect() /*-{
    return this.select;
  }-*/;

  /**
   * sets The SQL predicate to be applied to the layer.
   * 
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
