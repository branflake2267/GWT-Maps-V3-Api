package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;

/**
 * This object defines the marker shape to use in determination of a marker's clickable region. The shape consists of two properties Ñ type and coord Ñ which define the general type of marker and coordinates specific to that type of marker.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#MarkerShape} 
 */
public class MarkerShape extends JavaScriptObject {
  
  /**
   * This object defines the marker shape to use in determination of a marker's clickable region. The shape consists of two properties Ñ type and coord Ñ which define the general type of marker and coordinates specific to that type of marker.
   * use newInstance();
   */
  protected MarkerShape() {}
  
  /**
   * creates This object defines the marker shape to use in determination of a marker's clickable region. The shape consists of two properties Ñ type and coord Ñ which define the general type of marker and coordinates specific to that type of marker.
   * @return
   */
  public final static MarkerShape newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets The format of this attribute depends on the value of the type and follows the w3 AREA coords specification found at {@link http://www.w3.org/TR/REC-html40/struct/objects.html#adef-coords}. 
   * The coords attribute is an array of integers that specify the pixel position of the shape relative to the top-left corner of the target image. The coordinates depend on the value of type as follows: 
   * - circle: coords is [x1,y1,r] where x1,y2 are the coordinates of the center of the circle, and r is the radius of the circle. 
   * - poly: coords is [x1,y1,x2,y2...xn,yn] where each x,y pair contains the coordinates of one vertex of the polygon. 
   * - rect: coords is [x1,y1,x2,y2] where x1,y1 are the coordinates of the upper-left corner of the rectangle and x2,y2 are the coordinates of the lower-right coordinates of the rectangle.
   * @param coords array of coords
   */
  public final native void setCoordinates(JsArrayInteger coords) /*-{
    this.coords = coords;
  }-*/;
  
  /**
   * gets coords (refer to setter)
   * @return
   */
  public final native JsArrayInteger getCoordinates() /*-{
    return this.coords;
  }-*/;
  
  /**
   * sets Describes the shape's type and can be circle, poly or rect.
   * @param type
   */
  public final void setType(MarkerShapeType type) {
    setType(type.value());
  }
  
  /**
   * sets Describes the shape's type and can be circle, poly or rect.
   * @param type
   */
  private final native void setType(String type) /*-{
    this.type = type;
  }-*/;
  
  /**
   * gets gets Describes the shape's type and can be circle, poly or rect.
   * @return
   */
  public final MarkerShapeType getType() {
    return MarkerShapeType.fromValue(getTypeImpl());
  }
  
  /**
   * gets Describes the shape's type and can be circle, poly or rect.
   * @return
   */
  private final native String getTypeImpl() /*-{
    return this.type;
  }-*/;

}
