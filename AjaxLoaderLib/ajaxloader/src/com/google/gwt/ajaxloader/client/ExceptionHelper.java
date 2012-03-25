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

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

/**
 * Helps with the GWT uncaught exception handler.
 */
public abstract class ExceptionHelper {
  /**
   * If an uncaught exception handler has been registered, execute the Runnable 
   * in a try/catch block and handle exceptions with the uncaught exception 
   * handler.  Otherwise, run the Runnable and do not catch exceptions.
   * 
   * @param runnable The Runnable to execute.
   */
  public static void runProtected(Runnable runnable) {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler != null) {
      try {
        runnable.run();
      } catch (Throwable e) {
        handler.onUncaughtException(e);
      }
    } else {
      runnable.run();
    }
  }
  
  private ExceptionHelper() {
    // do not instantiate
  }
}
