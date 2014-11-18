package com.geojir.wbs;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class GeoJIR_wbsServlet extends HttpServlet {

	  String[] listUsers = { "Martin,Joel", "Dupond,Marc", "Develt,Denis", "Fabre,Jean-Marc", "Duval,Pierre", "Garcia,José","Klein,Philippe","Reverso,Thierry" };
	  @Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException 
	  {
	      
		  resp.setContentType("application/json");
//	      resp.getWriter().println("\"Hello, welcome to GeoJIR's world (GET).\"");
	      for(int i = 0; i< listUsers.length; i++)
	      {
	    	  resp.getWriter().println(listUsers[i]);
	      }
	  }

	  @Override
	  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException 
	  {

	      if (req.getParameter("testing") != null) {
	          resp.setContentType("application/json");
	          resp.getWriter().println("\"Hello, welcome to GeoJIR's world (POST).\"");
	      } else {
		      resp.setContentType("application/json");
		      resp.getWriter().println("\"Hello, welcome to GeoJIR's world (POST).\"");
	      }
	  }
}
