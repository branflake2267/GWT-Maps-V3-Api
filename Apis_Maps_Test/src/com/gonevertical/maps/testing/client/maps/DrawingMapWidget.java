package com.gonevertical.maps.testing.client.maps;

import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.adsense.AdFormat;
import com.google.gwt.maps.client.adsense.AdUnitOptions;
import com.google.gwt.maps.client.adsense.AdUnitWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.drawinglib.DrawingControlOptions;
import com.google.gwt.maps.client.drawinglib.DrawingManager;
import com.google.gwt.maps.client.drawinglib.DrawingManagerOptions;
import com.google.gwt.maps.client.drawinglib.OverlayType;
import com.google.gwt.maps.client.events.channelnumber.ChannelNumberChangeMapEvent;
import com.google.gwt.maps.client.events.channelnumber.ChannelNumberChangeMapHandler;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.format.FormatChangeMapEvent;
import com.google.gwt.maps.client.events.format.FormatChangeMapHandler;
import com.google.gwt.maps.client.events.mapchange.MapChangeMapEvent;
import com.google.gwt.maps.client.events.mapchange.MapChangeMapHandler;
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
import com.google.gwt.maps.client.events.position.PositionChangeMapEvent;
import com.google.gwt.maps.client.events.position.PositionChangeMapHandler;
import com.google.gwt.maps.client.overlays.Circle;
import com.google.gwt.maps.client.overlays.CircleOptions;
import com.google.gwt.maps.client.overlays.Marker;
import com.google.gwt.maps.client.overlays.Polygon;
import com.google.gwt.maps.client.overlays.Polyline;
import com.google.gwt.maps.client.overlays.Rectangle;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/layers.html#FusionTables}
 */
public class DrawingMapWidget extends Composite {

  private VerticalPanel pWidget;

  private MapWidget mapWidget;

  public DrawingMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>Map with Drawing"));

    drawMap();

    drawDrawing();

    //drawMapAds();
  }

  private void drawMap() {
    LatLng center = LatLng.newInstance(49.496675,-102.65625);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(4);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.HYBRID);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");

    mapWidget.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
        // TODO fix the event getting, getting ....
        System.out.println("clicked on latlng=" + event.getMouseEvent().getLatLng());
      }
    });
  }


  private void drawDrawing() {

    DrawingControlOptions drawingControlOptions = DrawingControlOptions.newInstance();
    drawingControlOptions.setPosition(ControlPosition.TOP_CENTER);
    drawingControlOptions.setDrawingModes(OverlayType.values());

    CircleOptions circleOptions = CircleOptions.newInstance();
    //circleOptions.setFillColor("FF6633");

    DrawingManagerOptions options = DrawingManagerOptions.newInstance();
    options.setMap(mapWidget);
    options.setDrawingMode(OverlayType.CIRCLE);
    options.setCircleOptions(circleOptions);

    options.setDrawingControlOptions(drawingControlOptions);

    DrawingManager o = DrawingManager.newInstance(options); 

    o.addCircleCompleteHandler(new CircleCompleteMapHandler() {
      public void onEvent(CircleCompleteMapEvent event) {
        Circle circle = event.getCircle();
        System.out.println("circle completed radius=" + circle.getRadius());
      }
    });

    o.addMarkerCompleteHandler(new MarkerCompleteMapHandler() {
      public void onEvent(MarkerCompleteMapEvent event) {
        Marker marker = event.getMarker();
        System.out.println("marker completed position=" + marker.getPosition());
      }
    });

    o.addOverlayCompleteHandler(new OverlayCompleteMapHandler() {
      public void onEvent(OverlayCompleteMapEvent event) {
        OverlayType ot = event.getOverlayType();
        System.out.println("marker completed OverlayType=" + ot.toString());

        if (ot == OverlayType.CIRCLE) {
          Circle circle = event.getCircle();
          System.out.println("radius=" + circle.getRadius());
        }

        if (ot == OverlayType.MARKER) {
          Marker marker = event.getMarker();
          System.out.println("position=" + marker.getPosition());
        }

        if (ot == OverlayType.POLYGON) {
          Polygon polygon = event.getPolygon();
          System.out.println("paths=" + polygon.getPaths().toString());
        }

        if (ot == OverlayType.POLYLINE) {
          Polyline polyline = event.getPolyline();
          System.out.println("paths=" + polyline.getPath().toString());
        }

        if (ot == OverlayType.RECTANGLE) {
          Rectangle rectangle = event.getRectangle();
          System.out.println("bounds=" + rectangle.getBounds());
        }

        System.out.println("marker completed OverlayType=" + ot.toString());
      }
    });

    o.addPolygonCompleteHandler(new PolygonCompleteMapHandler() {
      public void onEvent(PolygonCompleteMapEvent event) {
        Polygon polygon = event.getPolygon();
        System.out.println("Polygon completed paths=" + polygon.getPath().toString());
      }
    });

    o.addPolylineCompleteHandler(new PolylineCompleteMapHandler() {
      public void onEvent(PolylineCompleteMapEvent event) {
        Polyline polyline = event.getPolyline();
        System.out.println("Polyline completed paths=" + polyline.getPath().toString());
      }
    });

    o.addRectangleCompleteHandler(new RectangleCompleteMapHandler() {
      public void onEvent(RectangleCompleteMapEvent event) {
        Rectangle rectangle = event.getRectangle();
        System.out.println("Rectangle completed bounds=" + rectangle.getBounds().getToString());
      }
    });

  }

  private void drawMapAds() {

    AdUnitOptions options = AdUnitOptions.newInstance();
    options.setFormat(AdFormat.HALF_BANNER);
    options.setPosition(ControlPosition.RIGHT_CENTER);
    options.setMap(mapWidget);
    options.setPublisherId("pub-0032065764310410");
    options.setChannelNumber("4000893900");

    AdUnitWidget adUnit = new AdUnitWidget(options);

    adUnit.addChannelNumberChangeHandler(new ChannelNumberChangeMapHandler() {
      public void onEvent(ChannelNumberChangeMapEvent event) { 
      }
    });

    adUnit.addFormatChangeHandler(new FormatChangeMapHandler() {
      public void onEvent(FormatChangeMapEvent event) {
      }
    });

    adUnit.addMapChangeHandler(new MapChangeMapHandler() {
      public void onEvent(MapChangeMapEvent event) {
      }
    });

    adUnit.addPositionChangeHandler(new PositionChangeMapHandler() {
      public void onEvent(PositionChangeMapEvent event) {
      }
    });

  }

}
