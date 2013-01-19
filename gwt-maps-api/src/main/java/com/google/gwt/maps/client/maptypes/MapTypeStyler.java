package com.google.gwt.maps.client.maptypes;

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

/**
 * A styler affects how a map's elements will be styled. Each MapTypeStyler should contain one and only one key. If more
 * than one key is specified in a single MapTypeStyler, all but one will be ignored. For example: var rule = {hue:
 * '#ff0000'}. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#MapTypeStyler" >MapTypeStyler API
 * Doc</a>
 */
public class MapTypeStyler extends JavaScriptObject {

  /**
   * A styler affects how a map's elements will be styled. Each MapTypeStyler should contain one and only one key. If
   * more than one key is specified in a single MapTypeStyler, all but one will be ignored. For example: var rule =
   * {hue: '#ff0000'}. use newInstance();
   */
  protected MapTypeStyler() {
  }

  /**
   * Create a hue styler. <br>
   * Sets the hue of the feature to match the hue of the color supplied. Note that the saturation and lightness of the
   * feature is conserved, which means that the feature will not match the color supplied exactly. Valid values: An RGB
   * hex string, i.e. '#ff0000'.
   * 
   * @param hue i.e. #445566
   */
  public final static MapTypeStyler newHueStyler(String hue) {
    MapTypeStyler styler = JavaScriptObject.createObject().cast();
    styler.setHue(hue);
    return styler;
  }

  /**
   * Create gamma styler. <br>
   * Modifies the gamma by raising the lightness to the given power. Valid values: Floating point numbers, [0.01, 10],
   * with 1.0 representing no change.
   * 
   * @param gamma [0.01,10]
   */
  public final static MapTypeStyler newGammaStyler(double gamma) {
    MapTypeStyler styler = JavaScriptObject.createObject().cast();
    styler.setGamma(gamma);
    return styler;
  }

  /**
   * Create lightness styler. <br>
   * Shifts lightness of colors by a percentage of the original value if decreasing and a percentage of the remaining
   * value if increasing. Valid values: [-100, 100].
   * 
   * @param lightness [-100,100]
   */
  public final static MapTypeStyler newLightnessStyler(int lightness) {
    MapTypeStyler styler = JavaScriptObject.createObject().cast();
    styler.setLightness(lightness);
    return styler;
  }

  /**
   * Create invert_lightness styler. <br>
   * A value of true will invert the lightness of the feature while preserving the hue and saturation.
   * 
   * @param invertLightness
   */
  public final static MapTypeStyler newInvertLightnessStyler(boolean invertLightness) {
    MapTypeStyler styler = JavaScriptObject.createObject().cast();
    styler.setInvertLightness(invertLightness);
    return styler;
  }

  /**
   * Create saturation styler. <br>
   * Shifts the saturation of colors by a percentage of the original value if decreasing and a percentage of the
   * remaining value if increasing. Valid values: [-100, 100].
   * 
   * @param saturation [-100, 100]
   */
  public final static MapTypeStyler newSaturationStyler(int saturation) {
    MapTypeStyler styler = JavaScriptObject.createObject().cast();
    styler.setSaturation(saturation);
    return styler;
  }

  /**
   * Create visibility styler. <br>
   * Sets the visibility of the feature. Valid values: 'on', 'off' or 'simplifed'.
   * 
   * @param visibility {'on'|'off'|'simplifed'}
   */
  public final static MapTypeStyler newVisibilityStyler(String visibility) {
    MapTypeStyler styler = JavaScriptObject.createObject().cast();
    styler.setVisibility(visibility);
    return styler;
  }

  /**
   * sets Gamma. Modifies the gamma by raising the lightness to the given power. Valid values: Floating point numbers,
   * [0.01, 10], with 1.0 representing no change.
   * 
   * @param gamma
   */
  private final native void setGamma(double gamma) /*-{
    this.gamma = gamma;
  }-*/;

  /**
   * gets Gamma. Modifies the gamma by raising the lightness to the given power. Valid values: Floating point numbers,
   * [0.01, 10], with 1.0 representing no change.
   */
  public final native double getGamma() /*-{
    return this.gamma;
  }-*/;

  /**
   * sets Sets the hue of the feature to match the hue of the color supplied. Note that the saturation and lightness of
   * the feature is conserved, which means that the feature will not match the color supplied exactly. Valid values: An
   * RGB hex string, i.e. '#ff0000'.
   * 
   * @param hue
   */
  private final native void setHue(String hue) /*-{
    this.hue = hue;
  }-*/;

  /**
   * gets Sets the hue of the feature to match the hue of the color supplied. Note that the saturation and lightness of
   * the feature is conserved, which means that the feature will not match the color supplied exactly. Valid values: An
   * RGB hex string, i.e. '#ff0000'.
   */
  public final native String getHue() /*-{
    return this.hue;
  }-*/;

  /**
   * sets Inverts lightness. A value of true will invert the lightness of the feature while preserving the hue and
   * saturation.
   * 
   * @param invert_lightness
   */
  private final native void setInvertLightness(boolean invert_lightness) /*-{
    this.invert_lightness = invert_lightness;
  }-*/;

  /**
   * gets Inverts lightness. A value of true will invert the lightness of the feature while preserving the hue and
   * saturation.
   */
  public final native boolean getInvertLightness() /*-{
    return this.invert_lightness;
  }-*/;

  /**
   * sets Lightness. Shifts lightness of colors by a percentage of the original value if decreasing and a percentage of
   * the remaining value if increasing. Valid values: [-100, 100].
   * 
   * @param lightness
   */
  private final native void setLightness(int lightness) /*-{
    this.lightness = lightness;
  }-*/;

  /**
   * gets Lightness. Shifts lightness of colors by a percentage of the original value if decreasing and a percentage of
   * the remaining value if increasing. Valid values: [-100, 100].
   */
  public final native int getLightness() /*-{
    return this.lightness;
  }-*/;

  /**
   * sets Saturation. Shifts the saturation of colors by a percentage of the original value if decreasing and a
   * percentage of the remaining value if increasing. Valid values: [-100, 100].
   * 
   * @param saturation
   */
  private final native void setSaturation(int saturation) /*-{
    this.saturation = saturation;
  }-*/;

  /**
   * gets Saturation. Shifts the saturation of colors by a percentage of the original value if decreasing and a
   * percentage of the remaining value if increasing. Valid values: [-100, 100].
   */
  public final native int getSaturation() /*-{
    return this.saturation;
  }-*/;

  /**
   * sets Visibility: Valid values: 'on', 'off' or 'simplifed'.
   * 
   * @param visibility
   */
  private final native void setVisibility(String visibility) /*-{
    this.visibility = visibility;
  }-*/;

  /**
   * gets Visibility: Valid values: 'on', 'off' or 'simplifed'.
   */
  public final native String getVisibility() /*-{
    return this.visibility;
  }-*/;
  
}
