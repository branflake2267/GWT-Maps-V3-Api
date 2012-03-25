package com.google.gwt.maps.client.placelib;

import java.util.ArrayList;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.placeslib.PlaceDetailsHandler;
import com.google.gwt.maps.client.placeslib.PlaceDetailsRequest;
import com.google.gwt.maps.client.placeslib.PlaceResult;
import com.google.gwt.maps.client.placeslib.PlaceSearchHandler;
import com.google.gwt.maps.client.placeslib.PlaceSearchRequest;
import com.google.gwt.maps.client.placeslib.PlacesService;
import com.google.gwt.maps.client.placeslib.PlacesServiceStatus;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class PlacesServiceTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 7000;

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
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");
        
        Element attrContainer = fp.getElement();
        PlacesService o = PlacesService.newInstance(attrContainer, mapWidget);
        
        finishTest();
      }
    }, loadLibraries , sensor);
  }
   
  /**
   * TODO add some more tests
   */
  public void testDetails1() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");
        
        Element attrContainer = fp.getElement();
        PlacesService o = PlacesService.newInstance(attrContainer, mapWidget);
        
        String reference = "CnRkAAAAGnBVNFDeQoOQHzgdOpOqJNV7K9-c5IQrWFUYD9TNhUmz5-aHhfqyKH0zmAcUlkqVCrpaKcV8ZjGQKzB6GXxtzUYcP-muHafGsmW-1CwjTPBCmK43AZpAwW0FRtQDQADj3H2bzwwHVIXlQAiccm7r4xIQmjt_Oqm2FejWpBxLWs3L_RoUbharABi5FMnKnzmRL2TGju6UA4k";
        PlaceDetailsRequest request = PlaceDetailsRequest.newInstance();
        request.setReference(reference);
        
        o.getDetails(request , new PlaceDetailsHandler() {
          public void onCallback(PlaceResult result, PlacesServiceStatus status) {
            
            System.out.println("status=" + status.toString());
            
            if (status == PlacesServiceStatus.OK) {
              System.out.println("OK");
              
              String address = result.getFormatted_Address();
              JsArray<GeocoderAddressComponent> addressComp = result.getAddress_Components();
              String name = result.getName();
              
              System.out.println("source=" + result.toSource());
              
              assertTrue(true);
              
            } else if (status == PlacesServiceStatus.INVALID_REQUEST) {
              System.out.println("INVALID_REQUEST");
              fail();
              
            } else if (status == PlacesServiceStatus.OVER_QUERY_LIMIT) {
              System.out.println("OVER_QUERY_LIMIT");
              fail();
              
            } else if (status == PlacesServiceStatus.REQUEST_DENIED) {
              System.out.println("REQUEST_DENIED");
              fail();
              
            } else if (status == PlacesServiceStatus.UNKNOWN_ERROR) {
              System.out.println("UNKNOWN_ERROR");
              fail();
              
            } else if (status == PlacesServiceStatus.ZERO_RESULTS) {
              System.out.println("ZERO_RESULTS");
              assertTrue(true);
              
            }
            
            finishTest();   
          }
        });
        
        
      }
    }, loadLibraries , sensor);
  }
  
  /**
   * TODO add some more tests
   */
  public void testSearch() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");
        
        Element attrContainer = fp.getElement();
        PlacesService o = PlacesService.newInstance(attrContainer, mapWidget);
        
        PlaceSearchRequest request = PlaceSearchRequest.newInstance();
        request.setName("Seattle");
        request.setBounds(mapWidget.getBounds());
        
        o.search(request, new PlaceSearchHandler() {
          public void onCallback(JsArray<PlaceResult> results, PlacesServiceStatus status) {
            
            System.out.println("status=" + status.toString());
            
            if (status == PlacesServiceStatus.OK) {
              System.out.println("OK");
              
              assertTrue(true);
              
            } else if (status == PlacesServiceStatus.INVALID_REQUEST) {
              System.out.println("INVALID_REQUEST");
              fail();
              
            } else if (status == PlacesServiceStatus.OVER_QUERY_LIMIT) {
              System.out.println("OVER_QUERY_LIMIT");
              fail();
              
            } else if (status == PlacesServiceStatus.REQUEST_DENIED) {
              System.out.println("REQUEST_DENIED");
              fail();
              
            } else if (status == PlacesServiceStatus.UNKNOWN_ERROR) {
              System.out.println("UNKNOWN_ERROR");
              fail();
              
            } else if (status == PlacesServiceStatus.ZERO_RESULTS) {
              System.out.println("ZERO_RESULTS");
              assertTrue(true);
              
            }
            
            finishTest();   
            
          }
        });
        
        
      }
    }, loadLibraries , sensor);
  }
}
