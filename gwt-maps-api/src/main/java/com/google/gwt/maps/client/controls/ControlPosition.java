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
 * Identifiers used to specify the placement of controls on the map. Controls are positioned relative to other controls
 * in the same layout position. Controls that are added first are positioned closer to the edge of the map.<br>
 * <br>
 * <table border="1px" padding="0px">
 * <col width="33,3%"/><col width="33,3%"/><col width="33,3%"/> <thead><tbody> <tbody>
 * <tr>
 * <td>TL</td>
 * <td>TC</td>
 * <td>TR</td>
 * </tr>
 * <tr>
 * <td>LT</td>
 * <td></td>
 * <td>RT</td>
 * </tr>
 * <tr>
 * <td>&nbsp;</td>
 * <td>&nbsp;</td>
 * <td>&nbsp;</td>
 * </tr>
 * <tr>
 * <td>LC</td>
 * <td></td>
 * <td>RC</td>
 * </tr>
 * <tr>
 * <td>&nbsp;</td>
 * <td>&nbsp;</td>
 * <td>&nbsp;</td>
 * </tr>
 * <tr>
 * <td>LB</td>
 * <td></td>
 * <td>LB</td>
 * </tr>
 * <tr>
 * <td>BL</td>
 * <td>BC</td>
 * <td>BR</td>
 * </tr>
 * </tbody>
 * </table>
 * <br>
 * Elements in the top or bottom row flow towards the middle. Elements at the left or right sides flow downwards. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#ControlPosition">ControlPosition
 * API Doc</a>
 */
public enum ControlPosition {

  /**
   * javascript constant numbers - reverse engineered BOTTOM_CENTER=11 BOTTOM_LEFT=10 BOTTOM_RIGHT=12 LEFT_BOTTOM=6
   * LEFT_CENTER=4 LEFT_TOP=5 RIGHT_BOTTOM=9 RIGHT_CENTER=8 RIGHT_TOP=7 TOP_CENTER=2 TOP_LEFT=1 TOP_RIGHT=3
   */

  /**
   * Elements are positioned in the center of the bottom row.
   */
  BOTTOM_CENTER(11),

  /**
   * Elements are positioned in the bottom left and flow towards the middle. Elements are positioned to the right of the
   * Google logo.
   */
  BOTTOM_LEFT(10),

  /**
   * Elements are positioned in the bottom right and flow towards the middle. Elements are positioned to the left of the
   * copyrights.
   */
  BOTTOM_RIGHT(12),

  /**
   * Elements are positioned on the left, above bottom-left elements, and flow upwards.
   */
  LEFT_BOTTOM(6),

  /**
   * Elements are positioned in the center of the left side.
   */
  LEFT_CENTER(4),

  /**
   * Elements are positioned on the left, below top-left elements, and flow downwards.
   */
  LEFT_TOP(5),

  /**
   * Elements are positioned on the right, above bottom-right elements, and flow upwards.
   */
  RIGHT_BOTTOM(9),

  /**
   * Elements are positioned in the center of the right side.
   */
  RIGHT_CENTER(8),

  /**
   * Elements are positioned on the right, below top-right elements, and flow downwards.
   */
  RIGHT_TOP(7),

  /**
   * Elements are positioned in the center of the top row.
   */
  TOP_CENTER(2),

  /**
   * Elements are positioned in the top left and flow towards the middle.
   */
  TOP_LEFT(1),

  /**
   * Elements are positioned in the top right and flow towards the middle.
   */
  TOP_RIGHT(3);

  /**
   * javascript constant value
   */
  private int value;

  /**
   * Elements in the top or bottom row flow towards the middle. Elements at the left or right sides flow downwards.
   * 
   * @param value javascript constant value
   */
  ControlPosition(int value) {
    this.value = value;
  }

  /**
   * returns enum name
   */
  public String getName() {
    return name();
  }

  /**
   * returns javascript constant value
   */
  public int value() {
    return value;
  }

  public String toString() {
    return name() + "(" + value + ")";
  }

  /**
   * reconstruct from position from javascript constant value
   * 
   * @param value javascript constant value
   */
  public static ControlPosition fromValue(int value) {
    ControlPosition r = null;
    switch (value) {
    case 1:
      r = TOP_LEFT;
      break;
    case 2:
      r = TOP_CENTER;
      break;
    case 3:
      r = TOP_RIGHT;
      break;
    case 4:
      r = LEFT_CENTER;
      break;
    case 5:
      r = LEFT_TOP;
      break;
    case 6:
      r = LEFT_BOTTOM;
      break;
    case 7:
      r = RIGHT_TOP;
      break;
    case 8:
      r = RIGHT_CENTER;
      break;
    case 9:
      r = RIGHT_BOTTOM;
      break;
    case 10:
      r = BOTTOM_LEFT;
      break;
    case 11:
      r = BOTTOM_CENTER;
      break;
    case 12:
      r = BOTTOM_RIGHT;
      break;
    }
    return r;
  }

}
