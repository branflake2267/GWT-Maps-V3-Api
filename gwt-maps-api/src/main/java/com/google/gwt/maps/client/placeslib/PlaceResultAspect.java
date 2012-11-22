package com.google.gwt.maps.client.placeslib;

import com.google.gwt.core.client.JavaScriptObject;

public class PlaceResultAspect extends JavaScriptObject {

  protected PlaceResultAspect() {
  }
  
  /**
   * The user's rating for this particular aspect, from 0 to 3.
   */
  public final native int getRating() /*-{
    return this.rating;
  }-*/;
  
  /**
   * The name of the aspect that is being rated. eg. atmosphere, service, food, overall, etc.
   */
  public final native String getType() /*-{
    return this.type;
  }-*/;
  
}
