package com.google.gwt.maps.client.events;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Inherit this into unique Map Event
 *
 * @param <H> {@link extends MapHandler}
 * @param <E> {@link extends MapEvent}
 */
public abstract class MapEvent<H extends MapHandler<E>, E> extends GwtEvent<H> {

  /**
   * properties from the map event call back
   * {@link com.google.gwt.ajaxloader.client.Properties}
   */
  protected Properties properties;

  /**
   * create a new map event
   * @param properties
   */
  public MapEvent(Properties properties) {
    this.properties = properties;
  }

  /**
   * get the raw properties
   * @return {@link com.google.gwt.ajaxloader.client.Properties}
   */
  public Properties getProperties() {
    return properties;
  }

  /**
   * implement in the event that inherits this
   */
  @Override
  public abstract Type<H> getAssociatedType();

  /**
   * implement in the event that inherits this
   */
  @Override
  protected abstract void dispatch(H handler);

  /**
   * get property object as json
   * @param jso
   * @return
   */
  protected native String getAsJson(JavaScriptObject jso) /*-{
    return jso.toSource ? jso.toSource() : "NO SOURCE";
  }-*/;
  
}
