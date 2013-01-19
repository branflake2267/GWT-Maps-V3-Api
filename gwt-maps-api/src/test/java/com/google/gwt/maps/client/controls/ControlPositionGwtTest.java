package com.google.gwt.maps.client.controls;

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

public class ControlPositionGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testEnum1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.BOTTOM_CENTER;
        String left = "BOTTOM_CENTER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum10() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.TOP_CENTER;
        String left = "TOP_CENTER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum11() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.TOP_LEFT;
        String left = "TOP_LEFT";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum12() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.TOP_RIGHT;
        String left = "TOP_RIGHT";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.BOTTOM_LEFT;
        String left = "BOTTOM_LEFT";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.BOTTOM_RIGHT;
        String left = "BOTTOM_RIGHT";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum4() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.LEFT_CENTER;
        String left = "LEFT_CENTER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum5() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.LEFT_BOTTOM;
        String left = "LEFT_BOTTOM";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum6() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.LEFT_TOP;
        String left = "LEFT_TOP";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum7() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.RIGHT_BOTTOM;
        String left = "RIGHT_BOTTOM";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum8() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.RIGHT_CENTER;
        String left = "RIGHT_CENTER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum9() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.RIGHT_TOP;
        String left = "RIGHT_TOP";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    });
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ControlPosition o = ControlPosition.BOTTOM_CENTER;
        finishTest();
      }
    });
  }

}
