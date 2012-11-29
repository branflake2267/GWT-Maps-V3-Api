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
import com.google.gwt.maps.client.layers.KmlLayer;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;


public class MultipleKmlMapWidget extends Composite {

	private VerticalPanel pWidget;

	private MapWidget mapWidget;

	private KmlLayer layers;

	private VerticalPanel pRoutes = new VerticalPanel();

	private KmlLayer route1 = KmlLayer.newInstance("http://www.cyclingthealps.com/tour2012/stage14.kmz");
	private KmlLayer route2 = KmlLayer.newInstance("http://www.cyclingthealps.com/tour2012/stage15.kmz");
	private KmlLayer route3 = KmlLayer.newInstance("http://www.cyclingthealps.com/tour2012/stage16.kmz");
	private KmlLayer route4 = KmlLayer.newInstance("http://www.cyclingthealps.com/tour2012/stage17.kmz");
	private KmlLayer route5 = KmlLayer.newInstance("http://www.cyclingthealps.com/tour2012/stage18.kmz");
	private KmlLayer route6 = KmlLayer.newInstance("http://www.cyclingthealps.com/tour2012/stage19.kmz");
	private KmlLayer route7 = KmlLayer.newInstance("http://www.cyclingthealps.com/tour2012/stage20.kmz");

	public MultipleKmlMapWidget() {
		pWidget = new VerticalPanel();
		initWidget(pWidget);
		draw();
	}

	private void draw() {

		pWidget.clear();

		pWidget.add(new HTML("&nbsp;"));

		HorizontalPanel hp = new HorizontalPanel();
		hp.add(new HTML("Multiple Kml Example --- See this used on <a href='http://www.cyclingthealps.com/#tour-de-france-2012-stages'>www.cyclingthealps.com</a>"));

		pWidget.add(hp);

		drawMap();

		drawRoutesPanel();
	}

	private void drawMap() {
		LatLng center = LatLng.newInstance(46.649436, 2.633423);
		MapOptions opts = MapOptions.newInstance();
		opts.setZoom(6);
		opts.setCenter(center);
		opts.setMapTypeId(MapTypeId.TERRAIN);
		opts.setStreetViewControl(false);
		opts.setPanControl(false);
		opts.setZoomControl(false);

		mapWidget = new MapWidget(opts);
		pWidget.add(mapWidget);
		mapWidget.setSize("750px", "500px");
	}

	private void drawRoutesPanel() {

		VerticalPanel dialogContents = new VerticalPanel();
		addRoutes();
		dialogContents.add(pRoutes);
		// sets the panel on top of the map in the upper left corner
		mapWidget.setControls(ControlPosition.LEFT_TOP, dialogContents);
		// the dialogTour CSS setting can be found in the showcase.css file
		dialogContents.setStyleName("dialogTour");

	}

	private void addRoutes() {
		final CheckBox check1 = new CheckBox();
		final CheckBox check2 = new CheckBox();
		final CheckBox check3 = new CheckBox();
		final CheckBox check4 = new CheckBox();
		final CheckBox check5 = new CheckBox();
		final CheckBox check6 = new CheckBox();
		final CheckBox check7 = new CheckBox();
		
		// Introduction
		HorizontalPanel pTitle = new HorizontalPanel();
		Label lTitle = new Label("Enable Disable Routes");
		pTitle.add(lTitle);

		HorizontalPanel pDevider = new HorizontalPanel();
		Label lDevider = new Label("--------------------------");
		pDevider.add(lDevider);

		// stage 1
		HorizontalPanel stage1 = new HorizontalPanel();
		check1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (check1.getValue() == true) {
					kmlLoad(route1);

				} else {
					kmlUnload(route1);

				}
			}
		});
		Label stage1Label = new Label("Route 1");
		stage1.add(check1);
		stage1.add(stage1Label);

		// stage 2
		HorizontalPanel stage2 = new HorizontalPanel();
		check2.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (check2.getValue() == true) {
					kmlLoad(route2);

				} else {
					kmlUnload(route2);

				}
			}
		});
		Label stage2Label = new Label("Route 2");
		stage2.add(check2);
		stage2.add(stage2Label);

		// stage 3
		HorizontalPanel stage3 = new HorizontalPanel();
		check3.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (check3.getValue() == true) {
					kmlLoad(route3);

				} else {
					kmlUnload(route3);

				}
			}
		});
		Label stage3Label = new Label("Route 3");
		stage3.add(check3);
		stage3.add(stage3Label);
	
		// stage 4
		HorizontalPanel stage4 = new HorizontalPanel();
		check4.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (check4.getValue() == true) {
					kmlLoad(route4);

				} else {
					kmlUnload(route4);

				}
			}
		});
		Label stage4Label = new Label("Route 4");
		stage4.add(check4);
		stage4.add(stage4Label);
		
		// stage 5
		HorizontalPanel stage5 = new HorizontalPanel();
		check5.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (check5.getValue() == true) {
					kmlLoad(route5);

				} else {
					kmlUnload(route5);

				}
			}
		});
		Label stage5Label = new Label("Route 5");
		stage5.add(check5);
		stage5.add(stage5Label);
		
		// stage 6
		HorizontalPanel stage6 = new HorizontalPanel();
		check6.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (check6.getValue() == true) {
					kmlLoad(route6);

				} else {
					kmlUnload(route6);

				}
			}
		});
		Label stage19Label = new Label("Route 6");
		stage6.add(check6);
		stage6.add(stage19Label);

		// stage 7
		HorizontalPanel stage7 = new HorizontalPanel();
		check7.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (check7.getValue() == true) {
					kmlLoad(route7);

				} else {
					kmlUnload(route7);

				}
			}
		});
		Label stage7Label = new Label("Route 7");
		stage7.add(check7);
		stage7.add(stage7Label);

		// Adding all horizontal panels to the vertical panel pRoutes
		pRoutes.add(pTitle);
		pRoutes.add(pDevider);
		pRoutes.add(stage1);
		pRoutes.add(stage2);
		pRoutes.add(stage3);
		pRoutes.add(stage4);
		pRoutes.add(stage5);
		pRoutes.add(stage6);
		pRoutes.add(stage7);

	}
	/*
	 * Add kml layer to Map
	 * 
	 * @layer is KmlLayer object containing the URL to the kml route
	 */
	private void kmlLoad(KmlLayer layer) {
		layers = layer;
		layers.setMap(mapWidget);
	}

	/*
	 * Remove kml layer from Map
	 * 
	 * @layer is KmlLayer object containing the URL to the kml route
	 */
	private void kmlUnload(KmlLayer layer) {
		if (layer != null) {
			layers = layer;
			layers.setMap(null);

		}
	}

}
