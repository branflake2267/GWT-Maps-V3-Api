package com.google.gwt.maps.client.events;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.base.LatLng;

/**
 * This object is returned from various mouse events on the map and overlays, and contains all the fields shown below.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#MouseEvent}
 */
public class MouseEvent {
  
  /**
   * {@link LatLng}
   */
  private LatLng latLng;
  
  /**
   * Create a new MouseEvent from properties of the map event call back
   * @param properties {@link com.google.gwt.ajaxloader.client.Properties}
   */
  public MouseEvent(Properties properties) {
    parseProperties(properties);
  }

  /**
   * parse the properties for latlng
   * @param properties
   */
  private void parseProperties(Properties properties) {
    try {
      latLng = (LatLng) properties.getObject("latLng");
    } catch (TypeException e) {
      e.printStackTrace();
    }
  }
  
  /**
   * get lat lng
   * @return {@link LatLng}
   */
  public LatLng getLatLng() {
    return latLng;
  }

}
