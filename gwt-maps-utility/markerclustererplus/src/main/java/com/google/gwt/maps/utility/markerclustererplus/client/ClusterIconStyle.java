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
import com.google.gwt.core.client.JsArrayInteger;

public class ClusterIconStyle extends JavaScriptObject {

  protected ClusterIconStyle() {
  }

  public static ClusterIconStyle newInstance() {
    return createObject().cast();
  }

  public final void setAnchor(int yOffset, int xOffset) {
    setAnchor(JsUtil.toIntegerArray(yOffset, xOffset));
  }

  public final native void setAnchor(JsArrayInteger value) /*-{
      this.anchor = value;
  }-*/;

  public final void setAnchorIcon(int yOffset, int xOffset) {
    setAnchorIcon(JsUtil.toIntegerArray(yOffset, xOffset));
  }

  public final native void setAnchorIcon(JsArrayInteger value) /*-{
      this.anchorIcon = value;
  }-*/;

  public final native void setBackgroundPosition(String value) /*-{
      this.backgroundPosition = value;
  }-*/;

  public final native void setFontFamily(String value) /*-{
      this.fontFamily = value;
  }-*/;

  public final native void setFontStyle(String value) /*-{
      this.fontStyle = value;
  }-*/;

  public final native void setFontWeight(String value) /*-{
      this.fontWeight = value;
  }-*/;

  public final native void setHeight(int value) /*-{
      this.height = value;
  }-*/;

  public final native void setTextColor(String value) /*-{
      this.textColor = value;
  }-*/;

  public final native void setTextDecoration(String value) /*-{
      this.textDecoration = value;
  }-*/;

  public final native void setTextSize(int value) /*-{
      this.textSize = value;
  }-*/;

  public final native void setUrl(String value) /*-{
      this.url = value;
  }-*/;

  public final native void setWidth(int value) /*-{
      this.width = value;
  }-*/;
}
