package com.google.gwt.maps.client.placelib;

import java.util.ArrayList;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.placeslib.AutocompleteOptions;
import com.google.gwt.maps.client.placeslib.AutocompleteType;

public class AutocompleteOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				AutocompleteOptions o = AutocompleteOptions.newInstance();
				finishTest();
			}
		});
	}

	public void testBounds() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				AutocompleteOptions o = AutocompleteOptions.newInstance();
				LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
				LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
				LatLngBounds left = LatLngBounds.newInstance(sw, ne);
				o.setBounds(left);
				LatLngBounds right = o.getBounds();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

	public void testTypes() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.PLACES);
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				AutocompleteOptions o = AutocompleteOptions.newInstance();
				AutocompleteType[] left = new AutocompleteType[2];
				left[0] = AutocompleteType.ESTABLISHMENT;
				left[1] = AutocompleteType.GEOCODE;
				o.setTypes(left);
				AutocompleteType[] right = o.getTypes();
				assertEquals(left.length, right.length);
				assertEquals(left[0].value(), right[0].value());
				finishTest();
			}
		});
	}

	public void testTypes2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				AutocompleteOptions o = AutocompleteOptions.newInstance();
				AutocompleteType left = AutocompleteType.ESTABLISHMENT;
				o.setTypes(left);
				AutocompleteType[] right = o.getTypes();
				assertEquals(left.value(), right[0].value());
				finishTest();
			}
		});
	}

}
