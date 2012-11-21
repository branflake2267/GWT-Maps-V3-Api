package com.google.gwt.maps.client.workaround;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;

public class WorkAroundUtils {

  /**
   * When a third party api complains about this extra element in the object. This only happens in DevMode 
   * The JSO carries an __gwt_ObjectId in devMode, which needs to be removed in some cases.
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

