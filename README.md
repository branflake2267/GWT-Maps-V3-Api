#GWT-Maps-V3-Api

This library provides Java language bindings for the Google maps Javascript api. 

##Demo
# ![tiny arrow](http://www.lirmm.fr/bib-icons/Stanford/arrow.small.rightT.gif "tiny arrow")  [Live Showcase](http://gonevertical-apis.appspot.com/)

##Community
# [GWT Maps V3 API G+ Community](https://plus.google.com/communities/105780740892495987648)

##Implementers
* [Live Showcase](http://gonevertical-apis.appspot.com)
* [Cycling the Alps](http://www.cyclingthealps.com)
* [Open City Agora](http://opencityagora.appspot.com/) example: [San Francisco Open City Agora](http://sf.opencityagora.appspot.com/Agora.html)

##New Features
* Released to sonatype `3.9.0-build-17-SNAPSHOT` 1/19/2013
* Fixed some bugs, added triggerResize to mapWidget. Started G+ Community. 1/18/2013
* v16 released to sonatype `3.9.0-build-16` 1/13/2013
* v16 Switching from alpha to build b/c it is stable 1/13/2013 (3.9.0-build-16-SNAPSHOT)
* v16 Fixed Marker Animation and added marker animation controls to examples 1/13/2013
* v15 Fixed Custom overlay setMap 1/13/2013
* Custom overlay view added 12/20/2012
* Added waypoint to directions example
* InfoWindow supports GWT widgets with events
* Added PlaceSearchRequest map example
* 3.9.0 code now in master has the place result with pagination search

##Maven Versions Available
* [See what is available on Maven Central](http://search.maven.org/#search%7Cga%7C1%7Ccom.github.branflake2267)
* 3.9.0-build-17 - Release
* 3.10.0-alpha-1-SNAPSHOT - Snapshot 

##Current Maven Release	
1. Add Maven dependencies	
	```xml
	<!-- GWT Maps API V3 -->
	<dependency>
		<groupId>com.github.branflake2267</groupId>
		<artifactId>gwt-maps</artifactId>
		<version>3.10.0-alpha-1</version>
		<type>pom</type>
	</dependency>

	<!-- Other GWT Maps Dependency from Google -->
	<dependency>
		<groupId>com.google.gwt.google-apis</groupId>
		<artifactId>gwt-ajaxloader</artifactId>
		<version>1.1.0</version>
	</dependency>
	```
	
2. Add the inherits statement to your module.gwt.xml.	
	```xml
	<inherits name='com.google.gwt.maps.Maps' />
	```
3. Load and use the API.

* Example of loading the api. Find the showcase example [here](https://github.com/branflake2267/GWT-Maps-V3-Api/blob/master/gwt-maps-showcase/src/main/java/com/google/gwt/maps/testing/client/Showcase.java#L78).
	```java
	  private void loadMapApi() {
	    boolean sensor = true;
	
	    // load all the libs for use in the maps
	    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
	    loadLibraries.add(LoadLibrary.ADSENSE);
	    loadLibraries.add(LoadLibrary.DRAWING);
	    loadLibraries.add(LoadLibrary.GEOMETRY);
	    loadLibraries.add(LoadLibrary.PANORAMIO);
	    loadLibraries.add(LoadLibrary.PLACES);
	    loadLibraries.add(LoadLibrary.WEATHER);
	    loadLibraries.add(LoadLibrary.VISUALIZATION);
	
	    Runnable onLoad = new Runnable() {
	      @Override
	      public void run() {
	        draw();
	      }
	    };
	
	    LoadApi.go(onLoad, loadLibraries, sensor);
	  }
	```

##Current Maven Snapshots
1. Add Maven dependencies	
	```xml
	<repositories>
    		<repository>
        		<id>sonatype.snapshots</id>
        		<name>Sonatype snapshot repository</name>
        		<url>https://oss.sonatype.org/content/repositories/snapshots/</url>
        		<snapshots>
            			<enabled>true</enabled>
        		</snapshots>
    		</repository>
	</repositories>

	<!-- GWT Maps API V3 -->
	<dependency>
		<groupId>com.github.branflake2267</groupId>
		<artifactId>gwt-maps</artifactId>
		<version>3.10.0-alpha-2-SNAPSHOT</version>
		<type>pom</type>
	</dependency>

	<!-- Other GWT Maps Dependency from Google -->
	<dependency>
		<groupId>com.google.gwt.google-apis</groupId>
		<artifactId>gwt-ajaxloader</artifactId>
		<version>1.1.0</version>
	</dependency>
	```
	
2. Add the inherits statement to your module.gwt.xml.	
	```xml
	<inherits name='com.google.gwt.maps.Maps' />
	```

##Previous Versions
Here is the most recent build of the **GWT-Maps-V3-Api**. We've already Mavenized this project, but are currently having it added to the Central Repo. Until then, here are the current jars.

* Downloads Built Nov, 7th 2012
* [gwt-maps-api-v3-3.8.1-javadoc.jar](https://github.com/downloads/branflake2267/GWT-Maps-V3-Api/Apis_Google_Maps-3.8.1-javadoc.jar)
* [gwt-maps-api-v3-3.8.1-sources.jar](https://github.com/downloads/branflake2267/GWT-Maps-V3-Api/Apis_Google_Maps-3.8.1-sources.jar)
* [gwt-maps-api-v3-3.8.1.jar](https://github.com/downloads/branflake2267/GWT-Maps-V3-Api/Apis_Google_Maps-3.8.1.jar)

##Jar Use
1. Download jar
2. Add jar to your /WEB-INF/lib
3. Right click on the jar and goto Build path > add to build path

##Eclipse Setup Using Source
1. Clone the source with EGit
2. Add the project to your build path
3. Link the maps source "src" folder as src_maps in your build path
4. Inherit the module
	
	```xml
	<inherits name='com.google.gwt.maps.Maps'/>
	```

##Documentation
* [GWT-Maps-V3-API JavaDoc's (3.9.0)](http://branflake2267.github.com/GWT-Maps-V3-Api/javadoc/3.9.0-build-17/)
* Complete list on [Wiki page](https://github.com/branflake2267/GWT-Maps-V3-Api/wiki)

##Contribute
* Learn about contributing under [Eclipse Contributor Setup](https://github.com/branflake2267/GWT-Maps-V3-Api/wiki/Eclipse-Contributor-Setup)
* [Build Server](http://teamcity.gonevertical.org/)

##Thanks to
[![Arcbees.com](http://arcbees-ads.appspot.com/images/1.png)](http://arcbees.com)
