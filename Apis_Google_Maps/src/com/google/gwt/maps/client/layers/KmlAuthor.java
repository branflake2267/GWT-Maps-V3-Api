package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Contains details of the author of a KML document or feature.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#KmlAuthor}
 */
public class KmlAuthor extends JavaScriptObject {
  
  protected KmlAuthor() {}
  
  /**
   * Contains details of the author of a KML document or feature.
   * @return
   */
  public static final KmlAuthor newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The author's e-mail address, or an empty string if not specified.
   * @param email
   */
  public final native void setEmail(String email) /*-{
    this.email = email;
  }-*/;
  
  /**
   * The author's e-mail address, or an empty string if not specified.
   * @return
   */
  public final native String getEmail() /*-{
    return this.email;
  }-*/;
  
  /**
   * The author's name, or an empty string if not specified.
   * @param name
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;
  
  /**
   * The author's name, or an empty string if not specified.
   * @return
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;
  
  /**
   * The author's home page, or an empty string if not specified.
   * @param uri
   */
  public final native void setUri(String uri) /*-{
    this.uri = uri;
  }-*/;
  
  /**
   * The author's home page, or an empty string if not specified.
   */
  public final native String getUri() /*-{
    return this.uri;
  }-*/;
  
}
