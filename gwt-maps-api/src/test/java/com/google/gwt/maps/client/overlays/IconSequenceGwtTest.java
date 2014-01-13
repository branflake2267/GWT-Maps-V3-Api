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

public class IconSequenceGwtTest extends AbstractMapsGWTTestHelper {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				@SuppressWarnings("unused")
				final IconSequence sequence = IconSequence.newInstance();

				finishTest();
			}
		});
	}

	public void testFixedRotation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				final boolean expected = true;

				final IconSequence sequence = IconSequence.newInstance();
				sequence.setFixedRotation(expected);

				final boolean actual = sequence.getFixedRotation();
				assertEquals("Wrong fixed rotation", expected, actual);

				finishTest();
			}
		});
	}

	public void testIcon() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				final SymbolPath path = SymbolPath.BACKWARD_CLOSED_ARROW;
				final double scale = 1d;
				final Symbol expected = Symbol.newInstance(path, scale);

				final IconSequence sequence = IconSequence.newInstance();
				sequence.setIcon(expected);

				final Symbol actual = sequence.getIcon();
				assertEquals("Wrong symbol", expected, actual);

				finishTest();
			}
		});
	}

	public void testOffset() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				final String expected = "50%";

				final IconSequence sequence = IconSequence.newInstance();
				sequence.setOffset(expected);

				final String actual = sequence.getOffset();
				assertEquals("Wrong offset", expected, actual);

				finishTest();
			}
		});
	}

	public void testRepeat() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				final String expected = "50%";

				final IconSequence sequence = IconSequence.newInstance();
				sequence.setRepeat(expected);

				final String actual = sequence.getRepeat();
				assertEquals("Wrong repeat", expected, actual);

				finishTest();
			}
		});
	}

}
