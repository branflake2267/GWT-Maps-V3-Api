package com.google.gwt.maps.client.placeslib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;

/**
 * Defines information about a Place.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#PlaceResult}
 */
public class PlaceResult extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected PlaceResult() {}
  
  /**
   * 
   * @return
   */
  public static final PlaceResult newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The collection of address components for this Place's location.
   * @param address_components
   */
  public final native void setAddress_Components(JsArray<GeocoderAddressComponent> address_components) /*-{
    this.address_components = address_components;
  }-*/;
  
  /**
   * The collection of address components for this Place's location.
   * @return
   */
  public final native JsArray<GeocoderAddressComponent> getAddress_Components() /*-{
    return this.address_components;
  }-*/;
  
  /**
   * The Place's full address.
   * @param formatted_address
   */
  public final native void setFormated_Address(String formatted_address) /*-{
    this.formatted_address = formatted_address;
  }-*/;
  
  /**
   * The Place's full address.
   * @return
   */
  public final native String getFormatted_Address() /*-{
    return this.formatted_address;
  }-*/;

  /**
   * The Place's phone number, formatted according to the number's regional convention.
   * @param formatted_phone_number
   */
  public final native void setFormatted_Phone_Number(String formatted_phone_number) /*-{
    this.formatted_phone_number = formatted_phone_number;
  }-*/;
  
  /**
   * The Place's phone number, formatted according to the number's regional convention.
   */
  public final native String getFormatted_Phone_Number() /*-{
    return this.formatted_phone_number;
  }-*/;
  
  /**
   * The Place's geometry-related information.
   * @param geometry
   */
  public final native void setGeometry(PlaceGeometry geometry) /*-{
    this.geometry = geometry;
  }-*/;
  
  /**
   * The Place's geometry-related information.
   * @return
   */
  public final native PlaceGeometry getGeometry() /*-{
    return this.geometry;
  }-*/;
  
  /**
   * Attribution text to be displayed for this Place result.
   * @param html_attributions
   */
  public final native void setHtml_Attributions(String html_attributions) /*-{
    this.html_attributions = html_attributions;
  }-*/;
  
  /**
   * Attribution text to be displayed for this Place result.
   */
  public final native String getHtml_Attributions() /*-{
    return this.html_attributions;
  }-*/;
  
  /**
   * URL to an image resource that can be used to represent this Place's category.
   * @param icon
   */
  public final native void setIcon(String icon) /*-{
    this.icon = icon;
  }-*/;
  
  /**
   * URL to an image resource that can be used to represent this Place's category.
   * @return
   */
  public final native String getIcon() /*-{
    return this.icon;
  }-*/;
  
  /**
   * A unique identifier denoting this Place. This identifier may not be used to retrieve information about this Place, and to verify the identity of a Place across separate searches. As ids can occasionally change, it is recommended that the stored id for a Place be compared with the id returned in later Details requests for the same Place, and updated if necessary.
   * @param id
   */
  public final native void setId(String id) /*-{
    this.id = id;
  }-*/;
  
  /**
   * A unique identifier denoting this Place. This identifier may not be used to retrieve information about this Place, and to verify the identity of a Place across separate searches. As ids can occasionally change, it is recommended that the stored id for a Place be compared with the id returned in later Details requests for the same Place, and updated if necessary.
   * @return
   */
  public final native String getId() /*-{
    return this.id;
  }-*/;
  
  /**
   * The Place's phone number in international format. International format includes the country code, and is prefixed with the plus (+) sign.
   * @param international_phone_number
   */
  public final native void setInternational_Phone_Number(String international_phone_number) /*-{
    this.international_phone_number = international_phone_number;
  }-*/;
  
  /**
   * The Place's phone number in international format. International format includes the country code, and is prefixed with the plus (+) sign.
   * @return
   */
  public final native String getInternational_Phone_Number() /*-{
    return this.international_phone_number;
  }-*/;
  
  /**
   * The Place's name. Note: In the case of user entered Places, this is the raw text, as typed by the user. Please exercise caution when using this data, as malicious users may try to use it as a vector for code injection attacks (See http://en.wikipedia.org/wiki/Code_injection).
   * @param name
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;
  
  /**
   * The Place's name. Note: In the case of user entered Places, this is the raw text, as typed by the user. Please exercise caution when using this data, as malicious users may try to use it as a vector for code injection attacks (See http://en.wikipedia.org/wiki/Code_injection).
   * @return
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;
  
  /**
   * The Place's rating, from 0.0 to 5.0, based on user reviews.
   * @param rating
   */
  public final native void setRating(int rating) /*-{
    this.rating = rating;
  }-*/;
  
  /**
   * The Place's rating, from 0.0 to 5.0, based on user reviews.
   * @return
   */
  public final native int getRating() /*-{
    return this.rating;
  }-*/;
  
  /**
   * An opaque string that may be used to retrieve up-to-date information about this Place (via PlacesService.getDetails()). reference contains a unique token that you can use to retrieve additional information about this Place in a Place Details request. You can store this token and use it at any time in future to refresh cached data about this Place, but the same token is not guaranteed to be returned for any given Place across different searches.
   * @param reference
   */
  public final native void setReference(String reference) /*-{
    this.reference = reference;
  }-*/;
  
  /**
   * An opaque string that may be used to retrieve up-to-date information about this Place (via PlacesService.getDetails()). reference contains a unique token that you can use to retrieve additional information about this Place in a Place Details request. You can store this token and use it at any time in future to refresh cached data about this Place, but the same token is not guaranteed to be returned for any given Place across different searches.
   * @return
   */
  public final native String getReference() /*-{
    return this.reference;
  }-*/;
  
  /**
   * An array of types for this Place (e.g., ["political",  "locality"] or ["restaurant", "establishment"]).
   * @param types
   */
  public final native void setTypes(JsArrayString types) /*-{
    this.types = types;
  }-*/;
  
  /**
   * An array of types for this Place (e.g., ["political",  "locality"] or ["restaurant", "establishment"]).
   * @return
   */
  public final native JsArrayString getTypes() /*-{
    return this.types;
  }-*/; 
  
  /**
   * URL of the associated Google Place Page.
   * @param url
   */
  public final native void setUrl(String url) /*-{
    this.url = url;
  }-*/;
  
  /**
   * URL of the associated Google Place Page.
   * @return
   */
  public final native String getUrl() /*-{
    return this.url;
  }-*/;
  
  /**
   * A fragment of the Place's address for disambiguation (usually street name and locality).
   * @param vicinity
   */
  public final native void setVicinity(String vicinity) /*-{
    this.vicinity = vicinity;
  }-*/;
  
  /**
   * A fragment of the Place's address for disambiguation (usually street name and locality).
   * @return
   */
  public final native String getVicinity() /*-{
    return this.vicinity;
  }-*/;
  
  /**
   * The authoritative website for this Place, such as a business' homepage.
   * @param website
   */
  public final native void setWebsite(String website) /*-{
    this.website = website;
  }-*/;
  
  /**
   * The authoritative website for this Place, such as a business' homepage.
   */
  public final native String getWebsite() /*-{
    return this.website;
  }-*/;
 
}
