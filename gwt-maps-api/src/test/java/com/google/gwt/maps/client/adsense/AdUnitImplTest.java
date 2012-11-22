package com.google.gwt.maps.client.adsense;

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class AdUnitImplTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.ADSENSE };
	}

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

				FlowPanel fp = new FlowPanel();
				Element element = fp.getElement();
				AdUnitImpl o = AdUnitImpl.newInstance(element, options);

				assertEquals(options.getMap().getElement(), o.getMap()
						.getElement());
				assertEquals(options.getPublisherId(), o.getPublisherId());
				assertEquals(options.getChannelNumber(), o.getChannelNumber());
				assertEquals(options.getFormat(), o.getFormat());
				assertNotNull(o.getContainer());

				finishTest();
			}
		});
	}
}
