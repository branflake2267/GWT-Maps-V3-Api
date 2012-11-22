package com.google.gwt.maps.client.placeslib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;

public class TextSearchRequest extends JavaScriptObject {

  protected TextSearchRequest() {
  }
    
  public static final TextSearchRequest newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The bounds within which to search for Places. Both location and radius
   * will be ignored if bounds is set.
   * 
   * @param bounds
   */
  public final native void setBounds(LatLngBounds bounds) /*-{
    this.bounds = bounds;
  }-*/;

  /**
   * The bounds within which to search for Places. Both location and radius
   * will be ignored if bounds is set.
   */
  public final native LatLngBounds getBounds() /*-{
    return this.bounds;
  }-*/;
  
  /**
   * The location around which to search for Places.
   * 
   * @param location
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;

  /**
   * The location around which to search for Places.
   */
  public final native LatLng getLocation() /*-{
    return this.location;
  }-*/;
  
  /**
   * The request's query term. e.g. the name of a place ('Eiffel Tower'), a
   * category followed by the name of a location ('pizza in New York'), or the
   * name of a place followed by a location disambiguator ('Starbucks in
   * Sydney').
   */
  public final native void setQuery(String query) /*-{
    this.query = query;
  }-*/;
  
  /**
   * The request's query term. e.g. the name of a place ('Eiffel Tower'), a
   * category followed by the name of a location ('pizza in New York'), or the
   * name of a place followed by a location disambiguator ('Starbucks in
   * Sydney').
   */
  public final native String getQuery() /*-{
    return this.query;
  }-*/;

  /**
   * The radius of the area used to bias results when searching for Places, in
   * meters.
   */
  public final native void setRadius(double radius) /*-{
    this.radius = radius;
  }-*/;

  /**
   * The radius of the area used to bias results when searching for Places, in
   * meters.
   */
  public final native double getRadius() /*-{
    return this.radius;
  }-*/;
  
}
