package com.gonevertical.maps.testing.client.maps;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.services.DirectionsRenderer;
import com.google.gwt.maps.client.services.DirectionsRendererOptions;
import com.google.gwt.maps.client.services.DirectionsRequest;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.maps.client.services.DirectionsResultHandler;
import com.google.gwt.maps.client.services.DirectionsService;
import com.google.gwt.maps.client.services.DirectionsStatus;
import com.google.gwt.maps.client.services.Distance;
import com.google.gwt.maps.client.services.DistanceMatrixElementStatus;
import com.google.gwt.maps.client.services.DistanceMatrixRequest;
import com.google.gwt.maps.client.services.DistanceMatrixRequestHandler;
import com.google.gwt.maps.client.services.DistanceMatrixResponse;
import com.google.gwt.maps.client.services.DistanceMatrixResponseElement;
import com.google.gwt.maps.client.services.DistanceMatrixResponseRow;
import com.google.gwt.maps.client.services.DistanceMatrixService;
import com.google.gwt.maps.client.services.DistanceMatrixStatus;
import com.google.gwt.maps.client.services.Duration;
import com.google.gwt.maps.client.services.TravelMode;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/layers.html#FusionTables}
 */
public class DirectionsServiceMapWidget extends Composite {

  private VerticalPanel pWidget;

  private MapWidget mapWidget;
  
  private HTML htmlDistanceMatrixService = new HTML("&nbsp;");

  public DirectionsServiceMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();
    
    pWidget.add(new HTML("<br/>"));

    HorizontalPanel hp = new HorizontalPanel();
    pWidget.add(hp);
    hp.add(new HTML("Directions Service&nbsp;&nbsp;&nbsp;&nbsp;"));
    hp.add(htmlDistanceMatrixService);
    
    drawMap();
    
    drawDirections();
  }
  
  private void drawMap() {
    LatLng center = LatLng.newInstance(48.11, -123.24);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(8);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.HYBRID);
    
    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");
    
    mapWidget.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
      }
    });
  }
  
  private void drawDirections() {
    
    DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
    final DirectionsRenderer directionsDisplay = DirectionsRenderer.newInstance(options);
    directionsDisplay.setMap(mapWidget);
    
    //LatLng origin = LatLng.newInstance(37.7699298, -122.4469157);
    //LatLng destination = LatLng.newInstance(37.7683909618184, -122.51089453697205);
    
    String origin = "Arlington, WA";
    String destination = "Seattle, WA";
    
    DirectionsRequest request = DirectionsRequest.newInstance();
    request.setOrigin(origin);
    request.setDestination(destination);
    request.setTravelMode(TravelMode.DRIVING);
    
    DirectionsService o = DirectionsService.newInstance();    
    o.route(request, new DirectionsResultHandler() {
      public void onCallback(DirectionsResult result, DirectionsStatus status) {
        if (status == DirectionsStatus.OK) {
          directionsDisplay.setDirections(result);
          getDistance();
        } else if (status == DirectionsStatus.INVALID_REQUEST) {
     
        } else if (status == DirectionsStatus.MAX_WAYPOINTS_EXCEEDED) {
     
        } else if (status == DirectionsStatus.NOT_FOUND) {
     
        } else if (status == DirectionsStatus.OVER_QUERY_LIMIT) {
     
        } else if (status == DirectionsStatus.REQUEST_DENIED) {
     
        } else if (status == DirectionsStatus.UNKNOWN_ERROR) {
     
        } else if (status == DirectionsStatus.ZERO_RESULTS) {
          
        }
      
      }
    });
    
  }

  private void getDistance() {
    
    String origin = "Arlington, WA";
    String destination = "Seattle, WA";
    
    String[] ao = new String[1];
    ao[0] = origin;
    JsArrayString origins = ArrayHelper.toJsArrayString(ao);
    
    String[] ad = new String[1];
    ad[0] = destination;
    JsArrayString destinations = ArrayHelper.toJsArrayString(ad);
    
    DistanceMatrixRequest request = DistanceMatrixRequest.newInstance();
    request.setOrigins(origins);
    request.setDestinations(destinations);
    request.setTravelMode(TravelMode.DRIVING);
    
    DistanceMatrixService o = DistanceMatrixService.newInstance();
    o.getDistanceMatrix(request, new DistanceMatrixRequestHandler() {
      public void onCallback(DistanceMatrixResponse response, DistanceMatrixStatus status) {
        
        System.out.println("status=" + status.value());
        
        if (status == DistanceMatrixStatus.INVALID_REQUEST) {
          
        } else if (status == DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED) {
          
        } else if (status == DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED) {
          
        } else if (status == DistanceMatrixStatus.OK) {
          
          JsArrayString dest = response.getDestinationAddresses();
          JsArrayString org = response.getOriginAddresses();
          JsArray<DistanceMatrixResponseRow> rows = response.getRows();
          
          System.out.println("rows.length=" + rows.length());
          DistanceMatrixResponseRow d = rows.get(0);
          JsArray<DistanceMatrixResponseElement> elements = d.getElements();
          for (int i=0; i < elements.length(); i++) {
            DistanceMatrixResponseElement e = elements.get(i);
            Distance distance = e.getDistance();
            Duration duration = e.getDuration();
            DistanceMatrixElementStatus st = e.getStatus();
            System.out.println("distance=" + distance.getText() + " value=" + distance.getValue());
            System.out.println("duration=" + duration.getText() + " value=" + duration.getValue());
            
            String html = "&nbsp;&nbsp;Distance=" + distance.getText() + " Duration=" + duration.getText() + " ";
            htmlDistanceMatrixService.setHTML(html);
          }
          
        } else if (status == DistanceMatrixStatus.OVER_QUERY_LIMIT) {
          
        } else if (status == DistanceMatrixStatus.REQUEST_DENIED) {
          
        } else if (status == DistanceMatrixStatus.UNKNOWN_ERROR) {
          
        }
        
      }
    });
    
    
  }
  
}
