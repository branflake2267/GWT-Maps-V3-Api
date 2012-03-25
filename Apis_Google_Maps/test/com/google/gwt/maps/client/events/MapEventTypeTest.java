package com.google.gwt.maps.client.events;

import com.google.gwt.junit.client.GWTTestCase;

public class MapEventTypeTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  
  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testUseMap() {
    
    // map has 19 of them 12/21/2011
    
    // 1. map
    assertEquals("bounds_changed", MapEventType.BOUNDS_CHANGED.value());
    
    // 2. map
    assertEquals("center_changed", MapEventType.CENTER_CHANGED.value());
    
    // 3. map
    assertEquals("click", MapEventType.CLICK.value());
    
    // 4. map
    assertEquals("dblclick", MapEventType.DBLCLICK.value());
    
    // 5. map
    assertEquals("drag", MapEventType.DRAG.value());
    
    // 6. map
    assertEquals("dragend", MapEventType.DRAGEND.value());
    
    // 7. map
    assertEquals("dragstart", MapEventType.DRAGSTART.value());
    
    // 8. map
    assertEquals("heading_changed", MapEventType.HEADING_CHANGED.value());
    
    // 9. map
    assertEquals("idle", MapEventType.IDLE.value());
    
    // 10. map
    assertEquals("maptypeid_changed", MapEventType.MAPTYPEID_CHANGED.value());
    
    // 11. map
    assertEquals("mousemove", MapEventType.MOUSEMOVE.value());
    
    // 12. map
    assertEquals("mouseout", MapEventType.MOUSEOUT.value());
    
    // 13. map
    assertEquals("mouseover", MapEventType.MOUSEOVER.value());
    
    // 14. map
    assertEquals("projection_changed", MapEventType.PROJECTION_CHANGED.value());
    
    // 15. map
    assertEquals("resize", MapEventType.RESIZE.value());
    
    // 16. map
    assertEquals("rightclick", MapEventType.RIGHTCLICK.value());
    
    // 17. map
    assertEquals("tilesloaded", MapEventType.TILESLOADED.value());
    
    // 18. map
    assertEquals("tilt_changed", MapEventType.TILT_CHANGED.value());
    
    // 19. map
    assertEquals("zoom_changed", MapEventType.ZOOM_CHANGED.value());
    
    
  }
  
  
}
