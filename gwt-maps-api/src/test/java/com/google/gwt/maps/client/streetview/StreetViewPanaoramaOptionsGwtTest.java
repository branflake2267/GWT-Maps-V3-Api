package com.google.gwt.maps.client.streetview;

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
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.controls.PanControlOptions;

public class StreetViewPanaoramaOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        finishTest();
      }
    });
  }

  public void testDefaults() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();

        assertTrue(options.getsScrollWheel());
        assertFalse(options.getEnableCloseButton());
        assertFalse(options.getDisableDoubleClickZoom());

        finishTest();
      }
    });
  }

  public void testImageDateControl() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();

        options.setImageDateControl(false);
        assertFalse(options.getImageDateControl());

        options.setImageDateControl(true);
        assertTrue(options.getImageDateControl());

        finishTest();
      }
    });
  }

  public void testAddressControl() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        boolean left = true;
        options.setAddressControl(left);
        boolean right = options.getAddressControl();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testClickToGo() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();

        options.setClickToGo(true);
        assertTrue("Should be enabled", options.getClickToGo());

        options.setClickToGo(false);
        assertFalse("Should be disabled", options.getClickToGo());

        finishTest();
      }
    });
  }

  public void testAddressControlOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        StreetViewAddressControlOptions left = StreetViewAddressControlOptions.newInstance();
        left.setPosition(ControlPosition.BOTTOM_CENTER);
        options.setAddressControlOptions(left);
        StreetViewAddressControlOptions right = options.getAddressControlOptions();
        assertEquals(left.getPosition(), right.getPosition());
        finishTest();
      }
    });

  }

  public void testDisableDoubleClickZoom() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        boolean left = true;
        options.setDisableDoubleClickZoom(left);
        boolean right = options.getDisableDoubleClickZoom();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnableCloseButton() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        boolean left = true;
        options.setEnableCloseButton(left);
        boolean right = options.getEnableCloseButton();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testLinksControl() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        boolean left = true;
        options.setLinksControl(left);
        boolean right = options.getLinksControl();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testPanControl() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        boolean left = true;
        options.setPanControl(left);
        boolean right = options.getPanControl();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testPanControlOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        PanControlOptions left = PanControlOptions.newInstance();
        left.setPosition(ControlPosition.BOTTOM_CENTER);
        options.setPanControlOptions(left);
        PanControlOptions right = options.getPanControlOptions();
        assertEquals(left.getPosition(), right.getPosition());
        finishTest();
      }
    });

  }

  public void testPano() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        String left = "test";
        options.setPano(left);
        String right = options.getPano();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  /**
   * TODO finish in render
   */
  public void testPanoProvider() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPanoProvider(new StreetViewPanoramaProvider() {
          @Override
          public StreetViewPanoramaData getPanoData(String pano, int zoom, int tileX, int tileY) {
            // TODO
            return null;
          }
        });
        // TODO assert something
        finishTest();
      }
    });

  }

}
