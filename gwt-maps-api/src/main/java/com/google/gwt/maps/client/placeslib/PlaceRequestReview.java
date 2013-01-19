package com.google.gwt.maps.client.placeslib;

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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class PlaceRequestReview extends JavaScriptObject {

  protected PlaceRequestReview() {
  }

  /**
   * Contains an array of PlaceAspectRating objects, each of which provides a rating of a single attribute of the
   * establishment. The first object in the array is considered the primary aspect. Each PlaceAspectRating is defined
   * as:
   */
  public final native JsArray<PlaceResultAspect> getAspects() /*-{
    return this.aspects;
  }-*/;

  /**
   * The name of the user who submitted the review. Anonymous reviews are attributed to "A Google user". If a language
   * parameter was set, then the phrase "A Google user" will return a localized string.
   */
  public final native String getAuthorName() /*-{
    return this.author_name;
  }-*/;

  /**
   * The URL to the users Google+ profile, if available.
   */
  public final native String getAuthorUrl() /*-{
    return this.author_url;
  }-*/;

  /**
   * Contains the user's review. When reviewing a location with Google Places, text reviews are considered optional;
   * therefore, this field may by empty.
   */
  public final native String getText() /*-{
    return this.text;
  }-*/;

  /**
   * The time that the review was submitted, measured in the number of seconds since since midnight, January 1, 1970
   * UTC.
   */
  public final native int getTime() /*-{
    return this.time;
  }-*/;

}
