package com.google.gwt.maps.client.events;

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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.events.mapchange.MapChangeEventFormatter;

public class MapHandlerRegistration {

  /**
   * event handler
   * 
   * @param jso
   * @param eventType
   * @param handler
   * @param formatter
   */
  @SuppressWarnings("rawtypes")
  // is ugly, but is a cyclic generic type, so suppressed
  public static <E extends MapEvent> HandlerRegistration addHandler(JavaScriptObject jso, MapEventType eventType,
      MapHandler<E> handler, MapEventFormatter<E> formatter) {
    final JavaScriptObject listener = addHandlerImpl(jso, eventType.value(), handler, formatter);
    HandlerRegistration registration = new HandlerRegistration() {
      @Override
      public void removeHandler() {
        removeHandlerImpl(listener);
      }
    };
    return registration;
  }

  /**
   * event handler for the mvc object
   * 
   * @param jso
   * @param eventType
   * @param handler
   * @param formatter
   */
  @SuppressWarnings("rawtypes")
  // is ugly, but is a cyclic generic type, so suppressed
  public static <E extends MapEvent> HandlerRegistration addHandlerMvc(JavaScriptObject jso, MapEventType eventType,
      MapHandler<E> handler, MapEventFormatter<E> formatter) {
    final JavaScriptObject listener = addHandlerImplMvc(jso, eventType.value(), handler, formatter);
    HandlerRegistration registration = new HandlerRegistration() {
      @Override
      public void removeHandler() {
        removeHandlerImpl(listener);
      }
    };
    return registration;
  }

  /**
   * event handler for the drawing overlay objects
   * 
   * @param jso
   * @param eventType
   * @param handler
   * @param formatter
   */
  @SuppressWarnings("rawtypes")
  // is ugly, but is a cyclic generic type, so suppressed
  public static <E extends MapEvent> HandlerRegistration addHandlerDrawing(JavaScriptObject jso,
      MapEventType eventType, MapHandler<E> handler, MapEventFormatter<E> formatter) {

    final JavaScriptObject listener = addHandlerImplDrawing(jso, eventType.value(), handler, formatter);
    HandlerRegistration registration = new HandlerRegistration() {
      @Override
      public void removeHandler() {
        removeHandlerImpl(listener);
      }
    };
    return registration;
  }

  /**
   * process the callback and send it to the handler
   * 
   * @param jso
   * @param eventName
   * @param handler
   * @param formatter
   */
  @SuppressWarnings("rawtypes")
  // is ugly, but is a cyclic generic type, so suppressed
  private static native <E extends MapEvent> JavaScriptObject addHandlerImpl(JavaScriptObject jso, String eventName,
      MapHandler<E> handler, MapEventFormatter<E> formatter) /*-{
    var callback = function(event) {
      $entry(@com.google.gwt.maps.client.events.MapHandlerRegistration::onCallback(Lcom/google/gwt/maps/client/events/MapHandler;Lcom/google/gwt/ajaxloader/client/Properties;Lcom/google/gwt/maps/client/events/MapEventFormatter;)(handler, event, formatter));
    };
    return $wnd.google.maps.event.addListener(jso, eventName, callback)
  }-*/;

  /**
   * process the callback and send it to the handler
   * 
   * @param jso
   * @param eventName
   * @param handler
   * @param formatter
   */
  @SuppressWarnings("rawtypes")
  // is ugly, but is a cyclic generic type, so suppressed
  private static native <E extends MapEvent> JavaScriptObject addHandlerImplMvc(JavaScriptObject jso, String eventName,
      MapHandler<E> handler, MapEventFormatter<E> formatter) /*-{
    var callback = function(event) {
      var eventCon = {
        index : event
      };
      $entry(@com.google.gwt.maps.client.events.MapHandlerRegistration::onCallback(Lcom/google/gwt/maps/client/events/MapHandler;Lcom/google/gwt/ajaxloader/client/Properties;Lcom/google/gwt/maps/client/events/MapEventFormatter;)(handler, eventCon, formatter));
    };
    return $wnd.google.maps.event.addListener(jso, eventName, callback)
  }-*/;

