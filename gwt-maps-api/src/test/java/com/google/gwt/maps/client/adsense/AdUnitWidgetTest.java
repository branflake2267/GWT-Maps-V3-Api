package com.google.gwt.maps.client.adsense;

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.user.client.ui.RootPanel;

public class AdUnitWidgetTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.ADSENSE };
	}

	public void testChannelNumber() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(optionsMap);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				AdUnitOptions options = AdUnitOptions.newInstance();
				options.setFormat(AdFormat.HALF_BANNER);
				options.setPosition(ControlPosition.RIGHT_CENTER);
				options.setMap(mapWidget);
				options.setPublisherId("pub-0032065764310410");
				options.setChannelNumber("4000893900");
				AdUnitWidget o = new AdUnitWidget(options);

				String right = o.getChannelNumber();
				assertEquals("4000893900", right);

				finishTest();
			}
		});
	}

	public void testContainer() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(optionsMap);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				AdUnitOptions options = AdUnitOptions.newInstance();
				options.setFormat(AdFormat.HALF_BANNER);
				options.setPosition(ControlPosition.RIGHT_CENTER);
				options.setMap(mapWidget);
				options.setPublisherId("pub-0032065764310410");
				options.setChannelNumber("4000893900");
				AdUnitWidget o = new AdUnitWidget(options);

				Element right = o.getContainer();
				String sright = right.getInnerHTML();
				assertEquals("<span></span>", sright);

				finishTest();
			}
		});
	}

	public void testFormat() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(optionsMap);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				AdUnitOptions options = AdUnitOptions.newInstance();
				options.setFormat(AdFormat.HALF_BANNER);
				options.setPosition(ControlPosition.RIGHT_CENTER);
				options.setMap(mapWidget);
				options.setPublisherId("pub-0032065764310410");
				options.setChannelNumber("4000893900");

				AdUnitWidget o = new AdUnitWidget(options);
				AdFormat right = o.getFormat();

				assertEquals(options.getFormat(), right);

				finishTest();
			}
		});
	}

	public void testMap() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(optionsMap);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				AdUnitOptions options = AdUnitOptions.newInstance();
				options.setFormat(AdFormat.HALF_BANNER);
				options.setPosition(ControlPosition.RIGHT_CENTER);
				options.setMap(mapWidget);
				options.setPublisherId("pub-0032065764310410");
				options.setChannelNumber("4000893900");
				AdUnitWidget o = new AdUnitWidget(options);

				MapWidget right = o.getMap();
				String sright = right.toString();
				assertEquals(
						"<div style=\"position: relative; background-color: #e5e3df; overflow: hidden; width: 500px; height: 500px;\" class=\"gwt-map-MapWidget-div\"><div style=\"position: absolute; left: 0px; top: 0px; overflow: hidden; width: 100%; height: 100%; z-index: 0;\"><div style=\"position: absolute; left: 0px; top: 0px; overflow: hidden; width: 100%; height: 100%; z-index: 0;\"><div style=\"position: absolute; left: 0px; top: 0px; z-index: 1; cursor: url(http://maps.gstatic.com/mapfiles/openhand_8_8.cur), default;\"><div style=\"z-index: 100; position: absolute; left: 0px; top: 0px;\"><div style=\"position: absolute; left: 0px; top: 0px; z-index: 0;\"><div style=\"position: absolute; left: 0px; top: 0px; z-index: 1;\"></div></div></div><div style=\"z-index: 101; position: absolute; left: 0px; top: 0px;\"></div><div style=\"z-index: 102; position: absolute; left: 0px; top: 0px;\"></div><div style=\"z-index: 103; position: absolute; left: 0px; top: 0px;\"></div><div style=\"z-index: 104; position: absolute; left: 0px; top: 0px;\"></div><div style=\"z-index: 105; position: absolute; left: 0px; top: 0px;\"></div><div style=\"z-index: 106; position: absolute; left: 0px; top: 0px;\"></div><div style=\"position: absolute; z-index: 0;\"><div style=\"overflow: hidden;\"></div></div></div></div></div></div>",
						sright);

				finishTest();
			}
		});
	}

	public void testPosition() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(optionsMap);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				AdUnitOptions options = AdUnitOptions.newInstance();
				options.setFormat(AdFormat.HALF_BANNER);
				options.setPosition(ControlPosition.RIGHT_CENTER);
				options.setMap(mapWidget);
				options.setPublisherId("pub-0032065764310410");
				options.setChannelNumber("4000893900");
				AdUnitWidget o = new AdUnitWidget(options);

				o.setPosition(ControlPosition.TOP_CENTER);
				ControlPosition right = o.getPosition();
				assertEquals(ControlPosition.TOP_CENTER, right);

				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(optionsMap);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				AdUnitOptions options = AdUnitOptions.newInstance();
				options.setFormat(AdFormat.HALF_BANNER);
				options.setPosition(ControlPosition.RIGHT_CENTER);
				options.setMap(mapWidget);
				options.setPublisherId("pub-0032065764310410");
				options.setChannelNumber("4000893900");
				AdUnitWidget o = new AdUnitWidget(options);

				finishTest();
			}
		});
	}

}
