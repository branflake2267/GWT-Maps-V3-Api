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
import com.google.gwt.maps.client.base.Point;

public class SymbolGwtTest extends AbstractMapsGWTTestHelper {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				final double scale = 1d;
				final SymbolPath symbolPath = SymbolPath.BACKWARD_CLOSED_ARROW;
				final Symbol actual = Symbol.newInstance(symbolPath, scale);

				// test
				assertNotNull("Object not created", actual);
				assertEquals("Wrong scaling", scale, actual.getScale());
				assertEquals("Wrong icon", symbolPath.value(), actual.getPath());

				finishTest();
			}
		});
	}

	public void testAnchor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final double scale = 1d;
				final SymbolPath symbolPath = SymbolPath.BACKWARD_CLOSED_ARROW;
				final Symbol symbol = Symbol.newInstance(symbolPath, scale);

				final Point expected = Point.newInstance(2, 2);
				symbol.setAnchor(expected);

				final Point actual = symbol.getAnchor();
				assertEquals("Wrong anchor", expected.toString(), actual.toString());

				finishTest();
			}
		});
	}

	public void testPath_SvgPath() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final double scale = 1d;
				final SymbolPath symbolPath = SymbolPath.BACKWARD_CLOSED_ARROW;
				final Symbol symbol = Symbol.newInstance(symbolPath, scale);

				final String expected = "M 125,5 155,90 245,90 175,145 200,230 125,180 50,230 75,145 5,90 95,90 z";
				symbol.setPath(expected);

				final String actual = symbol.getPath();
				assertEquals("Wrong svg path", expected, actual);

				finishTest();
			}
		});
	}

	public void testPath_SymbolPath() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final double scale = 1d;
				final SymbolPath symbolPath = SymbolPath.BACKWARD_CLOSED_ARROW;
				final Symbol symbol = Symbol.newInstance(symbolPath, scale);

				final SymbolPath expected = SymbolPath.CIRCLE;
				symbol.setPath(expected);

				final String actual = symbol.getPath();
				assertEquals("Wrong predefined path", expected, actual);

				finishTest();
			}
		});
	}

	public void testRotation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final double scale = 1d;
				final SymbolPath symbolPath = SymbolPath.BACKWARD_CLOSED_ARROW;
				final Symbol symbol = Symbol.newInstance(symbolPath, scale);

				final double expected = 35;
				symbol.setRotation(expected);

				final double actual = symbol.getRotation();
				assertEquals("Wrong rotation	", expected, actual);

				finishTest();
			}
		});
	}

	public void testScale() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final double scale = 1d;
				final SymbolPath symbolPath = SymbolPath.BACKWARD_CLOSED_ARROW;
				final Symbol symbol = Symbol.newInstance(symbolPath, scale);

				final double expected = 2.5;
				symbol.setScale(expected);

				final double actual = symbol.getScale();
				assertEquals("Wrong scale", expected, actual);

				finishTest();
			}
		});
	}

	public void testFillColor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final double scale = 1d;
				final SymbolPath symbolPath = SymbolPath.BACKWARD_CLOSED_ARROW;
				final Symbol symbol = Symbol.newInstance(symbolPath, scale);

				final String expected = "red";
				symbol.setFillColor(expected);

				final String actual = symbol.getFillColor();
				assertEquals("Wrong fill color", expected, actual);

				finishTest();
			}
		});
	}

	public void testFillOpactity() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final double scale = 1d;
				final SymbolPath symbolPath = SymbolPath.BACKWARD_CLOSED_ARROW;
				final Symbol symbol = Symbol.newInstance(symbolPath, scale);

				final double expected = 0.5d;
				symbol.setFillOpacity(expected);

				final double actual = symbol.getFillOpacity();
				assertEquals("Wrong fill opacity", expected, actual);

				finishTest();
			}
		});
	}

	public void testStrokeColor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final double scale = 1d;
				final SymbolPath symbolPath = SymbolPath.BACKWARD_CLOSED_ARROW;
				final Symbol symbol = Symbol.newInstance(symbolPath, scale);

				final String expected = "red";
				symbol.setStrokeColor(expected);

				final String actual = symbol.getStrokeColor();
				assertEquals("Wrong stroke color", expected, actual);

				finishTest();
			}
		});
	}

	public void testStrokeOpacity() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				final double scale = 1d;
				final SymbolPath symbolPath = SymbolPath.BACKWARD_CLOSED_ARROW;
				final Symbol symbol = Symbol.newInstance(symbolPath, scale);

				final double expected = .5d;
				symbol.setStrokeOpacity(expected);

				final double actual = symbol.getStrokeOpacity();
				assertEquals("Wrong stroke opacity", expected, actual);

				finishTest();
			}
		});

	}

	public void testStrokeWeight() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final double scale = 1d;
				final SymbolPath symbolPath = SymbolPath.BACKWARD_CLOSED_ARROW;
				final Symbol symbol = Symbol.newInstance(symbolPath, scale);

				final int expected = 5;
				symbol.setStrokeWeight(expected);

				final int actual = symbol.getStrokeWeight();
				assertEquals("Wrong stroke weight", expected, actual);

				finishTest();
			}
		});

	}

}
