package com.google.gwt.maps.client.service;

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.services.DirectionsRenderer;
import com.google.gwt.maps.client.services.DirectionsRendererOptions;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class DirectionsRendererTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRendererOptions options = DirectionsRendererOptions
						.newInstance();
				DirectionsRenderer o = DirectionsRenderer.newInstance(options);
				finishTest();
			}
		});
	}

	public void testDirections() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRendererOptions options = DirectionsRendererOptions
						.newInstance();
				DirectionsRenderer o = DirectionsRenderer.newInstance(options);
				DirectionsResult left = DirectionsResult.newInstance();
				o.setDirections(left);
				DirectionsResult right = o.getDirections();
				assertEquals(left.getRoutes().length(), right.getRoutes()
						.length());
				finishTest();
			}
		});
	}

	public void testMap() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRendererOptions options = DirectionsRendererOptions
						.newInstance();
				DirectionsRenderer o = DirectionsRenderer.newInstance(options);
				MapOptions opts = MapOptions.newInstance();
				MapWidget left = new MapWidget(opts);
				RootPanel.get().add(left);
				o.setMap(left);
				MapWidget right = o.getMap();
				assertEquals(left.getCenter().getToString(), right.getCenter()
						.getToString());
				finishTest();
			}
		});
	}

	public void testPanel() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRendererOptions options = DirectionsRendererOptions
						.newInstance();
				DirectionsRenderer o = DirectionsRenderer.newInstance(options);
				FlowPanel fp = new FlowPanel();
				Element left = fp.getElement();
				o.setPanel(left);
				Element right = o.getPanel();
				assertEquals(left.toString(), right.toString());
				finishTest();
			}
		});
	}

	public void testRouteIndex() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRendererOptions options = DirectionsRendererOptions
						.newInstance();
				DirectionsRenderer o = DirectionsRenderer.newInstance(options);
				int left = 5;
				o.setRouteIndex(left);
				int right = o.getRouteIndex();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

}
