package com.google.gwt.maps.client.testutil;

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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Test template for testing GMaps objects.
 * 
 * @author Joseph Lust
 */
public abstract class AbstractGwtTestUtil extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  public static final boolean HAS_SENSOR = false;

  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.MapsForTests";
  }

}
