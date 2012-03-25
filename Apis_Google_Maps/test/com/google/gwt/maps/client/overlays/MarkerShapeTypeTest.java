package com.google.gwt.maps.client.overlays;

import com.google.gwt.junit.client.GWTTestCase;

public class MarkerShapeTypeTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  
  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testUse1() {
    MarkerShapeType type = MarkerShapeType.CIRCLE;
    assertEquals("circle", type.value());
  }
  
  public void testUse2() {
    MarkerShapeType type = MarkerShapeType.POLY;
    assertEquals("poly", type.value());
  }
  
  public void testUse3() {
    MarkerShapeType type = MarkerShapeType.RECT;
    assertEquals("rect", type.value());
  }
 
}
