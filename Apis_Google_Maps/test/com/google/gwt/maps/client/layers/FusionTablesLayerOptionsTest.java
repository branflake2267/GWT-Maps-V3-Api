package com.google.gwt.maps.client.layers;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.user.client.ui.RootPanel;

public class FusionTablesLayerOptionsTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  public void testUse() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesLayerOptions options = FusionTablesLayerOptions.newInstance();
        FusionTablesLayer o = FusionTablesLayer.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
   
  public void testClickable() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesLayerOptions options = FusionTablesLayerOptions.newInstance();
        boolean left = true;
        options.setClickable(left);
        boolean right = options.getClickable();
        assertEquals(left, right);
        FusionTablesLayer o = FusionTablesLayer.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testHeatmap() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesLayerOptions options = FusionTablesLayerOptions.newInstance();
        FusionTableHeatmap left = FusionTableHeatmap.newInstance();
        left.setEnabled(true);
        options.setHeatmap(left);
        FusionTableHeatmap right = options.getHeatmap();
        FusionTablesLayer o = FusionTablesLayer.newInstance(options);
        assertEquals(left.getEnabled(), right.getEnabled());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testMap() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesLayerOptions options = FusionTablesLayerOptions.newInstance();
        FusionTablesLayer o = FusionTablesLayer.newInstance(options);
        MapOptions opts = MapOptions.newInstance();
        MapWidget left = new MapWidget(opts);
        options.setMap(left);
        o.setOptions(options);
        left.setSize("500px", "500px");
        RootPanel.get().add(left);
        o.setMap(left);
        MapWidget right = o.getMap();
        assertEquals(left.getCenter(), right.getCenter());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testQuery() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesLayerOptions options = FusionTablesLayerOptions.newInstance();
        FusionTablesLayer o = FusionTablesLayer.newInstance(options);
        FusionTablesQuery left = FusionTablesQuery.newInstance();
        left.setFrom("outterspace");
        options.setQuery(left);
        FusionTablesQuery right = options.getQuery();
        assertEquals(left.getFrom(), right.getFrom());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testStyles() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesLayerOptions options = FusionTablesLayerOptions.newInstance();
        FusionTablesStyle[] array = new FusionTablesStyle[3];
        array[0] = FusionTablesStyle.newInstance();
        array[1] = FusionTablesStyle.newInstance();
        array[2] = FusionTablesStyle.newInstance();
        JsArray<FusionTablesStyle> left = ArrayHelper.toJsArray(array);
        options.setStyles(left);
        JsArray<FusionTablesStyle> right = options.getStyles();
        assertEquals(left.length(), right.length());
        FusionTablesLayer o = FusionTablesLayer.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testSuppressInfoWindows() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesLayerOptions options = FusionTablesLayerOptions.newInstance();
        boolean left = true;
        options.setSuppressInfoWindows(left);
        FusionTablesLayer o = FusionTablesLayer.newInstance(options);
        boolean right = options.getSuppressInfoWindows();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
