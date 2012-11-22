package com.google.gwt.maps.client.adsense;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.controls.ControlPosition;

public class AdUnitOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testAdFormat() {

		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				AdUnitOptions o = AdUnitOptions.newInstance();
				AdFormat left = AdFormat.BANNER;
				o.setFormat(left);
				AdFormat right = o.getFormat();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testChannel() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				AdUnitOptions o = AdUnitOptions.newInstance();
				String left = "test";
				o.setChannelNumber(left);
				String right = o.getChannelNumber();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testPosition() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				AdUnitOptions o = AdUnitOptions.newInstance();
				ControlPosition left = ControlPosition.TOP_CENTER;
				o.setPosition(left);
				ControlPosition right = o.getPosition();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testPublisherId() {

		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				AdUnitOptions o = AdUnitOptions.newInstance();
				String left = "test";
				o.setPublisherId(left);
				String right = o.getPublisherId();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testUse() {

		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				AdUnitOptions o = AdUnitOptions.newInstance();
				finishTest();
			}
		});
	}

}
