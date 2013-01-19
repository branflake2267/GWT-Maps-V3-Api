package com.google.gwt.maps.client.adsense;

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

public class AdFormatGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.ADSENSE };
  }

  public void testReverseEngineer() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        reverseEngineer();
        finishTest();
      }
    });
  }

  private native void reverseEngineer() /*-{
    var array = [ "BANNER", "BUTTON", "HALF_BANNER", "LARGE_RECTANGLE",
        "LEADERBOARD", "MEDIUM_RECTANGLE", "SKYSCRAPER", "SMALL_RECTANGLE",
        "SMALL_SQUARE", "SQUARE", "VERTICAL_BANNER", "WIDE_SKYSCRAPER" ]
    for ( var i = 0; i < array.length; i++) {
      var s = "$wnd.google.maps.adsense.AdFormat." + array[i];
      alert(array[i] + "=" + eval(s));
    }
  }-*/;

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        @SuppressWarnings("unused")
        AdFormat o = AdFormat.BANNER;
        finishTest();
      }
    });
  }

  public void testEnum1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.BANNER;
        String left = "BANNER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.BUTTON;
        String left = "BUTTON";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.HALF_BANNER;
        String left = "HALF_BANNER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum4() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.LARGE_RECTANGLE;
        String left = "LARGE_RECTANGLE";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum5() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.LEADERBOARD;
        String left = "LEADERBOARD";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum6() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.MEDIUM_RECTANGLE;
        String left = "MEDIUM_RECTANGLE";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum7() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.SKYSCRAPER;
        String left = "SKYSCRAPER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum8() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.SMALL_RECTANGLE;
        String left = "SMALL_RECTANGLE";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum9() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.SMALL_SQUARE;
        String left = "SMALL_SQUARE";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum10() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.SQUARE;
        String left = "SQUARE";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum11() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.VERTICAL_BANNER;
        String left = "VERTICAL_BANNER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }

  public void testEnum12() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdFormat o = AdFormat.WIDE_SKYSCRAPER;
        String left = "WIDE_SKYSCRAPER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    });
  }
}
