package com.google.gwt.maps.client.panoramiolib;

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

/**
 * Describes a single Panoramio feature. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#PanoramioFeature">PanoramioFeature
 * API Doc</a>
 */
public class PanoramioFeature extends JavaScriptObject {

  /**
   * generated from event use newInstance();
   */
  protected PanoramioFeature() {
  }

  /**
   * generated from event Describes a single Panoramio feature.
   */
  public static final PanoramioFeature newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The username of the user who uploaded this photo.
   * 
   * @param author
   */
  public final native void setAuthor(String author) /*-{
    this.author = author;
  }-*/;

  /**
   * The username of the user who uploaded this photo.
   */
  public final native String getAuthor() /*-{
    return this.author;
  }-*/;

  /**
   * The unique identifier for this photo, as used in the Panoramio API. <br>
   * <br>
   * See <a href="http://www.panoramio.com/api/widget/api.html">Panoramio API</a>.
   * 
   * @param photoId
   */
  public final native void setPhotoId(String photoId) /*-{
    this.photoId = photoId;
  }-*/;

  /**
   * The unique identifier for this photo, as used in the Panoramio API. <br>
   * <br>
   * See <a href="http://www.panoramio.com/api/widget/api.html">Panoramio API</a>.
   */
  public final native String getPhotoId() /*-{
    return this.photoId;
  }-*/;

  /**
   * The title of the photo.
   * 
   * @param title
   */
  public final native void setTitle(String title) /*-{
    this.title = title;
  }-*/;

  /**
   * The title of the photo.
   */
  public final native String getTitle() /*-{
    return this.title;
  }-*/;

  /**
   * The URL of the photo.
   * 
   * @param url
   */
  public final native void setUrl(String url) /*-{
    this.url = url;
  }-*/;

  /**
   * The URL of the photo.
   */
  public final native String getUrl() /*-{
    return this.url;
  }-*/;

  /**
   * The unique identifier for the user who uploaded this photo, as used in the Panoramio API. <br>
   * <br>
   * See <a href="http://www.panoramio.com/api/widget/api.html">Panoramio API</a>.
   * 
   * @param userId
   */
  public final native void setUserId(String userId) /*-{
    this.userId = userId;
  }-*/;

  /**
   * The unique identifier for the user who uploaded this photo, as used in the Panoramio API. <br>
   * <br>
   * See <a href="http://www.panoramio.com/api/widget/api.html">Panoramio API</a>.
   */
  public final native String getUserId() /*-{
    return this.userId;
  }-*/;

}
