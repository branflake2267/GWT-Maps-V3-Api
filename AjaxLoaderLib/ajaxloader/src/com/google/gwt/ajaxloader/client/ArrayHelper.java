/*
 * Copyright 2008 Google Inc.
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

/**
 * Convenience methods for working with GWT JsArrays.
 */
public class ArrayHelper {
  /**
   * Converts a Java array of booleans to a JavaScript boolean array.
   * 
   * @param bits array of booleans to convert.
   * @deprecated this overload can be ambiguous with other methods using
   *             varargs. Use the toJsArrayBoolean() method instead.
   */
  @Deprecated
  public static JsArrayBoolean createJsArray(boolean... bits) {
    return toJsArrayBoolean(bits);
  }

  /**
   * Converts a Java array of doubles to a JavaScript number array.
   * 
   * @param numbers array of doubles to convert.
   * @deprecated this overload is ambiguous with other methods using varrgs. Use
   *             toJsArrayNumber() instead.
   */
  @Deprecated
  public static JsArrayNumber createJsArray(double... numbers) {
    return toJsArrayNumber(numbers);
  }

  /**
   * Converts Java integer array to JavaScript integer array.
   * 
   * @param integers array of integers to convert.
   * @deprecated This overload is ambiguous with other methods using varargs.
   *             Use toJsArrayInteger() instead.
   */
  @Deprecated
  public static JsArrayInteger createJsArray(int[] integers) {
    return toJsArrayInteger(integers);
  }

  /**
   * Converts an array of Java strings to an array of JavaScript strings.
   * 
   * @param strings array of strings to convert
   * @deprecated renamed to toJsArrayString() to avoid using overloads w/
   *             varargs
   */
  @Deprecated
  public static JsArrayString createJsArray(String... strings) {
    return toJsArrayString(strings);
  }

  // TODO(zundel): Add other methods to convert to Java Arrays
  
  /**
   * Takes an array of Integers to be interpreted as bytes and returns a Java
   * Array of the byte primitive type.
   * 
   * @param bytes a JavaScript array to return. 
   */
  public static byte[] toJavaArrayBytes(JsArrayInteger bytes) {
    int length = bytes.length();
    byte[] ret = new byte[length];
    for (int i = 0; i < length; i++) {
      ret[i] = (byte) bytes.get(i);
    }
    return ret;
  }

  public static <J extends JavaScriptObject> JsArray<J> toJsArray(J... objects) {
    JsArray<J> result = JsArray.createArray().cast();
    for (int i = 0; i < objects.length; i++) {
      result.set(i, objects[i]);
    }
    nativePatchConstructorForSafari(result);
    return result;
  }

  /**
   * Converts a Java array of booleans to a JavaScript boolean array.
   * 
   * @param bits array of booleans to convert.
   */
  public static JsArrayBoolean toJsArrayBoolean(boolean... bits) {
    JsArrayBoolean result = JsArrayBoolean.createArray().cast();
    for (int i = 0; i < bits.length; i++) {
      result.set(i, bits[i]);
    }
    nativePatchConstructorForSafari(result);
    return result;
  }

  /**
   * Converts Java integer array to JavaScript integer array.
   * 
   * @param integers array of integers to convert.
   */
  public static JsArrayInteger toJsArrayInteger(int... integers) {
    JsArrayInteger result = JsArrayInteger.createArray().cast();
    for (int i = 0; i < integers.length; i++) {
      result.set(i, integers[i]);
    }
    nativePatchConstructorForSafari(result);
    return result;
  }

  /**
   * Converts a Java array of doubles to a JavaScript number array.
   * 
   * @param numbers array of doubles to convert.
   */
  public static JsArrayNumber toJsArrayNumber(double... numbers) {
    JsArrayNumber result = JsArrayNumber.createArray().cast();
    for (int i = 0; i < numbers.length; i++) {
      result.set(i, numbers[i]);
    }
    nativePatchConstructorForSafari(result);
    return result;
  }

  /**
   * Converts an array of Java strings to an array of JavaScript strings.
   * 
   * @param strings array of strings to convert
   */
  public static JsArrayString toJsArrayString(String... strings) {
    JsArrayString result = JsArrayString.createArray().cast();
    for (int i = 0; i < strings.length; i++) {
      result.set(i, strings[i]);
    }
    nativePatchConstructorForSafari(result);
    return result;
  }
  
  

  /**
   * This is a fixup for the constructor used to address issue 219 - Safari bug
   * in comparing Date & Array constructors.
   * 
   * @param result
   */
  public static native void nativePatchConstructorForSafari(JavaScriptObject result) /*-{
    result.constructor = $wnd.Array;
  }-*/;

}
