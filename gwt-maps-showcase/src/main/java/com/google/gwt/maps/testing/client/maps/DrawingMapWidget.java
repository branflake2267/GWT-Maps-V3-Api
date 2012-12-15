package com.google.gwt.maps.testing.client.maps;

/*
 * #%L
 * GWT Maps API V3 - Showcase
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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.drawinglib.DrawingControlOptions;
import com.google.gwt.maps.client.drawinglib.DrawingManager;
import com.google.gwt.maps.client.drawinglib.DrawingManagerOptions;
import com.google.gwt.maps.client.drawinglib.OverlayType;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.overlaycomplete.OverlayCompleteMapEvent;
import com.google.gwt.maps.client.events.overlaycomplete.OverlayCompleteMapHandler;
import com.google.gwt.maps.client.events.overlaycomplete.circle.CircleCompleteMapEvent;
import com.google.gwt.maps.client.events.overlaycomplete.circle.CircleCompleteMapHandler;
import com.google.gwt.maps.client.events.overlaycomplete.marker.MarkerCompleteMapEvent;
import com.google.gwt.maps.client.events.overlaycomplete.marker.MarkerCompleteMapHandler;
import com.google.gwt.maps.client.events.overlaycomplete.polygon.PolygonCompleteMapEvent;
import com.google.gwt.maps.client.events.overlaycomplete.polygon.PolygonCompleteMapHandler;
import com.google.gwt.maps.client.events.overlaycomplete.polyline.PolylineCompleteMapEvent;
import com.google.gwt.maps.client.events.overlaycomplete.polyline.PolylineCompleteMapHandler;
import com.google.gwt.maps.client.events.overlaycomplete.rectangle.RectangleCompleteMapEvent;
import com.google.gwt.maps.client.events.overlaycomplete.rectangle.RectangleCompleteMapHandler;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.maps.client.overlays.Circle;
import com.google.gwt.maps.client.overlays.CircleOptions;
import com.google.gwt.maps.client.overlays.Marker;
import com.google.gwt.maps.client.overlays.Polygon;
import com.google.gwt.maps.client.overlays.PolygonOptions;
import com.google.gwt.maps.client.overlays.Polyline;
import com.google.gwt.maps.client.overlays.Rectangle;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/layers.html#FusionTables"
 * >FusionTables API Doc</a>
 */
public class DrawingMapWidget extends Composite {

  private final VerticalPanel pWidget;

  private MapWidget mapWidget;

