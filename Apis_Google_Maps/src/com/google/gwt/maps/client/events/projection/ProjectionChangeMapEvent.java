package com.google.gwt.maps.client.events.projection;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class ProjectionChangeMapEvent extends MapEvent<ProjectionChangeMapHandler, ProjectionChangeMapEvent> {

  public static Type<ProjectionChangeMapHandler> TYPE = new Type<ProjectionChangeMapHandler>();
  
  public ProjectionChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<ProjectionChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ProjectionChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
