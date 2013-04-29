package com.google.gwt.maps.client;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import com.google.gwt.ajaxloader.client.AjaxLoader;
import com.google.gwt.ajaxloader.client.AjaxLoader.AjaxLoaderOptions;

/**
 * Load Maps javascript v3 api
 * 
 * TODO maybe move to the new loading system they have in google apis
 */
public class LoadApi {

  /**
   * Note: If you use 3, it will take the newest stable available. Don't want that. We didn't test with that yet!
   */
  public final static String API_VERSION = "3.10";

  /**
   * Libraries not loaded by default <br>
   * <br>
   * See <a href= "https://developers.google.com/maps/documentation/javascript/basics.html#Libraries" >Libraries API
   * Doc</a>
   */
  public static enum LoadLibrary {

    /**
     * Allows your Maps API application to include context-sensitive text ads, allowing you to share in ad revenue for
     * ads shown to your users. Consult the AdSense Library documentation for more information.
     */
    ADSENSE,

    /**
     * Provides a graphical interface for users to draw polygons, rectangles, polylines, circles, and markers on the
     * map. Consult the Drawing Library documentation for more information.
     */
    DRAWING,

    /**
     * Geometry includes utility functions for calculating scalar geometric values (such as distance and area) on the
     * the surface of the earth. Consult the Geometry Library documentation for more information.
     */
    GEOMETRY,

    /**
     * Panoramio contains functionality for adding Panoramio photo layers to your Maps API application. Consult the
     * Panoramio Layers documentation for more information.
     */
    PANORAMIO,

    /**
     * Places enables your application to search for businesses, geographic locations, and points of interest near a
     * given location, or as a user types. Consult the Places Library documentation for more information.
     */
    PLACES,

    /**
     * Weather contains functionality for adding meterological layers to your Maps API application. Consult the Weather
     * Layers documentation for more information.
     */
    WEATHER,

    /**
     * Visualization contains functionality for adding advanced visualization layers to your Maps API application.
     * Consult the Visualization documentation for more information.
     */
    VISUALIZATION;

    public String value() {
      return name().toLowerCase();
    }

    public static LoadLibrary fromValue(String value) {
      return valueOf(value.toUpperCase());
    }

    @Override
    public String toString() {
      return name().toLowerCase();
    }
  }

  /**
   * @See <a href="https://developers.google.com/maps/documentation/javascript/basics#Localization">Localization docs</a>
   * @See <a href="https://spreadsheets.google.com/pub?key=p9pdwsai2hDMsLkXsoM05KQ&gid=1">List of languages</a>
   */
  public static enum Language {

    GERMAN("de"),
    GREEK("el"),
    ENGLISH("en"),
    ENGLISH_AUSTRALIAN("en-AU"),
    ENGLISH_GREAT_BRITAIN("en-GB"),
    SPANISH("es"),
    BASQUE("eu"),
    FARSI("fa"),
    FINNISH("fi"),
    FILIPINO("fil"),
    FRENCH("fr"),
    GALICIAN("gl"),
    GUJARATI("gu"),
    HINDI("hi"),
    CROATIAN("hr"),
    HUNGARIAN("hu"),
    INDONESIAN("id"),
    ITALIAN("it"),
    HEBREW("iw"),
    JAPANESE("ja"),
    KANNADA("kn"),
    KOREAN("ko"),
    LITHUANIAN("lt"),
    LATVIAN("lv"),
    MALAYALAM("ml"),
    MARATHI("mr"),
    DUTCH("nl"),
    NORWEGIAN_NYNORSK("nn"),
    NORWEGIAN("no"),
    ORIYA("or"),
    POLISH("pl"),
    PORTUGUESE("pt"),
    PORTUGUESE_BRAZIL("pt-BR"),
    PORTUGUESE_PORTUGAL("pt-PT"),
    ROMANSCH("rm"),
    ROMANIAN("ro"),
    RUSSIAN("ru"),
    SLOVAK("sk"),
    SLOVENIAN("sl"),
    SERBIAN("sr"),
    SWEDISH("sv"),
    TAGALOG("tl"),
    TAMIL("ta"),
    TELUGU("te"),
    THAI("th"),
    TURKISH("tr"),
    UKRAINIAN("uk"),
    VIETNAMESE("vi"),
    CHINESE_SIMPLIFIED("zh-CN"),
    CHINESE_TRADITIONAL("zh-TW"),
    DANISH("da");

    private String value;

    Language(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    public static Language fromValue(String value) {
      return valueOf(value.toUpperCase());
    }

    @Override
    public String toString() {
      return name().toLowerCase() + "(" + value + ")";
    }

  }

