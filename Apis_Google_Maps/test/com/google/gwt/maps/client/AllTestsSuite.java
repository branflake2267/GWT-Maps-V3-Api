package com.google.gwt.maps.client;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import junit.framework.TestSuite;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.junit.tools.GWTTestSuite;
import com.google.gwt.maps.client.adsense.AdFormatTest;
import com.google.gwt.maps.client.adsense.AdUnitImplTest;
import com.google.gwt.maps.client.adsense.AdUnitOptionsTest;
import com.google.gwt.maps.client.adsense.AdUnitWidgetTest;
import com.google.gwt.maps.client.base.LatLngBoundsTest;
import com.google.gwt.maps.client.base.LatLngTest;
import com.google.gwt.maps.client.base.PointTest;
import com.google.gwt.maps.client.base.SizeTest;
import com.google.gwt.maps.client.controls.ControlPositionTest;
import com.google.gwt.maps.client.controls.MapTypeControlOptionsTest;
import com.google.gwt.maps.client.controls.OverviewMapControlOptionsTest;
import com.google.gwt.maps.client.controls.PanControlOptionsTest;
import com.google.gwt.maps.client.controls.RotateControlOptionsTest;
import com.google.gwt.maps.client.controls.ScaleControlOptionsTest;
import com.google.gwt.maps.client.controls.ScaleControlStyleTest;
import com.google.gwt.maps.client.controls.ZoomControlOptionsTest;
import com.google.gwt.maps.client.controls.ZoomControlStyleTest;
import com.google.gwt.maps.client.drawing.DrawingControlOptionsTest;
import com.google.gwt.maps.client.drawing.DrawingManagerOptionsTest;
import com.google.gwt.maps.client.drawing.DrawingManagerTest;
import com.google.gwt.maps.client.drawing.OverlayTypeTest;
import com.google.gwt.maps.client.events.MapEventTypeTest;
import com.google.gwt.maps.client.events.MapHandlerRegistrationTest;
import com.google.gwt.maps.client.geometrylib.EncodingUtilsTest;
import com.google.gwt.maps.client.geometrylib.SphericalUtilsTest;
import com.google.gwt.maps.client.layers.BicyclingLayerTest;
import com.google.gwt.maps.client.layers.FusionTableLayerTest;
import com.google.gwt.maps.client.layers.FusionTableQueryTest;
import com.google.gwt.maps.client.layers.FusionTablesCellTest;
import com.google.gwt.maps.client.layers.FusionTablesHeatmapTest;
import com.google.gwt.maps.client.layers.FusionTablesLayerOptionsTest;
import com.google.gwt.maps.client.layers.FusionTablesMarkerOptionsTest;
import com.google.gwt.maps.client.layers.FusionTablesPolygonOptionsTest;
import com.google.gwt.maps.client.layers.FusionTablesPolylineOptionsTest;
import com.google.gwt.maps.client.layers.FusionTablesQueryTest;
import com.google.gwt.maps.client.layers.FusionTablesStyleTest;
import com.google.gwt.maps.client.layers.KmlAuthorTest;
import com.google.gwt.maps.client.layers.KmlFeatureDataTest;
import com.google.gwt.maps.client.layers.KmlLayerMetadataTest;
import com.google.gwt.maps.client.layers.KmlLayerOptionsTest;
import com.google.gwt.maps.client.layers.KmlLayerTest;
import com.google.gwt.maps.client.layers.TrafficLayerTest;
import com.google.gwt.maps.client.layers.TransitLayerTest;
import com.google.gwt.maps.client.main.MapImplTest;
import com.google.gwt.maps.client.main.MapOptionsTest;
import com.google.gwt.maps.client.main.MapTypeIdTest;
import com.google.gwt.maps.client.main.MapWidgetTest;
import com.google.gwt.maps.client.maptype.ImageMapTypeTest;
import com.google.gwt.maps.client.maptype.MapTypeRegistryTest;
import com.google.gwt.maps.client.maptype.MapTypeStyeElementTypeTest;
import com.google.gwt.maps.client.maptype.MapTypeStyleFeatureTypeTest;
import com.google.gwt.maps.client.maptype.MapTypeStyleTest;
import com.google.gwt.maps.client.maptype.MapTypeStylerTest;
import com.google.gwt.maps.client.maptype.ProjectionTest;
import com.google.gwt.maps.client.maptype.StyledMapTypeTest;
import com.google.gwt.maps.client.mvc.MVCArrayTest;
import com.google.gwt.maps.client.mvc.MVCObjectTest;
import com.google.gwt.maps.client.overlays.AnimationTest;
import com.google.gwt.maps.client.overlays.CircleOptionsTest;
import com.google.gwt.maps.client.overlays.CircleTest;
import com.google.gwt.maps.client.overlays.GroundOverlayOptionsTest;
import com.google.gwt.maps.client.overlays.GroundOverlayTest;
import com.google.gwt.maps.client.overlays.InfoWindowOptionsTest;
import com.google.gwt.maps.client.overlays.InfoWindowTest;
import com.google.gwt.maps.client.overlays.MapCanvasProjectionTest;
import com.google.gwt.maps.client.overlays.MapPanesTest;
import com.google.gwt.maps.client.overlays.MarkerImageTest;
import com.google.gwt.maps.client.overlays.MarkerOptionsTest;
import com.google.gwt.maps.client.overlays.MarkerShapeTest;
import com.google.gwt.maps.client.overlays.MarkerShapeTypeTest;
import com.google.gwt.maps.client.overlays.MarkerTest;
import com.google.gwt.maps.client.overlays.OverlayViewTest;
import com.google.gwt.maps.client.overlays.PolygonOptionsTest;
import com.google.gwt.maps.client.overlays.PolygonTest;
import com.google.gwt.maps.client.overlays.PolylineOptionsTest;
import com.google.gwt.maps.client.overlays.PolylineTest;
import com.google.gwt.maps.client.overlays.RectangleOptionsTest;
import com.google.gwt.maps.client.overlays.RectangleTest;
import com.google.gwt.maps.client.panoramio.PanoramioFeatureTest;
import com.google.gwt.maps.client.panoramio.PanoramioLayerTest;
import com.google.gwt.maps.client.panoramio.PanoramioOptionsTest;
import com.google.gwt.maps.client.placelib.AutocompleteOptionsTest;
import com.google.gwt.maps.client.placelib.AutocompleteTest;
import com.google.gwt.maps.client.placelib.AutocompleteTypeTest;
import com.google.gwt.maps.client.placelib.PlaceDetailsRequestTest;
import com.google.gwt.maps.client.placelib.PlaceGeomtryTest;
import com.google.gwt.maps.client.placelib.PlaceResultTest;
import com.google.gwt.maps.client.placelib.PlaceSearchRequestTest;
import com.google.gwt.maps.client.placelib.PlaceServiceStatusTest;
import com.google.gwt.maps.client.placelib.PlacesServiceTest;
import com.google.gwt.maps.client.service.DirectionsLegTest;
import com.google.gwt.maps.client.service.DirectionsRendererOptionsTest;
import com.google.gwt.maps.client.service.DirectionsRendererTest;
import com.google.gwt.maps.client.service.DirectionsRequestTest;
import com.google.gwt.maps.client.service.DirectionsResultTest;
import com.google.gwt.maps.client.service.DirectionsRouteTest;
import com.google.gwt.maps.client.service.DirectionsServiceTest;
import com.google.gwt.maps.client.service.DirectionsStatusTest;
import com.google.gwt.maps.client.service.DirectionsStepTest;
import com.google.gwt.maps.client.service.DirectionsWaypointTest;
import com.google.gwt.maps.client.service.DistanceMatrixElementStatusTest;
import com.google.gwt.maps.client.service.DistanceMatrixRequestTest;
import com.google.gwt.maps.client.service.DistanceMatrixServiceTest;
import com.google.gwt.maps.client.service.DistanceMatrixStatusTest;
import com.google.gwt.maps.client.service.DistanceTest;
import com.google.gwt.maps.client.service.DurationTest;
import com.google.gwt.maps.client.service.ElevationResultTest;
import com.google.gwt.maps.client.service.ElevationServiceTest;
import com.google.gwt.maps.client.service.ElevationStatusTest;
import com.google.gwt.maps.client.service.GeocoderAddressComponentTest;
import com.google.gwt.maps.client.service.GeocoderGeometryTest;
import com.google.gwt.maps.client.service.GeocoderLocationTypeTest;
import com.google.gwt.maps.client.service.GeocoderRequestTest;
import com.google.gwt.maps.client.service.GeocoderResultTest;
import com.google.gwt.maps.client.service.GeocoderStatusTest;
import com.google.gwt.maps.client.service.GeocoderTest;
import com.google.gwt.maps.client.service.LocationElevationRequestTest;
import com.google.gwt.maps.client.service.MaxZoomResultTest;
import com.google.gwt.maps.client.service.MaxZoomServiceTest;
import com.google.gwt.maps.client.service.MaxZoomStatusTest;
import com.google.gwt.maps.client.service.PathElevationRequestTest;
import com.google.gwt.maps.client.service.TravelModeTest;
import com.google.gwt.maps.client.service.UnitSystemTest;
import com.google.gwt.maps.client.streetview.StreetViewAddressControlOptionsTest;
import com.google.gwt.maps.client.streetview.StreetViewControlOptionsTest;
import com.google.gwt.maps.client.streetview.StreetViewLinkTest;
import com.google.gwt.maps.client.streetview.StreetViewLocationTest;
import com.google.gwt.maps.client.streetview.StreetViewPanaoramaOptionsTest;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaDataTest;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaImplTest;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidgetTest;
import com.google.gwt.maps.client.streetview.StreetViewPovTest;
import com.google.gwt.maps.client.streetview.StreetViewServiceTest;
import com.google.gwt.maps.client.streetview.StreetViewStatusTest;
import com.google.gwt.maps.client.streetview.StreetViewTileDataTest;
import com.google.gwt.maps.client.weatherlib.CloudLayerTest;
import com.google.gwt.maps.client.weatherlib.LabelColorTest;
import com.google.gwt.maps.client.weatherlib.TemperatureUnitTest;
import com.google.gwt.maps.client.weatherlib.WeatherLayerOptionsTest;
import com.google.gwt.maps.client.weatherlib.WeatherLayerTest;
import com.google.gwt.maps.client.weatherlib.WindSpeedUnitTest;

