package com.google.gwt.maps.client.placelib;

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

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
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

public class AutocompleteGwtTest extends AbstractMapsGWTTestHelper {

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

        Autocomplete o = Autocomplete.newInstance(textBoxElement, options);

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

        final Autocomplete o = Autocomplete.newInstance(htmlElement, options);

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

        Autocomplete o = Autocomplete.newInstance(textBoxElement, options);

        o.setTypes(types);

        // TODO maybe call it good just that it works?

        finishTest();
      }
    });
  }

}
