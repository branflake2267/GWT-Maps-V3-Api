package com.google.gwt.maps.client.overlays;

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
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;

/**
 * A structure representing a Marker icon or shadow image.<br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#Icon">Icon API
 * Doc</a>
 */
public class Icon extends JavaScriptObject {
  
  /**
   * A structure representing a Marker icon or shadow image.
   */
  protected Icon() {
  }

  /**
   * Creates a structure representing a Marker icon or shadow image.
   *
   * @param url The URL of the image or sprite sheet
   *  @return A new {@link Icon} object.
   */
  public final static Icon newInstance(String url) {
    return createJso(url).cast();
  }
  /**
   * Creates a structure representing a Marker icon or shadow image.
   *
   * @param url The URL of the image or sprite sheet
   * @param size The display size of the sprite or image. When using sprites, you must specify the sprite size. If the
   *          size is not provided, it will be set when the image loads.
   *  @return A new {@link Icon} object.
   */
  public final static Icon newInstance(String url, Size size) {
    return createJso(url, size).cast();
  }

  /**
   * Creates a structure representing a Marker icon or shadow image.
   *
   * @param url The URL of the image or sprite sheet
   * @param size The display size of the sprite or image. When using sprites, you must specify the sprite size. If the
   *          size is not provided, it will be set when the image loads.
   *  @param anchor The position at which to anchor an image in correspondance to the location of the marker on the map.
   *          By default, the anchor is located along the center point of the bottom of the image.
   *  @return A new {@link Icon} object.
   */
  public final static Icon newInstance(String url, Size size, Point anchor) {
    return createJso(url, size, anchor).cast();
  }

  /**
   * Creates a structure representing a Marker icon or shadow image.
   *
   * @param url The URL of the image or sprite sheet
   * @param size The display size of the sprite or image. When using sprites, you must specify the sprite size. If the
   *          size is not provided, it will be set when the image loads.
   *  @param anchor The position at which to anchor an image in correspondance to the location of the marker on the map.
   *          By default, the anchor is located along the center point of the bottom of the image.
   *  @param origin The position of the image within a sprite, if any, By default, the origin is located at the top left
   *          corner of the image (0,0).
   *  @return A new {@link Icon} object.
   */
  public final static Icon newInstance(String url, Size size, Point anchor, Point origin) {
    return createJso(url, size, anchor, origin).cast();
  }

  /**
   * Creates a structure representing a Marker icon or shadow image.
   *
   * @param url The URL of the image or sprite sheet
   * @param size The display size of the sprite or image. When using sprites, you must specify the sprite size. If the
   *          size is not provided, it will be set when the image loads.
   *  @param anchor The position at which to anchor an image in correspondance to the location of the marker on the map.
   *          By default, the anchor is located along the center point of the bottom of the image.
   *  @param origin The position of the image within a sprite, if any, By default, the origin is located at the top left
   *          corner of the image (0,0).
   *  @param scaledSize The size of the entire image after scaling, if any. Use this property to stretch/shrink an image
   *          or a sprite.
   *  @return A new {@link Icon} object.
   */
  public final static Icon newInstance(String url, Size size, Point anchor, Point origin, Size scaledSize) {
    return createJso(url, size, anchor, origin, scaledSize).cast();
  }

  private final static native JavaScriptObject createJso(String iconUrl) /*-{
    return {
      url: iconUrl
    };
  }-*/;

  private final static native JavaScriptObject createJso(String iconUrl, Size iconSize) /*-{
    return {
      url: iconUrl,
      size: iconSize
    };
  }-*/;

  private final static native JavaScriptObject createJso(String iconUrl, Size iconSize, Point iconAnchor) /*-{
    return {
      url: iconUrl,
      size: iconSize,
      origin: iconOrigin
    };
  }-*/;

  private final static native JavaScriptObject createJso(String iconUrl, Size iconSize, Point iconAnchor, Point iconOrigin) /*-{
    return {
      url: iconUrl,
      size: iconSize,
      origin: iconOrigin,
      anchor: iconAnchor
    };
  }-*/;

  private final static native JavaScriptObject createJso(String iconUrl, Size iconSize, Point iconAnchor, Point iconOrigin, Size iconScaledSize) /*-{
    return {
      url: iconUrl,
      size: iconSize,
      origin: iconOrigin,
      anchor: iconAnchor,
      scaledSize: iconScaledSize
    };      
  }-*/;

  /**
   * sets The position at which to anchor an image in correspondance to the location of the marker on the map. By
   * default, the anchor is located along the center point of the bottom of the image.
   * 
   * @param anchor
   */
  public final native void setAnchor(Point anchor) /*-{
    this.anchor = anchor;
  }-*/;

  /**
   * gets The position at which to anchor an image in correspondance to the location of the marker on the map. By
   * default, the anchor is located along the center point of the bottom of the image.
   */
  public final native Point getAnchor() /*-{
    return this.anchor;
  }-*/;

  /**
   * sets The position of the image within a sprite, if any. By default, the origin is located at the top left corner of
   * the image (0, 0).
   * 
   * @param origin
   */
  public final native void setOrigin(Point origin) /*-{
    this.origin = origin;
  }-*/;

  /**
   * gets The position of the image within a sprite, if any. By default, the origin is located at the top left corner of
   * the image (0, 0).
   */
  public final native Point getOrigin() /*-{
    return this.origin;
  }-*/;

  /**
   * sets The size of the entire image after scaling, if any. Use this property to stretch/shrink an image or a sprite.
   * 
   * @param scaledSize
   */
  public final native void setScaledSize(Size scaledSize) /*-{
    this.scaledSize = scaledSize;
  }-*/;

  /**
   * gets The size of the entire image after scaling, if any. Use this property to stretch/shrink an image or a sprite.
   */
  public final native Size getScaledSize() /*-{
    return this.scaledSize;
  }-*/;

  /**
   * sets The display size of the sprite or image. When using sprites, you must specify the sprite size. If the size is
   * not provided, it will be set when the image loads.
   * 
   * @param size
   */
  public final native void setSize(Size size) /*-{
    this.size = size;
  }-*/;

  /**
   * gets The display size of the sprite or image. When using sprites, you must specify the sprite size. If the size is
   * not provided, it will be set when the image loads.
   */
  public final native Size getSize() /*-{
    return this.size;
  }-*/;

  /**
   * sets The URL of the image or sprite sheet.
   * 
   * @param url
   */
  public final native void setUrl(String url) /*-{
    this.url = url;
  }-*/;

  /**
   * gets The URL of the image or sprite sheet.
   */
  public final native String getUrl() /*-{
    return this.url;
  }-*/;

}
