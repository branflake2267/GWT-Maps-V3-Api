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

/**
 * Built-in symbol paths.
 */
public enum SymbolPath {

	/**
	 * A circle.
	 */
	CIRCLE(0),

	/**
	 * A forward-pointing closed arrow.
	 */
	FORWARD_CLOSED_ARROW(1),

	/**
	 * A forward-pointing open arrow.
	 */
	FORWARD_OPEN_ARROW(2),

	/**
	 * A backward-pointing closed arrow.
	 */
	BACKWARD_CLOSED_ARROW(3),

	/**
	 * A backward-pointing open arrow.
	 */
	BACKWARD_OPEN_ARROW(4);


	private int value;

	SymbolPath(final int value) {
		this.value = value;
	}

	/**
	 * Get the ordinal value of the enum
	 * 
	 * @return ordinal
	 */
	public int value() {
		return value;
	}

	/**
	 * Reconstruct from ordinal value
	 * 
	 * @param value
	 * @return null if no match
	 */
	public static SymbolPath fromValue(final int value) {
		SymbolPath r = null;
		switch (value) {
		case 0:
			r = CIRCLE;
			break;
		case 1:
			r = FORWARD_CLOSED_ARROW;
			break;
		case 2:
			r = FORWARD_OPEN_ARROW;
			break;
		case 3:
			r = BACKWARD_CLOSED_ARROW;
			break;
		case 4:
			r = BACKWARD_OPEN_ARROW;
			break;
		}
		return r;
	}

	/**
	 * return the enum Type as a String
	 */
	@Override
	public String toString() {
		return name();
	}

}
