package com.google.gwt.maps.client.service;

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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DirectionsLeg;
import com.google.gwt.maps.client.services.DirectionsStep;
import com.google.gwt.maps.client.services.Distance;
import com.google.gwt.maps.client.services.Duration;

public class DirectionsLegGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsLeg o = DirectionsLeg.newInstance();
        finishTest();
      }
    });
  }

  public void testDistance() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsLeg o = DirectionsLeg.newInstance();
        Distance left = Distance.newInstance();
        left.setText("test");
        o.setDistance(left);
        Distance right = o.getDistance();
        assertEquals(left.getText(), right.getText());
        finishTest();
      }
    });
  }

  public void testDuration() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsLeg o = DirectionsLeg.newInstance();
        Duration left = Duration.newInstance();
        left.setText("test");
        o.setDuration(left);
        Duration right = o.getDuration();
        assertEquals(left.getText(), right.getText());
        finishTest();
      }
    });
  }

  public void testEnd_Address() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsLeg o = DirectionsLeg.newInstance();
        String left = "test";
        o.setEnd_Address(left);
        String right = o.getEnd_Address();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testEnd_Location() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsLeg o = DirectionsLeg.newInstance();
        LatLng left = LatLng.newInstance(25, 26);
        o.setEnd_Location(left);
        LatLng right = o.getEnd_Location();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });
  }

  public void testStart_Address() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsLeg o = DirectionsLeg.newInstance();
        String left = "test";
        o.setStart_Address(left);
        String right = o.getStart_Address();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testStart_Location() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsLeg o = DirectionsLeg.newInstance();
        LatLng left = LatLng.newInstance(25, 26);
        o.setStart_Location(left);
        LatLng right = o.getStart_Location();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });
  }

  public void testSteps() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsLeg o = DirectionsLeg.newInstance();
        DirectionsStep[] a = new DirectionsStep[3];
        a[0] = DirectionsStep.newInstance();
        a[1] = DirectionsStep.newInstance();
        a[2] = DirectionsStep.newInstance();
        JsArray<DirectionsStep> left = ArrayHelper.toJsArray(a);
        o.setSteps(left);
        JsArray<DirectionsStep> right = o.getSteps();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    });
  }

  public void testVia() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsLeg o = DirectionsLeg.newInstance();
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(25, 26);
        a[1] = LatLng.newInstance(27, 28);
        a[2] = LatLng.newInstance(29, 30);
        JsArray<LatLng> left = ArrayHelper.toJsArray(a);
        o.setVia_Waypoints(left);
        JsArray<LatLng> right = o.getVia_Waypoints();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    });
  }

}