  public DrawingMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
    drawShapes();
  }

  public final native void browserLog(Object obj)/*-{
                                                 $wnd.console.log(obj);
                                                 }-*/;

  private void drawShapes() {
    // add some draw shapes for folks
    CircleOptions cOpts = CircleOptions.newInstance();
    cOpts.setCenter(LatLng.newInstance(52.62d, -119.95d));
    cOpts.setFillColor("#FF0000");
    cOpts.setStrokeColor("CCFF44");
    cOpts.setFillOpacity(0.5d);
    cOpts.setStrokeOpacity(0.9d);
    cOpts.setStrokeWeight(3);
    cOpts.setRadius(1000000d);
    cOpts.setMap(mapWidget);
    @SuppressWarnings("unused")
    Circle circle = Circle.newInstance(cOpts);

    cOpts = CircleOptions.newInstance();
    cOpts.setCenter(LatLng.newInstance(40.569d, -82.7929d));
    cOpts.setFillColor("#00FF00");
    cOpts.setStrokeColor("FFCCFF");
    cOpts.setFillOpacity(0.7d);
    cOpts.setStrokeOpacity(0.9d);
    cOpts.setStrokeWeight(10);
    cOpts.setRadius(300000d);
    cOpts.setMap(mapWidget);
    @SuppressWarnings("unused")
    Circle circle2 = Circle.newInstance(cOpts);

    LatLng[] a = new LatLng[18];
    a[0] = LatLng.newInstance(49.02824580511537, -104.0899658203125);
    a[1] = LatLng.newInstance(43.009982694835784, -104.0679931640625);
    a[2] = LatLng.newInstance(43.026047765621, -98.5528564453125);
    a[3] = LatLng.newInstance(42.73623356449312, -98.0255126953125);
    a[4] = LatLng.newInstance(42.89740952345494, -97.9156494140625);
    a[5] = LatLng.newInstance(42.83298955227273, -97.3883056640625);
    a[6] = LatLng.newInstance(42.52607693975099, -96.5753173828125);
    a[7] = LatLng.newInstance(43.20248609768505, -96.4654541015625);
    a[8] = LatLng.newInstance(43.521979415112206, -96.6192626953125);
    a[9] = LatLng.newInstance(43.69698341176971, -96.5093994140625);
    a[10] = LatLng.newInstance(45.32638440880054, -96.4215087890625);
    a[11] = LatLng.newInstance(45.54224714353031, -96.9708251953125);
    a[12] = LatLng.newInstance(45.757284242039375, -96.6851806640625);
    a[13] = LatLng.newInstance(46.23050041945144, -96.5533447265625);
    a[14] = LatLng.newInstance(46.714738770992284, -96.9049072265625);
    a[15] = LatLng.newInstance(47.67030090972658, -96.8170166015625);
    a[16] = LatLng.newInstance(47.98009843932673, -97.1466064453125);
    a[17] = LatLng.newInstance(48.97058369834937, -97.2125244140625);
    JsArray<LatLng> paths = ArrayHelper.toJsArray(a);

    PolygonOptions pOpts = PolygonOptions.newInstance();
    pOpts.setFillColor("#0000FF");
    pOpts.setStrokeColor("FFFFFF");
    pOpts.setFillOpacity(0.4d);
    pOpts.setStrokeOpacity(0.9d);
    pOpts.setStrokeWeight(6);
    pOpts.setPaths(paths);
    pOpts.setMap(mapWidget);
    @SuppressWarnings("unused")
    Polygon polygon = Polygon.newInstance(pOpts);
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>Map with Drawing"));

    drawMap();

    drawDrawing();

    // drawMapAds();
  }

  private void drawMap() {
    LatLng center = LatLng.newInstance(49.496675, -102.65625);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(4);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.HYBRID);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");

    mapWidget.addClickHandler(new ClickMapHandler() {
      @Override
      public void onEvent(ClickMapEvent event) {
        GWT.log("clicked on latlng=" + event.getMouseEvent().getLatLng());
      }
    });
  }

  private void drawDrawing() {

    DrawingControlOptions drawingControlOptions = DrawingControlOptions.newInstance();
    drawingControlOptions.setPosition(ControlPosition.TOP_CENTER);
    drawingControlOptions.setDrawingModes(OverlayType.values());

    CircleOptions circleOptions = CircleOptions.newInstance();
    // circleOptions.setFillColor("FF6633");

    DrawingManagerOptions options = DrawingManagerOptions.newInstance();
    options.setMap(mapWidget);
    options.setDrawingMode(OverlayType.CIRCLE);
    options.setCircleOptions(circleOptions);

    options.setDrawingControlOptions(drawingControlOptions);

    DrawingManager o = DrawingManager.newInstance(options);

    o.addCircleCompleteHandler(new CircleCompleteMapHandler() {
      @Override
      public void onEvent(CircleCompleteMapEvent event) {
        Circle circle = event.getCircle();
        GWT.log("circle completed radius=" + circle.getRadius());
      }
    });

    o.addMarkerCompleteHandler(new MarkerCompleteMapHandler() {
      @Override
      public void onEvent(MarkerCompleteMapEvent event) {
        Marker marker = event.getMarker();
        GWT.log("marker completed position=" + marker.getPosition());
      }
    });

    o.addOverlayCompleteHandler(new OverlayCompleteMapHandler() {
      @Override
      public void onEvent(OverlayCompleteMapEvent event) {
        OverlayType ot = event.getOverlayType();
        GWT.log("marker completed OverlayType=" + ot.toString());

        if (ot == OverlayType.CIRCLE) {
          Circle circle = event.getCircle();
          GWT.log("radius=" + circle.getRadius());
          GWT.log("center=" + circle.getBounds().getCenter());
        }

        if (ot == OverlayType.MARKER) {
          Marker marker = event.getMarker();
          GWT.log("position=" + marker.getPosition());
          GWT.log("center=" + marker.getPosition());
        }

        if (ot == OverlayType.POLYGON) {
          Polygon polygon = event.getPolygon();
          GWT.log("paths=" + polygon.getPaths().toString());

          // print path points
          MVCArray<LatLng> points = polygon.getPath();
          for (int g = 0; g < points.getLength(); g++) {
            LatLng p = points.get(g);
            GWT.log("[" + p.getLatitude() + "," + p.getLongitude() + "]");
          }

          GWT.log("center=" + polygon.getPath());
        }

        if (ot == OverlayType.POLYLINE) {
          Polyline polyline = event.getPolyline();
          GWT.log("paths=" + polyline.getPath().toString());
          GWT.log("center=" + polyline.getPath());
        }

        if (ot == OverlayType.RECTANGLE) {
          Rectangle rectangle = event.getRectangle();
          GWT.log("bounds=" + rectangle.getBounds());
          GWT.log("center=" + rectangle.getBounds().getCenter());
        }

        GWT.log("marker completed OverlayType=" + ot.toString());
      }
    });

    o.addPolygonCompleteHandler(new PolygonCompleteMapHandler() {
      @Override
      public void onEvent(PolygonCompleteMapEvent event) {
        Polygon polygon = event.getPolygon();
        GWT.log("Polygon completed paths=" + polygon.getPath().toString());
      }
    });

    o.addPolylineCompleteHandler(new PolylineCompleteMapHandler() {
      @Override
      public void onEvent(PolylineCompleteMapEvent event) {
        Polyline polyline = event.getPolyline();
        GWT.log("Polyline completed paths=" + polyline.getPath().toString());
      }
    });

    o.addRectangleCompleteHandler(new RectangleCompleteMapHandler() {
      @Override
      public void onEvent(RectangleCompleteMapEvent event) {
        Rectangle rectangle = event.getRectangle();
        GWT.log("Rectangle completed bounds=" + rectangle.getBounds().getToString());
      }
    });

  }

}
