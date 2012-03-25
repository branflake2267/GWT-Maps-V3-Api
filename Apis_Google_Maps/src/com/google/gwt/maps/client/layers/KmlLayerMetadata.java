package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Metadata for a single KML layer, in JSON format.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#KmlLayerMetadata}
 */
public class KmlLayerMetadata extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected KmlLayerMetadata() {}

  /**
   * Metadata for a single KML layer, in JSON format.
   * @return
   */
  public static final KmlLayerMetadata newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The layer's <atom:author>, extracted from the layer markup.
   * @param author
   */
  public final native void setAuthor(KmlAuthor author) /*-{
    this.author = author;
  }-*/;
  
  /**
   * The layer's <atom:author>, extracted from the layer markup.
   * @return
   */
  public final native KmlAuthor getAuthor() /*-{
    return this.author;
  }-*/;
  
  /**
   * The layer's <description>, extracted from the layer markup.
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
   * @param name
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;
  
  /**
   * The layer's <name>, extracted from the layer markup.
   * @return
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;
  
  /**
   * The layer's <Snippet>, extracted from the layer markup
   * @param snippet
   */
  public final native void setSnippet(String snippet) /*-{
    this.snippet = snippet;
  }-*/;
  
  /**
   * The layer's <Snippet>, extracted from the layer markup
   * @return
   */
  public final native String getSnippet() /*-{
    return this.snippet;
  }-*/;
  
}
