#GWT-Maps-V3-Api   
##Use Google Maps V3 in GWT  ![tiny arrow](http://www.lirmm.fr/bib-icons/Stanford/arrow.small.rightT.gif "tiny arrow")  [Live Showcase](http://gonevertical-apis.appspot.com/)

Here is the most recent build of the **GWT-Maps-V3-Api**.

We've already Mavenized this project, but are currently having it added to the Central Repo. Until then, here are the current jars.

##Recent Build (24 Aug 2012)

- [gwt-maps-api-v3-3.8.0-beta2-javadoc.jar](https://github.com/downloads/branflake2267/GWT-Maps-V3-Api/Apis_Google_Maps-3.8.0-beta2-javadoc.jar)
- [gwt-maps-api-v3-3.8.0-beta2-sources.jar](https://github.com/downloads/branflake2267/GWT-Maps-V3-Api/Apis_Google_Maps-3.8.0-beta2-sources.jar)
- [gwt-maps-api-v3-3.8.0-beta2.jar](https://github.com/downloads/branflake2267/GWT-Maps-V3-Api/Apis_Google_Maps-3.8.0-beta2.jar)

##Documentation

[GWT-Maps-V3-API JavaDoc's (3.8.0)](http://branflake2267.github.com/GWT-Maps-V3-Api/javadoc/3.8.0/)

##To Build (with Maven)

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

##Contribute
Learn about contributing under [Eclipse Contributor Setup](https://github.com/branflake2267/GWT-Maps-V3-Api/wiki/Eclipse-Contributor-Setup)