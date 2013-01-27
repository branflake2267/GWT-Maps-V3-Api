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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.controls.PanControlOptions;
import com.google.gwt.maps.client.controls.ZoomControlOptions;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * Options defining the properties of a StreetViewPanorama object. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#StreetViewPanoramaOptions"
 * >StreetViewPanoramaOptions API Doc</a>
 */
public class StreetViewPanoramaOptions extends JavaScriptObject {

  /**
   * Options defining the properties of a StreetViewPanorama object. use newInstance();
   */
  protected StreetViewPanoramaOptions() {
  }

  /**
   * creates Options defining the properties of a StreetViewPanorama object.
   * 
   * @return {@link StreetViewPanoramaOptions}
   */
  public final static StreetViewPanoramaOptions newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    StreetViewPanoramaOptions obj = jso.cast();
    obj.setDefaults(obj);
    return obj;
  }

  /**
   * Set defaults to those expected from documentation
   * 
   * @param obj
   */
  private void setDefaults(StreetViewPanoramaOptions obj) {
    obj.setScrollWheel(true);
    obj.setDisableDoubleClickZoom(false);
    obj.setEnableCloseButton(false);
  }

  /**
   * sets The enabled/disabled state of the address control.
   * 
   * @param addressControl
   */
  public final native void setAddressControl(boolean addressControl) /*-{
    this.addressControl = addressControl
  }-*/;

  /**
   * gets The enabled/disabled state of the address control.
   */
  public final native boolean getAddressControl() /*-{
    return this.addressControl;
  }-*/;

  /**
   * Set the enabled/disabled state of the imagery acquisition date control.
   * 
   * @param imageDateControl
   */
  public final native void setImageDateControl(boolean imageDateControl) /*-{
    this.imageDateControl = imageDateControl
  }-*/;

  /**
   * Get the enabled/disabled state of the imagery acquisition date control.
   */
  public final native boolean getImageDateControl() /*-{
    return this.imageDateControl;
  }-*/;

  /**
   * sets The display options for the address control.
   * 
   * @param addressControlOptions {@link StreetViewAddressControlOptions}
   */
  public final native void setAddressControlOptions(StreetViewAddressControlOptions addressControlOptions) /*-{
    this.addressControlOptions = addressControlOptions;
  }-*/;

  /**
   * gets The display options for the address control.
   * 
   * @return {@link StreetViewAddressControlOptions}
   */
  public final native StreetViewAddressControlOptions getAddressControlOptions() /*-{
    return this.addressControlOptions;
  }-*/;

  /**
   * sets Enables/disables zoom on double click. Enabled by default.
   * 
   * @param disableDoubleClickZoom
   */
  public final native void setDisableDoubleClickZoom(boolean disableDoubleClickZoom) /*-{
    this.disableDoubleClickZoom = disableDoubleClickZoom;
  }-*/;

  /**
   * gets Enables/disables zoom on double click. Enabled by default.
   */
  public final native boolean getDisableDoubleClickZoom() /*-{
    return this.disableDoubleClickZoom;
  }-*/;

  /**
   * sets If true, the close button is displayed. Disabled by default.
   * 
   * @param enableCloseButton
   */
  public final native void setEnableCloseButton(boolean enableCloseButton) /*-{
    this.enableCloseButton = enableCloseButton;
  }-*/;

  /**
   * gets If true, the close button is displayed. Disabled by default.
   */
  public final native boolean getEnableCloseButton() /*-{
    return this.enableCloseButton;
  }-*/;

  /**
   * Set the enabled/disabled state of click-to-go.
   * 
   * @param clickToGo
   */
  public final native void setClickToGo(boolean clickToGo) /*-{
    this.clickToGo = clickToGo;
  }-*/;

  /**
   * Get the enabled/disabled state of click-to-go.
   */
  public final native boolean getClickToGo() /*-{
    return this.clickToGo;
  }-*/;

  /**
   * sets The enabled/disabled state of the links control.
   * 
   * @param linksControl
   */
  public final native void setLinksControl(boolean linksControl) /*-{
    this.linksControl = linksControl;
  }-*/;

  /**
   * gets The enabled/disabled state of the links control.
   */
  public final native boolean getLinksControl() /*-{
    return this.linksControl;
  }-*/;

  /**
   * sets The enabled/disabled state of the pan control.
   * 
   * @param panControl
   */
  public final native void setPanControl(boolean panControl) /*-{
    this.panControl = panControl;
  }-*/;

  /**
   * gets The enabled/disabled state of the pan control.
   */
  public final native boolean getPanControl() /*-{
    return this.panControl;
  }-*/;

  /**
   * sets The display options for the pan control.
   * 
   * @param panControlOptions {@link PanControlOptions}
   */
  public final native void setPanControlOptions(PanControlOptions panControlOptions) /*-{
    this.panControlOptions = panControlOptions;
  }-*/;

  /**
   * gets The display options for the pan control.
   * 
   * @return {@link PanControlOptions}
   */
  public final native PanControlOptions getPanControlOptions() /*-{
    return this.panControlOptions;
  }-*/;

  /**
   * sets The panorama ID, which should be set when specifying a custom panorama.
   * 
   * @param pano
   */
  public final native void setPano(String pano) /*-{
    this.pano = pano;
  }-*/;

  /**
   * gets The panorama ID, which should be set when specifying a custom panorama.
   */
  public final native String getPano() /*-{
    return this.pano;
  }-*/;

  /**
   * sets Custom panorama provider, which takes a string pano id and returns an object defining the panorama given that
   * id. This function must be defined to specify custom panorama imagery.
   * 
   * @param provider
   */
  public final native void setPanoProvider(StreetViewPanoramaProvider provider) /*-{
    this.panoProvider = function(pano, zoom, tileX, tileY) {
      var z = zoom ? zoom : -1;
      var x = tileX ? tileX : -1;
      var y = tileY ? tileY : -1;
      return @com.google.gwt.maps.client.streetview.StreetViewPanoramaOptions::setPanoProviderImpl(Ljava/lang/String;IIILcom/google/gwt/maps/client/streetview/StreetViewPanoramaProvider;)(pano, z, x, y, provider);
    }
  }-*/;

  private static StreetViewPanoramaData setPanoProviderImpl(String pano, int zoom, int tileX, int tileY,
      StreetViewPanoramaProvider provider) {
    StreetViewPanoramaData svpd = provider.getPanoData(pano, zoom, tileX, tileY);
    return svpd;
  }

  /**
   * gets Custom panorama provider, which takes a string pano id and returns an object defining the panorama given that
   * id. This function must be defined to specify custom panorama imagery.
   */
  public final native StreetViewPanoramaProvider getPanoProvider() /*-{
    return this.panoProvider;
  }-*/;

  /**
   * sets The LatLng position of the Street View panorama.
   * 
   * @param position {@link LatLng}
   */
  public final native void setPosition(LatLng position) /*-{
    this.position = position;
  }-*/;

  /**
   * gets The LatLng position of the Street View panorama.
   * 
   * @return {@link LatLng}
   */
  public final native LatLng getPosition() /*-{
    return this.position;
  }-*/;

  /**
   * The camera orientation, specified as heading, pitch, and zoom, for the panorama.
   * 
   * @param pov {@link StreetViewPov}
   */
  public final native void setStreeViewPov(StreetViewPov pov) /*-{
    this.pov = pov;
  }-*/;

  /**
   * gets The camera orientation, specified as heading, pitch, and zoom, for the panorama.
   */
  public final native StreetViewPov getStreetViewPov() /*-{
    return this.pov;
  }-*/;

  /**
   * sets If false, disables scrollwheel zooming in Street View. The scrollwheel is enabled by default.
   * 
   * @param scrollwheel
   */
  public final native void setScrollWheel(boolean scrollwheel) /*-{
    this.scrollwheel = scrollwheel;
  }-*/;

  /**
   * gets If false, disables scrollwheel zooming in Street View. The scrollwheel is enabled by default.
   */
  public final native boolean getsScrollWheel() /*-{
    return this.scrollwheel;
  }-*/;

  /**
   * sets If true, the Street View panorama is visible on load.
   * 
   * @param visible See {@link #setVisible(boolean)}.<br>
   * Method will be removed in version 3.11
   */
  @Deprecated
  public final native void setVisibile(boolean visible) /*-{
    this.visible = visible;
  }-*/;

  /**
   * sets If true, the Street View panorama is visible on load.
   * 
   * @param visible
   */
  public final native void setVisible(boolean visible) /*-{
    this.visible = visible;
  }-*/;

  /**
   * gets If true, the Street View panorama is visible on load.
   */
  public final native boolean getVisible() /*-{
    return this.visible;
  }-*/;

  /**
   * sets The enabled/disabled state of the zoom control.
   * 
   * @param zoomControl
   */
  public final native void setZoomControl(boolean zoomControl) /*-{
    this.zoomControl = zoomControl;
  }-*/;

  /**
   * gets The enabled/disabled state of the zoom control.
   */
  public final native boolean getZoomControl() /*-{
    return this.zoomControl;
  }-*/;

  /**
   * sets The display options for the zoom control.
   * 
   * @param zoomControlOptions
   */
  public final native void setZoomControlOptions(ZoomControlOptions zoomControlOptions) /*-{
    this.zoomControlOptions = zoomControlOptions;
  }-*/;

  /**
   * gets The display options for the zoom control.
   */
  public final native ZoomControlOptions getZoomControlOptions() /*-{
    return this.zoomControlOptions;
  }-*/;

}
