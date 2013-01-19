package com.google.gwt.maps.client.maptypes;

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
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#ImageMapType" >ImageMapType API
 * Doc</a>
 */
public class MapTypeRegistry extends MVCObject<MapTypeRegistry> {

  /**
   * The MapTypeRegistry holds the collection of custom map types available to the map for its use. The API consults
   * this registry when providing the list of available map types within controls, for example.
   */
  protected MapTypeRegistry() {
  }

  /**
   * The MapTypeRegistry holds the collection of custom map types available to the map for its use. The API consults
   * this registry when providing the list of available map types within controls, for example.
   */
  public final static MapTypeRegistry newInstance() {
    return createJso().cast();
  }

  private final static native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.MapTypeRegistry();
  }-*/;

  /**
   * Sets the registry to associate the passed string identifier with the passed MapType.
   * 
   * @param id
   * @param mapType is Object because of limitations of JSO's and interfaces in GWT
   */
  public final native void set(String id, Object mapType) /*-{
    this.set(id, mapType);
  }-*/;

}
