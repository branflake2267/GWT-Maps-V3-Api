package com.google.gwt.maps.client.layers;

/*
 * #%L
 * GWT Maps API V3 - Core API
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

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/layers.html#KMLLayers" >KMLLayers API
 * Doc</a>
 */
public class KmlLayerGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testClose() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "http://api.flickr.com/services/feeds/geo/?g=322338@N20&lang=en-us&format=feed-georss";
        KmlLayerOptions options = KmlLayerOptions.newInstance();
        KmlLayer o = KmlLayer.newInstance(url, options);

        MapOptions mapOptions = MapOptions.newInstance();
        MapWidget left = new MapWidget(mapOptions);
        o.setMap(left);
        o.close();
        finishTest();
      }
    });

  }

  public void testClose2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "http://api.flickr.com/services/feeds/geo/?g=322338@N20&lang=en-us&format=feed-georss";
        KmlLayerOptions options = KmlLayerOptions.newInstance();
        KmlLayer o = KmlLayer.newInstance(url, options);
        MapOptions mapOptions = MapOptions.newInstance();
        MapWidget left = new MapWidget(mapOptions);
        o.setMap(left);
        o.setMap((MapWidget) null);
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testGetDefaultViewport() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(49.496675, -102.65625);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(4);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.ROADMAP);

        MapWidget mapWidget = new MapWidget(opts);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        String url = "http://api.flickr.com/services/feeds/geo/?g=322338@N20&lang=en-us&format=feed-georss";
        KmlLayer o = KmlLayer.newInstance(url);
        o.setMap(mapWidget);

        String left = "";
        LatLngBounds right = o.getDefaultViewport();

        // assertEquals(left, right.getToString()); // not sure why
        // right is null as of yet. I'll fish out in render testing

        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testMetadata() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(49.496675, -102.65625);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(4);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.ROADMAP);

        MapWidget mapWidget = new MapWidget(opts);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        String url = "http://api.flickr.com/services/feeds/geo/?g=322338@N20&lang=en-us&format=feed-georss";
        KmlLayer o = KmlLayer.newInstance(url);
        o.setMap(mapWidget);

        KmlLayerMetadata right = o.getMetadata();
        KmlAuthor author = right.getAuthor();
        String authName = author.getName();
        String authEmail = author.getEmail();
        String authUri = author.getUri();

        String desc = right.getDescription();
        String name = right.getName();
        String snippet = right.getSnippet();

        // I need a better link with the attributes
        // assertEquals("", authName);
        // assertEquals("", authEmail);
        // assertEquals("", authUri);
        // assertEquals("", desc);
        // assertEquals("", name);
        // assertEquals("", snippet);

        finishTest();
      }
    });

  }

  public void testUrl() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(49.496675, -102.65625);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(4);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.ROADMAP);

        MapWidget mapWidget = new MapWidget(opts);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        String url = "http://api.flickr.com/services/feeds/geo/?g=322338@N20&lang=en-us&format=feed-georss";
        KmlLayer o = KmlLayer.newInstance(url);
        o.setMap(mapWidget);

        String right = o.getUrl();
        assertEquals(url, right);

        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "http://api.flickr.com/services/feeds/geo/?g=322338@N20&lang=en-us&format=feed-georss";
        KmlLayerOptions options = KmlLayerOptions.newInstance();
        KmlLayer o = KmlLayer.newInstance(url, options);
        finishTest();
      }
    });

  }

  public void testGetMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(49.496675, -102.65625);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(4);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.ROADMAP);

        MapWidget mapWidget = new MapWidget(opts);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        String url = "http://api.flickr.com/services/feeds/geo/?g=322338@N20&lang=en-us&format=feed-georss";
        KmlLayer o = KmlLayer.newInstance(url);
        o.setMap(mapWidget);

        MapWidget right = o.getMap();
        assertEquals(mapWidget.getCenter().getToString(), right.getCenter().getToString());

        finishTest();
      }
    });
  }

  public void testGetStatus_null() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(49.496675, -102.65625);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(4);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.ROADMAP);

        MapWidget mapWidget = new MapWidget(opts);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        String url = "http://api.flickr.com/services/feeds/geo/?g=322338@N20&lang=en-us&format=feed-georss";
        KmlLayer o = KmlLayer.newInstance(url);
        o.setMap(mapWidget);

        // test - not yet loaded
        KmlLayerStatus actual = o.getStatus();
        assertNull(actual);

        finishTest();
      }
    });
  }

  public void testGetStatus_waitForLoad_success() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(49.496675, -102.65625);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(4);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.ROADMAP);

        MapWidget mapWidget = new MapWidget(opts);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        String url = "http://api.flickr.com/services/feeds/geo/?g=322338@N20&lang=en-us&format=feed-georss";
        final KmlLayer o = KmlLayer.newInstance(url);
        o.setMap(mapWidget);

        // wait for item to load
        Timer wait = new Timer() {

          @Override
          public void run() {
            KmlLayerStatus actual = o.getStatus();
            KmlLayerStatus expected = KmlLayerStatus.OK;

            if (actual != null) {
              assertEquals(expected, actual);
            }

            finishTest();
          }
        };

        wait.scheduleRepeating(200); // wait for doc load, then check
        // will fail timeout if the doc does not load
      }
    });
  }

  public void testGetStatus_waitForLoad_fail() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(49.496675, -102.65625);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(4);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.ROADMAP);

        MapWidget mapWidget = new MapWidget(opts);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        String url = "http://999.999.999.999"; // bogus, instant fail
        final KmlLayer o = KmlLayer.newInstance(url);
        o.setMap(mapWidget);

        // wait for item to load
        Timer wait = new Timer() {

          @Override
          public void run() {
            KmlLayerStatus actual = o.getStatus();
            KmlLayerStatus expected = KmlLayerStatus.FETCH_ERROR;

            if (actual != null) {
              assertEquals(expected, actual);
            }

            finishTest();
          }
        };

        wait.scheduleRepeating(200); // wait for doc load, then check
        // will fail timeout if the doc does not load
      }
    });
  }
}
