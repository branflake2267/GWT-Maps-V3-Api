package com.google.gwt.maps.client.maptype;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.controls.MapTypeStyle;
import com.google.gwt.maps.client.maptypes.StyledMapType;
import com.google.gwt.maps.client.maptypes.StyledMapTypeOptions;

public class StyledMapTypeTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StyledMapTypeOptions options = StyledMapTypeOptions
						.newInstance();
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyle[] array = new MapTypeStyle[3];
				array[0] = MapTypeStyle.newInstance();
				array[1] = MapTypeStyle.newInstance();
				array[2] = MapTypeStyle.newInstance();
				JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
				StyledMapTypeOptions options = StyledMapTypeOptions
						.newInstance();
				StyledMapType o = StyledMapType.newInstance(styles, options);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testAlt() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyle[] array = new MapTypeStyle[3];
				array[0] = MapTypeStyle.newInstance();
				array[1] = MapTypeStyle.newInstance();
				array[2] = MapTypeStyle.newInstance();
				JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
				StyledMapTypeOptions options = StyledMapTypeOptions
						.newInstance();
				String left = "test";
				options.setAlt(left);
				String right = options.getAlt();
				assertEquals(left, right);
				StyledMapType o = StyledMapType.newInstance(styles, options);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testMaxZoom() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyle[] array = new MapTypeStyle[3];
				array[0] = MapTypeStyle.newInstance();
				array[1] = MapTypeStyle.newInstance();
				array[2] = MapTypeStyle.newInstance();
				JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
				StyledMapTypeOptions options = StyledMapTypeOptions
						.newInstance();
				int left = 5;
				options.setMaxZoom(left);
				int right = options.getMaxZoom();
				assertEquals(left, right);
				StyledMapType o = StyledMapType.newInstance(styles, options);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testMinZoom() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyle[] array = new MapTypeStyle[3];
				array[0] = MapTypeStyle.newInstance();
				array[1] = MapTypeStyle.newInstance();
				array[2] = MapTypeStyle.newInstance();
				JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
				StyledMapTypeOptions options = StyledMapTypeOptions
						.newInstance();
				int left = 5;
				options.setMinZoom(left);
				int right = options.getMinZoom();
				assertEquals(left, right);
				StyledMapType o = StyledMapType.newInstance(styles, options);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testName() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyle[] array = new MapTypeStyle[3];
				array[0] = MapTypeStyle.newInstance();
				array[1] = MapTypeStyle.newInstance();
				array[2] = MapTypeStyle.newInstance();
				JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
				StyledMapTypeOptions options = StyledMapTypeOptions
						.newInstance();
				String left = "test";
				options.setName(left);
				String right = options.getName();
				assertEquals(left, right);
				StyledMapType o = StyledMapType.newInstance(styles, options);
				finishTest();
			}
		});

	}

}
