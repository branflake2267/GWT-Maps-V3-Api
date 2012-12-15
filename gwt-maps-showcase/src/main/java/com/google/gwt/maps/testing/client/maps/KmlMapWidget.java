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

import com.google.gwt.core.client.GWT;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.events.kmlmouse.KmlMouseMapEvent;
import com.google.gwt.maps.client.events.kmlmouse.KmlMouseMapHandler;
import com.google.gwt.maps.client.layers.KmlFeatureData;
import com.google.gwt.maps.client.layers.KmlLayer;
import com.google.gwt.maps.client.layers.KmlLayerMetadata;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/layers.html#FusionTables"
 * >FusionTables API Doc</a>
 */
public class KmlMapWidget extends Composite {

  private VerticalPanel pWidget;

  private MapWidget mapWidget;

  public KmlMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("&nbsp;"));

    HorizontalPanel hp = new HorizontalPanel();
    hp.add(new HTML("Kml Example - Try clicking on marker &nbsp;&nbsp;&nbsp;"));

    pWidget.add(hp);

    drawMap();

    // draw kmls
    // changeKmlState();

    drawKml2();
  }

  private void drawMap() {
    LatLng center = LatLng.newInstance(49.496675, -102.65625);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(4);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.ROADMAP);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");
  }

  private void drawKml2() {

    // String url =
    // "http://api.flickr.com/services/feeds/geo/?g=322338@N20&lang=en-us&format=feed-georss";

    // TODO this won't work in devmode but works in production, can't point to
    // localhost.
    String base = GWT.getHostPageBaseURL();
    String url = base + "/kmlgenerator?id=120234&pass=1345&msg=hi";

    KmlLayer o = KmlLayer.newInstance(url);
    o.setMap(mapWidget);

    o.addClickHandler(new KmlMouseMapHandler() {
      public void onEvent(KmlMouseMapEvent event) {
        KmlFeatureData featureData = event.getFeatureData();

        @SuppressWarnings("unused")
        LatLng latlng = event.getLatLng();

        @SuppressWarnings("unused")
        Size size = event.getPixelOffset();
        GWT.log("clicked featureData=" + featureData.getToString());
      }
    });

    // TODO I need a better link with more meta data
    @SuppressWarnings("unused")
    KmlLayerMetadata metaData = o.getMetadata();
    // KmlAuthor author = metaData.getAuthor();
    // String authName = author.getName();
    // String authEmail = author.getEmail();
    // String authUri = author.getUri();
    //
    // String desc = metaData.getDescription();
    // String name = metaData.getName();
    // String snippet = metaData.getSnippet();

    // GWT.log("work? authName=" + authName);

  }

}
