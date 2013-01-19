package com.google.gwt.maps.client.layers;

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

public class KmlLayerMetadataGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testAuthor() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        KmlLayerMetadata o = KmlLayerMetadata.newInstance();
        KmlAuthor left = KmlAuthor.newInstance();
        left.setEmail("test123");
        o.setAuthor(left);
        KmlAuthor right = o.getAuthor();
        assertEquals(left.getEmail(), right.getEmail());
        finishTest();
      }
    });

  }

  public void testDescription() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        KmlLayerMetadata o = KmlLayerMetadata.newInstance();
        String left = "test123";
        o.setDescription(left);
        String right = o.getDescription();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testName() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        KmlLayerMetadata o = KmlLayerMetadata.newInstance();
        String left = "test123";
        o.setName(left);
        String right = o.getName();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testSnippet() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        KmlLayerMetadata o = KmlLayerMetadata.newInstance();
        String left = "test123";
        o.setSnippet(left);
        String right = o.getSnippet();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        KmlLayerMetadata o = KmlLayerMetadata.newInstance();
        finishTest();
      }
    });

  }

}
