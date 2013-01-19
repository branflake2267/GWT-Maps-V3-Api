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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Contains details of the author of a KML document or feature. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#KmlAuthor">KmlAuthor API Doc</a>
 */
public class KmlAuthor extends JavaScriptObject {

  protected KmlAuthor() {
  }

  /**
   * Contains details of the author of a KML document or feature.
   */
  public static final KmlAuthor newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The author's e-mail address, or an empty string if not specified.
   * 
   * @param email
   */
  public final native void setEmail(String email) /*-{
    this.email = email;
  }-*/;

  /**
   * The author's e-mail address, or an empty string if not specified.
   */
  public final native String getEmail() /*-{
    return this.email;
  }-*/;

  /**
   * The author's name, or an empty string if not specified.
   * 
   * @param name
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;

  /**
   * The author's name, or an empty string if not specified.
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * The author's home page, or an empty string if not specified.
   * 
   * @param uri
   */
  public final native void setUri(String uri) /*-{
    this.uri = uri;
  }-*/;

  /**
   * The author's home page, or an empty string if not specified.
   */
  public final native String getUri() /*-{
    return this.uri;
  }-*/;

}
