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

import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;

import java.util.Date;

/**
 * Tests the Properties class.
 */
public class PropertiesTest extends GWTTestCase {
  // length of time to wait for asynchronous test to complete.
  static final int ASYNC_DELAY_MSEC = 10000; // 10 seconds

  public static void diff(String expected, String actual) {
    if (!expected.equals(actual)) {
      int length = Math.max(expected.length(), actual.length());
      for (int i = 0; i < length; i++) {
        String expectedChar = i >= expected.length() ? "null" : ""
            + expected.charAt(i);
        String actualChar = i >= actual.length() ? "null" : ""
            + actual.charAt(i);
        if (!expectedChar.equals(actualChar)) {
          String message = "assertion failed\n";
          message += "expected: " + expected + "actual: " + actual;
          message += "expected.charAt(" + i + ") == " + expectedChar + "\n";
          message += "actual.charAt(" + i + ") == " + actualChar;
          fail(message);
        }
      }
    }
  }

  @Override
  public String getModuleName() {
    return "com.google.gwt.ajaxloader.AjaxLoader";
  }

  public void testBoolean() throws Exception {
    Properties proper = Properties.create();
    assertNull(proper.getBoolean("key"));

    proper.set("key", true);
    assertEquals(true, proper.getBoolean("key").booleanValue());

    proper.set("key", false);
    assertEquals(false, proper.getBoolean("key").booleanValue());

    proper.set("key", 0.0);

    try {
      proper.getBoolean("key");
      fail();
    } catch (TypeException x) {
      // exception expected
    }

    Boolean bit = null;
    proper.set("key", bit);
    assertNull(proper.getBoolean("key"));
  }

  @SuppressWarnings("deprecation")
  public void testDate() throws TypeException {
    Properties proper = Properties.create();
    assertNull(proper.getDate("key"));

    Date expected = new Date(109, 6, 11);
    proper.set("key", expected);
    Date actual = proper.getDate("key");
    String message = "expected: " + expected + " actual: " + actual;
    assertEquals(message, expected.getTime(), actual.getTime());

    proper.set("key", 0.0);
    try {
      proper.getDate("key");
      fail();
    } catch (TypeException x) {
      // exception expected
    }

    proper.set("key", JavaScriptObject.createObject());
    try {
      proper.getDate("key");
      fail();
    } catch (JavaScriptException x) {
      // exception expected
    }

    proper.remove("key");
    assertNull(proper.getDate("key"));
  }

  public void testNumber() throws TypeException {
    Properties proper = Properties.create();
    assertNull(proper.getNumber("key"));

    proper.set("key", 1.5);
    assertEquals(1.5, proper.getNumber("key").doubleValue());

    proper.set("key", "1.5");
    try {
      proper.getNumber("key");
      fail();
    } catch (TypeException x) {
      // exception expected
    }

    Double number = null;
    proper.set("key", number);
    assertNull(proper.getNumber("key"));
  }

  public void testObject() throws TypeException {
    Properties proper = Properties.create();
    assertNull(proper.getObject("key"));

    proper.set("key", JavaScriptObject.createObject());
    assertEquals("[object Object]", proper.getObject("key").toString());

    proper.set("key", "1.5");
    try {
      proper.getObject("key");
      fail();
    } catch (TypeException x) {
      // exception expected
    }

    proper.remove("key");
    assertNull(proper.getObject("key"));
  }

  public void testString() throws TypeException {
    Properties proper = Properties.create();
    assertNull(proper.getString("key"));

    proper.set("key", "value");
    assertEquals("value", proper.getString("key"));

    proper.set("key", 1.5);
    try {
      proper.getString("key");
      fail();
    } catch (TypeException x) {
      // exception expected
    }

    proper.remove("key");
    assertNull(proper.getString("key"));
  }

  public void testType() {
    Properties proper = Properties.create();

    assertEquals("undefined", proper.typeof("key"));

    String value = null;
    proper.set("key", value);
    assertEquals("object", proper.typeof("key"));

    proper.remove("key");
    assertEquals("undefined", proper.typeof("key"));
  }
}