package com.google.gwt.maps.client.maptype;

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
import com.google.gwt.maps.client.maptypes.MapTypeStyler;

public class MapTypeStylerGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyler options = MapTypeStyler.newGammaStyler(44.4);

        finishTest();
      }
    });

  }

  public void testGamma() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        double left = 0.01f;
        MapTypeStyler options = MapTypeStyler.newGammaStyler(left);

        double right = options.getGamma();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testHue() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String left = "#ff0000";
        MapTypeStyler options = MapTypeStyler.newHueStyler(left);

        String right = options.getHue();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testInvertLightness() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        boolean left = true;
        MapTypeStyler options = MapTypeStyler.newInvertLightnessStyler(left);

        boolean right = options.getInvertLightness();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testLightness() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        int left = -10;
        MapTypeStyler options = MapTypeStyler.newLightnessStyler(left);

        int right = options.getLightness();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testSaturation() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        int left = -20;
        MapTypeStyler options = MapTypeStyler.newSaturationStyler(left);

        int right = options.getSaturation();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testVisibility() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String left = "simplifed";
        MapTypeStyler options = MapTypeStyler.newVisibilityStyler(left);

        String right = options.getVisibility();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

}
