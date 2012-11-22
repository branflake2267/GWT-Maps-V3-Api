package com.google.gwt.maps.testing.client.maps.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TestInfo extends Composite {
  
  public TestInfo() {
    
    VerticalPanel vp = new VerticalPanel();
    initWidget(vp);
    
    Button button = new Button("test");
    
    vp.add(new HTML("test"));
    vp.add(button);
    
    button.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
    	  GWT.log("click handler clicked!");
      }
    });
  }
}
