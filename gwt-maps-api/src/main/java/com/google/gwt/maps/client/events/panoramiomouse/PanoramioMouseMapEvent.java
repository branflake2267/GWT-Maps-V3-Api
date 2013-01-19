package com.google.gwt.maps.client.events.panoramiomouse;

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
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.panoramiolib.PanoramioFeature;

public class PanoramioMouseMapEvent extends MapEvent<PanoramioMouseMapHandler, PanoramioMouseMapEvent> {

  public static Type<PanoramioMouseMapHandler> TYPE = new Type<PanoramioMouseMapHandler>();

  public PanoramioMouseMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<PanoramioMouseMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(PanoramioMouseMapHandler handler) {
    handler.onEvent(this);
  }

  /**
   * A PanoramioFeature object containing information about the clicked feature.
   * 
   * @return {@link PanoramioFeature}
   */
  public PanoramioFeature getFeatureDetails() {
    PanoramioFeature feature = null;
    try {
      feature = (PanoramioFeature) properties.getObject("featureDetails");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return feature;
  }

  /**
   * Pre-rendered HTML content, as placed in the infowindow by the default UI.
   */
  public String getInfoWindowHtml() {
    String infoWindowHtml = null;
    try {
      infoWindowHtml = properties.getString("infoWindowHtml");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return infoWindowHtml;
  }

  /**
   * The position at which to anchor an infowindow on the clicked feature.
   * 
   * @return {@link LatLng}
   */
  public LatLng getLatLng() {
    LatLng latLng = null;
    try {
      latLng = (LatLng) properties.getObject("latLng");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return latLng;
  }

  /**
   * gets The offset to apply to an infowindow anchored on the clicked feature.
   */
  public Size getPixelOffset() {
    Size pixelOffset = null;
    try {
      pixelOffset = (Size) properties.getObject("pixelOffset");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return pixelOffset;
  }

}
