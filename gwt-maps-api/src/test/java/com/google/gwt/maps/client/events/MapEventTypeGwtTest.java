package com.google.gwt.maps.client.events;

/*
 * #%L
 * GWT Maps API V3 - Core API
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

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class MapEventTypeGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
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
