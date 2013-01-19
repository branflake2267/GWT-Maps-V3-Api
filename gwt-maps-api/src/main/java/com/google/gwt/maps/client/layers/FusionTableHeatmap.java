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
 * Specifies the appearance for a FusionTablesLayer when rendered as a heatmap. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#FusionTablesHeatmap">
 * FusionTablesHeatmap API Doc</a>
 */
public class FusionTableHeatmap extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTableHeatmap() {
  }

  /**
   * Specifies the appearance for a FusionTablesLayer when rendered as a heatmap.
   */
  public static final FusionTableHeatmap newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * sets If true, render the layer as a heatmap.
   * 
   * @param enabled
   */
  public final native void setEnabled(boolean enabled) /*-{
    this.enabled = enabled;
  }-*/;

  /**
   * gets If true, render the layer as a heatmap.
   */
  public final native boolean getEnabled() /*-{
    return this.enabled;
  }-*/;

}
