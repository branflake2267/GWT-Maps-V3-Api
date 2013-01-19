package com.google.gwt.maps.client.layers;

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
 * Metadata for a single KML layer, in JSON format. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#KmlLayerMetadata">KmlLayerMetadata
 * API Doc</a>
 */
public class KmlLayerMetadata extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected KmlLayerMetadata() {
  }

  /**
   * Metadata for a single KML layer, in JSON format.
   */
  public static final KmlLayerMetadata newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The layer's <atom:author>, extracted from the layer markup.
   * 
   * @param author
   */
  public final native void setAuthor(KmlAuthor author) /*-{
    this.author = author;
  }-*/;

  /**
   * The layer's <atom:author>, extracted from the layer markup.
   */
  public final native KmlAuthor getAuthor() /*-{
    return this.author;
  }-*/;

  /**
   * The layer's <description>, extracted from the layer markup.
   * 
   * @param description
   */
  public final native void setDescription(String description) /*-{
    this.description = description;
  }-*/;

  /**
   * The layer's <description>, extracted from the layer markup.
   */
  public final native String getDescription() /*-{
    return this.description;
  }-*/;

  /**
   * The layer's <name>, extracted from the layer markup.
   * 
   * @param name
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;

  /**
   * The layer's <name>, extracted from the layer markup.
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * The layer's <Snippet>, extracted from the layer markup
   * 
   * @param snippet
   */
  public final native void setSnippet(String snippet) /*-{
    this.snippet = snippet;
  }-*/;

  /**
   * The layer's <Snippet>, extracted from the layer markup
   */
  public final native String getSnippet() /*-{
    return this.snippet;
  }-*/;

}
