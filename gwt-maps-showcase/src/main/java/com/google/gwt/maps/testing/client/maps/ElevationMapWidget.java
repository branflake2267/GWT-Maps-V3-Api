package com.google.gwt.maps.testing.client.maps;

/*
 * #%L
 * GWT Maps API V3 - Showcase
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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.i18n.client.NumberFormat;
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
 * <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/layers.html#FusionTables"
 * >FusionTables API Doc</a>
 */
public class ElevationMapWidget extends Composite {

  private final VerticalPanel pWidget;

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

    // trigger an info window popup so people can see it on map render
    findElevation(LatLng.newInstance(39.43d, -106.66d));
  }

  private void drawMap() {
    LatLng center = LatLng.newInstance(39.31, -106.02);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(8);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.TERRAIN);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");

    mapWidget.addClickHandler(new ClickMapHandler() {
      @Override
      public void onEvent(ClickMapEvent event) {
        GWT.log("clicked on latlng=" + event.getMouseEvent().getLatLng());

        LatLng point = event.getMouseEvent().getLatLng();
        findElevation(point);
      }
    });
  }

  private void findElevation(LatLng point) {

    LatLng[] a = new LatLng[] { point };

    JsArray<LatLng> locations = ArrayHelper.toJsArray(a);

    LocationElevationRequest request = LocationElevationRequest.newInstance();
    request.setLocations(locations);

    ElevationService o = ElevationService.newInstance();
    o.getElevationForLocations(request, new ElevationServiceHandler() {
      @Override
      public void onCallback(JsArray<ElevationResult> result, ElevationStatus status) {

        if (status == ElevationStatus.INVALID_REQUEST) {

        } else if (status == ElevationStatus.OK) {
          ElevationResult e = result.get(0);
          double elevation = e.getElevation();
          LatLng location = e.getLocation();
          @SuppressWarnings("unused")
          double res = e.getResolution();

          GWT.log("worked elevation=" + elevation);
          drawInfoWindow(location, elevation);

        } else if (status == ElevationStatus.OVER_QUERY_LIMIT) {

        } else if (status == ElevationStatus.REQUEST_DENIED) {

        } else if (status == ElevationStatus.UNKNOWN_ERROR) {

        }

        GWT.log("elevation request finished");
      }
    });
  }

  protected void drawInfoWindow(LatLng position, double elevation) {

    NumberFormat format = NumberFormat.getFormat("###");
    String elevationStr = format.format(elevation);
    String latlngStr = "[ " + format.format(position.getLatitude()) + ", " + format.format(position.getLongitude())
        + " ]";
    String message = "Elevation " + elevationStr + "m @ " + latlngStr;

    HTML html = new HTML(message);
    InfoWindowOptions options = InfoWindowOptions.newInstance();
    options.setContent(html);
    InfoWindow iw = InfoWindow.newInstance(options);
    iw.setPosition(position);
    iw.open(mapWidget);
  }

}
