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

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests the AjaxKeyRepository class.
 */
public class AjaxKeyRepositoryTest extends GWTTestCase {

  @Override
  public String getModuleName() {
    return "com.google.gwt.ajaxloader.AjaxLoader";
  }

  /**
   * Tests AjaxKeyRepsoritory.getKey() method.
   */
  public void testDefault() {
    @SuppressWarnings("unused")
    String value = AjaxKeyRepository.getKey();
    // The fact that the method runs without an exception is about all we can
    // reliably test. Can't really assert here, unit tests often run on some
    // random port or from a different host in the case of remote testing.
  }

  /**
   * Tests AjaxKeyRepsoritory.getKey(String) method.
   * 
   * In order for this test to succeed, the localhost:8080 key should be a
   * default or specified in the .properties file.
   */
  public void testDefaultLocalhost() {
    String value = AjaxKeyRepository.getKey("localhost:8080");
    assertEquals(
        "ABQIAAAAG8LzhtshQCjpSshU_uJjmxTwM0brOpm-All5BF6PoaKBxRWWERTZER2lJ4GnsG8nvhKLOQ20degaEQ",
        value);
  }

  /**
   * This test is named to fall at the end of the test run because it overrides
   * the default values compiled into the library.
   */
  public void testZZZCustomAjaxKeyConstants() {
    AjaxKeyConstants constants = GWT.create(CustomAjaxKeyConstants.class);
    AjaxKeyRepository.setKeys(constants);
    String value = AjaxKeyRepository.getKey("example.com:8080");
    assertEquals("TESTKEY", value);
  }
}