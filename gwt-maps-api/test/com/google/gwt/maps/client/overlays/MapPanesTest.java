package com.google.gwt.maps.client.overlays;

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;

public class MapPanesTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				finishTest();
			}
		});

	}

	public void testFloatPane() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setFloatPane(left);
				Element right = o.getFloatPane();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testFloatShadow() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setFloatShadow(left);
				Element right = o.getFloatShadow();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testMapPane() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setMapPane(left);
				Element right = o.getMapPane();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testOverlayImage() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setOverlayImage(left);
				Element right = o.getOverlayImage();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testOverlayLayer() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setOverlayLayer(left);
				Element right = o.getOverlayLayer();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testOverlayMouseTarget() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setOverlayMouseTarget(left);
				Element right = o.getOverlayMouseTarget();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testOverlayShadow() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setOverlayShadow(left);
				Element right = o.getOverlayShadow();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

}
