package com.google.gwt.maps.client.maptype;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.controls.MapTypeStyle;
import com.google.gwt.maps.client.maptypes.MapTypeRegistry;
import com.google.gwt.maps.client.maptypes.StyledMapType;
import com.google.gwt.maps.client.maptypes.StyledMapTypeOptions;

public class MapTypeRegistryTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;

	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	public void testWorks() {
		assertEquals(true, true);
	}

	@SuppressWarnings("unused")
	public void testUse() {
		LoadApi.go(new Runnable() {
			public void run() {
				MapTypeRegistry o = MapTypeRegistry.newInstance();
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testSet() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeRegistry o = MapTypeRegistry.newInstance();
        assertNotNull(o);
        
        String id = "myId";
        
        MapTypeStyle[] array = new MapTypeStyle[3];
        array[0] = MapTypeStyle.newInstance();
        array[1] = MapTypeStyle.newInstance();
        array[2] = MapTypeStyle.newInstance();
        JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
        StyledMapTypeOptions options = StyledMapTypeOptions.newInstance();
        StyledMapType styledType = StyledMapType.newInstance(styles, options);
        
        o.set(id, styledType);
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

}
