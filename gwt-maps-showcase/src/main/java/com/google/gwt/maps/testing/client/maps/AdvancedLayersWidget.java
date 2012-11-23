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
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.layers.BicyclingLayer;
import com.google.gwt.maps.client.layers.TrafficLayer;
import com.google.gwt.maps.client.layers.TransitLayer;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
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
public class AdvancedLayersWidget extends Composite {

  private VerticalPanel pWidget;
  private MapWidget mapWidget;

  public AdvancedLayersWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  /**
   * Buttons for toggling layers
   */
  private void drawLayerControls() {

    final TrafficLayer trafficLayer = TrafficLayer.newInstance();
    final Button button = new Button("Traffic");
    button.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        if (trafficLayer.getMap() == null) {
          trafficLayer.setMap(mapWidget);
          button.getElement().getStyle().setColor("red");
        } else {
          trafficLayer.setMap(null);
          button.getElement().getStyle().setColor("black");
        }
      }
    });

    final TransitLayer transitLayer = TransitLayer.newInstance();
    final Button button2 = new Button("Transit");
    button2.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        if (transitLayer.getMap() == null) {
          transitLayer.setMap(mapWidget);
          button2.getElement().getStyle().setColor("red");
        } else {
          transitLayer.setMap(null);
          button2.getElement().getStyle().setColor("black");
        }
      }
    });

    final BicyclingLayer bikeLayer = BicyclingLayer.newInstance();
    final Button button3 = new Button("Bicycle");
    button3.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        if (bikeLayer.getMap() == null) {
          bikeLayer.setMap(mapWidget);
          button3.getElement().getStyle().setColor("red");
        } else {
          bikeLayer.setMap(null);
          button3.getElement().getStyle().setColor("black");
        }
      }
    });

    FlowPanel widget = new FlowPanel();
    widget.add(button);
    widget.add(new HTML("Advanced Layers"));
    widget.add(button);
    widget.add(button2);
    widget.add(button3);

    DOM.setStyleAttribute(widget.getElement(), "background", "white");
    DOM.setStyleAttribute(widget.getElement(), "padding", "5px");
    DOM.setStyleAttribute(widget.getElement(), "margin", "3px");
    DOM.setStyleAttribute(widget.getElement(), "border", "3px solid darkgray");

    mapWidget.setControls(ControlPosition.RIGHT_CENTER, widget);

    // apply button so people can see more interesting map
    trafficLayer.setMap(mapWidget);
    button.getElement().getStyle().setColor("red");
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>Advanced Map Layers Example"));

    drawMap();
    drawLayerControls();
  }

  private void drawMap() {
    LatLng center = LatLng.newInstance(42.35, -71.07);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(14);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.ROADMAP);

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

}