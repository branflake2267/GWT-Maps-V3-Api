package com.google.gwt.maps.client.services;

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
 * The element-level status about a particular origin-destination pairing returned by the DistanceMatrixService upon
 * completion of a distance matrix request. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DistanceMatrixElementStatus">
 * DistanceMatrixElementStatus API Doc</a>
 */
public enum DistanceMatrixElementStatus {

  /**
   * The origin and/or destination of this pairing could not be geocoded.
   */
  NOT_FOUND,

  /**
   * The response contains a valid result.
   */
  OK,

  /**
   * No route could be found between the origin and destination.
   */
  ZERO_RESULTS;

  public String value() {
    return name().toLowerCase();
  }

  public static DistanceMatrixElementStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
  
}
