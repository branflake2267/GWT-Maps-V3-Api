package com.google.gwt.maps.client.overlays;

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
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaOptions;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class MarkerOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        finishTest();
      }
    });
  }

  public void testAnimation() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        Animation left = Animation.BOUNCE;
        o.setAnimation(left);
        Animation right = o.getAnimation();
        assertEquals(left.value(), right.value());
        finishTest();
      }
    });
  }

  public void testClickable() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        boolean left = true;
        o.setClickable(left);
        boolean right = o.getClickable();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testCursor() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        String left = "test";
        o.setCursor(left);
        String right = o.getCursor();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testDraggable() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        boolean left = true;
        o.setDraggable(left);
        boolean right = o.getDraggable();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testFlat() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        boolean left = true;
        o.setFlat(left);
        boolean right = o.getFlat();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testIcon() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        String left = "test";
        o.setIcon(left);
        String right = o.getIcon_String();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testIconAsMarkerImage() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        String url = "image/target.png";
        MarkerImage left = MarkerImage.newInstance(url);
        o.setIcon(left);
        MarkerImage right = o.getIcon_MarkerImage();
        assertEquals(left.getUrl(), right.getUrl());
        finishTest();
      }
    });
  }

  public void testIconMapWidget() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        MapOptions options = MapOptions.newInstance();
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        MapWidget left = new MapWidget(options);
        o.setMap(left);
        @SuppressWarnings("deprecation")
        MapWidget right = o.getMapWidget();
        assertLatLngEquals(left.getCenter(), right.getCenter());
        finishTest();
      }
    });
  }

  public void testIconMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        MapOptions options = MapOptions.newInstance();
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        MapWidget left = new MapWidget(options);
        o.setMap(left);
        MapWidget right = o.getMap();
        assertLatLngEquals(left.getCenter(), right.getCenter());
        finishTest();
      }
    });
  }

  @SuppressWarnings("unused")
  public void testIconStreetViewPanorama() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        FlowPanel fp = new FlowPanel();
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPano("testing");
        StreetViewPanoramaWidget left = new StreetViewPanoramaWidget(options);
        o.setMap(left);
        StreetViewPanoramaWidget right = o.getMapStreetViewPanoramaWidget();
        assertEquals(left.getPano(), right.getPano());
        finishTest();
      }
    });
  }

  public void testOptimized() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        boolean left = true;
        o.setOptimized(left);
        boolean right = o.getOptimized();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testPosition() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        LatLng left = LatLng.newInstance(35, 38);
        o.setPosition(left);
        LatLng right = o.getPosition();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });
  }

  public void testRaiseOnDrag() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        boolean left = true;
        o.setRaiseOnDrag(left);
        boolean right = o.getRaiseOnDrag();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testShadow() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        String left = "shadow";
        o.setShadow(left);
        String right = o.getShadow_String();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testShadowMarkerImage() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        MarkerImage left = MarkerImage.newInstance("images/target.png");
        o.setShadow(left);
        MarkerImage right = o.getShadow_MarkerImage();
        assertEquals(left.getUrl(), right.getUrl());
        finishTest();
      }
    });
  }

  public void testShape() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        MarkerShape left = MarkerShape.newInstance();
        left.setType(MarkerShapeType.CIRCLE);
        o.setShape(left);
        MarkerShape right = o.getShape();
        assertEquals(left.getType().value(), right.getType().value());
        finishTest();
      }
    });
  }

  public void testTitle() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        String left = "testing123";
        o.setTitle(left);
        String right = o.getTitle();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testVisible() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        boolean left = true;
        o.setVisible(left);
        boolean right = o.getVisible();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testZIndex() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        int left = 5;
        o.setZindex(left);
        int right = o.getZindex();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

}
