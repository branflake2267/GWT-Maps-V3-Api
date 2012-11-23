package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class FusionTablesHeatmapTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testEnabled() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTableHeatmap o = FusionTableHeatmap.newInstance();
				boolean left = true;
				o.setEnabled(left);
				boolean right = o.getEnabled();
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
				FusionTableHeatmap o = FusionTableHeatmap.newInstance();
				finishTest();
			}
		});

	}

}
