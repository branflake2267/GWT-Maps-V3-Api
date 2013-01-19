package com.google.gwt.maps.client.events.kmlmouse;

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
import com.google.gwt.maps.client.layers.KmlFeatureData;

public class KmlMouseMapEvent extends MapEvent<KmlMouseMapHandler, KmlMouseMapEvent> {

  public static Type<KmlMouseMapHandler> TYPE = new Type<KmlMouseMapHandler>();

  public KmlMouseMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<KmlMouseMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(KmlMouseMapHandler handler) {
    handler.onEvent(this);
  }

  /**
   * get A KmlFeatureData object, containing information about the clicked feature.
   */
  public KmlFeatureData getFeatureData() {
    KmlFeatureData featureData = null;
    try {
      featureData = (KmlFeatureData) properties.getObject("featureData");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return featureData;
  }

  /**
   * get The position at which to anchor an infowindow on the clicked feature.
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
   * get The offset to apply to an infowindow anchored on the clicked feature.
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
