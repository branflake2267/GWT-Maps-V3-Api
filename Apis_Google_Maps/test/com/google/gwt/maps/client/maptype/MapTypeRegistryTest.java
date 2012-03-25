package com.google.gwt.maps.client.maptype;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.maptypes.MapType;
import com.google.gwt.maps.client.maptypes.MapTypeRegistry;
import com.google.gwt.maps.client.maptypes.Projection;

public class MapTypeRegistryTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  
  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testUse() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeRegistry o = MapTypeRegistry.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testSet() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeRegistry o = MapTypeRegistry.newInstance();
        String id = "myId";
        o.set(id, new MapType() {
          
          @Override
          public void setTileSize(Size tileSize) {
            // TODO Auto-generated method stub
            
          }
          
          @Override
          public void setRadius(int radius) {
            // TODO Auto-generated method stub
            
          }
          
          @Override
          public void setProjection(Projection projection) {
            // TODO Auto-generated method stub
            
          }
          
          @Override
          public void setName(String name) {
            // TODO Auto-generated method stub
            
          }
          
          @Override
          public void setMinZoom(int minZoom) {
            // TODO Auto-generated method stub
            
          }
          
          @Override
          public void setMaxZoom(int maxZoom) {
            // TODO Auto-generated method stub
            
          }
          
          @Override
          public void setAlt(String alt) {
            // TODO Auto-generated method stub
            
          }
          
          @Override
          public void releaseTile(Element tile) {
            // TODO Auto-generated method stub
            
          }
          
          @Override
          public Element getTile(Point tileCoord, int zoom, Document ownerDocument) {
            // TODO Auto-generated method stub
            return null;
          }
          
          @Override
          public String getAlt() {
            // TODO Auto-generated method stub
            return null;
          }
        });
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  

}