public class AllTestsSuite extends GWTTestSuite {

	public static final String TARGET_CLASS_SUFFIX = "Test";

	public static TestSuite suite() throws Exception {

		GWTTestSuite suite = new GWTTestSuite();

		suite.addTestSuite(AdFormatTest.class);
		suite.addTestSuite(AdUnitImplTest.class);
		suite.addTestSuite(AdUnitOptionsTest.class);
		suite.addTestSuite(AdUnitWidgetTest.class);
		suite.addTestSuite(LatLngBoundsTest.class);
		suite.addTestSuite(LatLngTest.class);
		suite.addTestSuite(PointTest.class);
		suite.addTestSuite(SizeTest.class);
		suite.addTestSuite(ControlPositionTest.class);
		suite.addTestSuite(MapTypeControlOptionsTest.class);
		suite.addTestSuite(OverviewMapControlOptionsTest.class);
		suite.addTestSuite(PanControlOptionsTest.class);
		suite.addTestSuite(RotateControlOptionsTest.class);
		suite.addTestSuite(ScaleControlOptionsTest.class);
		suite.addTestSuite(ScaleControlStyleTest.class);
		suite.addTestSuite(ZoomControlOptionsTest.class);
		suite.addTestSuite(ZoomControlStyleTest.class);
		suite.addTestSuite(DrawingControlOptionsTest.class);
		suite.addTestSuite(DrawingManagerOptionsTest.class);
		suite.addTestSuite(DrawingManagerTest.class);
		suite.addTestSuite(OverlayTypeTest.class);
		suite.addTestSuite(MapEventTypeTest.class);
		suite.addTestSuite(MapHandlerRegistrationTest.class);
		suite.addTestSuite(EncodingUtilsTest.class);
		suite.addTestSuite(SphericalUtilsTest.class);
		suite.addTestSuite(BicyclingLayerTest.class);
		suite.addTestSuite(FusionTableLayerTest.class);
		suite.addTestSuite(FusionTableQueryTest.class);
		suite.addTestSuite(FusionTablesCellTest.class);
		suite.addTestSuite(FusionTablesHeatmapTest.class);
		suite.addTestSuite(FusionTablesLayerOptionsTest.class);
		suite.addTestSuite(FusionTablesMarkerOptionsTest.class);
		suite.addTestSuite(FusionTablesPolygonOptionsTest.class);
		suite.addTestSuite(FusionTablesPolylineOptionsTest.class);
		suite.addTestSuite(FusionTablesQueryTest.class);
		suite.addTestSuite(FusionTablesStyleTest.class);
		suite.addTestSuite(KmlAuthorTest.class);
		suite.addTestSuite(KmlFeatureDataTest.class);
		suite.addTestSuite(KmlLayerMetadataTest.class);
		suite.addTestSuite(KmlLayerOptionsTest.class);
		suite.addTestSuite(KmlLayerTest.class);
		suite.addTestSuite(TrafficLayerTest.class);
		suite.addTestSuite(TransitLayerTest.class);
		suite.addTestSuite(MapImplTest.class);
		suite.addTestSuite(MapOptionsTest.class);
		suite.addTestSuite(MapTypeIdTest.class);
		suite.addTestSuite(MapWidgetTest.class);
		suite.addTestSuite(ImageMapTypeTest.class);
		suite.addTestSuite(MapTypeRegistryTest.class);
		suite.addTestSuite(MapTypeStyeElementTypeTest.class);
		suite.addTestSuite(MapTypeStyleFeatureTypeTest.class);
		suite.addTestSuite(MapTypeStylerTest.class);
		suite.addTestSuite(MapTypeStyleTest.class);
		suite.addTestSuite(ProjectionTest.class);
		suite.addTestSuite(StyledMapTypeTest.class);
		suite.addTestSuite(MVCArrayTest.class);
		suite.addTestSuite(MVCObjectTest.class);
		suite.addTestSuite(AnimationTest.class);
		suite.addTestSuite(CircleOptionsTest.class);
		suite.addTestSuite(CircleTest.class);
		suite.addTestSuite(GroundOverlayOptionsTest.class);
		suite.addTestSuite(GroundOverlayTest.class);
		suite.addTestSuite(InfoWindowOptionsTest.class);
		suite.addTestSuite(InfoWindowTest.class);
		suite.addTestSuite(MapCanvasProjectionTest.class);
		suite.addTestSuite(MapPanesTest.class);
		suite.addTestSuite(MarkerImageTest.class);
		suite.addTestSuite(MarkerOptionsTest.class);
		suite.addTestSuite(MarkerShapeTest.class);
		suite.addTestSuite(MarkerShapeTypeTest.class);
		suite.addTestSuite(MarkerTest.class);
		suite.addTestSuite(OverlayViewTest.class);
		suite.addTestSuite(PolygonOptionsTest.class);
		suite.addTestSuite(PolygonTest.class);
		suite.addTestSuite(PolylineOptionsTest.class);
		suite.addTestSuite(PolylineTest.class);
		suite.addTestSuite(RectangleOptionsTest.class);
		suite.addTestSuite(RectangleTest.class);
		suite.addTestSuite(PanoramioFeatureTest.class);
		suite.addTestSuite(PanoramioLayerTest.class);
		suite.addTestSuite(PanoramioOptionsTest.class);
		suite.addTestSuite(AutocompleteOptionsTest.class);
		suite.addTestSuite(AutocompleteTest.class);
		suite.addTestSuite(AutocompleteTypeTest.class);
		suite.addTestSuite(PlaceDetailsRequestTest.class);
		suite.addTestSuite(PlaceGeomtryTest.class);
		suite.addTestSuite(PlaceResultTest.class);
		suite.addTestSuite(PlaceSearchRequestTest.class);
		suite.addTestSuite(PlaceServiceStatusTest.class);
		suite.addTestSuite(PlacesServiceTest.class);
		suite.addTestSuite(SandboxTest.class);
		suite.addTestSuite(DirectionsLegTest.class);
		suite.addTestSuite(DirectionsRendererOptionsTest.class);
		suite.addTestSuite(DirectionsRendererTest.class);
		suite.addTestSuite(DirectionsRequestTest.class);
		suite.addTestSuite(DirectionsResultTest.class);
		suite.addTestSuite(DirectionsRouteTest.class);
		suite.addTestSuite(DirectionsServiceTest.class);
		suite.addTestSuite(DirectionsStatusTest.class);
		suite.addTestSuite(DirectionsStepTest.class);
		suite.addTestSuite(DirectionsWaypointTest.class);
		suite.addTestSuite(DistanceMatrixElementStatusTest.class);
		suite.addTestSuite(DistanceMatrixRequestTest.class);
		suite.addTestSuite(DistanceMatrixServiceTest.class);
		suite.addTestSuite(DistanceMatrixStatusTest.class);
		suite.addTestSuite(DistanceTest.class);
		suite.addTestSuite(DurationTest.class);
		suite.addTestSuite(ElevationResultTest.class);
		suite.addTestSuite(ElevationServiceTest.class);
		suite.addTestSuite(ElevationStatusTest.class);
		suite.addTestSuite(GeocoderAddressComponentTest.class);
		suite.addTestSuite(GeocoderGeometryTest.class);
		suite.addTestSuite(GeocoderLocationTypeTest.class);
		suite.addTestSuite(GeocoderRequestTest.class);
		suite.addTestSuite(GeocoderResultTest.class);
		suite.addTestSuite(GeocoderStatusTest.class);
		suite.addTestSuite(GeocoderTest.class);
		suite.addTestSuite(LocationElevationRequestTest.class);
		suite.addTestSuite(MaxZoomResultTest.class);
		suite.addTestSuite(MaxZoomServiceTest.class);
		suite.addTestSuite(MaxZoomStatusTest.class);
		suite.addTestSuite(PathElevationRequestTest.class);
		suite.addTestSuite(TravelModeTest.class);
		suite.addTestSuite(UnitSystemTest.class);
		suite.addTestSuite(StreetViewAddressControlOptionsTest.class);
		suite.addTestSuite(StreetViewControlOptionsTest.class);
		suite.addTestSuite(StreetViewLinkTest.class);
		suite.addTestSuite(StreetViewLocationTest.class);
		suite.addTestSuite(StreetViewPanaoramaOptionsTest.class);
		suite.addTestSuite(StreetViewPanoramaDataTest.class);
		suite.addTestSuite(StreetViewPanoramaImplTest.class);
		suite.addTestSuite(StreetViewPanoramaWidgetTest.class);
		suite.addTestSuite(StreetViewPovTest.class);
		suite.addTestSuite(StreetViewServiceTest.class);
		suite.addTestSuite(StreetViewStatusTest.class);
		suite.addTestSuite(StreetViewTileDataTest.class);
		suite.addTestSuite(CloudLayerTest.class);
		suite.addTestSuite(LabelColorTest.class);
		suite.addTestSuite(TemperatureUnitTest.class);
		suite.addTestSuite(WeatherLayerOptionsTest.class);
		suite.addTestSuite(WeatherLayerTest.class);
		suite.addTestSuite(WindSpeedUnitTest.class);

		return suite;
	}

