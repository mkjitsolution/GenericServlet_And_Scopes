package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletTwo
 */
public class MyServletTwo extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext applicationScope = getServletContext();
		ServletConfig pageScope = getServletConfig();
		
		String officeAdr = applicationScope.getInitParameter("office-adr");
		String tl = pageScope.getInitParameter("TL");
		String city = pageScope.getInitParameter("City");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // bcoz to print on browser
		
		out.print("<center><b> My Servlet Two <b></center><hr/>");
		out.print("<br>Data from Application Scope "+officeAdr);
		out.print("<br>Data from Page Scope TL "+tl);
		out.print("<br>Data from Page Scope "+city);
		
	}

	
}
