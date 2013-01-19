package com.google.gwt.maps.client.events;

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

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.base.LatLng;

/**
 * This object is returned from various mouse events on the map and overlays, and contains all the fields shown below. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#MouseEvent" >MouseEvent API
 * Doc</a>
 */
public class MouseEvent {

  /**
   * {@link LatLng}
   */
  private LatLng latLng;

  /**
   * Create a new MouseEvent from properties of the map event call back
   * 
   * @param properties {@link com.google.gwt.ajaxloader.client.Properties}
   */
  public MouseEvent(Properties properties) {
    parseProperties(properties);
  }

  /**
   * Parse the properties for {@link LatLng}
   * 
   * @param properties
   */
  private void parseProperties(Properties properties) {
    try {
      latLng = (LatLng) properties.getObject("latLng");
    } catch (TypeException e) {
      e.printStackTrace();
    }
  }

  /**
   * The latitude/longitude that was below the cursor when the event occurred.
   * 
   * @return point of mouse event
   */
  public final LatLng getLatLng() {
    return latLng;
  }

  /**
   * Prevents this event from propagating further.
   */
  public final native void stop() /*-{
    this.stop();
  }-*/;

}
