package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Data for a single KML feature in JSON format, returned when a KML feature is clicked. The data contained in this object mirrors that associated with the feature in the KML or GeoRSS markup in which it is declared.
 * {@link }
 */
public class KmlFeatureData extends JavaScriptObject {
  
  /**
   * This is created from an event.
   * use newInstance();
   */
  protected KmlFeatureData() {}
  
  /**
   * this is created from an event
   * @return
   */
  public static final KmlFeatureData newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The feature's <atom:author>, extracted from the layer markup (if specified).
   * @param author
   */
  public final native void setAuthor(KmlAuthor author) /*-{
    this.author = author;
  }-*/;
  
  /**
   * The feature's <atom:author>, extracted from the layer markup (if specified).
   * @return
   */
  public final native KmlAuthor getAuthor() /*-{
    return this.author;
  }-*/;
  
  /**
   * The feature's <description>, extracted from the layer markup.
   * @param description
   */
  public final native void setDescription(String description) /*-{
    this.description = description;
  }-*/;
  
  /**
   * The feature's <description>, extracted from the layer markup.
   * @return
   */
  public final native String getDescription() /*-{
    return this.description;
  }-*/;
  
  /**
   * The feature's <id>, extracted from the layer markup. If no <id> has been specified, a unique ID will be generated for this feature.
   * @param id
   */
  public final native void setId(String id) /*-{
    this.id = id;
  }-*/;
  
  /**
   * The feature's <id>, extracted from the layer markup. If no <id> has been specified, a unique ID will be generated for this feature.
   */
  public final native String getId() /*-{
    return this.id;
  }-*/;
  
  /**
   * The feature's balloon styled text, if set.
   * @param infoWindowHtml
   */
  public final native void setInfoWindowHtml(String infoWindowHtml) /*-{
    this.infoWindowHtml = infoWindowHtml;
  }-*/;
  
  /**
   * The feature's balloon styled text, if set.
   * @return
   */
  public final native String getInfoWindowHtml() /*-{
    return this.infoWindowHtml;
  }-*/;
  
  /**
   * The feature's <name>, extracted from the layer markup.
   * @param name
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;
  
  /**
   * The feature's <name>, extracted from the layer markup.
   * @return
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;
  
  /**
   * The feature's <Snippet>, extracted from the layer markup.
   * @param snippet
   */
  public final native void setSnippet(String snippet) /*-{
    this.snippet = snippet;
  }-*/;
  
  /**
   * The feature's <Snippet>, extracted from the layer markup.
   * @return
   */
  public final native String getSnippet() /*-{
    return this.snippet;
  }-*/;

  /**
   * get to this object json string
   * @return
   */
  public final native String getToString() /*-{
    return this.toSource ? this.toSource() : "NO SOURCE";
  }-*/;
}
