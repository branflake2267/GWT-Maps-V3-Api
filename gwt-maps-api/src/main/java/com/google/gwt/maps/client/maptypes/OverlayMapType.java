package com.google.gwt.maps.client.maptypes;

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
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.maptypes.MapType;

/**
 * A bare-minimum version of the {@link MapType} interface,
 * suitable to be used as an overlay over a base map type.
 * Generates tile elements based on tile coordinates and zoom
 * level, and optionally performs cleanup on these elements
 * once they have been removed from the map.
 * 
 * <p>To convert an implementation of this interface into a
 * {@link JavaScriptObject} which can be added to the map,
 * use {@link OverlayMapType.JsoWrapper#create(OverlayMapType, Size)}.
 * 
 * @see MapWidget#getOverlayMapTypes()
 * @see OverlayMapType.JsoWrapper#create(OverlayMapType, Size)
 *
 */
public interface OverlayMapType {
	
	/**
	 * Returns a tile for the given tile
	 * coordinate (x, y) and zoom level.
	 * This tile will be appended to the
	 * given owner {@link Document}.
	 * 
	 * @param x the tile x coordinate at which the element will be positioned
	 * @param y the tile y coordinate at which the element will be positioned
	 * @param zoom the zoom level at which the element will be displayed
	 * @param owner the document to which the element will be attached
	 * @return a DOM element to be displayed as a tile on the map
	 */
	Element getTile(int x, int y, int zoom, Document owner);
	
	/**
	 * Releases the given tile, performing any necessary cleanup. The provided
	 * tile will have already been removed from the document.
	 * 
	 * <p>The above is taken from the official API documentation; in fact as of
	 * v3.13 the element is still attached at the time this method is called.
	 * If an exception should be raised at this point the element will be 'leaked',
	 * and remain attached to the map indefinitely.
	 * 
	 * @param tile the tile that is being removed from the map
	 */
	void releaseTile(Node tile);
	
	/**
	 * Use {@link #create(OverlayMapType, Size)} to wrap an
	 * {@link OverlayMapType} implementation so that it can be
	 * added to a map.
	 *
	 */
	public class JsoWrapper {
		
		/**
		 * Wraps an implementation of {@link OverlayMapType} with
		 * a native {@link JavaScriptObject}, so that it can be added
		 * to a map via {@link MapWidget#getOverlayMapTypes()}.
		 * 
		 * <p>A {@link Size} object must be provided along with the
		 * <code>OverlayMapType</code> implementation, which the map
		 * will use for requesting and laying out tiles. Therefore
		 * tiles created by the overlay should conform to this size.
		 * 
		 * @param overlay an overlay map type
		 * @param tileSize the size of the tiles that the overlay will generate
		 * @return a JSO wrapper for the overlay
		 */
		public static native JavaScriptObject create(OverlayMapType overlay, Size tileSize) /*-{
			if (!$wnd.GwtOverlayMapType) {
				$wnd.GwtOverlayMapType = function (gwtOverlay, tileSize) {
					this.gwtOverlay = gwtOverlay;
					this.tileSize = tileSize;
				}
				
				$wnd.GwtOverlayMapType.prototype.getTile = function (coord, zoom, ownerDocument) {
					return this.gwtOverlay.@com.google.gwt.maps.client.maptypes.OverlayMapType::getTile(IIILcom/google/gwt/dom/client/Document;)(coord.x, coord.y, zoom, ownerDocument);
				}
				
				$wnd.GwtOverlayMapType.prototype.releaseTile = function (tile) {
					this.gwtOverlay.@com.google.gwt.maps.client.maptypes.OverlayMapType::releaseTile(Lcom/google/gwt/dom/client/Node;)(tile);
				}
			}
			
			return new $wnd.GwtOverlayMapType(overlay, tileSize);
		}-*/;
	}
}
