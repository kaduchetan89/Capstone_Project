package com.travels.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet   {


	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String mode=req.getParameter("modeoftraveling");
		
		String src=req.getParameter("source");
		String dest =  req.getParameter("destination");
		String date =  req.getParameter("depdate");
		
		if(mode.equals("flight")) {
			pw.println("I am happy to report success in booking you on a direct flight From "+src+" to "+dest+"  on "+date);
			pw.println("<br> Have a nice journey..............");
		}
		
		else if (mode.equals("Cab")) {
			pw.println("I am happy to report success in booking you on a Cab From "+src+" to "+dest+"  on "+date);
			pw.println("<br> Have a nice journey..............");
		}
		
		else {
			pw.println("<br> Invalid Selection.......");
		}
	}
	
	
	@Override
	public  void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}
	
	
}
