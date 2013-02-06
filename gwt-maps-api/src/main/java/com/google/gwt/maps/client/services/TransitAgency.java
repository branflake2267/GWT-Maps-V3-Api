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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * TransitAgency, used within TRANSIT legs.<br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#TransitAgency" >TransitAgency API
 * Doc</a>
 */
public class TransitAgency extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected TransitAgency() {
  }

  /**
   */
  public static final TransitAgency newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The name of this transit agency.
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;

  /**
   * The name of this transit agency.
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * The transit agency's phone number.
   */
  public final native void setPhone(String phone) /*-{
    this.phone = phone;
  }-*/;

  /**
   * The transit agency's phone number.
   */
  public final native String getPhone() /*-{
    return this.phone;
  }-*/;

  /**
   * The transit agency's URL.
   */
  public final native void setUrl(String url) /*-{
    this.url = url;
  }-*/;

  /**
   * The transit agency's URL.
   */
  public final native String getUrl() /*-{
    return this.url;
  }-*/;

}
