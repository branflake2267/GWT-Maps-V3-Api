/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.ajaxloader.client;

import com.google.gwt.ajaxloader.client.AjaxLoader.AjaxLoaderOptions;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests the AjaxLoader class.
 */
public class AjaxLoaderTest extends GWTTestCase {
  // length of time to wait for asynchronous test to complete.
  static final int ASYNC_DELAY_MSEC = 10000; // 10 seconds
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.ajaxloader.AjaxLoader";
  }

  public void testLoadApi() {
    delayTestFinish(ASYNC_DELAY_MSEC);
    AjaxLoaderOptions options = AjaxLoaderOptions.newInstance();
    Runnable onLoad = new Runnable() {
      public void run() {
        finishTest();
      }      
    };
    AjaxLoader.loadApi("search", "1", onLoad, options);
  }
}