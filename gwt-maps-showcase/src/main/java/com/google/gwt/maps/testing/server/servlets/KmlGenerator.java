package com.google.gwt.maps.testing.server.servlets;

/*
 * #%L
 * GWT Maps API V3 - Showcase
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

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class KmlGenerator extends HttpServlet {
  
  private String[] example;

  /**
   * GET request - (no POST request below, that would need to be added)
   * 
   * @param request
   * @param response
   * @throws IOException
   */
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
    drawHtml(request, response);
  }

  /**
   * render some XML as a page
   * @param request
   * @param response
   * @throws IOException
   */
  private void drawHtml(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String xml = getKml(request);
   
    // write the html to page
    response.setContentType("text/xml"); 
    PrintWriter out = response.getWriter();
    out.print(xml);
  }

  /**
   * get the kml stuff
   * 
   * @param request
   */
  private String getKml(HttpServletRequest request) {
    
    // TODO how to get a parameter - not used yet...
    @SuppressWarnings("unused")
	Long id = getParameterLong(request, "id");
    
    StringBuilder sb = new StringBuilder();
    sb.append("<?xml version=\"1.0\" standalone=\"yes\"?>\n");
    sb.append("<kml xmlns=\"http://earth.google.com/kml/2.2\">\n");
    sb.append("<Document>\n");
    sb.append("<name><![CDATA[<b>Demonstration of <br>multiple data files <br>on one map</b>]]></name>\n");
    sb.append("<Folder>\n");
    
    addNetworkLinks(sb);
    
    sb.append("</Folder>\n");
    sb.append("</Document>\n");
    sb.append("</kml>\n");
    
    return sb.toString();
  }
  
  /**
   * iterate the kml or kmz links I want
   * 
   * @param sb
   */
  private void addNetworkLinks(StringBuilder sb) {
    for (int i=0; i < 3; i++) { 
      addNetworkLinks(sb, i);
    }
  }

  /**
   * get the network link
   * @param sb
   * @param i
   */
  private void addNetworkLinks(StringBuilder sb, int i) {
    sb.append("<NetworkLink>\n");
    sb.append("<Link>\n");
    sb.append("<href>" + getLink(i) + "</href>\n");
    sb.append("</Link>\n");
    sb.append("</NetworkLink>\n");
  }

  /**
   * you could get these from app engine query dynamically, using parameters from the querystring
   * @param index
   */
  private String getLink(int index) {
    if (example == null) {
      example = new String[3];
      
      // TODO some encoding of the querystring & has to take place and maybe other chars
      //example[0] = "http://sites.google.com/a/cyclingthealps.com/cyclingthealps/routes/Flueelapass.kmz?attredirects=0&d=1";
      
      example[0] = "http://sites.google.com/a/cyclingthealps.com/cyclingthealps/routes/Flueelapass.kmz?attredirects=0&amp;d=1";
      example[1] = "http://www.mappingsupport.com/p/gmap4/helpfile/County_Line_trail.kml";
      example[2] = "http://www.mappingsupport.com/p/gmap4/helpfile/Teanaway_Peaks.kml";
    }
    String s = example[index];
    return s;
  }

  /**
   * grab a parameter from the request query string http://domain.tld?id=[0-9]+
   * 
   * @param req
   * @param parameter
   * @return returns a long
   */
  private Long getParameterLong(HttpServletRequest req, String parameter) {
    String s = req.getParameter(parameter);
    if (s == null) {
      return null;
    }
    Long id = null;
    try {
      id = Long.parseLong(s);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
    return id;
  }
  
  
  
}


