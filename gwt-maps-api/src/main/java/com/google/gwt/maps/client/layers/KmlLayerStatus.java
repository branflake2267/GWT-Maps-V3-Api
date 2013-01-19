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

/**
 * The status returned by {@link KmlLayer} on the completion of loading a document.<br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#KmlLayerStatus" >KmlLayerStatus
 * API Doc</a>
 */
public enum KmlLayerStatus {

  /**
   * The document could not be found. Most likely it is an invalid URL, or the document is not publicly available.
   */
  DOCUMENT_NOT_FOUND,

  /**
   * The document exceeds the file size limits of KmlLayer.
   */
  DOCUMENT_TOO_LARGE,

  /**
   * The document could not be fetched.
   */
  FETCH_ERROR,

  /**
   * The document is not a valid KML, KMZ or GeoRSS document.
   */
  INVALID_DOCUMENT,

  /**
   * The {@link KmlLayer} is invalid.
   */
  INVALID_REQUEST,

  /**
   * The document exceeds the feature limits of KmlLayer.
   */
  LIMITS_EXCEEDED,

  /**
   * The layer loaded successfully.
   */
  OK,

  /**
   * The document could not be loaded within a reasonable amount of time.
   */
  TIMED_OUT,

  /**
   * The document failed to load for an unknown reason.
   */
  UNKNOWN;

  public String value() {
    return name();
  }

  public static KmlLayerStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  @Override
  public String toString() {
    return name();
  }
  
}
