package com.google.gwt.maps.client.placeslib;

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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Supported types are 'establishment' for businesses and 'geocode' for addresses. If no type is specified, both types
 * will be returned. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#Autocomplete">Autocomplete API
 * Doc</a>
 */
public enum AutocompleteType {

  ACCOUNTING,
  AIRPORT,
  AMUSEMENT_PARK,
  AQUARIUM,
  ART_GALLERY,
  ATM,
  BAKERY,
  BANK,
  BAR,
  BEAUTY_SALON,
  BICYCLE_STORE,
  BOOK_STORE,
  BOWLING_ALLEY,
  BUS_STATION,
  CAFE,
  CAMPGROUND,
  CAR_DEALER,
  CAR_RENTAL,
  CAR_REPAIR,
  CAR_WASH,
  CASINO,
  CEMETERY,
  CHURCH,
  CITY_HALL,
  CLOTHING_STORE,
  CONVENIENCE_STORE,
  COURTHOUSE,
  DENTIST,
  DEPARTMENT_STORE,
  DOCTOR,
  ELECTRICIAN,
  ELECTRONICS_STORE,
  EMBASSY,
  /**
   * Sets the types of predictions to be returned. Supported type 'establishment' for businesses
   */
  ESTABLISHMENT,
  FINANCE,
  FIRE_STATION,
  FLORIST,
  FOOD,
  FUNERAL_HOME,
  FURNITURE_STORE,
  GAS_STATION,
  GENERAL_CONTRACTOR,
  GROCERY_OR_SUPERMARKET,
  GYM,
  HAIR_CARE,
  HARDWARE_STORE,
  HEALTH,
  HINDU_TEMPLE,
  HOME_GOODS_STORE,
  HOSPITAL,
  INSURANCE_AGENCY,
  JEWELRY_STORE,
  LAUNDRY,
  LAWYER,
  LIBRARY,
  LIQUOR_STORE,
  LOCAL_GOVERNMENT_OFFICE,
  LOCKSMITH,
  LODGING,
  MEAL_DELIVERY,
  MEAL_TAKEAWAY,
  MOSQUE,
  MOVIE_RENTAL,
  MOVIE_THEATER,
  MOVING_COMPANY,
  MUSEUM,
  NIGHT_CLUB,
  PAINTER,
  PARK,
  PARKING,
  PET_STORE,
  PHARMACY,
  PHYSIOTHERAPIST,
  PLACE_OF_WORSHIP,
  PLUMBER,
  POLICE,
  POST_OFFICE,
  REAL_ESTATE_AGENCY,
  RESTAURANT,
  ROOFING_CONTRACTOR,
  RV_PARK,
  SCHOOL,
  SHOE_STORE,
  SHOPPING_MALL,
  SPA,
  STADIUM,
  STORAGE,
  STORE,
  SUBWAY_STATION,
  SYNAGOGUE,
  TAXI_STAND,
  TRAIN_STATION,
  TRAVEL_AGENCY,
  UNIVERSITY,
  VETERINARY_CARE,
  ZOO,

  /**
   * Search place types
   */

  ADMINISTRATIVE_AREA_LEVEL_1,
  ADMINISTRATIVE_AREA_LEVEL_2,
  ADMINISTRATIVE_AREA_LEVEL_3,
  COLLOQUIAL_AREA,
  COUNTRY,
  FLOOR,
  /**
   * Sets the types of predictions to be returned. Supported type 'geocode' for addresses
   */
  GEOCODE,
  INTERSECTION,
  LOCALITY,
  NATURAL_FEATURE,
  NEIGHBORHOOD,
  POLITICAL,
  POINT_OF_INTEREST,
  POST_BOX,
  POSTAL_CODE,
  POSTAL_CODE_PREFIX,
  POSTAL_TOWN,
  PREMISE,
  ROOM,
  ROUTE,
  STREET_ADDRESS,
  STREET_NUMBER,
  SUBLOCALITY,
  SUBLOCALITY_LEVEL_5,
  SUBLOCALITY_LEVEL_4,
  SUBLOCALITY_LEVEL_3,
  SUBLOCALITY_LEVEL_2,
  SUBLOCALITY_LEVEL_1,
  SUBPREMISE,
  TRANSIT_STATION,

  REGIONS("(regions)"),
  CITIES("(cities)");

  private static final List<AutocompleteType> EXPLICIT_TYPES = Arrays.asList(ESTABLISHMENT, GEOCODE);
  private static final List<AutocompleteType> TYPE_COLLECTIONS = Arrays.asList(CITIES, REGIONS);

  private final String value;

  AutocompleteType() {
    this(null);
  }

  AutocompleteType(String value) {
    this.value = value;
  }

  public String value() {
    if (value == null) {
      return name().toLowerCase();
    } else {
      return value;
    }
  }

  public static AutocompleteType fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }

  public static void validateTypesAreCompatibles(AutocompleteType... types) {
    List<AutocompleteType> autocompleteTypes = Arrays.asList(types);

    boolean hasExplicitTypes = !Collections.disjoint(autocompleteTypes, EXPLICIT_TYPES);
    boolean hasTypeCollections = !Collections.disjoint(autocompleteTypes, TYPE_COLLECTIONS);

    if (hasExplicitTypes && hasTypeCollections) {
      throw new IllegalArgumentException("You cannot use both explicit types and type collections");
    }
  }

}
