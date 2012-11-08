package com.google.gwt.maps.client.events;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.user.client.ui.RootPanel;

public class MapHandlerRegistrationTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				MapWidget wMap = new MapWidget(options);
				RootPanel.get().add(wMap);
				wMap.addClickHandler(new ClickMapHandler() {
					@Override
					public void onEvent(ClickMapEvent event) {
					}
				});
				finishTest();
			}
		});

	}

	// public void testClick() {
	// asyncLibTest(new Runnable() {
	// public void run() {
	//
	// MapOptions options = MapOptions.newInstance();
	// MapWidget wMap = new MapWidget(options);
	// RootPanel.get().add(wMap);
	//
	// wMap.addClickHandler(new ClickMapHandler() {
	// public void onEvent(ClickMapEvent event) {
	// MouseEvent me = event.getMouseEvent();
	// LatLng ll = me.getLatLng();
	// System.out.println("click worked " + ll.getToString());
	//
	// // TODO
	//
	// finishTest();
	// }
	// });
	//
	//
	// //LatLng objects = LatLng.newInstance(35d, 35d);
	//
	// // TODO add marker here
	//
	//
	// //MapHandlerRegistration.trigger(wMap, MapEventType.CLICK, objects);
	// }
	// });

	// }

}
