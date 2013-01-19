package com.google.gwt.maps.client.panoramio;

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

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.panoramiolib.PanoramioFeature;

public class PanoramioFeatureGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PANORAMIO };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioFeature o = PanoramioFeature.newInstance();
        finishTest();
      }
    });

  }

  public void testAuthor() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioFeature o = PanoramioFeature.newInstance();
        String left = "test";
        o.setAuthor(left);
        String right = o.getAuthor();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testPhotoId() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioFeature o = PanoramioFeature.newInstance();
        String left = "test";
        o.setPhotoId(left);
        String right = o.getPhotoId();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testTitle() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioFeature o = PanoramioFeature.newInstance();
        String left = "test";
        o.setTitle(left);
        String right = o.getTitle();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testUrl() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioFeature o = PanoramioFeature.newInstance();
        String left = "test";
        o.setUrl(left);
        String right = o.getUrl();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testUserId() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioFeature o = PanoramioFeature.newInstance();
        String left = "userIdTest";
        o.setUserId(left);
        String right = o.getUserId();
        assertEquals(left, right);
        finishTest();
      }
    });

  }
}
