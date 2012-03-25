Instructions for using Eclipse 3.3-3.5 

These instructions require 
  GWT 1.6 or higher          http://code.google.com/webtoolkit
  Google Plugin for Eclipse  http://code.google.com/eclipse
  Java JDK 1.5 or higher     http://java.sun.com/

---------- Required Google API Library for GWT variables ---------

Window->Preferences->Java->Build Path->Classpath Variables
Create a variable named "GWT_TOOLS" to point to a copy of the GWT tool 
distribution checked out from http://google-web-toolkit.googlecode.com/svn/tools

Create a variable named "GWT_HOME" pointing to a GWT install folder.
Create a variable named "JDK_HOME" pointing to the root of your JDK install
  (for example, C:\Program Files\jdk1.5.0_05 or /usr/lib/j2sdk1.5-sun)

---------- All other settings ------------------------------------

All other eclipse settings can be found at:

  http://google-web-toolkit.googlecode.com/svn/trunk/eclipse/README.txt

---------- Importing Projects ------------------------------------

After setting the variables above and installing the Google Plugin for Eclipse,
import the projects in the eclipse/ folder.

Immediately after importing, you will have unresolved references due to 
dependencies on gwt-user.jar.  

Right click on each project in the Package Explorer and select:

  Google -> Web Toolkit Settings... -> Use Google Web Toolkit

Make sure your SDK settings are valid.

----------- Launching in Development Mode --------------------------

This procedure will work with most of the samples distributed with the project,
but a more complex launch configuration will require you to set up a run
configuration using the Run... Dialog.

In the Package Explorer, right click on the project that has an entry point 
you want to run.  Select

  Run As -> Web Application

The development mode window will start, prompting you to enter a URL 
into a supported browser.  For more information on Development mode, see:

  http://code.google.com/webtoolkit/gettingstarted.html#running


