package com.google.gwt.maps.client.placeslib.placeresult;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class PlaceResultOpeningHours extends JavaScriptObject {
  
  protected PlaceResultOpeningHours() {
  }

  /**
   * Is a boolean value indicating if the Place is open at the current time.
   */
  public final native boolean getOpenNow() /*-{
    return this.open_now;
  }-*/;
  
  /**
   * Is an array of opening periods covering seven days, starting from Sunday,
   * in chronological order.
   */
  public final native JsArray<PlaceResultPeriods> getPeriods() /*-{
    return this.periods;
  }-*/;
  
}
