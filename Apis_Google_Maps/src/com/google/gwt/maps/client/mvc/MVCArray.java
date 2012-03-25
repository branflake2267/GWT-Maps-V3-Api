package com.google.gwt.maps.client.mvc;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.insertat.InsertAtEventFormatter;
import com.google.gwt.maps.client.events.insertat.InsertAtMapHandler;
import com.google.gwt.maps.client.events.removeat.RemoveAtEventFormatter;
import com.google.gwt.maps.client.events.removeat.RemoveAtMapHandler;
import com.google.gwt.maps.client.events.setat.SetAtEventFormatter;
import com.google.gwt.maps.client.events.setat.SetAtMapHandler;

/**
 * This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#MVCArray}
 */
public class MVCArray<T extends JavaScriptObject> extends MVCObject<T> {
  
  /**
   * This class extends MVCObject.
   * use newInstance();
   */
  protected MVCArray() {}
  
  /**
   * A mutable MVC Array.
   * @param array
   * @return
   */
  public final static <T extends JavaScriptObject> MVCArray<T> newInstance() {
    return createJso().cast();
  }
  
  /**
   * A mutable MVC Array.
   * @param array
   * @return
   */
  public final static <T extends JavaScriptObject> MVCArray<T> newInstance(JsArray<T> array) {
    if (array == null) {
      return null;
    }
    return createJso(array).cast();
  }
  
  /**
   * A mutable MVC Array.  
   * @param array one ore more objects (like T[] or T)
   * @return
   */
  public final static <T extends JavaScriptObject> MVCArray<T> newInstance(T... array) {
    if (array == null) {
      return null;
    }
    JsArray<T> a = ArrayHelper.toJsArray(array);
    return createJso(a).cast();
  }
  
  private final static native <T extends JavaScriptObject> JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.MVCArray();
  }-*/;

  private final static native <T extends JavaScriptObject> JavaScriptObject createJso(JsArray<T> array) /*-{
    return new $wnd.google.maps.MVCArray(array);
  }-*/;

  /**
   * Removes all elements from the array.
   */
  public final native void clear() /*-{
    this.clear();
  }-*/;
  
  /**
   * Iterate over each element, calling the provided callback. The callback is called for each element like: callback(element, index).
   * @param callback
   */
  public final void forEach(MVCArrayCallback<T> callback) {
    onCallback(callback);
  };
    
  /**
   * used to process for each 
   * @param callback
   */
  private final native void onCallback(MVCArrayCallback<T> callback) /*-{
    var cb = function(element, index) {
       @com.google.gwt.maps.client.mvc.MVCArray::forEachImplCallback(Lcom/google/gwt/core/client/JavaScriptObject;ILcom/google/gwt/maps/client/mvc/MVCArrayCallback;)(element, index, callback);
    };
    this.forEach(cb);
  }-*/;
  
  /**
   * send it to the callback interface
   * @param element
   * @param index
   * @param callback
   */
  private static final <T extends JavaScriptObject> void forEachImplCallback(T element, int index, MVCArrayCallback<T> callback) {
    callback.forEach(element, index);
  }
  
  /**
   * Returns a reference to the underlying Array. Warning: if the Array is mutated, no events will be fired by this object.
   * @return
   */
  public final native JsArray<T> getArray() /*-{
    return this.getArray();
  }-*/;
  
  /**
   * Get an element at the specified index.
   * @param index
   * @return
   */
  public final native T get(int index) /*-{
    return this.getAt(index);
  }-*/;
  
  /**
   * Returns the number of elements in this array.
   * @return
   */
  public final native int getLength() /*-{
    return this.getLength();
  }-*/;
  
  /**
   * Inserts an element at the specified index.
   * @param index
   * @param element
   */
  public final native void insertAt(int index, T element) /*-{
    this.insertAt(index, element);
  }-*/;
  
  /**
   * Removes the last element of the array and returns that element.
   * @return the element that was popped
   */
  public final native T pop() /*-{
    return this.pop();
  }-*/;
  
  /**
   * Adds one element to the end of the array and returns the new length of the array.
   * @param element
   * @return length of array
   */
  public final native int push(T element) /*-{
    return this.push(element);
  }-*/;
  
  /**
   * Removes an element from the specified index.
   * @param index
   * @return
   */
  public final native T removeAt(int index) /*-{
    return this.removeAt(index);
  }-*/;
  
  /**
   * Sets an element at the specified index.
   * @param index
   * @param element
   */
  public final native void setAt(int index, T element) /*-{
    this.setAt(index, element);
  }-*/;

  /**
   * This event is fired when insertAt() is called. The event passes the index that was passed to insertAt().
   * @param handler
   * @return
   */
  public final HandlerRegistration addInsertAtHandler(InsertAtMapHandler handler) {
    return MapHandlerRegistration.addHandlerMvc(this, MapEventType.INSERT_AT, handler, new InsertAtEventFormatter());
  }
  
  /**
   * This event is fired when removeAt() is called. The event passes the index that was passed to removeAt() and the element that was removed from the array.
   * @param handler
   * @return
   */
  public final HandlerRegistration addRemoveAtHandler(RemoveAtMapHandler handler) {
    return MapHandlerRegistration.addHandlerMvc(this, MapEventType.REMOVE_AT, handler, new RemoveAtEventFormatter());
  }
  
  /**
   * This event is fired when setAt() is called. The event passes the index that was passed to setAt() and the element that was previously in the array at that index.
   * @param handler
   * @return
   */
  public final HandlerRegistration addSetAtHandler(SetAtMapHandler handler) {
    return MapHandlerRegistration.addHandlerMvc(this, MapEventType.SET_AT, handler, new SetAtEventFormatter());
  }
  
}
