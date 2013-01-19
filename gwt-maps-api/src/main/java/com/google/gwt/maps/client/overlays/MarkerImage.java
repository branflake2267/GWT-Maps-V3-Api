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
 * A structure representing a Marker icon or shadow image. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MarkerImage">MarkerImage API
 * Doc</a>
 */
public class MarkerImage extends JavaScriptObject {

  /**
   * A structure representing a Marker icon or shadow image.
   */
  protected MarkerImage() {
  }

  /**
   * creates A structure representing a Marker icon or shadow image.
   * 
   * @param url The URL of the image or sprite sheet.
   * @return {@link MarkerImage}
   */
  public final static MarkerImage newInstance(String url) {
    return createJso(url).cast();
  }

  /**
   * creates A structure representing a Marker icon or shadow image.
   * 
   * @param url The URL of the image or sprite sheet.
   * @param size The display size of the sprite or image. When using sprites, you must specify the sprite size. If the
   *          size is not provided, it will be set when the image loads.
   * @return {@link MarkerImage}
   */
  public final static MarkerImage newInstance(String url, Size size) {
    return createJso(url, size).cast();
  }

  /**
   * creates A structure representing a Marker icon or shadow image.
   * 
   * @param url The URL of the image or sprite sheet.
   * @param size The display size of the sprite or image. When using sprites, you must specify the sprite size. If the
   *          size is not provided, it will be set when the image loads.
   * @param origin The position of the image within a sprite, if any. By default, the origin is located at the top left
   *          corner of the image (0, 0).
   * @return {@link MarkerImage}
   */
  public final static MarkerImage newInstance(String url, Size size, Point origin) {
    return createJso(url, size, origin).cast();
  }

  /**
   * creates A structure representing a Marker icon or shadow image.
   * 
   * @param url The URL of the image or sprite sheet.
   * @param size The display size of the sprite or image. When using sprites, you must specify the sprite size. If the
   *          size is not provided, it will be set when the image loads.
   * @param origin The position of the image within a sprite, if any. By default, the origin is located at the top left
   *          corner of the image (0, 0).
   * @param anchor The position at which to anchor an image in correspondance to the location of the marker on the map.
   *          By default, the anchor is located along the center point of the bottom of the image.
   * @return {@link MarkerImage}
   */
  public final static MarkerImage newInstance(String url, Size size, Point origin, Point anchor) {
    return createJso(url, size, origin, anchor).cast();
  }

  /**
   * creates A structure representing a Marker icon or shadow image.
   * 
   * @param url The URL of the image or sprite sheet.
   * @param size The display size of the sprite or image. When using sprites, you must specify the sprite size. If the
   *          size is not provided, it will be set when the image loads.
   * @param origin The position of the image within a sprite, if any. By default, the origin is located at the top left
   *          corner of the image (0, 0).
   * @param anchor The position at which to anchor an image in correspondance to the location of the marker on the map.
   *          By default, the anchor is located along the center point of the bottom of the image.
   * @param scaledSize The size of the entire image after scaling, if any. Use this property to stretch/shrink an image
   *          or a sprite.
   * @return {@link MarkerImage}
   */
  public final static MarkerImage newInstance(String url, Size size, Point origin, Point anchor, Size scaledSize) {
    return createJso(url, size, origin, anchor, scaledSize).cast();
  }

  private final static native JavaScriptObject createJso(String url) /*-{
    return new $wnd.google.maps.MarkerImage(url);
  }-*/;

  private final static native JavaScriptObject createJso(String url, Size size) /*-{
    return new $wnd.google.maps.MarkerImage(url, size);
  }-*/;

  private final static native JavaScriptObject createJso(String url, Size size, Point origin) /*-{
    return new $wnd.google.maps.MarkerImage(url, size, origin);
  }-*/;

  private final static native JavaScriptObject createJso(String url, Size size, Point origin, Point anchor) /*-{
    return new $wnd.google.maps.MarkerImage(url, size, origin, anchor);
  }-*/;

  private final static native JavaScriptObject createJso(String url, Size size, Point origin, Point anchor,
      Size scaledSize) /*-{
    return new $wnd.google.maps.MarkerImage(url, size, origin, anchor,
        scaledSize);
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
