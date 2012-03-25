/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.ajaxloader.sample.helloajaxloader.client;

import com.google.gwt.ajaxloader.client.AjaxLoader;
import com.google.gwt.ajaxloader.client.AjaxLoader.AjaxLoaderOptions;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Demonstrates the use of the AjaxLoader API.
 */
public class HelloAjaxLoader implements EntryPoint {

  private final VerticalPanel verticalPanel = new VerticalPanel();
  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    verticalPanel.getElement().getStyle().setPropertyPx("margin", 10);
    verticalPanel.setSpacing(10);
    RootPanel.get().add(verticalPanel);
    
    // Uncomment and replace the key below to load a key for the APIs.  You 
    //   could replace this with some kind of lookup based on 
    //   Window.location.getHost() and Window.location.getPort();
    // AjaxLoader.init("ABCDEFG");
    
    AjaxLoader.loadApi("maps", "2", new Runnable() {
      public void run() {
        mapsLoaded();
      }
    }, null);

    AjaxLoaderOptions options = AjaxLoaderOptions.newInstance();
    options.setPackages("imagepiechart");
    AjaxLoader.loadApi("visualization", "1", new Runnable() {   

      public void run() {
        pieChartLoaded();
      }
    }, options);
  }

  /**
   * This method is invoked after the Maps API is successfully loaded.
   */
  private void mapsLoaded() {
    verticalPanel.add(new Label("Maps API loaded with AjaxLoader"));
    SimplePanel mapPanel = new SimplePanel();
    nativeMakeMap(mapPanel.getElement());
    verticalPanel.add(mapPanel);
  }

  /**
   * A snippet of JavaScript that will create a visualization.  See 
   * the gwt-visualization library for GWT wrappers for the Google Visualization 
   * API.
   * 
   * @param chartDiv An element in the DOM to attach the pie chart to.
   */
  private native void nativeMakeImagePieChart(Element chartDiv) /*-{
    var data = new $wnd.google.visualization.DataTable();
    data.addColumn('string', 'Task');
    data.addColumn('number', 'Hours per Day');
    data.addRows(5);
    data.setValue(0, 0, 'Work');
    data.setValue(0, 1, 11);
    data.setValue(1, 0, 'Eat');
    data.setValue(1, 1, 2);
    data.setValue(2, 0, 'Commute');
    data.setValue(2, 1, 2);
    data.setValue(3, 0, 'Watch TV');
    data.setValue(3, 1, 2);
    data.setValue(4, 0, 'Sleep');
    data.setValue(4, 1, 7);

    var chart = new $wnd.google.visualization.ImagePieChart(chartDiv);
    chart.draw(data, {width: 500, height: 200, is3D: true, title: 'My Daily Activities'});
  }-*/;

  private native void nativeMakeMap(Element mapsDiv) /*-{
    var mapOptions = new Object();
    mapOptions.size = new $wnd.GSize(300,300);
    mapOne = new $wnd.GMap2(mapsDiv,
                     mapOptions);
    mapOne.setCenter(new $wnd.GLatLng(37.4419, -122.1419), 13);
  }-*/;
  
  /**
   * This method is invoked after the visualization API is successfully loaded.
   */
  private void pieChartLoaded() {
    verticalPanel.add(new Label("Visualization API loaded with AjaxLoader"));
    SimplePanel chartPanel = new SimplePanel();
    nativeMakeImagePieChart(chartPanel.getElement());
    verticalPanel.add(chartPanel);
  }
}

