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

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window.Location;

/**
 * Stores keys for different locations (hostname:port). The AjaxLoader class can
 * lookup a key from this repository if not otherwise specified.
 * 
 * This repository can be helpful for web sites that respond to requests for
 * multiple domains (or by name and IP address), or to run your application on
 * multiple servers (say development, test, and production) and store the set of
 * valid keys compiled into the application.
 * 
 * You can specify these keys in multiple ways:
 * 
 * - You can create a
 * com/google/gwt/ajaxloader/client/AjaxKeyConstants.properties file with the
 * following format:
 * 
 * localhost\:8080 = ABQIAAAAG8LzhtshQCjpSshU_uJjm\
 * xTwM0brOpm-All5BF6PoaKBxRWWERTZER2lJ4GnsG8nvhKLOQ20degaEQ
 * 
 * 127.0.0.1\:8080 = ABQIAAAAG8LzhtshQCjpSshU_uJjm\
 * xTBfUk9TZrBRaIteybtnU2KziHEpRQvhPNTjo7DMczjrRD3yBPRJ_BSQQ
 * 
 * example.com\:8080 = ABQIAAAAG8LzhU_uJjmhtshQCjpSs\
 * 3yBPRJ_BSQQxTBfUk9TZrBRaIteybtnU2KziHEpRQvhPNTjo7DMczjrRD
 * 
 * ajaxKeys = localhost\:8080, 127.0.0.1\:8080 example.com\:8080
 * 
 * - You can specify an instance of AjaxKeyConstants to the
 * {@link #setKeys(AjaxKeyConstants)} method.
 * 
 * - You can load keys at runtime with the {@link #putKey(String, String)}
 * method.
 */
public class AjaxKeyRepository {

  // Deferred bound instance of Constants class used to populate keys
  private static AjaxKeyConstants keys = GWT.create(AjaxKeyConstants.class);

  /**
   * Retrieve an Ajax API key given the current location.
   */
  public static String getKey() {
    return keys.ajaxKeys().get(Location.getHost());
  }

  /**
   * Retrieve an Ajax API Key given the hostname:port value.
   * 
   * @param location hostname:port string
   */
  public static String getKey(String location) {
    return keys.ajaxKeys().get(location);
  }

  /**
   * Associates a a hostname:port with an Ajax API key.
   * 
   * @param location hostname:port value
   * @param ajaxApiKey the key registered for the above hostname:port combo
   */
  public static void putKey(String location, String ajaxApiKey) {
    keys.ajaxKeys().put(location, ajaxApiKey);
  }

  /**
   * Override the default key properties with your own custom subclass. Note
   * that calling this method will invalidate any keys set with putKey or any
   * defaults compiled into the library.
   * 
   * @param keys an extension of the AjaxKeyConstants interface to override the
   *          defaults.
   */
  public static void setKeys(AjaxKeyConstants keys) {
    AjaxKeyRepository.keys = keys;
  }

  private AjaxKeyRepository() {
    // do not instantiate this class
  }
}
