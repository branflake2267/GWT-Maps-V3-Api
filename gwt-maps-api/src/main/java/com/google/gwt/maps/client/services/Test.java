package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;

public class Test extends JavaScriptObject {
  
  protected Test() {
  }
  
  public static final Test newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  public final native void test() /*-{
    this.origin = "Arlington, WA";
    this.destination = "Seattle, WA";
    this.travelMode = "DRIVING";
  }-*/;

}
