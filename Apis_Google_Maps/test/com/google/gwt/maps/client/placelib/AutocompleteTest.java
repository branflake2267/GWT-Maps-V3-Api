package com.google.gwt.maps.client.placelib;

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.events.place.PlaceChangeMapEvent;
import com.google.gwt.maps.client.events.place.PlaceChangeMapHandler;
import com.google.gwt.maps.client.placeslib.Autocomplete;
import com.google.gwt.maps.client.placeslib.AutocompleteOptions;
import com.google.gwt.maps.client.placeslib.AutocompleteType;
import com.google.gwt.maps.client.placeslib.PlaceResult;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class AutocompleteTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				HTML html = new HTML();
				Element htmlElement = html.getElement();
				AutocompleteOptions options = AutocompleteOptions.newInstance();
				Autocomplete o = Autocomplete.newInstance(htmlElement, options);
				finishTest();
			}
		});
	}

	public void testBounds() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				HTML tb = new HTML();
				Element textBoxElement = tb.getElement();
				AutocompleteOptions options = AutocompleteOptions.newInstance();
				LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
				LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
				LatLngBounds left = LatLngBounds.newInstance(sw, ne);
				options.setBounds(left);

				Autocomplete o = Autocomplete.newInstance(textBoxElement,
						options);

				assertEquals(left.getToString(), o.getBounds().getToString());

				LatLng sw2 = LatLng.newInstance(-32.203405d, 125.244141d);
				LatLng ne2 = LatLng.newInstance(-26.363882d, 131.044922d);
				LatLngBounds left2 = LatLngBounds.newInstance(sw2, ne2);
				o.setBounds(left2);

				assertEquals(left2.getToString(), o.getBounds().getToString());

				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testPlace() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				HTML html = new HTML();
				RootPanel.get().add(html);
				Element htmlElement = html.getElement();
				AutocompleteOptions options = AutocompleteOptions.newInstance();
				LatLng sw = LatLng.newInstance(-33.8902, 151.1759);
				LatLng ne = LatLng.newInstance(-33.8474, 151.2631);
				LatLngBounds left = LatLngBounds.newInstance(sw, ne);
				options.setBounds(left);

				final Autocomplete o = Autocomplete.newInstance(htmlElement,
						options);

				o.addPlaceChangeHandler(new PlaceChangeMapHandler() {
					@Override
					public void onEvent(PlaceChangeMapEvent event) {

						PlaceResult placeresult = o.getPlace();

						// TODO use trigger?
						// finishTest();
					}
				});

				finishTest();
			}
		});
	}

	public void testTypes() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				HTML tb = new HTML();
				Element textBoxElement = tb.getElement();
				AutocompleteOptions options = AutocompleteOptions.newInstance();

				AutocompleteType[] types = new AutocompleteType[2];
				types[0] = AutocompleteType.ESTABLISHMENT;
				types[1] = AutocompleteType.GEOCODE;
				options.setTypes(types);

				Autocomplete o = Autocomplete.newInstance(textBoxElement,
						options);

				o.setTypes(types);

				// TODO maybe call it good just that it works?

				finishTest();
			}
		});
	}

}
