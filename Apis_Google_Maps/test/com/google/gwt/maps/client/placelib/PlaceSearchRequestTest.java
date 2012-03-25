package com.google.gwt.maps.client.placelib;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.placeslib.PlaceGeometry;
import com.google.gwt.maps.client.placeslib.PlaceResult;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;

public class PlaceSearchRequestTest extends GWTTestCase {

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
        PlaceResult o = PlaceResult.newInstance();
        finishTest();
      }
    }, loadLibraries , sensor);
  }
   
  public void testAC() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
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
    }, loadLibraries , sensor);
  }
  
  public void testfa() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setFormated_Address(left);
        String right = o.getFormatted_Address();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testfpn() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setFormatted_Phone_Number(left);
        String right = o.getFormatted_Phone_Number();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testgeomtry() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        PlaceGeometry left = PlaceGeometry.newInstance();
        LatLng location = LatLng.newInstance(35, 38);
        left.setLocation(location );
        o.setGeometry(left);
        PlaceGeometry right = o.getGeometry();
        assertEquals(left.getLocation().getToString(), right.getLocation().getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testattr() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setHtml_Attributions(left);
        String right = o.getHtml_Attributions();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testicon() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setIcon(left);
        String right = o.getIcon();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testId() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setId(left);
        String right = o.getId();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testinterpn() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setInternational_Phone_Number(left);
        String right = o.getInternational_Phone_Number();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testName() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setName(left);
        String right = o.getName();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testRating() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        int left = 5;
        o.setRating(left);
        int right = o.getRating();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testref() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setReference(left);
        String right = o.getReference();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testtypes() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
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
    }, loadLibraries , sensor);
  }
  
  public void testurl() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setUrl(left);
        String right = o.getUrl();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testVicinity() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setVicinity(left);
        String right = o.getVicinity();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testWebsite() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceResult o = PlaceResult.newInstance();
        String left = "test";
        o.setWebsite(left);
        String right = o.getWebsite();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
}
