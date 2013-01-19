package com.google.gwt.maps.client.controls;

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
 * Identifiers for scale control ids. <br>
 * <br>
 * See <a
 * href="https://developers.google.com/maps/documentation/javascript/reference#ScaleControlStyle">ScaleControlStyle API
 * Doc</a>
 */
public enum ScaleControlStyle {

  /**
   * The standard scale control.
   */
  DEFAULT;

  /**
   * return the enum value as a String
   * 
   * @return String
   */
  public String value() {
    return name();
  }

  /**
   * convert a String value to enum Type
   * 
   * @param type
   * @return TYPE
   */
  public static ScaleControlStyle fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  /**
   * return the enum Type as a String
   */
  @Override
  public String toString() {
    return name();
  }

}
