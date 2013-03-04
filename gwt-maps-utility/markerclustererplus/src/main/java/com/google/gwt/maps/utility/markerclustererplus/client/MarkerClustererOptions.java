package com.google.gwt.maps.utility.markerclustererplus.client;

/*
 * #%L
 * GWT Maps API V3 - Utility API - MarkerClustererPlus
 * %%
 * Copyright (C) 2011 - 2013 GWT Maps API V3
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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;

import java.util.Collection;
import java.util.Collections;

public class MarkerClustererOptions extends JavaScriptObject {

  protected MarkerClustererOptions() {
  }

  public static MarkerClustererOptions newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    return jso.cast();
  }

  private native void set(final String field, final JavaScriptObject value) /*-{
      this[field] = value;
  }-*/;

  public final native void setAverageCenter(boolean averageCenter) /*-{
      this.averageCenter = averageCenter;
  }-*/;

  public final native boolean getAverageCenter() /*-{
      return this.averageCenter;
  }-*/;

  public final void setCalculator(ClusterCalculator calculator) {
    this.set("calculator", getCalculatorFunction(calculator));
  }

  private native JavaScriptObject getCalculatorFunction(final ClusterCalculator calculator) /*-{
      var fn = function (markers, nStyles) {
          var info = calculator.@com.google.gwt.maps.utility.markerclustererplus.client.ClusterCalculator::execute(Lcom/google/gwt/core/client/JsArray;I)(markers, nStyles);
          return info;
      };
      return fn;
  }-*/;

  public final native void setGridSize(int size) /*-{
      this.gridSize = size;
  }-*/;

  public final native int getGridSize(int size) /*-{
      return this.gridSize;
  }-*/;

  public final native void setImageExtension(String extension) /*-{
      this.imageExtension = extension;
  }-*/;

  public final native String getImageExtension() /*-{
      return this.imageExtension;
  }-*/;

  public final native void setImagePath(String path) /*-{
      this.imagePath = path;
  }-*/;

  public final native String getImagePath() /*-{
      return this.imagePath;
  }-*/;

  public final void setImageSizes(int... sizes) {
    JsArrayInteger array = JsUtil.toIntegerArray(sizes);
    setImageSizes(array);
  }

  public final void setImageSizes(Collection<Integer> sizes) {
    JsArrayInteger array = JsUtil.toIntegerArray(sizes);
    setImageSizes(array);
  }

  public final native void setImageSizes(JsArrayInteger sizes) /*-{
      this.imageSizes = sizes;
  }-*/;

  public final void setStyle(ClusterIconStyle style) {
    setStyles(Collections.singleton(style));
  }

  public final void setStyles(Collection<ClusterIconStyle> styles) {
    setStyles(JsUtil.toArray(styles));
  }

  public final native void setStyles(JsArray<ClusterIconStyle> styles) /*-{
      this.styles = styles;
  }-*/;

  public final native void setMinimumClusterSize(final int size) /*-{
      this.minimumClusterSize = size;
  }-*/;

  public final native int getMinimumClusterSize() /*-{
      return this.minimumClusterSize;
  }-*/;

  public final native void setMaxZoom(final int zoom) /*-{
      this.maxZoom = zoom;
  }-*/;

  public final native int getMaxZoom() /*-{
      return this.maxZoom;
  }-*/;

  public final native void setIgnoreHidden(final boolean ignoreHidden) /*-{
      this.ignoreHidden = ignoreHidden;
  }-*/;

  public final native boolean getIgnoreHidden() /*-{
      return this.ignoreHidden;
  }-*/;

  public final native void setZoomOnClick(final boolean zoomOnClick) /*-{
      this.zoomOnClick = zoomOnClick;
  }-*/;

  public final native boolean getZoomOnClick() /*-{
      return this.zoomOnClick;
  }-*/;

  public final native void setPrintable(final boolean printable) /*-{
      this.printable = printable;
  }-*/;

  public final native boolean getPrintable() /*-{
      return this.printable;
  }-*/;

}
