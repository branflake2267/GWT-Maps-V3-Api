package com.google.gwt.maps.client.maptype;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.controls.MapTypeStyle;
import com.google.gwt.maps.client.maptypes.MapTypeRegistry;
import com.google.gwt.maps.client.maptypes.StyledMapType;
import com.google.gwt.maps.client.maptypes.StyledMapTypeOptions;

public class MapTypeRegistryTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeRegistry o = MapTypeRegistry.newInstance();
				finishTest();
			}
		});

	}

	public void testSet() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeRegistry o = MapTypeRegistry.newInstance();
				assertNotNull(o);

				String id = "myId";

				MapTypeStyle[] array = new MapTypeStyle[3];
				array[0] = MapTypeStyle.newInstance();
				array[1] = MapTypeStyle.newInstance();
				array[2] = MapTypeStyle.newInstance();
				JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
				StyledMapTypeOptions options = StyledMapTypeOptions
						.newInstance();
				StyledMapType styledType = StyledMapType.newInstance(styles,
						options);

				o.set(id, styledType);

				finishTest();
			}
		});

	}

}
