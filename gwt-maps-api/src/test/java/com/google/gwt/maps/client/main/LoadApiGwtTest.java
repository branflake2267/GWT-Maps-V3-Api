package com.google.gwt.maps.client.main;

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

import java.util.ArrayList;

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class LoadApiGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return LoadLibrary.values();
  }

  /**
   * Must come first so that all API's are available for test suite or failures will occur
   */
  public void testLoadWLibs3() {
    boolean sensor = true;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.addAll(java.util.Arrays.asList(LoadLibrary.values()));

    LoadApi.go(new Runnable() {
      @Override
      public void run() {
        finishTest();
      }
    }, loadLibraries, sensor);
    delayTest();
  }

  public void testLoad() {
    boolean sensor = false;
    LoadApi.go(new Runnable() {
      @Override
      public void run() {
        finishTest();
      }
    }, sensor);
    delayTest();
  }

  public void testLoad3() {
    LoadApi.go(new Runnable() {
      @Override
      public void run() {
        finishTest();
      }
    }, true);
    delayTest();
  }

  public void testLoadWLibs() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.GEOMETRY);
    LoadApi.go(new Runnable() {
      @Override
      public void run() {
        finishTest();
      }
    }, loadLibraries, sensor);
    delayTest();
  }

  public void testReload2() {
    LoadApi.go(new Runnable() {
      @Override
      public void run() {
        LoadApi.go(new Runnable() {
          @Override
          public void run() {
            finishTest();
          }
        }, false);
      }
    }, false);
    delayTest();
  }

  public void testReload4() {
    LoadApi.go(new Runnable() {
      @Override
      public void run() {
        LoadApi.go(new Runnable() {
          @Override
          public void run() {
            finishTest();
          }
        }, false);
      }
    }, true);
    delayTest();
  }

  public void testReload5() {
    LoadApi.go(new Runnable() {
      @Override
      public void run() {
        LoadApi.go(new Runnable() {
          @Override
          public void run() {
            finishTest();
          }
        }, false, null);
      }
    }, true);

  }

  public void testReload6() {
    LoadApi.go(new Runnable() {
      @Override
      public void run() {
        LoadApi.go(new Runnable() {
          @Override
          public void run() {
            finishTest();
          }
        }, false, "");
      }
    }, true);
    delayTest();
  }

  public void testUse1() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.addAll(java.util.Arrays.asList(LoadLibrary.values()));

    LoadApi.go(new Runnable() {
      @Override
      public void run() {
        finishTest();
      }
    }, loadLibraries, sensor);
    delayTest();
  }

}
