package com.google.gwt.maps.client;

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

import com.google.gwt.maps.client.LoadApi.LoadLibrary;

/**
 * Example of how a test could be run.
 */
public class SandboxGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.GEOMETRY, LoadLibrary.PANORAMIO, LoadLibrary.PLACES, LoadLibrary.WEATHER };
  }

  protected void runSomething() {
    assertTrue(true);
  }

  public void testLoadAllLibraries() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        runSomething();
        finishTest();
      }
    });
  }

}
