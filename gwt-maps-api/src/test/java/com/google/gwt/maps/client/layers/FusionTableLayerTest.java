package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.user.client.ui.RootPanel;

public class FusionTableLayerTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesLayerOptions options = FusionTablesLayerOptions
						.newInstance();
				FusionTablesLayer o = FusionTablesLayer.newInstance(options);
				finishTest();
			}
		});

	}

	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(options);
				mapWidget.setSize("500px", "500px");
				RootPanel.get().add(mapWidget);

				BicyclingLayer o = BicyclingLayer.newInstance();
				o.setMap(mapWidget);
				MapWidget right = o.getMap();

				assertEquals(mapWidget.getCenter().getToString(), right
						.getCenter().getToString());
				finishTest();
			}
		});

	}

}
