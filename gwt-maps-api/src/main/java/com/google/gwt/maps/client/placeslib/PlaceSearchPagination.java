package com.google.gwt.maps.client.placeslib;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object used to fetch additional pages of Places results.
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#PlaceSearchPagination">PlaceSearchPagination API Doc</a>
 */
public class PlaceSearchPagination extends JavaScriptObject {
  
  protected PlaceSearchPagination() {
  }
  
  /**
   * Fetches the next page of results. Uses the same callback function that was
   * provided to the first search request.
   */
  public final native void nextPage() /*-{
    this.nextPage();
  }-*/;

  /**
   * Indicates if further results are available. true when there is an
   * additional results page.
   */
  public final native boolean hasNextPage() /*-{
    return this.hasNextPage;
  }-*/;
  
}
