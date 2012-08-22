#GWT-Maps-V3-Api   
##Use Google Maps V3 in GWT  ![tiny arrow](http://www.lirmm.fr/bib-icons/Stanford/arrow.small.rightT.gif "tiny arrow")  [Live Demo](http://gonevertical-apis.appspot.com/)

Here is the most recent build of the **GWT-Maps-V3-Api**.

We've already Mavenized this project, but are currently having it added to the Central Repo. Until then, here are the current jars.

##Recent Build (11 Apr 12 01:56)

- [gwt-maps-api-v3-3.8.0-beta1-javadoc.jar](http://www.lustforge.com/GWT/gwt-maps-api-v3-3.8.0-beta1-SNAPSHOT-javadoc.jar)
- [gwt-maps-api-v3-3.8.0-beta1-sources.jar](http://www.lustforge.com/GWT/gwt-maps-api-v3-3.8.0-beta1-SNAPSHOT-sources.jar)
- [gwt-maps-api-v3-3.8.0-beta1.jar](http://www.lustforge.com/GWT/gwt-maps-api-v3-3.8.0-beta1-SNAPSHOT.jar)


##To Build (with Maven)

1. Download the jar (only gwt-maps-api-v3-3.8.0-beta1.jar is needed)
2. Add the jars to your local repo.
3. Add the dependencies to your POM.

	<!-- GWT Maps API V3 -->
	<dependency>
		<groupId>com.google.gwt.maps</groupId>
		<artifactId>gwt-maps-api-v3</artifactId>
		<version>gwt-maps-api-v3-3.8.0-beta1</version>
		<scope>compile</scope>
	</dependency>

	<!-- Other Google -->
	<dependency>
		<groupId>com.google.gwt.google-apis</groupId>
		<artifactId>gwt-ajaxloader</artifactId>
		<version>1.1.0</version>
	</dependency>
4. Add the inherits statement to your module.gwt.xml.

	<inherits name='com.google.gwt.maps.Apis_Google_Maps' />


##Contribute
Learn about contributing under [Eclipse Contributor Setup](https://github.com/branflake2267/GWT-Maps-V3-Api/wiki/Eclipse-Contributor-Setup)