package com.google.gwt.maps.client.events.kmlmouse;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.layers.KmlFeatureData;

public class KmlMouseMapEvent extends MapEvent<KmlMouseMapHandler, KmlMouseMapEvent> {

  public static Type<KmlMouseMapHandler> TYPE = new Type<KmlMouseMapHandler>();

  public KmlMouseMapEvent(Properties properties) {
    super(properties); 
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<KmlMouseMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(KmlMouseMapHandler handler) {
    handler.onEvent(this);
  }
  
  /**
   * get A KmlFeatureData object, containing information about the clicked feature.
   * @return
   */
  public KmlFeatureData getFeatureData() {
    KmlFeatureData featureData = null;
    try {
      featureData = (KmlFeatureData) properties.getObject("featureData");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return featureData;
  }

  /**
   * get The position at which to anchor an infowindow on the clicked feature.
   * @return {@link LatLng}
   */
  public LatLng getLatLng() {
    LatLng latLng = null;
    try {
      latLng  = (LatLng) properties.getObject("latLng");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return latLng;
  }

  /**
   * get The offset to apply to an infowindow anchored on the clicked feature.
   * @return
   */
  public Size getPixelOffset() {
    Size pixelOffset = null;
    try {
      pixelOffset  = (Size) properties.getObject("pixelOffset");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return pixelOffset;
  }
  
}
