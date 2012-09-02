package com.google.gwt.maps.client;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import com.google.gwt.junit.tools.GWTTestSuite;
import com.google.gwt.maps.client.main.LoadApiTest;

import junit.framework.TestSuite;

public class AllTestsSuite extends GWTTestSuite {

  public static TestSuite suite() throws Exception {
    TestSuite suite = new TestSuite();
    
    // be sure the libs get loaded at the beginning b/c they won't want to add the libs during
    suite.addTestSuite(LoadApiTest.class);

    Class[] classes = getClasses("com.google.gwt.maps.client");
    for (Class clazz : classes) {
      suite.addTestSuite(clazz);
    }

    return suite;
  }

  /**
   * Scans all classes accessible from the context class loader which belong to
   * the given package and subpackages.
   * 
   * @param packageName
   *          The base package
   * @return The classes
   * @throws ClassNotFoundException
   * @throws IOException
   */
  private static Class[] getClasses(String packageName) throws ClassNotFoundException, IOException {
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    assert classLoader != null;
    String path = packageName.replace('.', '/');
    Enumeration<URL> resources = classLoader.getResources(path);
    List<File> dirs = new ArrayList<File>();
    while (resources.hasMoreElements()) {
      URL resource = resources.nextElement();
      dirs.add(new File(resource.getFile()));
    }
    ArrayList<Class> classes = new ArrayList<Class>();
    for (File directory : dirs) {
      classes.addAll(findClasses(directory, packageName));
    }
    return classes.toArray(new Class[classes.size()]);
  }

  /**
   * Recursive method used to find all classes in a given directory and subdirs.
   * 
   * @param directory
   *          The base directory
   * @param packageName
   *          The package name for classes found inside the base directory
   * @return The classes
   * @throws ClassNotFoundException
   */
  private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
    List<Class> classes = new ArrayList<Class>();
    if (!directory.exists()) {
      return classes;
    }
    File[] files = directory.listFiles();
    for (File file : files) {
      if (file.isDirectory()) {
        assert !file.getName().contains(".");
        classes.addAll(findClasses(file, packageName + "." + file.getName()));
      } else if (file.getName().endsWith("Test.class")) {
        classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
      }
    }
    return classes;
  }

}
