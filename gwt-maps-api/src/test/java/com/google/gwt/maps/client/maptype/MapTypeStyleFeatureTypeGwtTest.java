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
import com.google.gwt.maps.client.maptypes.MapTypeStyleFeatureType;

public class MapTypeStyleFeatureTypeGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE;
        finishTest();
      }
    });

  }

  public void testEnum1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE;
        String left = "administrative";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE__COUNTRY;
        String left = "administrative.country";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE__LAND_PARCEL;
        String left = "administrative.land_parcel";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum4() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE__LOCALITY;
        String left = "administrative.locality";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum5() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE__NEIGHBORHOOD;
        String left = "administrative.neighborhood";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum6() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE__PROVINCE;
        String left = "administrative.province";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum7() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ALL;
        String left = "all";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum8() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.LANDSCAPE;
        String left = "landscape";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum9() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.LANDSCAPE__MAN_MADE;
        String left = "landscape.man_made";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum10() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.LANDSCAPE__NATURAL;
        String left = "landscape.natural";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum11() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI;
        String left = "poi";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum12() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__ATTRACTION;
        String left = "poi.attraction";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum13() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__BUSINESS;
        String left = "poi.business";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum14() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__GOVERNMENT;
        String left = "poi.government";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum15() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__MEDICAL;
        String left = "poi.medical";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum16() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__PARK;
        String left = "poi.park";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum17() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__PLACE_OF_WORSHIP;
        String left = "poi.place_of_worship";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum18() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__SCHOOL;
        String left = "poi.school";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum19() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__SPORTS_COMPLEX;
        String left = "poi.sports_complex";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum20() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ROAD;
        String left = "road";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum21() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ROAD__ARTERIAL;
        String left = "road.arterial";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum22() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ROAD__HIGHWAY;
        String left = "road.highway";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum23() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ROAD__LOCAL;
        String left = "road.local";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum24() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT;
        String left = "transit";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum25() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT__LINE;
        String left = "transit.line";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum26() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT__STATION;
        String left = "transit.station";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum27() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT__STATION__AIRPORT;
        String left = "transit.station.airport";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum28() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT__STATION__BUS;
        String left = "transit.station.bus";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum29() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT__STATION__RAIL;
        String left = "transit.station.rail";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum30() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.WATER;
        String left = "water";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

}
