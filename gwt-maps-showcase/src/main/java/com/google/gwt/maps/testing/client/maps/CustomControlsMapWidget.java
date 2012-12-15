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
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CustomControlsMapWidget extends Composite {

  private VerticalPanel pWidget;
  private MapWidget mapWidget;

  public CustomControlsMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {
    pWidget.clear();

    pWidget.add(new HTML("<br>Custom Controls"));

    drawMap();
    drawControls();
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
      }
    });
  }

  private void drawControls() {
    Button button = new Button("B1");
    button.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        Window.alert("Button 1 Clicked");
      }
    });

    Button button2 = new Button("B2");
    button2.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        Window.alert("Button 2 Clicked ");
      }
    });

    final CheckBox cb = new CheckBox();
    cb.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        GWT.log("Button 2 Clicked");
        Window.alert("CheckBox is " + cb.getValue());
      }
    });

    FlowPanel widget = new FlowPanel();
    widget.add(button);
    widget.add(new HTML("Custom Controls"));
    widget.add(button);
    widget.add(button2);
    widget.add(cb);
    widget.addStyleName("TestControls");

    // TODO I'm not able to get the stylesheet to work, but this works below
    DOM.setStyleAttribute(widget.getElement(), "background", "white");
    DOM.setStyleAttribute(widget.getElement(), "padding", "5px");
    DOM.setStyleAttribute(widget.getElement(), "margin", "3px");
    DOM.setStyleAttribute(widget.getElement(), "border", "3px solid #FF0000");

    mapWidget.setControls(ControlPosition.RIGHT_CENTER, widget);
  }

}