  /**
   * drawing sends events partly with different signature or arguments.
   * 
   * @param jso
   * @param eventName
   * @param handler
   * @param formatter
   */
  @SuppressWarnings("rawtypes")
  // is ugly, but is a cyclic generic type, so suppressed
  private static native <E extends MapEvent> JavaScriptObject addHandlerImplDrawing(JavaScriptObject jso,
      String eventName, MapHandler<E> handler, MapEventFormatter<E> formatter) /*-{
    var callback = function(event) {
      var eventCon = {
        overlay : event
      };
      $entry(@com.google.gwt.maps.client.events.MapHandlerRegistration::onCallback(Lcom/google/gwt/maps/client/events/MapHandler;Lcom/google/gwt/ajaxloader/client/Properties;Lcom/google/gwt/maps/client/events/MapEventFormatter;)(handler, eventCon, formatter));
    };
    return $wnd.google.maps.event.addListener(jso, eventName, callback)
  }-*/;

  /**
   * HandlerRegistration call when finished
   * 
   * @param listener
   */
  private static native void removeHandlerImpl(JavaScriptObject listener) /*-{
    $wnd.google.maps.event.removeListener(listener);
  }-*/;

  /**
   * process generic handler callback
   * 
   * @param handler
   * @param properties
   * @param formatter
   */
  @SuppressWarnings("rawtypes")
  // is ugly, but is a cyclic generic type, so suppressed
  protected static <E extends MapEvent> void onCallback(final MapHandler<E> handler, final Properties properties,
      final MapEventFormatter<E> formatter) {
    try {
      formatEvent(handler, properties, formatter);
    } catch (Throwable x) {
      GWT.getUncaughtExceptionHandler().onUncaughtException(x);
    }
  }

  /**
   * create a map event
   * 
   * @param handler
   * @param properties
   * @param formatter
   */
  @SuppressWarnings("rawtypes")
  // is ugly, but is a cyclic generic type, so suppressed
  private static <E extends MapEvent> void formatEvent(MapHandler<E> handler, Properties properties,
      MapEventFormatter<E> formatter) {
    E event = formatter.createEvent(properties);
    handler.onEvent(event);
  }

  /**
   * Triggers the given event. All arguments after eventName are passed as arguments to the listeners. <br>
   * <b>Note:</b> Use Marker in objects to click on.
   * 
   * @param w
   * @param eventType
   * @param objects
   */
  public static void trigger(MapWidget w, MapEventType eventType, JavaScriptObject... objects) {
    JsArray<JavaScriptObject> a = ArrayHelper.toJsArray(objects);
    triggerImpl(w, eventType.value(), a);
  }

  private static native void triggerImpl(MapWidget w, String eventName, JsArray<JavaScriptObject> args) /*-{
    var jso = w.@com.google.gwt.maps.client.MapWidget::getJso()();
    $wnd.google.maps.event.trigger(jso, eventName, args);
  }-*/;

  /**
   * Triggers the given event. All arguments after eventName are passed as arguments to the listeners. <br>
   * <b>Note:</b> Use Marker in objects to click on.
   * 
   * @param w
   * @param eventType
   */
  public static void trigger(MapWidget w, MapEventType eventType) {
    triggerImpl(w, eventType.value());
  }

  private static native void triggerImpl(MapWidget w, String eventName) /*-{
    var jso = w.@com.google.gwt.maps.client.MapWidget::getJso()();
    $wnd.google.maps.event.trigger(jso, eventName);
  }-*/;

  /**
   * experimental for the moment. I'm not satisfied as of yet with this strategy.
   * 
   * Cross browser event handler registration. This listener is removed by calling removeListener(handle) for the handle
   * that is returned by this function.
   * 
   * @param jso
   * @param type
   * @param handler
   * @param capture
   */
  public static <E> void addDomListener(JavaScriptObject jso,
      com.google.gwt.event.dom.client.DomEvent.Type<ClickHandler> type, MapHandler<E> handler, boolean capture) {
    addDomListener(jso, type.getName(), handler, capture);
  }

  private static native <E> void addDomListener(JavaScriptObject object, String eventName, MapHandler<?> handler,
      boolean capture) /*-{
    var callback = function(event) {
      @com.google.gwt.maps.client.events.MapHandlerRegistration::addDomListenerImpl(Lcom/google/gwt/ajaxloader/client/Properties;Lcom/google/gwt/maps/client/events/MapHandler;)(event, handler)
    };
    $wnd.google.maps.event.addDomListener(object, eventName, callback, capture);
  }-*/;

  @SuppressWarnings("rawtypes")
  // is ugly, but is a cyclic generic type, so suppressed
  private static void addDomListenerImpl(Properties properties, MapHandler<MapEvent> handler) {
    MapChangeEventFormatter formatter = new MapChangeEventFormatter();
    handler.onEvent(formatter.createEvent(properties));
  }

}
