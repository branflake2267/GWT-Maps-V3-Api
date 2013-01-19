package com.google.gwt.maps.client.workaround;

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

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;

public class WorkAroundUtils {

  /**
   * When a third party api complains about this extra element in the object. This only happens in DevMode The JSO
   * carries an __gwt_ObjectId in devMode, which needs to be removed in some cases.
   * 
   * @param jso
   */
  public final static void removeGwtObjectId(JavaScriptObject jso) {
    if (jso == null) {
      return;
    }
    if (!GWT.isScript()) {
      removeGwtObjectIdImpl(jso);
    }
  }

  private final static native void removeGwtObjectIdImpl(JavaScriptObject jso) /*-{
    delete jso['__gwt_ObjectId'];
  }-*/;

}