	/**
	 * Scans all classes accessible from the context class loader which belong
	 * to the given package and sub-packages.
	 * 
	 * @param packageName
	 *            The base package
	 * @return The classes
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	private static List<Class<? extends GWTTestCase>> getClasses(
			String packageName) throws ClassNotFoundException, IOException {
		ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();
		assert classLoader != null;
		String path = packageName.replace('.', '/');
		Enumeration<URL> resources = classLoader.getResources(path);
		List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		List<Class<? extends GWTTestCase>> classes = new ArrayList<Class<? extends GWTTestCase>>();
		for (File directory : dirs) {

			for (@SuppressWarnings("rawtypes")
			Class dirClazz : findClasses(directory, packageName)) {

				if (GWTTestCase.class.isAssignableFrom(dirClazz)) {
					classes.add(dirClazz);
				}
			}
		}
		return classes;
	}

	/**
	 * Recursive method used to find all classes in a given directory and
	 * subdirs.
	 * 
	 * @param directory
	 *            The base directory
	 * @param packageName
	 *            The package name for classes found inside the base directory
	 * @return The classes
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("rawtypes")
	private static List<Class> findClasses(File directory, String packageName)
			throws ClassNotFoundException {

		final String targetSuffix = TARGET_CLASS_SUFFIX + ".class";

		List<Class> classes = new ArrayList<Class>();
		if (!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file,
						packageName + "." + file.getName()));
			} else if (file.getName().endsWith(targetSuffix)) {
				classes.add(Class.forName(packageName
						+ '.'
						+ file.getName().substring(0,
								file.getName().length() - 6)));
			}
		}
		return classes;
	}
}
