package com.google.gwt.maps.client.overlays;

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
 * Start an animation. Any ongoing animation will be cancelled. Currently supported animations are: BOUNCE, DROP.
 * Passing in null will cause any animation to stop.
 */
public enum Animation {

  BOUNCE(1),

  DROP(2),

  /**
   * Same as set Animation to null. This will stop the animation
   */
  STOPANIMATION(null);

  private Integer value;

  Animation(Integer value) {
    this.value = value;
  }

  /**
   * return the enum value as a String
   * 
   * @return String
   */
  public Integer value() {
    return value;
  }

  /**
   * convert a String value to enum Type
   * 
   * @param value
   * @return TYPE
   */
  public static Animation fromValue(String value) {
    Animation animation = Animation.STOPANIMATION;
    if (value.toLowerCase().contains("bounce") || value.contains("1")) {
      animation = BOUNCE;
    } else if (value.toLowerCase().contains("drop") || value.contains("2")) {
      animation = DROP;
    }
    return animation;
  }

  public static Animation fromValue(Integer value) {
    if (value == null) {
      return Animation.STOPANIMATION;
    } else {
      return fromValue(Integer.toString(value));
    }
  }

  /**
   * return the enum Type as a String
   */
  @Override
  public String toString() {
    return name();
  }

}
