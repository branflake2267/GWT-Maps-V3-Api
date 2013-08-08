package com.google.gwt.maps.client.overlays;

/*
 * #%L
 * GWT Maps API V3 - Core API
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


import com.google.gwt.maps.client.MapWidget;

/**
 * Interface for functions common to all "object" (Marker, Polygon etc.) style
 * overlays: getting and setting the parent map and the visibility
 * of the overlay.
 */
public interface Overlay {
  /**
   * Sets the map on which this overlay will be displayed.
   * Setting this value to null will cause the overlay to
   * be removed from the map.
   *
   * @param map The map that will display this overlay.
   */
  void setMap(MapWidget map);

  /**
   * Gets the map on which this overlay is currently displayed.
   *
   * @return The map that is displaying this overlay.
   */
  MapWidget getMap();

  /**
   * Sets the visibility of this overlay.
   *
   * @param visible <code>true</code> if the overlay should be displayed, <code>false</code> if it should not.
   */
  void setVisible(boolean visible);

  /**
   * Gets the visibility of this overlay.
   *
   * @return <code>true</code> if the overlay is being displayed, <code>false</code> if it is not.
   */
  boolean getVisible();
}
