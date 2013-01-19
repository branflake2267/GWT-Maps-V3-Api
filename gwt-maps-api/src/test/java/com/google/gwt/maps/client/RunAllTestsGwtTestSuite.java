package com.google.gwt.maps.client;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import junit.framework.TestSuite;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.junit.tools.GWTTestSuite;
import com.google.gwt.maps.client.main.LoadApiGwtTest;

public class RunAllTestsGwtTestSuite extends GWTTestSuite {

  public static final String TARGET_CLASS_SUFFIX = "Test";

  public static TestSuite suite() throws Exception {
    GWTTestSuite suite = new GWTTestSuite();

    // be sure the libs get loaded at the beginning b/c they won't want to
    // add the libs during
    suite.addTestSuite(LoadApiGwtTest.class);

    // don't run these twice
    ArrayList<String> ignoreTestList = new ArrayList<String>();
    ignoreTestList.add(LoadApiGwtTest.class.getName());
    ignoreTestList.add(AbstractMapsGWTTestHelper.class.getName());

    // make sure this test is run first to prime all library loads
    suite.addTestSuite(LoadApiGwtTest.class);

    for (Class<? extends GWTTestCase> clazz : getClasses("com.google.gwt.maps.client")) {
      if (!ignoreTestList.contains(clazz.getName())) {
        suite.addTestSuite(clazz);
      }
    }
    return suite;
  }

  /**
   * Scans all classes accessible from the context class loader which belong to the given package and sub-packages.
   * 
   * @param packageName The base package
   * @return The classes
   * @throws ClassNotFoundException
   * @throws IOException
   */
  @SuppressWarnings("unchecked")
  private static List<Class<? extends GWTTestCase>> getClasses(String packageName) throws ClassNotFoundException,
      IOException {
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
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
   * Recursive method used to find all classes in a given directory and subdirs.
   * 
   * @param directory The base directory
   * @param packageName The package name for classes found inside the base directory
   * @return The classes
   * @throws ClassNotFoundException
   */
  @SuppressWarnings("rawtypes")
  private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {

    final String targetSuffix = TARGET_CLASS_SUFFIX + ".class";

    List<Class> classes = new ArrayList<Class>();
    if (!directory.exists()) {
      return classes;
    }
    File[] files = directory.listFiles();
    for (File file : files) {
      if (file.isDirectory()) {
        assert !file.getName().contains(".");
        classes.addAll(findClasses(file, packageName + "." + file.getName()));
      } else if (file.getName().endsWith(targetSuffix)) {
        classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
      }
    }
    return classes;
  }
  
}
