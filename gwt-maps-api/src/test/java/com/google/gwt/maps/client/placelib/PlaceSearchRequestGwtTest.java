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

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.placeslib.PlaceGeometry;
import com.google.gwt.maps.client.placeslib.PlaceResult;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;

public class PlaceSearchRequestGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        finishTest();
      }
    });
  }

  public void testAC() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        GeocoderAddressComponent[] a = new GeocoderAddressComponent[3];
        a[0] = GeocoderAddressComponent.newInstace();
        a[1] = GeocoderAddressComponent.newInstace();
        a[2] = GeocoderAddressComponent.newInstace();
        JsArray<GeocoderAddressComponent> left = ArrayHelper.toJsArray(a);
        o.setAddress_Components(left);
        JsArray<GeocoderAddressComponent> right = o.getAddress_Components();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    });
  }

  public void testfa() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setFormated_Address(left);
        String right = o.getFormatted_Address();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testfpn() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setFormatted_Phone_Number(left);
        String right = o.getFormatted_Phone_Number();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testgeomtry() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        PlaceGeometry left = PlaceGeometry.newInstance();
        LatLng location = LatLng.newInstance(35, 38);
        left.setLocation(location);
        o.setGeometry(left);
        PlaceGeometry right = o.getGeometry();
        assertEquals(left.getLocation().getToString(), right.getLocation().getToString());
        finishTest();
      }
    });
  }

  public void testattr() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setHtml_Attributions(left);
        String right = o.getHtml_Attributions();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testicon() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setIcon(left);
        String right = o.getIcon();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testId() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setId(left);
        String right = o.getId();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testinterpn() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setInternational_Phone_Number(left);
        String right = o.getInternational_Phone_Number();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testName() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setName(left);
        String right = o.getName();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testRating() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        int left = 5;
        o.setRating(left);
        int right = o.getRating();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testref() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setReference(left);
        String right = o.getReference();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testtypes() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String[] a = new String[3];
        a[0] = "0";
        a[1] = "1";
        a[2] = "2";
        JsArrayString left = ArrayHelper.toJsArrayString(a);
        o.setTypes(left);
        JsArrayString right = o.getTypes();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    });
  }

  public void testurl() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setUrl(left);
        String right = o.getUrl();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testVicinity() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setVicinity(left);
        String right = o.getVicinity();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testWebsite() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setWebsite(left);
        String right = o.getWebsite();
        assertEquals(left, right);
        finishTest();
      }
    });
  }
}
