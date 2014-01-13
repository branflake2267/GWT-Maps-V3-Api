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

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.overlays.IconSequence;
import com.google.gwt.maps.client.overlays.Polyline;
import com.google.gwt.maps.client.overlays.PolylineOptions;
import com.google.gwt.maps.client.overlays.Symbol;
import com.google.gwt.maps.client.overlays.SymbolPath;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Example of a Polyline drawn on a Map. <br>
 * <br>
 * See <a href="https://github.com/branflake2267/GWT-Maps-V3-Api/issues/14">API
 * Issue 14</a>
 * 
 * @author Joseph Lust
 */
public class PolylineMapWidget extends Composite {

  private VerticalPanel pWidget;
  private MapWidget mapWidget;

  public PolylineMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    Anchor sectionAnchor = new Anchor();
    sectionAnchor.setName("polylineExample");
    pWidget.add(sectionAnchor);

    pWidget.add(new HTML("<br>Map with Polyline. 3 lines of 12 points, 12 points and 165 points."));

    drawMap();
    drawPolyline();
  }

  /**
   * Place map in the widget
   */
  private void drawMap() {
    LatLng center = LatLng.newInstance(35.871790d, -78.757d);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(14);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.HYBRID);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");
  }

  /**
   * Add {@link Polyline} overlay to {@link MapWidget} with an {@link IconSequence}
   */
  private void drawPolyline() {

    /*** (1) A nice simple line ***/
    LatLng[] a = new LatLng[12];
    a[0] = LatLng.newInstance(35.859300, -78.765407);
    a[1] = LatLng.newInstance(35.860622, -78.763282);
    a[2] = LatLng.newInstance(35.861074, -78.763862);
    a[3] = LatLng.newInstance(35.861770, -78.764055);
    a[4] = LatLng.newInstance(35.863752, -78.763647);
    a[5] = LatLng.newInstance(35.867561, -78.763518);
    a[6] = LatLng.newInstance(35.869091, -78.762445);
    a[7] = LatLng.newInstance(35.869195, -78.761823);
    a[8] = LatLng.newInstance(35.868239, -78.759162);
    a[9] = LatLng.newInstance(35.868256, -78.758519);
    a[10] = LatLng.newInstance(35.871369, -78.756759);
    a[11] = LatLng.newInstance(35.874168, -78.756781);
    JsArray<LatLng> simpleLatLngArr = ArrayHelper.toJsArray(a);
    
    // Draw various recurring symbols on the map
    // different colors and sizes/types shown
	final Symbol icon1 = Symbol.newInstance(SymbolPath.CIRCLE, 4d);
	icon1.setStrokeColor("blue");
	final Symbol icon2 = Symbol.newInstance(SymbolPath.FORWARD_CLOSED_ARROW, 5d);
	icon2.setStrokeColor("yellow");
	final Symbol icon3 = Symbol.newInstance(SymbolPath.FORWARD_OPEN_ARROW, 3d);
	icon3.setStrokeColor("orange");
	
	// start different sequences in different areas
	final IconSequence iconSeq1 = IconSequence.newInstance();
	iconSeq1.setIcon(icon1);
	iconSeq1.setOffset("10%");
	iconSeq1.setRepeat("22%");

	final IconSequence iconSeq2 = IconSequence.newInstance();
	iconSeq2.setIcon(icon2);
	iconSeq2.setOffset("50%");
	iconSeq2.setRepeat("7%");
	
	final IconSequence iconSeq3 = IconSequence.newInstance();
	iconSeq3.setIcon(icon3);
	iconSeq3.setOffset("70%");
	iconSeq3.setRepeat("5%");

	final JsArray<IconSequence> iconsArr = ArrayHelper
			.toJsArray(new IconSequence[] { iconSeq1, iconSeq2, iconSeq3 });

    PolylineOptions opts = PolylineOptions.newInstance();
    // opts.setMap(mapWidget); // you can attach it to the map here
    opts.setPath(simpleLatLngArr);
    opts.setStrokeColor("#0000FF");
    opts.setStrokeOpacity(1.0);
    opts.setStrokeWeight(2);
	opts.setIcons(iconsArr);
	
    Polyline polyLine = Polyline.newInstance(opts);
    polyLine.setMap(mapWidget); // or here, but this can also reassign it if you
                                // like
    // this allows you to make polylines with no map, and then display them as
    // needed

    /*** (2) Another simple line reusing some of the above ***/
    LatLng[] b = new LatLng[12];
    b[0] = LatLng.newInstance(35.864535, -78.761544);
    b[1] = LatLng.newInstance(35.864048, -78.761458);
    b[2] = LatLng.newInstance(35.863804, -78.762360);
    b[3] = LatLng.newInstance(35.862900, -78.762188);
    b[4] = LatLng.newInstance(35.861300, -78.762960);
    b[5] = LatLng.newInstance(35.860813, -78.763003);
    b[6] = LatLng.newInstance(35.860953, -78.761544);
    b[7] = LatLng.newInstance(35.859944, -78.759613);
    b[8] = LatLng.newInstance(35.860187, -78.758497);
    b[9] = LatLng.newInstance(35.860187, -78.756952);
    b[10] = LatLng.newInstance(35.861057, -78.755836);
    b[11] = LatLng.newInstance(35.861926, -78.756180);
    JsArray<LatLng> simpleLatLngArr2 = ArrayHelper.toJsArray(b);

    PolylineOptions opts3 = PolylineOptions.newInstance();
    opts3.setMap(mapWidget);
    opts3.setPath(simpleLatLngArr2);
    opts3.setStrokeColor("#00FF00");
    opts3.setStrokeOpacity(1.0);
    opts3.setStrokeWeight(2);

    @SuppressWarnings("unused")
    Polyline polyLine2 = Polyline.newInstance(opts3);

    /*** (2) A longer line ***/
    // NOTE: this is just an example - usually you would pull these values from
    // a database via RPC/XHR or from an XML file
    double[] lngPoints = new double[] { -78.759110, -78.758900, -78.758660, -78.758530, -78.758340, -78.758230,
        -78.758300, -78.758210, -78.758070, -78.757890, -78.757790, -78.757810, -78.757890, -78.757770, -78.757650,
        -78.757260, -78.757160, -78.757250, -78.757200, -78.757230, -78.757370, -78.757300, -78.756980, -78.756940,
        -78.756950, -78.757140, -78.757190, -78.757190, -78.757090, -78.756930, -78.756590, -78.756760, -78.755650,
        -78.754790, -78.754450, -78.754060, -78.753400, -78.752990, -78.752630, -78.752510, -78.752290, -78.751970,
        -78.751630, -78.750420, -78.750010, -78.749700, -78.749320, -78.749260, -78.749250, -78.749190, -78.748670,
        -78.748560, -78.748240, -78.747880, -78.747230, -78.747420, -78.747840, -78.748150, -78.748260, -78.748730,
        -78.749330, -78.749870, -78.750190, -78.750540, -78.750890, -78.751370, -78.751640, -78.751730, -78.751780,
        -78.751740, -78.751850, -78.752040, -78.752230, -78.752370, -78.752720, -78.752800, -78.752650, -78.752610,
        -78.752790, -78.752750, -78.752840, -78.752770, -78.752640, -78.752730, -78.752610, -78.752490, -78.751960,
        -78.751580, -78.751160, -78.750290, -78.749940, -78.749190, -78.748980, -78.748680, -78.748300, -78.747970,
        -78.747470, -78.747370, -78.747100, -78.746850, -78.746750, -78.746240, -78.745870, -78.745760, -78.745600,
        -78.745610, -78.745440, -78.745460, -78.745330, -78.745140, -78.744340, -78.744180, -78.744100, -78.744140,
        -78.744020, -78.743890, -78.743470, -78.743340, -78.743060, -78.742930, -78.742790, -78.742580, -78.742420,
        -78.742240, -78.741820, -78.741480, -78.740300, -78.739860, -78.739570, -78.739560, -78.739620, -78.739690,
        -78.740100, -78.740230, -78.740200, -78.740010, -78.740050, -78.740190, -78.740570, -78.740800, -78.741020,
        -78.741110, -78.741060, -78.741330, -78.742010, -78.742190, -78.742510, -78.743730, -78.744190, -78.744470,
        -78.744880, -78.745090, -78.745490, -78.746380, -78.746680, -78.746870, -78.747030, -78.747120, -78.747390,
        -78.747580, -78.748200, -78.748440, -78.748640, -78.749100, -78.749330 };
    double[] latPoints = new double[] { 35.871900, 35.871910, 35.871810, 35.871630, 35.871530, 35.871600, 35.872110,
        35.872290, 35.872390, 35.872370, 35.872250, 35.872100, 35.871970, 35.871790, 35.871710, 35.871760, 35.871900,
        35.872140, 35.872560, 35.872710, 35.872920, 35.873100, 35.873510, 35.873950, 35.874080, 35.874130, 35.874290,
        35.874480, 35.874640, 35.874700, 35.874650, 35.874170, 35.874120, 35.873970, 35.873830, 35.873500, 35.872870,
        35.872390, 35.871770, 35.871290, 35.870800, 35.870690, 35.870630, 35.870860, 35.870810, 35.870680, 35.870260,
        35.870050, 35.869390, 35.869110, 35.868340, 35.867830, 35.867830, 35.867400, 35.867170, 35.866810, 35.864720,
        35.863690, 35.863360, 35.862590, 35.861920, 35.861850, 35.861710, 35.861460, 35.861280, 35.861250, 35.861100,
        35.861090, 35.861130, 35.861440, 35.861490, 35.861400, 35.861120, 35.860650, 35.860030, 35.859720, 35.859260,
        35.858510, 35.857480, 35.857070, 35.856950, 35.856640, 35.856430, 35.855980, 35.855830, 35.855700, 35.855430,
        35.855120, 35.854880, 35.854720, 35.854700, 35.854770, 35.854710, 35.854610, 35.854310, 35.854280, 35.854040,
        35.854020, 35.854150, 35.854000, 35.853760, 35.853450, 35.853360, 35.853540, 35.854090, 35.854210, 35.854670,
        35.855360, 35.855920, 35.856130, 35.856580, 35.856720, 35.856950, 35.857300, 35.857440, 35.857450, 35.857250,
        35.857140, 35.856360, 35.855770, 35.855450, 35.855220, 35.855190, 35.855260, 35.855760, 35.856060, 35.856790,
        35.857200, 35.857730, 35.858260, 35.858770, 35.858920, 35.859350, 35.859740, 35.859940, 35.860300, 35.860980,
        35.861050, 35.861090, 35.861200, 35.861370, 35.861490, 35.862020, 35.862050, 35.862030, 35.862270, 35.862460,
        35.863130, 35.863280, 35.863250, 35.863080, 35.863040, 35.863140, 35.863120, 35.863060, 35.862900, 35.862270,
        35.862180, 35.862020, 35.862000, 35.861690, 35.861620, 35.861620, 35.861870, 35.861920 };

    // how you can make a bunch of LatLng objects
    ArrayList<LatLng> ptList = new ArrayList<LatLng>();
    int n = 0;
    for (double lng : lngPoints) {
      ptList.add(LatLng.newInstance(latPoints[n], lng));
      n++;
    }
    JsArray<LatLng> bigLatLngArr = ArrayHelper.toJsArray(ptList.toArray(new LatLng[] {})); // convert
                                                                                           // list->array->JsArray

    PolylineOptions opts2 = PolylineOptions.newInstance(); // you can reuse
                                                           // this, if your
                                                           // lines look the
                                                           // same
    opts2.setMap(mapWidget);
    opts2.setPath(bigLatLngArr);
    opts2.setStrokeColor("#FF0000");
    opts2.setStrokeOpacity(1.0);
    opts2.setStrokeWeight(2);

    Polyline bigPolyLine = Polyline.newInstance(opts2);
    mapWidget.setCenter(getPolyLineCenter(bigPolyLine));

  }

  /**
   * Return the center of a given polyline - send from server if it is a ton of
   * points due to full path scan
   * 
   * @param polyline
   * @return
   */
  // TODO can be moved into a utility class if frequently used
  private LatLng getPolyLineCenter(Polyline polyline) {
    if (polyline == null) {
      return null;
    }

    // checks
    JsArray<LatLng> path = polyline.getPath().getArray();
    if (path.length() == 0) {
      return null;
    }
    LatLng startPt = path.get(0);
    if (path.length() == 1) {
      return startPt;
    }

    double maxLat = startPt.getLatitude(), minLat = startPt.getLatitude(), maxLng = startPt.getLongitude(), minLng = startPt
        .getLongitude();
    for (int n = 1; n < path.length(); n++) {
      LatLng p = path.get(n);
      if (p.getLatitude() > maxLat) {
        maxLat = p.getLatitude();
      }
      if (p.getLongitude() > maxLng) {
        maxLng = p.getLongitude();
      }
      if (p.getLatitude() < minLat) {
        minLat = p.getLatitude();
      }
      if (p.getLongitude() < minLng) {
        minLng = p.getLongitude();
      }
    }

    return LatLng.newInstance(minLat + 0.5 * (maxLat - minLat), minLng + 0.5 * (maxLng - minLng));
  }

}
