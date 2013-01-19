package com.google.gwt.maps.client.controls;

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
 * Options for the rendering of the Overview Map control <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#OverviewMapControlOptions">See
 * OverviewMapControlOptions API</a>
 */
public class OverviewMapControlOptions extends JavaScriptObject {

  /**
   * Options for the rendering of the Overview Map control. use newInstance();
   */
  protected OverviewMapControlOptions() {
  }

  /**
   * creates a new instance for, Options for the rendering of the Overview Map control.
   */
  public final static OverviewMapControlOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * sets Whether the control should display in opened mode or collapsed (minimized) mode. By default, the control is
   * closed.
   * 
   * @param opened
   */
  public final native void setOpened(boolean opened) /*-{
    this.opened = opened;
  }-*/;

  /**
   * gets Whether the control should display in opened mode or collapsed (minimized) mode. By default, the control is
   * closed.
   */
  public final native boolean getOpened() /*-{
    return this.opened;
  }-*/;

}
