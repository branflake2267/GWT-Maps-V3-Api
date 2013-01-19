package com.google.gwt.maps.client.geometrylib;

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

import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.overlays.Polygon;
import com.google.gwt.maps.client.overlays.Polyline;

/**
 * Utility functions for computations involving polygons and polylines.<br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#poly" >Poly Utils API Doc</a>
 */
public class PolyUtils {

  /**
   * Computes whether the given point lies inside the specified polygon.
   * 
   * @param point
   * @param polygon
   * @return whether the polygon contains the point
   */
  public final static native boolean containsLocation(LatLng point, Polygon polygon) /*-{
    return $wnd.google.maps.geometry.poly.containsLocation(point, polygon);
  }-*/;

  /**
   * Computes whether the given point lies on or near to a polyline, or the edge of a polygon, within a specified
   * tolerance.
   * 
   * @param point test point
   * @param polygon within this polygon
   * @return whether location is on edge
   */
  public final static native boolean isLocationOnEdge(LatLng point, Polygon polygon) /*-{
    return $wnd.google.maps.geometry.poly.isLocationOnEdge(point, polygon);
  }-*/;

  /**
   * Computes whether the given point lies on or near to a polyline, or the edge of a polygon, within a specified
   * tolerance.
   * 
   * @param point test point
   * @param polyline along this polyline
   * @return whether location is on edge
   */
  public final static native boolean isLocationOnEdge(LatLng point, Polyline polyline) /*-{
    return $wnd.google.maps.geometry.poly.isLocationOnEdge(point, polyline);
  }-*/;

  /**
   * Computes whether the given point lies on or near to a polyline, or the edge of a polygon, within a specified
   * tolerance.
   * 
   * @param point test point
   * @param polygon within tolerance of this polygon
   * @param tolerance degrees from edge
   * @return whether point is on edge
   */
  public final static native boolean isLocationOnEdge(LatLng point, Polygon polygon, double tolerance) /*-{
    return $wnd.google.maps.geometry.poly.isLocationOnEdge(point, polygon,
        tolerance);
  }-*/;

  /**
   * Computes whether the given point lies on or near to a polyline, or the edge of a polygon, within a specified
   * tolerance.
   * 
   * @param point test point
   * @param polyline within tolerance of this line
   * @param tolerance degrees from edge
   * @return whether point is on edge
   */
  public final static native boolean isLocationOnEdge(LatLng point, Polyline polyline, double tolerance) /*-{
    return $wnd.google.maps.geometry.poly.isLocationOnEdge(point, polyline,
        tolerance);
  }-*/;

}
