package com.google.gwt.ajaxloader.client;

import com.google.gwt.ajaxloader.client.AjaxLoader.AjaxLoaderOptions;
import com.google.gwt.junit.client.GWTTestCase;

public class ClientLocationTest extends GWTTestCase {
  private static final int ASYNC_DELAY_MSEC = 10000;

  @Override
  public String getModuleName() {
    return "com.google.gwt.ajaxloader.AjaxLoader";
  }

  public void testClientLocation() {
    delayTestFinish(ASYNC_DELAY_MSEC);
    AjaxLoaderOptions options = AjaxLoaderOptions.newInstance();
    Runnable onLoad = new Runnable() {
      public void run() {
        ClientLocation clientLocation = AjaxLoader.getClientLocation();
        if (clientLocation == null) {
          fail("Client's location cannot be resolved.");
        }
        assertNotNull(clientLocation.getCity());
        assertNotNull(clientLocation.getCountry());
        assertNotNull(clientLocation.getCountryCode());
        assertNotNull(clientLocation.getLatitude());
        assertNotNull(clientLocation.getLongitude());
        assertNotNull(clientLocation.getRegion());
        finishTest();
      }
    };
    AjaxLoader.loadApi("search", "1", onLoad, options);
  }
}
