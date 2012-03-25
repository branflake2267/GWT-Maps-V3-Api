package com.google.gwt.maps.client.events;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class MapPanel extends FlowPanel {

  public MapPanel() {
    super();
  }
  
  @Override
  public void onAttach() {
    super.onAttach();
  }
  
  /**
   * todo only do this once, b/c other wise it probably won't act right adding it over and over
   */
  @Override
  public void add(Widget child) {
    super.add(child);
    onAttach();
    RootPanel.detachOnWindowClose(this);
  }
}
