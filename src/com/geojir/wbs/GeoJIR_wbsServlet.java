package com.geojir.wbs;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GeoJIR_wbsServlet extends HttpServlet {
	
	  @Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException 
	  {
	      resp.setContentType("application/json");
	      resp.getWriter().println("\"Hello, wellcome to GeoJIR's world (GET).\"");
	  }

	  @Override
	  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException 
	  {

	      if (req.getParameter("testing") != null) {
	          resp.setContentType("application/json");
	          resp.getWriter().println("\"Hello, wellcome to GeoJIR's world (POST).\"");
	      } else {
		      resp.setContentType("application/json");
		      resp.getWriter().println("\"Hello, wellcome to GeoJIR's world (POST).\"");
	      }
	  }
}
