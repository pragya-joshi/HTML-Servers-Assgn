package com.assgn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayFormDetails extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("emailId");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		String course=req.getParameter("course");
		String agreed=req.getParameter("agreement");
		System.out.println(agreed);
		PrintWriter out=res.getWriter();
		if(!(agreed==null)) {
			out.println("Welcome to Register Form Servlet");
			out.println("Name is "+name);
			out.println("Email is "+email);
			out.println("Gender is "+gender);
			out.println("Course Enrolled "+course);
		}
		else {
			out.println("Welcome to Register Servlet");
			out.println("You have not agreed to terms and conditions");
		}
	}
}