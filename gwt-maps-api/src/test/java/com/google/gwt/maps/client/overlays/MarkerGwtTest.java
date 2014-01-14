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

public class MarkerGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        finishTest();
      }
    });
  }

  public void testAnimation() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        Animation left = Animation.BOUNCE;
        o.setAnimation(left);
        Animation right = o.getAnimation();
        assertEquals(left.value(), right.value());
        finishTest();
      }
    });
  }

  // ensure does not infinite loop
  public void testAnimation_null() {
	  asyncLibTest(new Runnable() {
		  @Override
		  public void run() {
			  MarkerOptions options = MarkerOptions.newInstance();
			  Marker o = Marker.newInstance(options);

			  Animation expected = null;
			  o.setAnimation(expected);
			  Animation actual = o.getAnimation();
			  assertEquals("Wrong animation returned",expected, actual);
			  finishTest();
		  }
	  });
  }

  public void testClickable() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        String left = "help";
        o.setCursor(left);
        String right = o.getCursor();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testCursor() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        boolean left = true;
        o.setClickable(left);
        boolean right = o.getClickable();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testDraggable() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
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
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        boolean left = true;
        o.setFlat(left);
        boolean right = o.getFlat();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testIcon_String() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        String left = "icontest";
        o.setIcon(left);
        String right = o.getIcon_String();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testIcon_MarkerImage() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        String url = "images/target.png";
        MarkerImage left = MarkerImage.newInstance(url);
        o.setIcon(left);
        MarkerImage right = o.getIcon_MarkerImage();
        assertEquals(left.getUrl(), right.getUrl());
        finishTest();
      }
    });
  }
  
  public void testIcon_Symbol() {
	  asyncLibTest(new Runnable() {
		  @Override
		  public void run() {
			  MarkerOptions options = MarkerOptions.newInstance();
			  Marker o = Marker.newInstance(options);

			  Symbol expected = Symbol.newInstance(SymbolPath.CIRCLE, 1);
			  o.setIcon(expected);
			  Symbol actual = o.getIcon_Symbol();
			  assertEquals("Wrong icon symbol", expected, actual);
			  finishTest();
		  }
	  });
  }

  public void testMap_Map() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        MapOptions mapOptions = MapOptions.newInstance();
        MapWidget left = new MapWidget(mapOptions);
        o.setMap(left);
        MapWidget right = o.getMap();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());
        finishTest();
      }
    });
  }

  public void testMap_StreetViewPanorama() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        StreetViewPanoramaOptions optionsStreet = StreetViewPanoramaOptions.newInstance();
        optionsStreet.setPano("test");
        StreetViewPanoramaWidget left = new StreetViewPanoramaWidget(optionsStreet);
        o.setMap(left);
        StreetViewPanoramaWidget right = o.getMap_StreetViewPanorama();
        assertEquals(left.getPano(), right.getPano());
        finishTest();
      }
    });
  }

  public void testPosition() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        LatLng left = LatLng.newInstance(35, 38);
        o.setPosition(left);
        LatLng right = o.getPosition();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });
  }

  public void testShadow_String() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        String left = "test";
        o.setShadow(left);
        String right = o.getShadow_String();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testShadow_Marker() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        MarkerImage left = MarkerImage.newInstance("images/target.png");
        o.setShadow(left);
        MarkerImage right = o.getShadow_MarkerImage();
        assertEquals(left.getUrl(), right.getUrl());
        finishTest();
      }
    });
  }
  
  public void testShadow_Symbol() {
	  asyncLibTest(new Runnable() {
		  @Override
		  public void run() {
			  MarkerOptions options = MarkerOptions.newInstance();
			  Marker o = Marker.newInstance(options);
			  
			  Symbol expected = Symbol.newInstance(SymbolPath.CIRCLE, 1);
			  o.setShadow(expected);
			  Symbol actual = o.getShadow_Symbol();
			  assertEquals("Wrong shadow symbol", expected, actual);
			  finishTest();
		  }
	  });
  }

  public void testShadow_Shape() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
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
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        String left = "test";
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
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        boolean left = true;
        o.setVisible(left);
        boolean right = o.getVisible();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testZindex() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        int left = 5;
        o.setZindex(left);
        int right = o.getZindex();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testMaxZindex() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        int right = o.getMax_Zindex();
        assertEquals(1000000, right);
        finishTest();
      }
    });
  }

  @SuppressWarnings("unused")
  public void testClose() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        MapOptions mapOptions = MapOptions.newInstance();
        MapWidget left = new MapWidget(mapOptions);
        o.setMap(left);
        MapWidget right = o.getMap();
        o.close();
        finishTest();
      }
    });
  }

  @SuppressWarnings("unused")
  public void testClose2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        MapOptions mapOptions = MapOptions.newInstance();
        MapWidget left = new MapWidget(mapOptions);
        o.setMap(left);
        MapWidget right = o.getMap();
        o.setMap((MapWidget) null);
        finishTest();
      }
    });
  }

}
