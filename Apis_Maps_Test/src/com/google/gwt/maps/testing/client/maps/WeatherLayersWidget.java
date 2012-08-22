package com.google.gwt.maps.testing.client.maps;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.controls.ControlPosition;
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

	private VerticalPanel pWidget;
	private MapWidget mapWidget;

	public WeatherLayersWidget() {
		pWidget = new VerticalPanel();
		initWidget(pWidget);

		draw();
	}

	/**
	 * Buttons for toggling layers
	 */
	private void drawLayerControls() {

		final CloudLayer cloudLayer = CloudLayer.newInstance();
		final Button button = new Button("Clouds");
		button.addClickHandler(new ClickHandler() {
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

		FlowPanel widget = new FlowPanel();
		widget.add(button);
		widget.add(new HTML("Weather Layers"));
		widget.add(button);

		DOM.setStyleAttribute(widget.getElement(), "background", "white");
		DOM.setStyleAttribute(widget.getElement(), "padding", "5px");
		DOM.setStyleAttribute(widget.getElement(), "margin", "3px");
		DOM.setStyleAttribute(widget.getElement(), "border",
				"3px solid darkgray");

		mapWidget.setControls(ControlPosition.RIGHT_CENTER, widget);

		// apply clouds
		cloudLayer.setMap(mapWidget);
		button.getElement().getStyle().setColor("red");
	}

	private void draw() {

		pWidget.clear();
		pWidget.add(new HTML("<br>Weather Map Layers Example"));

		drawMap();
		drawLayerControls();
	}

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
		WeatherLayerOptions options = WeatherLayerOptions.newInstance();
		options.setTemperatureUnits(TemperatureUnit.FAHRENHEIT);
		options.setWindSpeedUnits(WindSpeedUnit.MILES_PER_HOUR);
		options.setLabelColor(LabelColor.BLACK);

		WeatherLayer weatherLayer = WeatherLayer.newInstance(options);
		weatherLayer.setMap(mapWidget);
	}
}