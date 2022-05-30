package br.com.hello.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	//service � responsavel por executar as informa��es da servlet
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print ("Hello World! Parabens meninas! Nossa primeira servlet");
		out.print("</body>");
		out.print("</html>");
		
	}

}
