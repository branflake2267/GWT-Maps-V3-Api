package com.google.gwt.maps.client.maptypes;

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

/**
 * Possible values for feature types. Specify these values as strings, i.e. 'administrative' or 'poi.park'. Stylers
 * applied to a parent feature type automatically apply to all child feature types. Note however that parent features
 * may include some additional features that are not included in one of their child feature types. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MapTypeStyleFeatureType">
 * MapTypeStyleFeatureType API Doc</a>
 */
public enum MapTypeStyleFeatureType {

  /**
   * Apply the rule to administrative areas.
   */
  ADMINISTRATIVE,

  /**
   * Apply the rule to countries.
   */
  ADMINISTRATIVE__COUNTRY,

  /**
   * Apply the rule to land parcels.
   */
  ADMINISTRATIVE__LAND_PARCEL,

  /**
   * Apply the rule to localities.
   */
  ADMINISTRATIVE__LOCALITY,

  /**
   * Apply the rule to neighborhoods.
   */
  ADMINISTRATIVE__NEIGHBORHOOD,

  /**
   * Apply the rule to provinces.
   */
  ADMINISTRATIVE__PROVINCE,

  /**
   * Apply the rule to all selector types.
   */
  ALL,

  /**
   * Apply the rule to landscapes.
   */
  LANDSCAPE,

  /**
   * Apply the rule to man made structures.
   */
  LANDSCAPE__MAN_MADE,

  /**
   * Apply the rule to natural features.
   */
  LANDSCAPE__NATURAL,

  /**
   * Apply the rule to landcover.
   */
  LANDSCAPE__NATURAL__LANDCOVER,

  /**
   * Apply the rule to terrain.
   */
  LANDSCAPE__NATURAL__TERRAIN,

  /**
   * Apply the rule to points of interest.
   */
  POI,

  /**
   * Apply the rule to attractions for tourists.
   */
  POI__ATTRACTION,

  /**
   * Apply the rule to businesses.
   */
  POI__BUSINESS,

  /**
   * Apply the rule to government buildings.
   */
  POI__GOVERNMENT,

  /**
   * Apply the rule to emergency services (hospitals, pharmacies, police, doctors, etc).
   */
  POI__MEDICAL,

  /**
   * Apply the rule to parks.
   */
  POI__PARK,

  /**
   * Apply the rule to places of worship, such as church, temple, or mosque.
   */
  POI__PLACE_OF_WORSHIP,

  /**
   * Apply the rule to schools.
   */
  POI__SCHOOL,

  /**
   * Apply the rule to sports complexes.
   */
  POI__SPORTS_COMPLEX,

  /**
   * Apply the rule to all roads
   */
  ROAD,

  /**
   * Apply the rule to arterial roads.
   */
  ROAD__ARTERIAL,

  /**
   * Apply the rule to highways.
   */
  ROAD__HIGHWAY,

  /**
   * Apply the rule to controlled-access highways.
   */
  ROAD__HIGHWAY__CONTROLLED_ACCESS,

  /**
   * Apply the rule to local roads.
   */
  ROAD__LOCAL,

  /**
   * Apply the rule to all transit stations and lines.
   */
  TRANSIT,

  /**
   * Apply the rule to transit lines.
   */
  TRANSIT__LINE,

  /**
   * Apply the rule to all transit stations.
   */
  TRANSIT__STATION,

  /**
   * Apply the rule to airports.
   */
  TRANSIT__STATION__AIRPORT,

  /**
   * Apply the rule to bus stops.
   */
  TRANSIT__STATION__BUS,

  /**
   * Apply the rule to rail stations.
   */
  TRANSIT__STATION__RAIL,

  /**
   * Apply the rule to bodies of water.
   */
  WATER;

  /**
   * return the enum value as a String
   * 
   * @return String
   */
  public String value() {
    return name().replaceAll("__", ".").toLowerCase();
  }

  /**
   * convert a String value to enum Type
   * 
   * @param type
   * @return TYPE
   */
  public static MapTypeStyleFeatureType fromValue(String type) {
    type = type.replaceAll("\\.", "__");
    return valueOf(type.toUpperCase());
  }

  /**
   * return the enum Type as a String
   */
  @Override
  public String toString() {
    return name().replaceAll("__", ".").toLowerCase();
  }
}
