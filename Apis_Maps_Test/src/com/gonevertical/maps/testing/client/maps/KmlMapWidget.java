package com.gonevertical.maps.testing.client.maps;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.events.kmlmouse.KmlMouseMapEvent;
import com.google.gwt.maps.client.events.kmlmouse.KmlMouseMapHandler;
import com.google.gwt.maps.client.layers.KmlFeatureData;
import com.google.gwt.maps.client.layers.KmlLayer;
import com.google.gwt.maps.client.layers.KmlLayerMetadata;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/layers.html#FusionTables}
 */
public class KmlMapWidget extends Composite {

  private VerticalPanel pWidget;

  private MapWidget mapWidget;

  private boolean changeState;
  
  public KmlMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("&nbsp;"));

    HorizontalPanel hp = new HorizontalPanel();
    hp.add(new HTML("Kml Example - Try clicking on marker &nbsp;&nbsp;&nbsp;"));

    pWidget.add(hp);

    drawMap();

    //draw kmls
    //changeKmlState();
    
    drawKml2();
  }

  private void drawMap() {
    LatLng center = LatLng.newInstance(49.496675,-102.65625);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(4);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.ROADMAP);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");
  }

  private void drawKml2() {

    //String url = "http://api.flickr.com/services/feeds/geo/?g=322338@N20&lang=en-us&format=feed-georss";
    
    // TODO this won't work in devmode but works in production, can't point to localhost. 
    String base = GWT.getHostPageBaseURL();
    String url = base + "/kmlgenerator?id=120234&pass=1345&msg=hi";

    KmlLayer o = KmlLayer.newInstance(url);
    o.setMap(mapWidget);

    o.addClickHandler(new KmlMouseMapHandler() {
      public void onEvent(KmlMouseMapEvent event) {
        KmlFeatureData featureData = event.getFeatureData();
        LatLng latlng = event.getLatLng();
        Size size = event.getPixelOffset();
        System.out.println("clicked featureData=" + featureData.getToString());
      }
    });

    // TODO I need a better link with more meta data
    KmlLayerMetadata metaData = o.getMetadata();
    //    KmlAuthor author = metaData.getAuthor();
    //    String authName = author.getName();
    //    String authEmail = author.getEmail();
    //    String authUri = author.getUri();
    //    
    //    String desc = metaData.getDescription();
    //    String name = metaData.getName();
    //    String snippet = metaData.getSnippet();

    //System.out.println("work? authName=" + authName);

  }

}
