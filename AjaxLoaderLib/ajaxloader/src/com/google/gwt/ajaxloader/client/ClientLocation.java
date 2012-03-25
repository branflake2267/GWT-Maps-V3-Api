/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.ajaxloader.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Wraps the ClientLocation object stored on google.loader described at
 * http://code.google.com/apis/ajax/documentation/#ClientLocation
 */
public class ClientLocation extends JavaScriptObject {

  protected ClientLocation() {
  }

  /**
   * Supplies the name of the city associated with the client's IP address.
   */
  public final native String getCity() /*-{
    return this.address.city;
  }-*/;

  /**
   * Supplies the name of the country associated with the client's IP address.
   */
  public final native String getCountry() /*-{
    return this.address.country;
  }-*/;

  /**
   * Supplies the name of the ISO 3166-1 country code associated with the
   * client's IP address.
   */
  public final native String getCountryCode() /*-{
    return this.address.country_code;
  }-*/;

  /**
   * Supplies the low resolution latitude associated with the client's IP
   * address.
   */
  public final native double getLatitude() /*-{
    return this.latitude;
  }-*/;

  /**
   * Supplies the low resolution longitude associated with the client's IP
   * address.
   */
  public final native double getLongitude() /*-{
    return this.longitude;
  }-*/;

  /**
   * Supplies the country specific region name associated with the client's IP
   * address.
   */
  public final native String getRegion() /*-{
    return this.address.region;
  }-*/;
}
