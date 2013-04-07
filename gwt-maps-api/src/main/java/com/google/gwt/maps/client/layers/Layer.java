package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.MapWidget;
/**
 * an artificial Layer super type for easy working with multiple layer objects. 
 * @author sg
 *
 */
public interface Layer {
	MapWidget getMap(); 
	void setMap(MapWidget mapWidget); 
}
