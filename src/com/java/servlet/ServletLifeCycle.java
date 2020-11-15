package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLifeCycle implements Servlet {

	private ServletConfig servletConfig = null;

	@Override // Servlet Life Cycle Method
	public void init(ServletConfig config) throws ServletException {
		this.servletConfig = config;
		System.out.println("Servlet has been loaded by the class loader and instantiated already!!!");
		System.out.println("init(ServletConfig config) method invoked!");
		System.out.println("Servlet Name: " + servletConfig.getServletName());
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.servletConfig;
	}

	@Override // Servlet Life Cycle Method
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service(ServletRequest req, ServletResponse res) method invoked!");
		// set content type for response
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<b>com.jcg.example.servlet.ServletLifeCycle Example</b>");
	}

	@Override
	public String getServletInfo() {
		return "Codedictator Servlet Life Cycle Example";
	}

	@Override // Servlet Life Cycle Method
	public void destroy() {
		System.out.println("destroy() method invoked!");
	}
}