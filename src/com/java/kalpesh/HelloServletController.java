package com.java.kalpesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		resp.setContentType("text/html");
		try {
			PrintWriter out = resp.getWriter();
			out.println("<html><body>");
			out.println("Hello Kalpesh!");
			out.println("<a href='https://www.youtube.com/channel/UCWnMX1pam6Vncf5hnrbKPzw'>Codedictator</a>");
			out.println("</body></html>");
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
