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

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.events.weatherlibmouse.WeatherMouseMapEvent;
import com.google.gwt.maps.client.events.weatherlibmouse.WeatherMouseMapHandler;
import com.google.gwt.maps.client.weatherlib.CloudLayer;
import com.google.gwt.maps.client.weatherlib.LabelColor;
import com.google.gwt.maps.client.weatherlib.TemperatureUnit;
import com.google.gwt.maps.client.weatherlib.WeatherLayer;
import com.google.gwt.maps.client.weatherlib.WeatherLayerOptions;
import com.google.gwt.maps.client.weatherlib.WindSpeedUnit;
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
 * "https://developers.google.com/maps/documentation/javascript/reference#WeatherLayer"
 * >WeatherLib API Doc</a>
 */
public class WeatherLayersWidget extends Composite {

  private final VerticalPanel pWidget;
  private MapWidget mapWidget;

  private WeatherLayer weatherLayer;
  private CloudLayer cloudLayer;

  public WeatherLayersWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  /**
   * Buttons for toggling layers
   */
  private void drawLayerControls() {

    final Button button = new Button("Clouds");
    button.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        if (cloudLayer.getMap() == null) {
          cloudLayer.setMap(mapWidget);
          button.getElement().getStyle().setColor("red");
        } else {
          cloudLayer.setMap(null);
          button.getElement().getStyle().setColor("black");
        }
      }
    });
    final Button button2 = new Button("Forecast");
    button2.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        if (weatherLayer.getMap() == null) {
          weatherLayer.setMap(mapWidget);
          button.getElement().getStyle().setColor("red");
        } else {
          weatherLayer.setMap(null);
          button.getElement().getStyle().setColor("black");
        }
      }
    });

    FlowPanel widget = new FlowPanel();
    widget.add(button);
    widget.add(new HTML("Weather Layers"));
    widget.add(button);
    widget.add(button2);

    DOM.setStyleAttribute(widget.getElement(), "background", "white");
    DOM.setStyleAttribute(widget.getElement(), "padding", "5px");
    DOM.setStyleAttribute(widget.getElement(), "margin", "3px");
    DOM.setStyleAttribute(widget.getElement(), "border", "3px solid darkgray");

    mapWidget.setControls(ControlPosition.RIGHT_CENTER, widget);

    button.getElement().getStyle().setColor("red");
    button2.getElement().getStyle().setColor("red");
  }

  private void draw() {

    pWidget.clear();
    pWidget.add(new HTML("<br>Weather Map Layers Example - Can configure Imperial/Metric units"));

    drawMap();
    drawLayerControls();
  }

  private final native void ConsoleLog(Object msg) /*-{
                                                   if($wnd.console) {
                                                   $wnd.console.log(msg);
                                                   }
                                                   }-*/;

  private void drawMap() {
    // zoom out for the clouds
    LatLng center = LatLng.newInstance(47.11, -4.91);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(3);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.SATELLITE);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");

    // add weather conditions layer
    WeatherLayerOptions options2 = WeatherLayerOptions.newInstance();
    options2.setTemperatureUnits(TemperatureUnit.FAHRENHEIT);
    options2.setWindSpeedUnits(WindSpeedUnit.MILES_PER_HOUR);
    options2.setLabelColor(LabelColor.BLACK);

    WeatherLayerOptions options = WeatherLayerOptions.newInstance();
    options.setTemperatureUnits(TemperatureUnit.FAHRENHEIT);
    options.setWindSpeedUnits(WindSpeedUnit.MILES_PER_HOUR);
    options.setLabelColor(LabelColor.BLACK);

    weatherLayer = WeatherLayer.newInstance(options);
    weatherLayer.setMap(mapWidget);

    // apply clouds
    cloudLayer = CloudLayer.newInstance();
    cloudLayer.setMap(mapWidget);

    // add custom handler for clicks on weather markers
    // NOTE: this is just being cat'd to the console as an
    // example of the information you get from the event
    weatherLayer.addClickHandler(new WeatherMouseMapHandler() {

      @Override
      public void onEvent(WeatherMouseMapEvent event) {
        ConsoleLog(event.getPixelOffset().getHeight());
        ConsoleLog(event.getLatLng().getLatitude());
        ConsoleLog(event.getInfoWindowHtml());
        ConsoleLog(event.getFeatureDetails().getCurrent());
        ConsoleLog(event.getFeatureDetails().getForecast().get(0));
        ConsoleLog(event.getFeatureDetails().getLocation());
        ConsoleLog(event.getFeatureDetails().getTemperatureUnits().value());
        ConsoleLog(event.getFeatureDetails().getWindSpeedUnits().value());

        // ideally you'd intercept the propagation of the event her so you could
        // display your own custom popup, not the default one
      }
    });

  }
}