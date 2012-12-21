#GWT-Maps-V3-Api

This library provides Java language bindings for the Google maps Javascript api. 

#NOTE 3.9.0+
* 12/20/2012: Active progress is being made on the next version...
* 11/31/2012: 3.9.0+ is coming soon (see [milestone](https://github.com/branflake2267/GWT-Maps-V3-Api/issues/milestones)). We will be changing the module naming in the future for 3.9.0. 

##Demo
# ![tiny arrow](http://www.lirmm.fr/bib-icons/Stanford/arrow.small.rightT.gif "tiny arrow")  [Live Showcase](http://gonevertical-apis.appspot.com/)

##Implementers
* [Live Showcase](http://gonevertical-apis.appspot.com)
* [Cycling the Alps](http://www.cyclingthealps.com)
* [Open City Agora](http://opencityagora.appspot.com/) example: [San Francisco Open City Agora](http://sf.opencityagora.appspot.com/Agora.html)

##Downloads (Last Build 7 Nov 2012)
Here is the most recent build of the **GWT-Maps-V3-Api**. We've already Mavenized this project, but are currently having it added to the Central Repo. Until then, here are the current jars.

* [gwt-maps-api-v3-3.8.1-javadoc.jar](https://github.com/downloads/branflake2267/GWT-Maps-V3-Api/Apis_Google_Maps-3.8.1-javadoc.jar)
* [gwt-maps-api-v3-3.8.1-sources.jar](https://github.com/downloads/branflake2267/GWT-Maps-V3-Api/Apis_Google_Maps-3.8.1-sources.jar)
* [gwt-maps-api-v3-3.8.1.jar](https://github.com/downloads/branflake2267/GWT-Maps-V3-Api/Apis_Google_Maps-3.8.1.jar)

##Documentation

[GWT-Maps-V3-API JavaDoc's (3.8.0)](http://branflake2267.github.com/GWT-Maps-V3-Api/javadoc/3.8.0/)

##New Features
* Custom overlay view added 12/20/2012
* Added waypoint to directions example
* InfoWindow supports GWT widgets with events
* Added PlaceSearchRequest map example
* 3.9.0 code now in master has the place result with pagination search

##Future Features
* GitHub host the maven repository for easier dependency adding. Branch of code in progress.

##Maven Use
1. Download the jar (only gwt-maps-api-v3-3.8.0-beta2.jar is needed)
2. Add the jars to your local repo.
3. Add the dependencies to your POM.
	
	```xml
	<!-- GWT Maps API V3 -->
	<dependency>
		<groupId>com.google.gwt.maps</groupId>
		<artifactId>gwt-maps-api-v3</artifactId>
		<version>gwt-maps-api-v3-3.8.0-beta2</version>
		<scope>compile</scope>
	</dependency>

	<!-- Other Google -->
	<dependency>
		<groupId>com.google.gwt.google-apis</groupId>
		<artifactId>gwt-ajaxloader</artifactId>
		<version>1.1.0</version>
	</dependency>
	```
4. Add the inherits statement to your module.gwt.xml.
	
	```xml
	<inherits name='com.google.gwt.maps.Apis_Google_Maps' />
	```

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
	<inherits name='com.google.gwt.maps.Apis_Google_Maps' />
	```

##Contribute
* Learn about contributing under [Eclipse Contributor Setup](https://github.com/branflake2267/GWT-Maps-V3-Api/wiki/Eclipse-Contributor-Setup)
* [Build Server](http://teamcity.gonevertical.org/)

##Thanks to
[![Arcbees.com](http://arcbees-ads.appspot.com/images/1.png)](http://arcbees.com)
