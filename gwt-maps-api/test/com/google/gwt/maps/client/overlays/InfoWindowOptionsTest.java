package com.google.gwt.maps.client.overlays;

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.user.client.ui.FlowPanel;

public class InfoWindowOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				InfoWindowOptions o = InfoWindowOptions.newInstance();
				finishTest();
			}
		});

	}

	public void testContent_String() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				InfoWindowOptions o = InfoWindowOptions.newInstance();
				String left = "test123";
				o.setContent(left);
				String right = o.getContent_String();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testContent_Element() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				InfoWindowOptions o = InfoWindowOptions.newInstance();
				FlowPanel fp = new FlowPanel();
				Element left = fp.getElement();
				o.setContent(left);
				Element right = o.getContent_Element();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testDisableAutoPan() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				InfoWindowOptions o = InfoWindowOptions.newInstance();
				boolean left = true;
				o.setDisableAutoPan(left);
				boolean right = o.getDisableAutoPan();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testMaxWidth() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				InfoWindowOptions o = InfoWindowOptions.newInstance();
				int left = 100;
				o.setMaxWidth(left);
				int right = o.getMaxWidth();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testPixelOffset() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				InfoWindowOptions o = InfoWindowOptions.newInstance();
				Size left = Size.newInstance(102d, 203d);
				o.setPixelOffet(left);
				Size right = o.getPixelOffset();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});

	}

	public void testPosition() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				InfoWindowOptions o = InfoWindowOptions.newInstance();
				LatLng left = LatLng.newInstance(35, 38);
				o.setPosition(left);
				LatLng right = o.getPosition();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});

	}

	public void testZindex() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				InfoWindowOptions o = InfoWindowOptions.newInstance();
				int left = 100;
				o.setZindex(left);
				int right = o.getZindex();
				assertEquals(left, right);
				finishTest();
			}
		});

	}
}
