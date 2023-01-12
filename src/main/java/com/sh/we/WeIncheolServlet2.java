package com.sh.we;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WeIncheolServlet2
 */
@WebServlet("/hello2")
public class WeIncheolServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter()
		.append("Served at: ")
		.append(request.getContextPath())
		.append("배고파요 점심 뭐 먹을까요?");

	}
}
