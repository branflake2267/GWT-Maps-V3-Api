package com.google.gwt.maps.testing.client.maps;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.events.fusiontablemouse.FusionTablesMouseMapEvent;
import com.google.gwt.maps.client.events.fusiontablemouse.FusionTablesMouseMapHandler;
import com.google.gwt.maps.client.layers.FusionTablesLayer;
import com.google.gwt.maps.client.layers.FusionTablesLayerOptions;
import com.google.gwt.maps.client.layers.FusionTablesQuery;
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
public class FusionTablesMapWidget extends Composite {

  private VerticalPanel pWidget;

  private MapWidget mapWidget;

  public FusionTablesMapWidget() {

    pWidget = new VerticalPanel();

    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>Fusion Tables Example - Try clicking on marker"));

    setupMap();

    setupFusionTablesLayer();

  }

  private void setupMap() {
    // chicago
    LatLng center = LatLng.newInstance(41.898, -87.632);

    MapOptions options = MapOptions.newInstance();
    options.setCenter(center);
    options.setZoom(12);
    options.setMapTypeId(MapTypeId.ROADMAP);

    mapWidget = new MapWidget(options);
    pWidget.add(mapWidget);

    mapWidget.setSize("750px", "500px");
  }

  private void setupFusionTablesLayer() {

    String select = "address";
    String from = "198945";
    String where = "ridership > 5000";

    FusionTablesQuery query = FusionTablesQuery.newInstance();
    query.setSelect(select);
    query.setFrom(from);
    query.setWhere(where);

    FusionTablesLayerOptions options = FusionTablesLayerOptions.newInstance();
    options.setQuery(query);

    FusionTablesLayer layer = FusionTablesLayer.newInstance(options);
    layer.addClickHandler(new FusionTablesMouseMapHandler() {
      public void onEvent(FusionTablesMouseMapEvent event) {

        @SuppressWarnings("unused")
        String infoWindowHtml = event.getInfoWindowHtml();
        LatLng latlng = event.getLatLng();

        @SuppressWarnings("unused")
        Size pixelOffset = event.getPixelOffset();

        @SuppressWarnings("unused")
        JavaScriptObject jso = event.getRow();
        String json = event.getRowAsJson();
        GWT.log("click on " + latlng.getToString() + "  json=" + json);
      }
    });
    layer.setMap(mapWidget);
  }

}
