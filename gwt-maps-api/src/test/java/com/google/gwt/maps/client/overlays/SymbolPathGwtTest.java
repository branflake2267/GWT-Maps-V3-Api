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

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class SymbolPathGwtTest extends AbstractMapsGWTTestHelper {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				@SuppressWarnings("unused")
				final SymbolPath path = SymbolPath.BACKWARD_CLOSED_ARROW;

				finishTest();
			}
		});
	}

	public void testAllValues() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				for (final SymbolPath path : SymbolPath.values()) {
					final int value = path.value();
					final SymbolPath actual = SymbolPath.fromValue(value);
					assertEquals("Wrong value", path, actual);
				}

				finishTest();
			}
		});
	}

}
