package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class KmlAuthorTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testEmail() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlAuthor o = KmlAuthor.newInstance();
				String left = "test";
				o.setEmail(left);
				String right = o.getEmail();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testName() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlAuthor o = KmlAuthor.newInstance();
				String left = "test";
				o.setName(left);
				String right = o.getName();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testUri() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlAuthor o = KmlAuthor.newInstance();
				String left = "test";
				o.setUri(left);
				String right = o.getUri();
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
				KmlAuthor o = KmlAuthor.newInstance();
				finishTest();
			}
		});

	}

}
