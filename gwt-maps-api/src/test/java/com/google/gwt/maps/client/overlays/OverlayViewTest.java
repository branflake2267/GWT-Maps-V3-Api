package com.google.gwt.maps.client.overlays;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaOptions;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;
import com.google.gwt.maps.client.streetview.StreetViewPov;
import com.google.gwt.user.client.ui.RootPanel;

public class OverlayViewTest extends AbstractMapsGWTTest {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayView o = OverlayView.newInstance();
        finishTest();
      }
    });

  }

  public void testDraw() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayView o = OverlayView.newInstance();

        // TODO - is prototype - not easily tested
        o.draw();

        finishTest();
      }
    });

  }

  public void testMapWidget() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        // no map - confirm null
        OverlayView o = OverlayView.newInstance();
        MapWidget actual = o.getMap();
        assertNull(actual);

        // set a map
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        o.setMap(mapWidget);
        actual = o.getMap();
        assertLatLngEquals(mapWidget.getCenter(), o.getMap().getCenter());

        finishTest();
      }
    });
  }

  public void testPanoMapWidget() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        // no map - confirm null
        OverlayView o = OverlayView.newInstance();
        MapWidget actual = o.getMap();
        assertNull(actual);

        LatLng position = LatLng.newInstance(21.271525, -157.822731);

        StreetViewPov pov = StreetViewPov.newInstance();
        pov.setHeading(250);
        pov.setZoom(1);
        pov.setPitch(10);

        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPosition(position);
        options.setStreeViewPov(pov);

        StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
        // set a map
        RootPanel.get().add(wStreet);

        o.setMap(wStreet);
        // assertNotNull(o.getMap());
        // can't tests because a MapWidget is not being used

        finishTest();
      }
    });
  }

  public void testProjection() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        // set a map
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        // no map - confirm null
        OverlayView o = OverlayView.newInstance();
        o.setMap(mapWidget);

        MapCanvasProjection projection = o.getProjection();
        assertNotNull(projection);

        finishTest();
      }
    });
  }

  public void testGetPanes() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        // set a map
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        // no map - confirm null
        OverlayView o = OverlayView.newInstance();
        o.setMap(mapWidget);

        MapPanes panes = o.getPanes();
        assertNotNull(panes.getMapPane());

        finishTest();
      }
    });
  }

  public void testOnAdd() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayView o = OverlayView.newInstance();

        // TODO - is prototype - not easily tested
        o.onAdd();

        finishTest();
      }
    });

  }

  public void testOnRemove() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayView o = OverlayView.newInstance();

        // TODO - is prototype - not easily tested
        o.onRemove();

        finishTest();
      }
    });

  }

}
