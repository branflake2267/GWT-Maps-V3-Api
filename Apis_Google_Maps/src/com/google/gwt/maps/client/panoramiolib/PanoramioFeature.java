package com.google.gwt.maps.client.panoramiolib;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *  Describes a single Panoramio feature.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#PanoramioFeature}
 */
public class PanoramioFeature extends JavaScriptObject {

  /**
   * generated from event
   * use newInstance();
   */
  protected PanoramioFeature() {}
  
  /**
   * generated from event
   * Describes a single Panoramio feature.
   * @return
   */
  public static final PanoramioFeature newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The username of the user who uploaded this photo.
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
   * The unique identifier for this photo, as used in the Panoramio API (see {@link http://www.panoramio.com/api/widget/api.html}).
   * @param photoId
   */
  public final native void setPhotoId(String photoId) /*-{
    this.photoId = photoId;
  }-*/;
  
  /**
   * The unique identifier for this photo, as used in the Panoramio API (see {@link http://www.panoramio.com/api/widget/api.html}).
   */
  public final native String getPhotoId() /*-{
    return this.photoId;
  }-*/;
  
  /**
   * The title of the photo.
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
   * The unique identifier for the user who uploaded this photo, as used in the Panoramio API (see {@link http://www.panoramio.com/api/widget/api.html}).
   * @param userId
   */
  public final native void setUserId(String userId) /*-{
    this.userId = userId;
  }-*/;
  
  /**
   * The unique identifier for the user who uploaded this photo, as used in the Panoramio API (see {@link http://www.panoramio.com/api/widget/api.html}).
   * @return
   */
  public final native String getUserId() /*-{
    return this.userId;
  }-*/;
  
}
