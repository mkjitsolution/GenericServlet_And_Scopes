package p1;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class GenericServletDemo
 */
public class GenericServletDemo extends GenericServlet {

	@Override
	public void destroy() {
		System.out.println(" Application Undeployed");
	}

	@Override
	public void init() throws ServletException {
		System.out.println(" Application Deployed ");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println(" Req to Service method");
		
	}

	

}
