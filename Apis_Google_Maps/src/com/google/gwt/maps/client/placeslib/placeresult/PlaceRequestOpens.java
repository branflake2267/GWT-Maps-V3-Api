package com.google.gwt.maps.client.placeslib.placeresult;

import com.google.gwt.core.client.JavaScriptObject;

public class PlaceRequestOpens extends JavaScriptObject {
  
  protected PlaceRequestOpens() {
  }

  /**
   * Day a number from 0–6, corresponding to the days of the week, starting on
   * Sunday. For example, 2 means Tuesday.
   */
  public final native int getDay() /*-{
    return this.day;
  }-*/;
  
  /**
   * Time may contain a time of day in 24-hour hhmm format (values are in the
   * range 0000–2359). The time will be reported in the Place’s timezone.
   */
  public final native String getTime() /*-{
    return this.time;
  }-*/;
  
  public final native int getHours() /*-{
    return this.hours;
  }-*/;
  
  public final native int getMinutes() /*-{
    return this.minutes;
  }-*/;
  
  public final native int getNextDate() /*-{
    return this.nextDate;
  }-*/;
  
}
