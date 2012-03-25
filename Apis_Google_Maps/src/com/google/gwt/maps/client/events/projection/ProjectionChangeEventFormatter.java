package com.google.gwt.maps.client.events.projection;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEventFormatter;

public class ProjectionChangeEventFormatter implements MapEventFormatter<ProjectionChangeMapEvent> {

  @Override
  public ProjectionChangeMapEvent createEvent(Properties properties) {
    return new ProjectionChangeMapEvent(properties);
  }

}
