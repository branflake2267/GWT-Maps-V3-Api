package com.google.gwt.maps.client.placeslib.placeresult;

import com.google.gwt.core.client.JavaScriptObject;

public class PlaceResultPeriods extends JavaScriptObject {

  protected PlaceResultPeriods() {
  }
  
  /**
   * Contains a pair of day and time objects describing when the Place closes.
   */
  public final native PlaceRequestOpens getClose() /*-{
    return this.close;
  }-*/;
  
  /**
   * Contains a pair of day and time objects describing when the Place opens.
   */
  public final native PlaceRequestOpens getOpen() /*-{
    return this.open;
  }-*/;
  
}
