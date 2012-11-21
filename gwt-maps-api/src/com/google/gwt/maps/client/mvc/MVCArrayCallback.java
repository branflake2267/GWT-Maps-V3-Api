package com.google.gwt.maps.client.mvc;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * handler to process a for each element. Used in iterating array
 * @param <T> generic JavaScriptObject
 */
public interface MVCArrayCallback<T extends JavaScriptObject> {
  public void forEach(T element, int index); 
}
