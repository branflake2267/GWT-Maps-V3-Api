package com.google.gwt.maps.client.service;

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

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.services.Geocoder;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;
import com.google.gwt.maps.client.services.GeocoderGeometry;
import com.google.gwt.maps.client.services.GeocoderLocationType;
import com.google.gwt.maps.client.services.GeocoderRequest;
import com.google.gwt.maps.client.services.GeocoderRequestHandler;
import com.google.gwt.maps.client.services.GeocoderResult;
import com.google.gwt.maps.client.services.GeocoderStatus;

public class GeocoderGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Geocoder o = Geocoder.newInstance();
        finishTest();
      }
    });
  }

  public void testGeocode_() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Geocoder o = Geocoder.newInstance();
        GeocoderRequest request = GeocoderRequest.newInstance();
        request.setAddress("Google");
        o.geocode(request, new GeocoderRequestHandler() {
          @Override
          public void onCallback(JsArray<GeocoderResult> results, GeocoderStatus status) {
            if (status == GeocoderStatus.OK) {

              if (results.length() > 0) {
                assertTrue(true);
              } else {
                assertTrue(false);
              }

            } else if (status == GeocoderStatus.ERROR) {
              fail();
            } else if (status == GeocoderStatus.INVALID_REQUEST) {
              fail();
            } else if (status == GeocoderStatus.OVER_QUERY_LIMIT) {
              fail();
            } else if (status == GeocoderStatus.REQUEST_DENIED) {
              fail();
            } else if (status == GeocoderStatus.UNKNOWN_ERROR) {
              fail();
            } else if (status == GeocoderStatus.ZERO_RESULTS) {
              assertTrue(true);
            }
            finishTest();
          }
        });
        // finishTest();
      }
    });
  }

  public void testGeocode_address() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Geocoder o = Geocoder.newInstance();
        GeocoderRequest request = GeocoderRequest.newInstance();
        request.setAddress("1027 state street marysville, wa 98270");
        o.geocode(request, new GeocoderRequestHandler() {
          @Override
          public void onCallback(JsArray<GeocoderResult> results, GeocoderStatus status) {
            if (status == GeocoderStatus.OK) {

              if (results.length() > 0) {
                assertTrue(true);
              } else {
                assertTrue(false);
              }

              for (int i = 0; i < results.length(); i++) {
                GeocoderResult result = results.get(i);

                JsArray<GeocoderAddressComponent> components = result.getAddress_Components();
                int len = components.length();
                assertEquals(7, len);

                String address = result.getFormatted_Address();
                assertNotNull(address);

                GeocoderGeometry geo = result.getGeometry();
                //
                // LatLng pointNE = LatLng.newInstance(48.0582905d, -122.176957d);
                // LatLng pointSW = LatLng.newInstance(48.0582905d, -122.176934d);
                // LatLngBounds bounds = geo.getBounds();
                // assertLatLngEquals(bounds.getNorthEast(), pointNE);
                // assertLatLngEquals(bounds.getSouthWest(), pointSW);

                GeocoderLocationType lt = geo.getLocation_Type();
                assertEquals(GeocoderLocationType.RANGE_INTERPOLATED, lt);

                JsArrayString types = result.getTypes();
                int len3 = types.length();
                assertEquals(1, len3);

                int len2 = types.length();
                assertEquals(1, len2);
              }

            } else if (status == GeocoderStatus.ERROR) {
              fail();
            } else if (status == GeocoderStatus.INVALID_REQUEST) {
              fail();
            } else if (status == GeocoderStatus.OVER_QUERY_LIMIT) {
              fail();
            } else if (status == GeocoderStatus.REQUEST_DENIED) {
              fail();
            } else if (status == GeocoderStatus.UNKNOWN_ERROR) {
              fail();
            } else if (status == GeocoderStatus.ZERO_RESULTS) {
              assertTrue(true);
            }
            finishTest();
          }
        });
        // finishTest();
      }
    });
  }

  public void testGeocode_Bounds() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Geocoder o = Geocoder.newInstance();
        GeocoderRequest request = GeocoderRequest.newInstance();
        LatLng sw1 = LatLng.newInstance(-31.203405d, 125.244141d);
        LatLng ne1 = LatLng.newInstance(-25.3633882d, 131.0434922d);
        LatLngBounds bounds = LatLngBounds.newInstance(sw1, ne1);
        request.setBounds(bounds);
        o.geocode(request, new GeocoderRequestHandler() {
          @Override
          public void onCallback(JsArray<GeocoderResult> results, GeocoderStatus status) {
            if (status == GeocoderStatus.OK) {

              if (results.length() > 0) {
                assertTrue(true);
              } else {
                assertTrue(false);
              }

            } else if (status == GeocoderStatus.ERROR) {
              fail();
            } else if (status == GeocoderStatus.INVALID_REQUEST) {
              fail();
            } else if (status == GeocoderStatus.OVER_QUERY_LIMIT) {
              fail();
            } else if (status == GeocoderStatus.REQUEST_DENIED) {
              fail();
            } else if (status == GeocoderStatus.UNKNOWN_ERROR) {
              fail();
            } else if (status == GeocoderStatus.ZERO_RESULTS) {
              assertTrue(true);
            }
            finishTest();
          }
        });
        // finishTest();
      }
    });
  }

  public void testGeocode_location() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Geocoder o = Geocoder.newInstance();
        GeocoderRequest request = GeocoderRequest.newInstance();
        LatLng location = LatLng.newInstance(47.64880, -122.35072);
        request.setLocation(location);
        o.geocode(request, new GeocoderRequestHandler() {
          @Override
          public void onCallback(JsArray<GeocoderResult> results, GeocoderStatus status) {
            if (status == GeocoderStatus.OK) {

              if (results.length() > 0) {
                assertTrue(true);
              } else {
                assertTrue(false);
              }

            } else if (status == GeocoderStatus.ERROR) {
              fail();
            } else if (status == GeocoderStatus.INVALID_REQUEST) {
              fail();
            } else if (status == GeocoderStatus.OVER_QUERY_LIMIT) {
              fail();
            } else if (status == GeocoderStatus.REQUEST_DENIED) {
              fail();
            } else if (status == GeocoderStatus.UNKNOWN_ERROR) {
              fail();
            } else if (status == GeocoderStatus.ZERO_RESULTS) {
              assertTrue(true);
            }
            finishTest();
          }
        });
        // finishTest();
      }
    });
  }

  public void testGeocode_region() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Geocoder o = Geocoder.newInstance();
        GeocoderRequest request = GeocoderRequest.newInstance();
        request.setRegion("USA");
        o.geocode(request, new GeocoderRequestHandler() {
          @Override
          public void onCallback(JsArray<GeocoderResult> results, GeocoderStatus status) {
            if (status == GeocoderStatus.OK) {

              if (results.length() > 0) {
                assertTrue(true);
              } else {
                assertTrue(false);
              }

            } else if (status == GeocoderStatus.ERROR) {
              fail();
            } else if (status == GeocoderStatus.INVALID_REQUEST) {
              fail();
            } else if (status == GeocoderStatus.OVER_QUERY_LIMIT) {
              fail();
            } else if (status == GeocoderStatus.REQUEST_DENIED) {
              fail();
            } else if (status == GeocoderStatus.UNKNOWN_ERROR) {
              fail();
            } else if (status == GeocoderStatus.ZERO_RESULTS) {
              assertTrue(true);
            }
            finishTest();
          }
        });
        // finishTest();
      }
    });
  }

}
