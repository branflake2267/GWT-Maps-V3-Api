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
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.events.bounds.BoundsChangeMapEvent;
import com.google.gwt.maps.client.events.bounds.BoundsChangeMapHandler;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.place.PlaceChangeMapEvent;
import com.google.gwt.maps.client.events.place.PlaceChangeMapHandler;
import com.google.gwt.maps.client.placeslib.Autocomplete;
import com.google.gwt.maps.client.placeslib.AutocompleteOptions;
import com.google.gwt.maps.client.placeslib.AutocompleteType;
import com.google.gwt.maps.client.placeslib.PlaceGeometry;
import com.google.gwt.maps.client.placeslib.PlaceResult;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/layers.html#FusionTables"
 * >FusionTables API Doc</a>
 */
public class AutocompletePlacesMapWidget extends Composite {

  private VerticalPanel pWidget;

  private MapWidget mapWidget;

  private TextBox tbPlaces;

  public AutocompletePlacesMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    HTML html = new HTML("<br><br>Map with autocomplete places &nbsp;&nbsp;");
    tbPlaces = new TextBox();
    tbPlaces.setWidth("350px");

    HorizontalPanel hp = new HorizontalPanel();
    hp.add(html);
    hp.add(tbPlaces);

    pWidget.add(hp);

    hp.setCellVerticalAlignment(tbPlaces, HorizontalPanel.ALIGN_BOTTOM);

    drawMap();

    drawAutoComplete();
  }

  private void drawMap() {
    LatLng center = LatLng.newInstance(49.496675, -102.65625);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(8);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.TERRAIN);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");

    mapWidget.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
        // TODO fix the event getting, getting ....
        GWT.log("clicked on latlng=" + event.getMouseEvent().getLatLng());
      }
    });
  }

  private void drawAutoComplete() {

    Element element = tbPlaces.getElement();

    AutocompleteType[] types = new AutocompleteType[2];
    types[0] = AutocompleteType.ESTABLISHMENT;
    types[1] = AutocompleteType.GEOCODE;

    AutocompleteOptions options = AutocompleteOptions.newInstance();
    options.setTypes(types);
    options.setBounds(mapWidget.getBounds());

    final Autocomplete autoComplete = Autocomplete.newInstance(element, options);

    autoComplete.addPlaceChangeHandler(new PlaceChangeMapHandler() {
      public void onEvent(PlaceChangeMapEvent event) {

        PlaceResult result = autoComplete.getPlace();

        PlaceGeometry geomtry = result.getGeometry();
        LatLng center = geomtry.getLocation();

        mapWidget.panTo(center);
        // mapWidget.setZoom(8);

        GWT.log("place changed center=" + center);
      }
    });

    mapWidget.addBoundsChangeHandler(new BoundsChangeMapHandler() {
      public void onEvent(BoundsChangeMapEvent event) {
        LatLngBounds bounds = mapWidget.getBounds();
        autoComplete.setBounds(bounds);
      }
    });
  }

}