  /**
   * Load Maps javascript v3 api with default libraries. these are not loaded {@link LoadLibrary}
   * 
   * @param onLoad - callback on success
   * @param sensor - derive location [true|false]
   */
  public static void go(Runnable onLoad, boolean sensor) {
    load(onLoad, sensor, null, null, null);
  }

  /**
   * loads maps api
   * 
   * @param onLoad callback on success
   * @param loadLibraries load additional libraries like geometry
   * @param sensor derive location [true|false]
   */
  public static void go(Runnable onLoad, ArrayList<LoadLibrary> loadLibraries, boolean sensor) {
    load(onLoad, sensor, loadLibraries, null, null);
  }
  
  /**
   * loads maps api
   * 
   * @param onLoad callback on success
   * @param loadLibraries load additional libraries like geometry
   * @param sensor derive location [true|false]
   * @param language choose a language
   */
  public static void go(Runnable onLoad, ArrayList<LoadLibrary> loadLibraries, boolean sensor, Language language) {
    load(onLoad, sensor, loadLibraries, language, null);
  }

  /**
   * loads maps api
   * 
   * @param onLoad callback on success
   * @param loadLibraries load additional libraries like geometry
   * @param sensor derive location [true|false]
   */
  public static void go(Runnable onLoad, LoadLibrary[] loadLibraries, boolean sensor) {
    ArrayList<LoadLibrary> loadLibrariesList = new ArrayList<LoadLibrary>(Arrays.asList(loadLibraries));
    load(onLoad, sensor, loadLibrariesList, null, null);
  }
  
  /**
   * loads maps api
   * 
   * @param onLoad callback on success
   * @param loadLibraries load additional libraries like geometry
   * @param sensor derive location [true|false]
   * @param language choose a language
   */
  public static void go(Runnable onLoad, LoadLibrary[] loadLibraries, boolean sensor, Language language) {
    ArrayList<LoadLibrary> loadLibrariesList = new ArrayList<LoadLibrary>(Arrays.asList(loadLibraries));
    load(onLoad, sensor, loadLibrariesList, language, null);
  }

  /**
   * loads maps api
   * 
   * @param onLoad callback on success
   * @param sensor derive location [true|false]
   * @param otherParams add additional params. like "key=YOUR_API_KEY"
   */
  public static void go(Runnable onLoad, boolean sensor, String otherParams) {
    load(onLoad, sensor, null, null, otherParams);
  }

  /**
   * loads maps api
   * 
   * @param onLoad callback on success
   * @param loadLibraries load additional libraries like geometry
   * @param sensor sensor derive location [true|false]
   * @param otherParams add additional params. like "key=YOUR_API_KEY"
   */
  public static void go(Runnable onLoad, ArrayList<LoadLibrary> loadLibraries, boolean sensor, String otherParams) {
    load(onLoad, sensor, loadLibraries, null, otherParams);
  }

  /**
   * loads maps api
   * 
   * @param onLoad callback on success
   * @param loadLibraries load additional libraries like geometry
   * @param sensor sensor derive location [true|false]
   * @param language choose a language
   * @param otherParams add additional params. like "key=YOUR_API_KEY"
   */
  public static void go(Runnable onLoad, ArrayList<LoadLibrary> loadLibraries, boolean sensor, Language language,
      String otherParams) {
    load(onLoad, sensor, loadLibraries, language, otherParams);
  }

  private static void load(Runnable onLoad, boolean sensor, ArrayList<LoadLibrary> loadLibraries, Language language,
      String otherParams) {
    String op = "sensor=" + sensor;
    if (otherParams != null) {
      op += "&" + otherParams;
    }

    if (loadLibraries != null) {
      op += "&" + getLibraries(loadLibraries);
    }

    if (language != null) {
      op += "&language=" + language.getValue();
    }

    AjaxLoaderOptions settings = AjaxLoaderOptions.newInstance();
    settings.setOtherParms(op);
    AjaxLoader.loadApi("maps", API_VERSION, onLoad, settings);
  }

  /**
   * get the url libraries parameter
   * 
   * @param loadLibraries
   */
  private static String getLibraries(ArrayList<LoadLibrary> loadLibraries) {
    if (loadLibraries == null) {
      return "";
    }
    String s = "libraries=";
    Iterator<LoadLibrary> itr = loadLibraries.iterator();
    int i = 0;
    while (itr.hasNext()) {
      LoadLibrary ll = itr.next();
      if (ll != null) {
        if (i > 0) {
          s += ",";
        }
        s += ll.value();
        i++;
      }
    }
    return s;
  }

  /**
   * private constructor
   */
  private LoadApi() {
  }
}
