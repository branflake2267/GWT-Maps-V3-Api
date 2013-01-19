package com.google.gwt.maps.client.drawinglib;

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

/**
 * The types of overlay that may be created by the DrawingManager. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#OverlayType">OverlayType API
 * Doc</a>
 */
public enum OverlayType {

  /**
   * Specifies that the DrawingManager creates circles, and that the overlay given in the overlaycomplete event is a
   * circle.
   */
  CIRCLE,

  /**
   * Specifies that the DrawingManager creates markers, and that the overlay given in the overlaycomplete event is a
   * marker.
   */
  MARKER,

  /**
   * Specifies that the DrawingManager creates polygons, and that the overlay given in the overlaycomplete event is a
   * polygon.
   */
  POLYGON,

  /**
   * Specifies that the DrawingManager creates polylines, and that the overlay given in the overlaycomplete event is a
   * polyline.
   */
  POLYLINE,

  /**
   * Specifies that the DrawingManager creates rectangles, and that the overlay given in the overlaycomplete event is a
   * rectangle.
   */
  RECTANGLE;

  public String value() {
    return name().toLowerCase();
  }

  public static OverlayType fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }

}
