package com.google.gwt.maps.client.panoramio;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.panoramiolib.PanoramioFeature;

public class PanoramioFeatureTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PANORAMIO };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PanoramioFeature o = PanoramioFeature.newInstance();
				finishTest();
			}
		});

	}

	public void testAuthor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PanoramioFeature o = PanoramioFeature.newInstance();
				String left = "test";
				o.setAuthor(left);
				String right = o.getAuthor();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testPhotoId() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PanoramioFeature o = PanoramioFeature.newInstance();
				String left = "test";
				o.setPhotoId(left);
				String right = o.getPhotoId();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testTitle() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PanoramioFeature o = PanoramioFeature.newInstance();
				String left = "test";
				o.setTitle(left);
				String right = o.getTitle();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testUrl() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PanoramioFeature o = PanoramioFeature.newInstance();
				String left = "test";
				o.setUrl(left);
				String right = o.getUrl();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testUserId() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PanoramioFeature o = PanoramioFeature.newInstance();
				String left = "userIdTest";
				o.setUserId(left);
				String right = o.getUserId();
				assertEquals(left, right);
				finishTest();
			}
		});

	}
}
