package com.google.gwt.maps.client.adsense;

import java.util.ArrayList;

import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class AdUnitImplTest extends GWTTestCase {

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
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        
        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");
        
        AdUnitOptions options = AdUnitOptions.newInstance();
        options.setFormat(AdFormat.HALF_BANNER);
        options.setPosition(ControlPosition.RIGHT_CENTER);
        options.setMap(mapWidget);
        options.setPublisherId("pub-0032065764310410");
        
        FlowPanel fp = new FlowPanel();
        Element element = fp.getElement();
        AdUnitImpl o = AdUnitImpl.newInstance(element, options);
        
        finishTest();
      }
    }, loadLibraries , sensor);
  }
}
