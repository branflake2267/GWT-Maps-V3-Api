package com.gonevertical.maps.testing.client.maps;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.overlays.InfoWindow;
import com.google.gwt.maps.client.overlays.InfoWindowOptions;
import com.google.gwt.maps.client.services.ElevationResult;
import com.google.gwt.maps.client.services.ElevationService;
import com.google.gwt.maps.client.services.ElevationServiceHandler;
import com.google.gwt.maps.client.services.ElevationStatus;
import com.google.gwt.maps.client.services.LocationElevationRequest;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/layers.html#FusionTables}
 */
public class ElevationMapWidget extends Composite {

  private VerticalPanel pWidget;

  private MapWidget mapWidget;

  public ElevationMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>ElevationService. Click for elevation:"));

    drawMap();
    
  }

  private void drawMap() {
    LatLng center = LatLng.newInstance(49.496675,-102.65625);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(4);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.HYBRID);
    
    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");
    
    mapWidget.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
        // TODO fix the event getting, getting ....
        System.out.println("clicked on latlng=" + event.getMouseEvent().getLatLng());
        
        findElevation(event);
      }
    });
  }

  private void findElevation(ClickMapEvent event) {
    
    LatLng[] a = new LatLng[1];
    a[0] = event.getMouseEvent().getLatLng();
    
    JsArray<LatLng> locations = ArrayHelper.toJsArray(a);
    
    LocationElevationRequest request = LocationElevationRequest.newInstance();
    request.setLocations(locations);
    
    ElevationService o = ElevationService.newInstance();
    o.getElevationForLocations(request, new ElevationServiceHandler() {
      public void onCallback(JsArray<ElevationResult> result, ElevationStatus status) {
       
        if (status == ElevationStatus.INVALID_REQUEST) {
          
        } else if (status == ElevationStatus.OK) {
          ElevationResult e = result.get(0);
          double elevation = e.getElevation();
          LatLng location = e.getLocation();
          double res = e.getResolution();
          
          System.out.println("worked elevation=" + elevation);
          drawInfoWindow(location, elevation);
          
        } else if (status == ElevationStatus.OVER_QUERY_LIMIT) {
          
        } else if (status == ElevationStatus.REQUEST_DENIED) {
          
        } else if (status == ElevationStatus.UNKNOWN_ERROR) {
          
        }
        
        System.out.println("elevation request finished");
      }
    });
  }


  protected void drawInfoWindow(LatLng position, double elevation) {
    HTML html = new HTML("Elevation is " + elevation + " at " + position.getToString());
    InfoWindowOptions options = InfoWindowOptions.newInstance();
    options.setContent(html);
    InfoWindow iw = InfoWindow.newInstance(options);
    iw.setPosition(position);
    iw.open(mapWidget);
  }
  
}
