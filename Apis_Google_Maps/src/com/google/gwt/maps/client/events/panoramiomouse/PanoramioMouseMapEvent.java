package com.google.gwt.maps.client.events.panoramiomouse;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.panoramiolib.PanoramioFeature;

public class PanoramioMouseMapEvent extends MapEvent<PanoramioMouseMapHandler, PanoramioMouseMapEvent> {

  public static Type<PanoramioMouseMapHandler> TYPE = new Type<PanoramioMouseMapHandler>();

  public PanoramioMouseMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<PanoramioMouseMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(PanoramioMouseMapHandler handler) {
    handler.onEvent(this);
  }

  /**
   * A PanoramioFeature object containing information about the clicked feature.
   * @return {@link PanoramioFeature} 
   */
  public PanoramioFeature getFeatureDetails() {
    PanoramioFeature feature = null;
    try {
      feature = (PanoramioFeature) properties.getObject("featureDetails");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return feature ;
  }
  
  /**
   * Pre-rendered HTML content, as placed in the infowindow by the default UI.
   * @return
   */
  public String getInfoWindowHtml() {
    String infoWindowHtml = null;
    try {
      infoWindowHtml  = properties.getString("infoWindowHtml");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return infoWindowHtml;
  }

  /**
   * The position at which to anchor an infowindow on the clicked feature.
   * @return {@link LatLng}
   */
  public LatLng getLatLng() {
    LatLng latLng = null;
    try {
      latLng = (LatLng) properties.getObject("latLng");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return latLng;
  }

  /**
   * gets The offset to apply to an infowindow anchored on the clicked feature.
   * @return
   */
  public Size getPixelOffset() {
    Size pixelOffset = null;
    try {
      pixelOffset = (Size) properties.getObject("pixelOffset");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return pixelOffset;
  }
  
}
