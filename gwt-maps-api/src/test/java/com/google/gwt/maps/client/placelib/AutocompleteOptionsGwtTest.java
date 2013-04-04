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

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.placeslib.AutocompleteOptions;
import com.google.gwt.maps.client.placeslib.AutocompleteType;

import java.util.ArrayList;

public class AutocompleteOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[]{LoadLibrary.PLACES};
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

  public void testCompatibleTypes1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AutocompleteOptions options = AutocompleteOptions.newInstance();
        options.setTypes(AutocompleteType.ESTABLISHMENT, AutocompleteType.GEOCODE);
        finishTest();
      }
    });
  }

  public void testCompatibleTypes2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AutocompleteOptions options = AutocompleteOptions.newInstance();
        options.setTypes(AutocompleteType.REGIONS, AutocompleteType.CITIES);
        finishTest();
      }
    });
  }

  public void testCompatibleTypesThrows1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AutocompleteOptions options = AutocompleteOptions.newInstance();
        try {
          options.setTypes(AutocompleteType.ESTABLISHMENT, AutocompleteType.CITIES);
          fail();
        } catch (IllegalArgumentException e) {
        }
        finishTest();
      }
    });
  }

  public void testCompatibleTypesThrows2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AutocompleteOptions options = AutocompleteOptions.newInstance();
        try {
          options.setTypes(AutocompleteType.ESTABLISHMENT, AutocompleteType.REGIONS);
          fail();
        } catch (IllegalArgumentException e) {
        }
        finishTest();
      }
    });
  }

  public void testCompatibleTypesThrows3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AutocompleteOptions options = AutocompleteOptions.newInstance();
        try {
          options.setTypes(AutocompleteType.GEOCODE, AutocompleteType.CITIES);
          fail();
        } catch (IllegalArgumentException e) {
        }
        finishTest();
      }
    });
  }

  public void testCompatibleTypesThrows4() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AutocompleteOptions options = AutocompleteOptions.newInstance();
        try {
          options.setTypes(AutocompleteType.GEOCODE, AutocompleteType.REGIONS);
          fail();
        } catch (IllegalArgumentException e) {
        }
        finishTest();
      }
    });
  }

}
