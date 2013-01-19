package com.google.gwt.maps.client.mvc;

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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.events.insertat.InsertAtMapEvent;
import com.google.gwt.maps.client.events.insertat.InsertAtMapHandler;
import com.google.gwt.maps.client.events.removeat.RemoveAtMapEvent;
import com.google.gwt.maps.client.events.removeat.RemoveAtMapHandler;
import com.google.gwt.maps.client.events.setat.SetAtMapEvent;
import com.google.gwt.maps.client.events.setat.SetAtMapHandler;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;

public class MVCArrayGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testClear() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HTML h1 = new HTML("1");
        HTML h2 = new HTML("2");
        HTML h3 = new HTML("3");
        FlowPanel fp1 = new FlowPanel();
        fp1.add(h1);
        FlowPanel fp2 = new FlowPanel();
        fp2.add(h2);
        FlowPanel fp3 = new FlowPanel();
        fp3.add(h3);

        Element[] e = new Element[3];
        e[0] = fp1.getElement();
        e[1] = fp2.getElement();
        e[2] = fp3.getElement();
        JsArray<Element> array = ArrayHelper.toJsArray(e);

        MVCArray<Element> o = MVCArray.newInstance(array);

        o.clear();

        assertEquals(0, o.getLength());

        finishTest();
      }
    });

  }

  public void testForEach() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HTML h1 = new HTML("1");
        HTML h2 = new HTML("2");
        HTML h3 = new HTML("3");
        FlowPanel fp1 = new FlowPanel();
        fp1.add(h1);
        FlowPanel fp2 = new FlowPanel();
        fp2.add(h2);
        FlowPanel fp3 = new FlowPanel();
        fp3.add(h3);

        Element[] e = new Element[3];
        e[0] = fp1.getElement();
        e[1] = fp2.getElement();
        e[2] = fp3.getElement();
        JsArray<Element> array = ArrayHelper.toJsArray(e);

        MVCArray<Element> o = MVCArray.newInstance(array);

        o.forEach(new MVCArrayCallback<Element>() {
          @Override
          public void forEach(Element element, int index) {
            assertEquals(1, element.getChildCount());
            String left = "<div class=\"gwt-HTML\">" + (index + 1) + "</div>";
            String right = element.getInnerHTML();
            assertEquals(left, right);
          }
        });

        finishTest();
      }
    });

  }

  public void testGet() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HTML h1 = new HTML("1");
        HTML h2 = new HTML("2");
        HTML h3 = new HTML("3");
        FlowPanel fp1 = new FlowPanel();
        fp1.add(h1);
        FlowPanel fp2 = new FlowPanel();
        fp2.add(h2);
        FlowPanel fp3 = new FlowPanel();
        fp3.add(h3);

        Element[] e = new Element[3];
        e[0] = fp1.getElement();
        e[1] = fp2.getElement();
        e[2] = fp3.getElement();
        JsArray<Element> array = ArrayHelper.toJsArray(e);

        MVCArray<Element> o = MVCArray.newInstance(array);

        Element ee = o.get(0);
        String left = "<div class=\"gwt-HTML\">1</div>";
        String right = ee.getInnerHTML();
        assertEquals(left, right);

        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testGetArray() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HTML h1 = new HTML("1");
        HTML h2 = new HTML("2");
        HTML h3 = new HTML("3");
        FlowPanel fp1 = new FlowPanel();
        fp1.add(h1);
        FlowPanel fp2 = new FlowPanel();
        fp2.add(h2);
        FlowPanel fp3 = new FlowPanel();
        fp3.add(h3);

        Element[] e = new Element[3];
        e[0] = fp1.getElement();
        e[1] = fp2.getElement();
        e[2] = fp3.getElement();
        JsArray<Element> array = ArrayHelper.toJsArray(e);

        MVCArray<Element> o = MVCArray.newInstance(array);

        JsArray<Element> a = o.getArray();

        assertEquals(3, o.getLength());

        finishTest();
      }
    });

  }

  public void testInsertAt() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HTML h1 = new HTML("1");
        HTML h2 = new HTML("2");
        HTML h3 = new HTML("3");
        HTML h4 = new HTML("4");
        FlowPanel fp1 = new FlowPanel();
        fp1.add(h1);
        FlowPanel fp2 = new FlowPanel();
        fp2.add(h2);
        FlowPanel fp3 = new FlowPanel();
        fp3.add(h3);
        FlowPanel fp4 = new FlowPanel();
        fp4.add(h4);

        Element[] e = new Element[3];
        e[0] = fp1.getElement();
        e[1] = fp2.getElement();
        e[2] = fp3.getElement();
        JsArray<Element> array = ArrayHelper.toJsArray(e);
        MVCArray<Element> o = MVCArray.newInstance(array);

        o.addInsertAtHandler(new InsertAtMapHandler() {
          @Override
          public void onEvent(InsertAtMapEvent event) {
            int index = event.getIndex();
            assertEquals(0, index);
          }
        });

        // insertAt
        o.insertAt(0, fp4.getElement());

        // test size
        assertEquals(4, o.getLength());

        String left = "<div class=\"gwt-HTML\">4</div>";
        String right = o.get(0).getInnerHTML();
        assertEquals(left, right);

        finishTest();
      }
    });

  }

  public void testPop() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HTML h1 = new HTML("1");
        HTML h2 = new HTML("2");
        HTML h3 = new HTML("3");
        FlowPanel fp1 = new FlowPanel();
        fp1.add(h1);
        FlowPanel fp2 = new FlowPanel();
        fp2.add(h2);
        FlowPanel fp3 = new FlowPanel();
        fp3.add(h3);

        Element[] e = new Element[3];
        e[0] = fp1.getElement();
        e[1] = fp2.getElement();
        e[2] = fp3.getElement();
        JsArray<Element> array = ArrayHelper.toJsArray(e);
        MVCArray<Element> o = MVCArray.newInstance(array);

        Element lastElement = o.pop();
        String lastElementLeft = "<div class=\"gwt-HTML\">3</div>";
        String lastElementRight = lastElement.getInnerHTML();
        assertEquals(lastElementLeft, lastElementRight);

        // test size
        int size = o.getLength();
        assertEquals(2, size);

        String left = "<div class=\"gwt-HTML\">2</div>";
        String right = o.get(o.getLength() - 1).getInnerHTML();
        assertEquals(left, right);

        finishTest();
      }
    });

  }

  public void testPush() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HTML h1 = new HTML("1");
        HTML h2 = new HTML("2");
        HTML h3 = new HTML("3");
        HTML h4 = new HTML("4");
        FlowPanel fp1 = new FlowPanel();
        fp1.add(h1);
        FlowPanel fp2 = new FlowPanel();
        fp2.add(h2);
        FlowPanel fp3 = new FlowPanel();
        fp3.add(h3);
        FlowPanel fp4 = new FlowPanel();
        fp4.add(h4);

        Element[] e = new Element[3];
        e[0] = fp1.getElement();
        e[1] = fp2.getElement();
        e[2] = fp3.getElement();
        JsArray<Element> array = ArrayHelper.toJsArray(e);
        MVCArray<Element> o = MVCArray.newInstance(array);

        int newLength = o.push(fp4.getElement());
        assertEquals(4, newLength);

        String left = "<div class=\"gwt-HTML\">4</div>";
        String right = o.get(o.getLength() - 1).getInnerHTML();
        assertEquals(left, right);

        finishTest();
      }
    });

  }

  public void testRemoveAt() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HTML h1 = new HTML("1");
        HTML h2 = new HTML("2");
        HTML h3 = new HTML("3");
        FlowPanel fp1 = new FlowPanel();
        fp1.add(h1);
        FlowPanel fp2 = new FlowPanel();
        fp2.add(h2);
        FlowPanel fp3 = new FlowPanel();
        fp3.add(h3);

        Element[] e = new Element[3];
        e[0] = fp1.getElement();
        e[1] = fp2.getElement();
        e[2] = fp3.getElement();
        JsArray<Element> array = ArrayHelper.toJsArray(e);
        MVCArray<Element> o = MVCArray.newInstance(array);

        o.addRemoveAtHandler(new RemoveAtMapHandler() {
          @Override
          public void onEvent(RemoveAtMapEvent event) {
            int index = event.getIndex();
            assertEquals(2, index);
          }
        });

        Element removed = o.removeAt(2);

        int newLength = o.getLength();
        assertEquals(2, newLength);

        String left = "<div class=\"gwt-HTML\">3</div>";
        String right = removed.getInnerHTML();
        assertEquals(left, right);

        finishTest();
      }
    });

  }

  public void testSetAt() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HTML h1 = new HTML("1");
        HTML h2 = new HTML("2");
        HTML h3 = new HTML("3");
        HTML h4 = new HTML("4");
        FlowPanel fp1 = new FlowPanel();
        fp1.add(h1);
        FlowPanel fp2 = new FlowPanel();
        fp2.add(h2);
        FlowPanel fp3 = new FlowPanel();
        fp3.add(h3);
        FlowPanel fp4 = new FlowPanel();
        fp4.add(h4);

        Element[] e = new Element[3];
        e[0] = fp1.getElement();
        e[1] = fp2.getElement();
        e[2] = fp3.getElement();
        JsArray<Element> array = ArrayHelper.toJsArray(e);
        MVCArray<Element> o = MVCArray.newInstance(array);

        o.addSetAtHandler(new SetAtMapHandler() {
          @Override
          public void onEvent(SetAtMapEvent event) {
            int index = event.getIndex();
            assertEquals(3, index);
          }
        });

        // set
        o.setAt(3, fp4.getElement());

        int newLength = o.getLength();
        assertEquals(4, newLength);

        Element element = o.get(3);
        String left = "<div class=\"gwt-HTML\">4</div>";
        String right = element.getInnerHTML();
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
        HTML h1 = new HTML("1");
        HTML h2 = new HTML("2");
        HTML h3 = new HTML("3");
        FlowPanel fp1 = new FlowPanel();
        fp1.add(h1);
        FlowPanel fp2 = new FlowPanel();
        fp2.add(h2);
        FlowPanel fp3 = new FlowPanel();
        fp3.add(h3);

        Element[] e = new Element[3];
        e[0] = fp1.getElement();
        e[1] = fp2.getElement();
        e[2] = fp3.getElement();
        JsArray<Element> array = ArrayHelper.toJsArray(e);

        MVCArray<Element> o = MVCArray.newInstance(array);

        finishTest();
      }
    });

  }
}
