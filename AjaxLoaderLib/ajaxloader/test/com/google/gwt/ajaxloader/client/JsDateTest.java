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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

import java.util.Date;

/**
 * Tests the JsDate class.
 */
public class JsDateTest extends GWTTestCase {
  // length of time to wait for asynchronous test to complete.
  static final int ASYNC_DELAY_MSEC = 10000; // 10 seconds
  
  @Override
  public String getModuleName() {
    return "com.google.gwt.ajaxloader.AjaxLoader";
  }

  @SuppressWarnings("deprecation")
  public void testIsDate() {
    Date jdate = new Date(109, 6, 14);
    assertTrue(JsDate.isDate(JsDate.toJs(jdate)));
    assertTrue(JsDate.isDate(JsDate.create(jdate.getTime())));
    assertFalse(JsDate.isDate(null));
    assertFalse(JsDate.isDate(JavaScriptObject.createObject()));
    assertFalse(JsDate.isDate(timeIsNotANumber()));
  }
  
  @SuppressWarnings("deprecation")
  public void testTime() {
    Date jdate = new Date(109, 6, 14);
    JsDate js = JsDate.toJs(jdate);
    assertEquals(jdate.getTime(), js.getTime());
  }
  
  @SuppressWarnings("deprecation")
  public void testToJava() {
    Date jdate = new Date(109, 6, 14);
    JsDate js = JsDate.create(jdate.getTime());
    assertEquals(jdate.getTime(), JsDate.toJava(js).getTime());
    
    js = JsDate.toJs(jdate);
    assertEquals(jdate.getTime(), JsDate.toJava(js).getTime());
    
    assertNull(JsDate.toJava(null));
  }
  
  private native JavaScriptObject timeIsNotANumber() /*-{
    return {
      getTime : function () {
        return "time";
      }
    };
  }-*/;
}