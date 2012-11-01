package com.google.gwt.maps.client.events;

import com.google.gwt.ajaxloader.client.Properties;

/**
 * interface createEvent in {@link MapHandlerRegistration} using generics
 * 
 * @param <E>
 */
@SuppressWarnings("rawtypes")
// is ugly, but is a cyclic generic type, so suppressed
public interface MapEventFormatter<E extends MapEvent> {
	public E createEvent(Properties properties);
}
