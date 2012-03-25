package com.google.gwt.maps.client.service;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
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

public class GeocoderTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  public void testUse() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        Geocoder o = Geocoder.newInstance();
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testGeocode_() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        Geocoder o = Geocoder.newInstance();
        GeocoderRequest request = GeocoderRequest.newInstance();
        request.setAddress("Google");
        o.geocode(request , new GeocoderRequestHandler() {
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
        //finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testGeocode_address() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        Geocoder o = Geocoder.newInstance();
        GeocoderRequest request = GeocoderRequest.newInstance();
        request.setAddress("1027 state street marysville, wa 98270");
        o.geocode(request , new GeocoderRequestHandler() {
          public void onCallback(JsArray<GeocoderResult> results, GeocoderStatus status) {
            if (status == GeocoderStatus.OK) {
              
              if (results.length() > 0) {
                assertTrue(true);
              } else {
                assertTrue(false);
              }
              
              for (int i=0; i < results.length(); i++) {
                GeocoderResult result = results.get(i);
                
                JsArray<GeocoderAddressComponent> components = result.getAddress_Components();
                int len = components.length();
                assertEquals(7, len);
                
                String address = result.getFormatted_Address();
                assertNotNull(address);
                
                GeocoderGeometry geo = result.getGeometry();
                LatLngBounds bounds = geo.getBounds();
                assertEquals("((48.0582905, -122.17695759999998), (48.0582905, -122.17693480000003))", bounds.getToString());
                
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
        //finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testGeocode_Bounds() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        Geocoder o = Geocoder.newInstance();
        GeocoderRequest request = GeocoderRequest.newInstance();
        LatLng sw1 = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne1 = LatLng.newInstance(new BigDecimal(-25.3633882), new BigDecimal(131.0434922));
        LatLngBounds bounds = LatLngBounds.newInstance(sw1, ne1);
        request.setBounds(bounds);
        o.geocode(request , new GeocoderRequestHandler() {
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
        //finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testGeocode_location() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        Geocoder o = Geocoder.newInstance();
        GeocoderRequest request = GeocoderRequest.newInstance();
        LatLng location = LatLng.newInstance(47.64880, -122.35072);
        request.setLocation(location);
        o.geocode(request , new GeocoderRequestHandler() {
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
        //finishTest();
      }
    }, loadLibraries , sensor);
  }

  
  public void testGeocode_region() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        Geocoder o = Geocoder.newInstance();
        GeocoderRequest request = GeocoderRequest.newInstance();
        request.setRegion("USA");
        o.geocode(request , new GeocoderRequestHandler() {
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
        //finishTest();
      }
    }, loadLibraries , sensor);
  }

}
