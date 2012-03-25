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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayBoolean;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests the ArrayHelper class.
 */
public class ArrayHelperTest extends GWTTestCase {

  private static class TestObject extends JavaScriptObject {

    public static final native TestObject create(int arg1, String arg2) /*-{
      return {'intMember':arg1, 'stringMember':arg2};
    }-*/;

    @SuppressWarnings("unused")
    protected TestObject() {
    }

    public final native boolean isEqual(int arg1, String arg2) /*-{
      return this.intMember == arg1 && this.stringMember == arg2;
    }-*/;
  }

  @Override
  public String getModuleName() {
    return "com.google.gwt.ajaxloader.AjaxLoader";
  }

  public void testToJavaArrayBytes() {
    JsArrayInteger array;
    array = nativeGetJavaArrayBytes(1, 2, 3);
    assertEquals("array[0]", 1, array.get(0));
    assertEquals("array[2]", 2, array.get(1));
    assertEquals("array[3]", 3, array.get(2));

    byte[] result;
    result = ArrayHelper.toJavaArrayBytes(array);
    assertEquals("result[0] 1", 1, result[0]);
    assertEquals("result[2] 1", 2, result[1]);
    assertEquals("result[3] 1", 3, result[2]);

    array = nativeGetJavaArrayBytes(1, 2, 128);
    result = ArrayHelper.toJavaArrayBytes(array);
    assertEquals("result[0] 2", 1, result[0]);
    assertEquals("result[2] 2", 2, result[1]);
    // should be negative - overflows a byte
    assertEquals("result[3] 2", -128, result[2]); 
  }

  public void testToJsArrayBoolean() {
    JsArrayBoolean result;
    result = ArrayHelper.toJsArrayBoolean(true);
    assertEquals("length", 1, result.length());
    assertEquals("result[0]", true, result.get(0));

    result = ArrayHelper.toJsArrayBoolean(true, false, true);
    assertEquals("length", 3, result.length());
    assertEquals("result[0]", true, result.get(0));
    assertEquals("result[1]", false, result.get(1));
    assertEquals("result[2]", true, result.get(2));

    boolean[] bools = {true, false, true};
    result = ArrayHelper.toJsArrayBoolean(bools);
    assertEquals("length", 3, result.length());
    assertEquals("result[0]", true, result.get(0));
    assertEquals("result[1]", false, result.get(1));
    assertEquals("result[2]", true, result.get(2));
  }

  public void testToJsArrayInteger() {
    JsArrayInteger result;
    result = ArrayHelper.toJsArrayInteger(1);
    assertEquals("length", 1, result.length());
    assertEquals("result[0]", 1, result.get(0));

    result = ArrayHelper.toJsArrayInteger(1, 2, -1);
    assertEquals("length", 3, result.length());
    assertEquals("result[0]", 1, result.get(0));
    assertEquals("result[1]", 2, result.get(1));
    assertEquals("result[2]", -1, result.get(2));

    int[] integers = {1, 2, -1};
    result = ArrayHelper.toJsArrayInteger(integers);
    assertEquals("length", 3, result.length());
    assertEquals("result[0]", 1, result.get(0));
    assertEquals("result[1]", 2, result.get(1));
    assertEquals("result[2]", -1, result.get(2));
  }

  public void testToJsArrayNumber() {
    JsArrayNumber result;
    result = ArrayHelper.toJsArrayNumber(1.0);
    assertEquals("length", 1, result.length());
    assertEquals("result[0]", 1.0, result.get(0));

    result = ArrayHelper.toJsArrayNumber(1.0, 2.0, -1.0);
    assertEquals("length", 3, result.length());
    assertEquals("result[0]", 1.0, result.get(0));
    assertEquals("result[1]", 2.0, result.get(1));
    assertEquals("result[2]", -1.0, result.get(2));

    double[] numbers = {1.0, 2.0, -1.0};
    result = ArrayHelper.toJsArrayNumber(numbers);
    assertEquals("length", 3, result.length());
    assertEquals("result[0]", 1.0, result.get(0));
    assertEquals("result[1]", 2.0, result.get(1));
    assertEquals("result[2]", -1.0, result.get(2));
  }

  public void testToJsArrayObjects() {
    JsArray<TestObject> result;

    result = ArrayHelper.toJsArray(TestObject.create(0, "Zero"));
    assertEquals("result.length()", 1, result.length());
    assertTrue("result[0]", result.get(0).isEqual(0, "Zero"));

    result = ArrayHelper.toJsArray(TestObject.create(1, "One"),
        TestObject.create(2, "Two"), TestObject.create(3, "Three"));
    assertEquals("result.length()", 3, result.length());
    assertTrue("result[0] 1", result.get(0).isEqual(1, "One"));
    assertTrue("result[1] 1", result.get(1).isEqual(2, "Two"));
    assertTrue("result[2] 1", result.get(2).isEqual(3, "Three"));

    TestObject[] ins = {
        TestObject.create(1, "One"), TestObject.create(2, "Two"),
        TestObject.create(3, "Three"),};
    result = ArrayHelper.toJsArray(ins);
    assertEquals("result.length()", 3, result.length());
    assertTrue("result[0] 2", result.get(0).isEqual(1, "One"));
    assertTrue("result[1] 2", result.get(1).isEqual(2, "Two"));
    assertTrue("result[2] 2", result.get(2).isEqual(3, "Three"));
  }

  public void testToJsArrayString() {
    JsArrayString result;
    result = ArrayHelper.toJsArrayString("foo");
    assertEquals("length", 1, result.length());
    assertEquals("result[0]", "foo", result.get(0));

    result = ArrayHelper.toJsArrayString("foo", "bar", "baz");
    assertEquals("length", 3, result.length());
    assertEquals("result[0]", "foo", result.get(0));
    assertEquals("result[1]", "bar", result.get(1));
    assertEquals("result[2]", "baz", result.get(2));

    String[] strings = {"foo", "bar", "baz"};
    result = ArrayHelper.toJsArrayString(strings);
    assertEquals("length", 3, result.length());
    assertEquals("result[0]", "foo", result.get(0));
    assertEquals("result[1]", "bar", result.get(1));
    assertEquals("result[2]", "baz", result.get(2));
  }

  private native JsArrayInteger nativeGetJavaArrayBytes(int a, int b, int c) /*-{
    return [a, b, c];
  }-*/;
}
