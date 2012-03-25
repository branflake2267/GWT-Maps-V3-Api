package com.google.gwt.maps.client.maptypes;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *  This class extends MVCObject. // TODO hmmmm how should I inlude the methods
 */
public class MapTypeRegistry extends JavaScriptObject {
  
  /**
   * The MapTypeRegistry holds the collection of custom map types available to the map for its use. The API consults this registry when providing the list of avaiable map types within controls, for example.
   */
  protected MapTypeRegistry() {}
  
  /**
   * The MapTypeRegistry holds the collection of custom map types available to the map for its use. The API consults this registry when providing the list of avaiable map types within controls, for example.
   * @return
   */
  public final static MapTypeRegistry newInstance() {
    return createJso().cast();
  }

  private final static native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.MapTypeRegistry();
  }-*/;
  
  /**
   * Sets the registry to associate the passed string identifier with the passed MapType.
   * @param id
   * @param mapType
   */
  public final native void set(String id, MapType mapType) /*-{
    this.set(id, mapType);
  }-*/;
  

}
