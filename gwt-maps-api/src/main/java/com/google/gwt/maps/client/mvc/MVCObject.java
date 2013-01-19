package com.google.gwt.maps.client.mvc;

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

import java.util.HashMap;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class implementing KVO. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MVCObject">MVCObject API Doc</a>
 */
public class MVCObject<T extends JavaScriptObject> extends JavaScriptObject {

  /**
   * Base class implementing KVO. use newInstance();
   */
  protected MVCObject() {
  }

  /**
   * (Main purpose is for internal use only) <br>
   * create instance of MVCObject (inherited class)
   */
  public final static <T extends JavaScriptObject> MVCObject<T> createInstanceOfMVCObject() {
    return createJsoMvcObject().cast();
  }

  /**
   * Binds a View to a Model.
   */
  private final static native JavaScriptObject createJsoMvcObject() /*-{
    return $wnd.google.maps.MVCObject();
  }-*/;

  /**
   * Binds a View to a Model.
   * 
   * @param key
   * @param target
   */
  public final native void bindTo(String key, MVCObject<T> target) /*-{
    this.bindTo(key, target);
  }-*/;

  /**
   * Binds a View to a Model.
   * 
   * @param key
   * @param target
   * @param targetKey
   */
  public final native void bindTo(String key, MVCObject<T> target, String targetKey) /*-{
    this.bindTo(key, target, targetKey);
  }-*/;

  /**
   * Binds a View to a Model.
   * 
   * @param key
   * @param target
   * @param targetKey
   * @param noNotify
   */
  public final native void bindTo(String key, MVCObject<T> target, String targetKey, boolean noNotify) /*-{
    this.bindTo(key, target, targetKey, noNotify);
  }-*/;

  /**
   * Generic handler for state changes. Override this in derived classes to handle arbitrary state changes.
   * 
   * @param key
   */
  public final native void changed(String key) /*-{
    this.changed(key);
  }-*/;

  /**
   * Gets a value.
   * 
   * @param key
   */
  public final native T get(String key) /*-{
    return this.get(key);
  }-*/;

  /**
   * Notify all observers of a change on this property. This notifies both objects that are bound to the object's
   * property as well as the object that it is bound to.
   * 
   * @param key
   */
  public final native void notify(String key) /*-{
    this.notify(key);
  }-*/;

  /**
   * Sets a value.
   * 
   * @param key
   * @param value
   */
  public final native void set(String key, T value) /*-{
    this.set(key, value);
  }-*/;

  /**
   * Sets a collection of key-value pairs.
   * 
   * @param values
   */
  public final native void setValues(HashMap<String, String> values) /*-{
    this.setValues(values);
  }-*/;

  /**
   * Removes a binding. Unbinding will set the unbound property to the current value. The object will not be notified,
   * as the value has not changed.
   * 
   * @param key
   */
  public final native void unbind(String key) /*-{
    this.unbind(key);
  }-*/;

  /**
   * Removes all bindings.
   */
  public final native void unbindAll() /*-{
    this.unbindAll();
  }-*/;

}
