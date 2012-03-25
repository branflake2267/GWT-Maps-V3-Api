package com.google.gwt.maps.client.placeslib;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.place.PlaceChangeEventFormatter;
import com.google.gwt.maps.client.events.place.PlaceChangeMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A service to provide Place predictions based on a user's text input. It attaches to an input element of type text, and listens for text entry in that field. The list of predictions is presented as a drop-down list, and is updated as text is entered. This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#Autocomplete}
 */
public class Autocomplete extends MVCObject<Autocomplete> {

  private static final native JavaScriptObject createJso(Element inputField, AutocompleteOptions options) /*-{
    return new $wnd.google.maps.places.Autocomplete(inputField, options);
  }-*/;
  
  /**
   * Creates a new instance of Autocomplete that attaches to the specified input text field with the given options.
   * @param inputField
   * @param options
   * @return
   */
  public static final Autocomplete newInstance(Element inputField, AutocompleteOptions options) {
    return createJso(inputField, options).cast();
  }

  /**
   * use newInstance();
   */
  protected Autocomplete() {}

  /**
   * This event is fired when a PlaceResult is made available for a Place the user has selected. If the user enters the name of a Place that was not suggested by the control and presses the Enter key, a place_changed event will be fired that contains the user input in the name property, with no other properties defined.
   * @param handler
   * @return
   */
  public final HandlerRegistration addPlaceChangeHandler(PlaceChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.PLACE_CHANGED, handler, new PlaceChangeEventFormatter());
  } 
  
  /**
   * Returns the bounds to which predictions are biased.
   * @return
   */
  public final native LatLngBounds getBounds() /*-{
    return this.getBounds();
  }-*/;
  
  /**
   * Returns the details of the Place selected by the user, or null if no Place has been selected yet.
   * @return
   */
  public final native PlaceResult getPlace() /*-{
    return this.getPlace();
  }-*/;
  
  /**
   * Sets the preferred area within which to return Place results. Results are biased towards, but not restricted to, this area.
   * @param bounds
   */
  public final native void setBounds(LatLngBounds bounds) /*-{
    this.setBounds(bounds); 
  }-*/;
  
  /**
   * Sets the types of predictions to be returned. Supported types are 'establishment' for businesses and 'geocode' for addresses. If no type is specified, both types will be returned.
   * @param types
   */
  public final void setTypes(AutocompleteType... types) {
    if (types == null) {
      return;
    }
    String[] stypes = new String[types.length]; 
    for (int i=0; i < types.length; i++) {
      stypes[i] = types[i].value();
    }
    JsArrayString a = ArrayHelper.toJsArrayString(stypes);
    setTypesImpl(a);
  }
  
  private final native void setTypesImpl(JsArrayString types) /*-{
    this.setTypes(types);
  }-*/;
  
}
