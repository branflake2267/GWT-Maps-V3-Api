package com.google.gwt.maps.testing.client.maps;

import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaOptions;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;
import com.google.gwt.maps.client.streetview.StreetViewPov;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * See <a href="https://developers.google.com/maps/documentation/javascript/streetview">StreetView API Doc</a>
 */
public class StreetViewMapWidget extends Composite {

  private VerticalPanel pWidget;

  public StreetViewMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>Street View"));

    drawStreeView();
   
  }
  
  private void drawStreeView() {
   
    LatLng position = LatLng.newInstance(21.271525d, -157.822731d);
    
    StreetViewPov pov = StreetViewPov.newInstance();
    pov.setHeading(250);
    pov.setZoom(1);
    pov.setPitch(10);
    
    StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
    options.setPosition(position);
    options.setStreeViewPov(pov);
    
    StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
    pWidget.add(wStreet);
    wStreet.setSize("750px", "500px");
  
  }
}