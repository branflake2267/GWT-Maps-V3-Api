package com.google.gwt.maps.client.overlays;

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
import com.google.gwt.maps.client.base.Point;

/**
 * A symbol that can be draw on {@link Polyline}<br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#Symbol"
 * >Symbol API Doc</a>
 */
public class Symbol extends JavaScriptObject {

	/**
	 * A symbol that can be draw on {@link Polyline}
	 */
	protected Symbol() {
	}

	/**
	 * A symbol that can be draw on {@link Polyline}
	 * @param symbolPath
	 *            predefined {@link SymbolPath} path
	 * @param scale
	 *            value relative to 1.
	 * @return
	 */
	public final static Symbol newInstance(final SymbolPath symbolPath,
			final double scale) {

		final Symbol symbol = JavaScriptObject.createObject().cast();
		symbol.setPath(symbolPath);
		symbol.setScale(scale);
		return symbol;
	}

	/**
	 * A symbol that can be draw on {@link Polyline}
	 * @param svgPath
	 *            path in <a
	 * href="http://www.w3.org/TR/SVG/paths.html#PathData">SVG path
	 * notation</a>
	 * @param scale
	 *            value relative to 1.
	 * @return
	 */
	public final static Symbol newInstance(final String svgPath,
			final double scale) {

		final Symbol symbol = JavaScriptObject.createObject().cast();
		symbol.setPath(svgPath);
		symbol.setScale(scale);
		return symbol;
	}

	/**
	 * Sets the position of the symbol relative to the marker or polyline. The
	 * coordinates of the symbol's path are translated left and up by the
	 * anchor's x and y coordinates respectively. By default, a symbol is
	 * anchored at <code>(0, 0)</code>. The position is expressed in the same
	 * coordinate system as the symbol's path
	 * 
	 * @param anchor
	 */
	public final native void setAnchor(Point anchor) /*-{
    	this.anchor = anchor;
	}-*/;

	/**
	 * Gets The position of the symbol relative to the marker or polyline
	 */
	public final native Point getAnchor() /*-{
    	return this.anchor;
  	}-*/;

	/**
	 * Set the symbol's path to a built-in symbol path. Required.
	 * 
	 * @param symbolPath
	 */
	public final void setPath(final SymbolPath symbolPath) {
		setPathJso(symbolPath.value());
	}

	/**
	 * Set the symbol's path to a built-in symbol path using the ordinal value
	 * 
	 * @param symbolPathOrdinal
	 */
	private final native void setPathJso(int symbolPathOrdinal) /*-{
		this.path = symbolPathOrdinal;
	}-*/;

	/**
	 * Set the symbol's path to a custom path expressed using <a
	 * href="http://www.w3.org/TR/SVG/paths.html#PathData">SVG path
	 * notation</a>. Required.
	 * 
	 * @param path
	 */
	public final native void setPath(String path) /*-{
		this.path = path;
	}-*/;

	/**
	 * Get the symbol's path in SVN Path Notation.
	 * 
	 * @return path as SVG string
	 */
	public final native String getPath() /*-{
		return this.path;
	}-*/;

	/**
	 * Set the angle by which to rotate the symbol, expressed clockwise in
	 * degrees. Defaults to <code>0</code>. A symbol in an {@link IconSequence}
	 * where <code>fixedRotation</code> is <code>false</code> is rotated
	 * relative to the angle of the edge on which it lies.
	 * 
	 * @param rotation
	 */
	public final native void setRotation(double rotation) /*-{
		this.rotation = rotation;
	}-*/;

	/**
	 * Get the symbol's path in SVN Path Notation.
	 * 
	 * @return rotation amount
	 */
	public final native double getRotation() /*-{
		return this.rotation;
	}-*/;

	/**
	 * Sets the symbol's fill color. All CSS3 colors are supported except for
	 * extended named colors. For symbol markers, this defaults to 'black'. For
	 * symbols on polylines, this defaults to the stroke color of the
	 * corresponding polyline.
	 * 
	 * @param fillColor
	 */
	public final native void setFillColor(String fillColor) /*-{
		this.fillColor = fillColor;
	}-*/;

	/**
	 * Get the symbol's fill color.
	 */
	public final native String getFillColor() /*-{
		return this.fillColor;
	}-*/;

	/**
	 * Sets the symbol's fill opacity. Defaults to 0.
	 * 
	 * @param fillOpacity
	 */
	public final native void setFillOpacity(double fillOpacity) /*-{
		this.fillOpacity = fillOpacity;
	}-*/;

	/**
	 * Get the symbol's fill opacity.
	 */
	public final native double getFillOpacity() /*-{
		return this.fillOpacity;
	}-*/;

	/**
	 * Sets the amount by which the symbol is scaled in size. For symbol
	 * markers, this defaults to 1; after scaling, the symbol may be of any
	 * size. For symbols on a polyline, this defaults to the stroke weight of
	 * the polyline; after scaling, the symbol must lie inside a square 22
	 * pixels in size centered at the symbol's anchor.
	 * 
	 * @param scaledSize
	 */
	public final native void setScale(double scale) /*-{
		this.scale = scale;
	}-*/;

	/**
	 * Gets the amount by which the symbol is scaled in size.
	 */
	public final native double getScale() /*-{
		return this.scale;
	}-*/;

	/**
	 * Sets the symbol's stroke color. All CSS3 colors are supported except for
	 * extended named colors. For symbol markers, this defaults to <code>'black'
	 * </code>. For symbols on a polyline, this defaults to the stroke color of
	 * the polyline.
	 * 
	 * @param strokeColor
	 */
	public final native void setStrokeColor(String strokeColor) /*-{
		this.strokeColor = strokeColor;
	}-*/;

	/**
	 * Gets the symbol's stroke color.
	 */
	public final native String getStrokeColor() /*-{
		return this.strokeColor;
	}-*/;

	/**
	 * Sets the symbol's stroke opacity. For symbol markers, this defaults to 1.
	 * For symbols on a polyline, this defaults to the stroke opacity of the
	 * polyline.
	 * 
	 * @param strokeOpacity
	 */
	public final native void setStrokeOpacity(double strokeOpacity) /*-{
		this.strokeOpacity = strokeOpacity;
	}-*/;

	/**
	 * Gets the symbol's stroke opacity.
	 */
	public final native double getStrokeOpacity() /*-{
		return this.strokeOpacity;
	}-*/;

	/**
	 * Set the symbol's stroke weight. Defaults to the scale of the symbol.
	 * 
	 * @param strokeWeight
	 */
	public final native void setStrokeWeight(int strokeWeight) /*-{
		this.strokeWeight = strokeWeight;
	}-*/;

	/**
	 * Get the symbol's stroke weight. Defaults to the scale of the symbol.
	 */
	public final native int getStrokeWeight() /*-{
		return this.strokeWeight;
	}-*/;
}
