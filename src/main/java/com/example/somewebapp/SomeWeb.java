package com.example.somewebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/message")
public class SomeWeb extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.print("<html><body><h2>Hello from Servlet (ver. 3.0)</h2></body></html>");
		out.print("<html><body><h3>A to juz moj tekst</h3></body></html>");
		out.close();
	}
}

