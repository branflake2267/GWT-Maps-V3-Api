package com.google.gwt.maps.client.overlays;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2013 GWT Maps API V3
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
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.mvc.MVCObject;

public abstract class Overlay<T extends JavaScriptObject> extends MVCObject<T> {

	/**
	 * Must declare a protected constructor on
	 * <code>JavaScriptObject</code> subclasses to
	 * keep GWT happy.
	 */
	protected Overlay()
	{}
	
	/**
	 * If set to <code>true</code>, the user can drag
	 * this overlay over the map. The <code>geodesic</code>
	 * property will define the mode of dragging, where
	 * applicable.
	 * 
	 * <p>Defaults to <code>false</code>
	 * 
	 * @param draggable whether the overlay can be dragged by the user
	 */
	public final native void setDraggable(boolean draggable) /*-{
		this.setDraggable(draggable);
	}-*/;
	
	/**
	 * Returns whether this overlay can be dragged by the user
	 * 
	 * @return <code>true</code> if dragging is enabled on this overlay
	 */
	public final native boolean getDraggable() /*-{
		return this.getDraggable();
	}-*/;
	
	/**
	 * Renders this overlay on the specified map. If
	 * map is set to <code>null</code>, the overlay
	 * will be removed.
	 * 
	 * @param map the map on which to display the overlay
	 */
	public final void setMap(MapWidget map) {
		if (map == null)
			setMapImpl( null );
		else
			setMapImpl( map.getJso() );
	}
	
	protected final native void setMapImpl(MapImpl map) /*-{
		this.setMap(map);
	}-*/;
	
	/**
	 * Returns the map on which this overlay is attached.
	 * 
	 * @return the map
	 */
	public final MapWidget getMap() {
		return MapWidget.newInstance( getMapImpl() );
	}
	
	protected final native MapImpl getMapImpl() /*-{
		return this.getMap();
	}-*/;
	
	/**
	 * Hides this overlay if set to <code>false</code>.
	 * 
	 * @param visible visibility of the overlay
	 */
	public final native void setVisible(boolean visible) /*-{
		this.setVisible(visible);
	}-*/;
	
	/**
	 * Returns whether this overlay is visible on the map.
	 * 
	 * @return visibility of the overlay
	 */
	public final native boolean getVisible() /*-{
		return this.getVisible();
	}-*/;
}
