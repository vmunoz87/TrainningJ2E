package com.vmz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Test extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		/* la JSP est mise dans le WEB-INF => Non accéssible directement depuis le client
		 * la Servlet redirige le couple Request/Response vers la JSP. Ainsi, la ressource est accessible par le client via la servlet (config dans le web.xml)
		 * Dans ce cas, localhost:8080/test/toto
		 * */
		this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );			}
}