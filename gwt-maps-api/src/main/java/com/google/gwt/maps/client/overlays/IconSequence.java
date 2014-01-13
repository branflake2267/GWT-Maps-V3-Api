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

/**
 * Describes how icons are to be rendered on a line.<br>
 * 
 * If your polyline is geodesic, then the distances specified for both offset
 * and repeat are calculated in meters by default. Setting either offset or
 * repeat to a pixel value will cause the distances to be calculated in pixels
 * on the screen.<br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#IconSequence"
 * >Symbol API Doc</a>
 */
public class IconSequence extends JavaScriptObject {

	/**
	 * A symbol that can be draw on {@link Polyline}
	 */
	protected IconSequence() {
	}

	/**
	 * A symbol that can be draw on {@link Polyline}
	 * 
	 * @return {@link IconSequence}
	 */
	public final static IconSequence newInstance() {
		return JavaScriptObject.createObject().cast();
	}

	/**
	 * Sets fixed rotation. If <code>true</code>, each icon in the sequence has
	 * the same fixed rotation regardless of the angle of the edge on which it
	 * lies. Defaults to <code>false</code>, in which case each icon in the
	 * sequence is rotated to align with its edge.
	 * 
	 * @param fixedRotation
	 */
	public final native void setFixedRotation(boolean fixedRotation) /*-{
		this.fixedRotation = fixedRotation;
	}-*/;

	/**
	 * Sets fixed rotation state.
	 */
	public final native boolean getFixedRotation() /*-{
    	return this.fixedRotation;
  	}-*/;

	/**
	 * Set the icon to render on the line.
	 * 
	 * @param symbol
	 */
	public final native void setIcon(Symbol symbol) /*-{
		this.icon = symbol;
	}-*/;

	/**
	 * Get the icon to render on the line.
	 */
	public final native Symbol getIcon() /*-{
		return this.icon;
	}-*/;

	/**
	 * Set the distance from the start of the line at which an icon is to be
	 * rendered. This distance may be expressed as a percentage of line's length
	 * (e.g. '50%') or in pixels (e.g. '50px'). Defaults to '100%
	 * 
	 * @param offset
	 */
	public final native void setOffset(String offset) /*-{
		this.offset = offset;
	}-*/;

	/**
	 * Get the distance from the start of the line at which an icon is to be
	 * rendered.
	 */
	public final native String getOffset() /*-{
		return this.offset;
	}-*/;

	/**
	 * Set the distance between consecutive icons on the line. This distance may
	 * be expressed as a percentage of the line's length (e.g. '50%') or in
	 * pixels (e.g. '50px'). To disable repeating of the icon, specify '0'.
	 * Defaults to '0'.
	 * 
	 * @param offset
	 */
	public final native void setRepeat(String repeat) /*-{
		this.repeat = repeat;
	}-*/;

	/**
	 * Get the distance from the start of the line at which an icon is to be
	 * rendered.
	 */
	public final native String getRepeat() /*-{
		return this.repeat;
	}-*/;
}
