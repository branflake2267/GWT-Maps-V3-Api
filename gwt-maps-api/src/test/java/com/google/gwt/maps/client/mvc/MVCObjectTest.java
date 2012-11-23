package com.google.gwt.maps.client.mvc;

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class MVCObjectTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testBindTo() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();

				finishTest();
			}
		});

	}

	// TODO add all the bindtos...

	@SuppressWarnings("unused")
	public void testChanged() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testGet() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testNotify() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testSet() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testSetValues() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUnbind() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUnbindAll() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();
				finishTest();
			}
		});

	}

}
