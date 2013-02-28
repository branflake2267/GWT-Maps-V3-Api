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

import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.controls.MapTypeControlOptions;
import com.google.gwt.maps.client.maptypes.ImageMapType;
import com.google.gwt.maps.client.maptypes.ImageMapTypeOptions;
import com.google.gwt.maps.client.maptypes.TileUrlCallBack;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * See <a
 * href='http://wiki.openstreetmap.org/wiki/Google_Maps_Example'>OpenStreetMap
 * Example Doc</a>
 */
public class OpenStreetMapLayerWidget extends Composite {

	private VerticalPanel pWidget;
	private MapWidget mapWidget;

	public OpenStreetMapLayerWidget() {
		pWidget = new VerticalPanel();
		initWidget(pWidget);

		draw();
	}

	private void draw() {

		pWidget.clear();
		pWidget.add(new HTML("<br>OpenStreetMap Layer Example"));

		drawMap();
	}

	/**
	 * Example from <a href=
	 * 'https://github.com/branflake2267/GWT-Maps-V3-Api/issues/125'>GitHub
	 * Issue</a>
	 * 
	 * @return
	 */
	private ImageMapType getOsmMapType() {
		ImageMapTypeOptions opts = ImageMapTypeOptions.newInstance();
		opts.setMaxZoom(20);
		opts.setMinZoom(1);
		opts.setName("OpenStreetMap");

		// this is where the magic happens :)
		opts.setTileSize(Size.newInstance(256, 256));
		opts.setTileUrl(new TileUrlCallBack() {
			public String getTileUrl(Point point, int zoom) {
				return "http://tile.openstreetmap.org/" + zoom + "/"
						+ ((int) point.getX()) + "/" + ((int) point.getY())
						+ ".png";
			}
		});
		return ImageMapType.newInstance(opts);
	}

	/**
	 * Creates map widget and adds to container
	 */
	private void drawMap() {

		int zoomLevel = 13;
		LatLng center = LatLng.newInstance(42.35, -71.07);
		String osmMapTypeName = "OSM"; // need to be consistent in the
										// controlOptions and mapTypeRegistry

		/* Create a map and add the OSM layer */
		MapTypeControlOptions controlOptions = MapTypeControlOptions
				.newInstance();
		controlOptions.setMapTypeIds(new String[] {
				osmMapTypeName,
				MapTypeId.ROADMAP.toString()
			});

		MapOptions options = MapOptions.newInstance();
		options.setZoom(zoomLevel);
		options.setCenter(center);
		options.setMapTypeControlOptions(controlOptions);
		options.setMapTypeId(osmMapTypeName); // set the OSM as the selected type
		mapWidget = new MapWidget(options);

		// Add the new map type we created to the registry so it can be used by
		// the map
		mapWidget.getMapTypeRegistry().set(osmMapTypeName, getOsmMapType());

		pWidget.add(mapWidget);
		mapWidget.setSize("750px", "500px");
	}

}