package com.google.gwt.maps.client.mvc;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.events.insertat.InsertAtMapEvent;
import com.google.gwt.maps.client.events.insertat.InsertAtMapHandler;
import com.google.gwt.maps.client.events.removeat.RemoveAtMapEvent;
import com.google.gwt.maps.client.events.removeat.RemoveAtMapHandler;
import com.google.gwt.maps.client.events.setat.SetAtMapEvent;
import com.google.gwt.maps.client.events.setat.SetAtMapHandler;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;

public class MVCArrayTest extends GWTTestCase {

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
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testClear() {
    LoadApi.go(new Runnable() {
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
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  

  public void testGetArray() {
    LoadApi.go(new Runnable() {
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
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testForEach() {
    LoadApi.go(new Runnable() {
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
          public void forEach(Element element, int index) {
            assertEquals(1, element.getChildCount());
            String left = "<div class=\"gwt-HTML\">" + (index+1) + "</div>";
            String right = element.getInnerHTML();
            assertEquals(left, right);
          }
        });
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGet() {
    LoadApi.go(new Runnable() {
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
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testInsertAt() {
    LoadApi.go(new Runnable() {
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
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  

  public void testPop() {
    LoadApi.go(new Runnable() {
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
        String right = o.get(o.getLength()-1).getInnerHTML();
        assertEquals(left, right);
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPush() {
    LoadApi.go(new Runnable() {
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
        String right = o.get(o.getLength()-1).getInnerHTML();
        assertEquals(left, right);
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testRemoveAt() {
    LoadApi.go(new Runnable() {
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
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testSetAt() {
    LoadApi.go(new Runnable() {
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
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
