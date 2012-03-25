package com.google.gwt.maps.client.overlays;

import com.google.gwt.junit.client.GWTTestCase;

public class AnimationTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  
  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testUse1() {
    Animation type = Animation.BOUNCE;
    assertEquals("bounce", type.value());
  }
  
  public void testUse2() {
    Animation type = Animation.DROP;
    assertEquals("drop", type.value());
  }
 
}
