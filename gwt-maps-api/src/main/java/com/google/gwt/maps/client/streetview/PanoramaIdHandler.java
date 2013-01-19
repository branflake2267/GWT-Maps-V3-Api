package com.google.gwt.maps.client.streetview;

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
 * Handler for the getPanoramaById callback <br>
 * <br>
 * See <a
 * href="https://developers.google.com/maps/documentation/javascript/reference#StreetViewService">StreetViewService API
 * Doc</a>
 */
public interface PanoramaIdHandler {

  /**
   * Retrieves the data for the given pano id and passes it to the provided callback as a StreetViewPanoramaData object.
   * Pano ids are unique per panorama and stable for the lifetime of a session, but are liable to change between
   * sessions.
   * 
   * @param data
   * @param status
   */
  public void onCallback(StreetViewPanoramaData data, StreetViewStatus status);

}
