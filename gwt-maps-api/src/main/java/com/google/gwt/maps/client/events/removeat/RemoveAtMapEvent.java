package com.google.gwt.maps.client.events.removeat;

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

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.events.MapEvent;

public class RemoveAtMapEvent extends MapEvent<RemoveAtMapHandler, RemoveAtMapEvent> {

  public static Type<RemoveAtMapHandler> TYPE = new Type<RemoveAtMapHandler>();

  public RemoveAtMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<RemoveAtMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(RemoveAtMapHandler handler) {
    handler.onEvent(this);
  }

  public int getIndex() {
    int index = -1;
    try {
      index = properties.getNumber("index").intValue();
    } catch (TypeException e) {
    }
    return index;
  }

}
