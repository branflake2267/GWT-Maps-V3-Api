package com.google.gwt.maps.client.placeslib;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.base.LatLngBounds;

/**
 * The options that can be set on an Autocomplete.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#AutocompleteOptions}
 */
public class AutocompleteOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected AutocompleteOptions() {}
  
  /**
   * 
   * @return
   */
  public static final AutocompleteOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The area in which to search for Places. Results are biased towards, but not restricted to, Places contained within these bounds.
   * @param bounds
   */
  public final native void setBounds(LatLngBounds bounds) /*-{
    this.bounds = bounds;
  }-*/;
  
  /**
   * The area in which to search for Places. Results are biased towards, but not restricted to, Places contained within these bounds.
   */
  public final native LatLngBounds getBounds() /*-{
    return this.bounds;
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
    this.types = types;
  }-*/;
  
  /**
   * gets The types of predictions to be returned. Supported types are 'establishment' for businesses and 'geocode' for addresses. If neither is specified, both types are returned.
   * @return
   */
  public final AutocompleteType[] getTypes() {
    JsArrayString at = getTypesImpl();
    if (at == null) {
      return null;
    }
    AutocompleteType[] types = new AutocompleteType[at.length()]; 
    for (int i=0; i < at.length(); i++) {
      types[i] = AutocompleteType.fromValue(at.get(i));
    }
    return types;
  }
  
  private final native JsArrayString getTypesImpl() /*-{
    return this.types;
  }-*/;
  
}
