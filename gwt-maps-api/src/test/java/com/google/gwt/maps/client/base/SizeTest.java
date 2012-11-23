package com.google.gwt.maps.client.base;

import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class SizeTest extends AbstractMapsGWTTest {

	public static final double MOCK_H = 100d;
	public static final double MOCK_W = 250d;

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testEqual() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				Size left = Size.newInstance(MOCK_H, MOCK_W);
				Size right = Size.newInstance(MOCK_H, MOCK_W);
				boolean b = left.equals(right);
				assertEquals(true, b);
				finishTest();
			}
		});
	}

	public void testHeight() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				double height = MOCK_W;
				Size o = Size.newInstance(MOCK_H, height, "px", "px");
				assertEquals(height, o.getHeight());
				o.setHeight(MOCK_H + 1);
				assertEquals(MOCK_H + 1, o.getHeight());
				finishTest();
			}
		});
	}

	public void testNotEqual() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				Size left = Size.newInstance(101, MOCK_W);
				Size right = Size.newInstance(MOCK_H, MOCK_W);
				boolean b = left.equals(right);
				assertEquals(false, b);
				finishTest();
			}
		});
	}

	public void testToString() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				String hStr = NumberFormat.getFormat("#.#").format(MOCK_H + 1);
				String wStr = NumberFormat.getFormat("#.#").format(MOCK_W);
				String left = "(" + hStr + ", " + wStr + ")"; // oddly trailing
																// zeros are
																// truncated in
																// API toString

				Size right = Size.newInstance(MOCK_H + 1, MOCK_W);
				assertEquals(left, right.getToString());
				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				Size o = Size.newInstance(MOCK_H, MOCK_W);
				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				Size o = Size.newInstance(MOCK_H, MOCK_W, "px", "px");
				finishTest();
			}
		});
	}

	public void testWidth() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				double width = MOCK_H;
				Size o = Size.newInstance(width, MOCK_W, "px", "px");
				assertEquals(width, o.getWidth());
				o.setWidth(MOCK_W + 1);
				assertEquals(MOCK_W + 1, o.getWidth());
				finishTest();
			}
		});
	}
}
