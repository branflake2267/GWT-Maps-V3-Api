package com.google.gwt.maps.testing.client.maps;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.placeslib.PlaceResult;
import com.google.gwt.maps.client.placeslib.PlaceSearchHandler;
import com.google.gwt.maps.client.placeslib.PlaceSearchRequest;
import com.google.gwt.maps.client.placeslib.PlacesService;
import com.google.gwt.maps.client.placeslib.PlacesServiceStatus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PlaceSearchMapWidget extends Composite {

	private VerticalPanel pWidget;
	private MapWidget mapWidget;

	public PlaceSearchMapWidget() {
		pWidget = new VerticalPanel();
		initWidget(pWidget);

		draw();
	}

	private void draw() {
		pWidget.clear();
		pWidget.add(new HTML("<br>Click on the map to start the PlaceSearchRequest"));
		
		drawMap();
	}

	private void searchRequest(LatLng clickLocation) {
	  String[] types = new String[1];
	  types[0] = "establishment";
	  
	  PlaceSearchRequest request = PlaceSearchRequest.newInstance(); 
    request.setLocation(clickLocation); 
    request.setRaidus(500); 
    // TODO add more AutocompleteTypes...
    //request.setTypes(AutocompleteType.ESTABLISHMENT);
    request.setTypes(types);
    
    PlacesService placeService = PlacesService.newInstance(mapWidget.getElement(), mapWidget);
    placeService.search(request, new PlaceSearchHandler() {                 
        @Override
        public void onCallback(JsArray<PlaceResult> results, PlacesServiceStatus status) {
          // TODO add some popup to display the results
          Window.alert("I found this many places " + results.length());
        }
    });     
  }

  private void drawMap() {
		LatLng center = LatLng.newInstance(49.496675, -102.65625);
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
				GWT.log("clicked on latlng="
						+ event.getMouseEvent().getLatLng());
				
				searchRequest(event.getMouseEvent().getLatLng());
			}
		});
	}

}
