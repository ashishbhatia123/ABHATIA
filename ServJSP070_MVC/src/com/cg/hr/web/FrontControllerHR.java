package com.cg.hr.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("*.hr")
public class FrontControllerHR extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url=request.getRequestURI();
		String command =getCommand(url);
		String prefix="/WEB-INF/pages/";
				String postfix =".jsp";
		/*System.out.println(url);
				System.out.println(getCommand(url));*/
		RequestDispatcher dispatcher= null;
		String jspName=null;
		switch(command)
		{
		case "*":
		{
			
		}
		case "HomePage":
		{
			jspName= "Welcome";
			
			break;
		}
		case "getLoginPage" :
		{
			jspName ="Login";
			
			break;
		}
		case "authenticate" :
		{
			String userName= request.getParameter("UserName");
			String password= request.getParameter("password");
			if(userName.equals("aa") && password.equals("aa"))
			{
				HttpSession session = request.getSession(true); // if not then make session
				// either you write true or getSession() without parameter  is same 
				System.out.println(session.getId());
			session.setAttribute("fullname", "aa aaa aaaa");
			jspName= "MainMenu";
			}
			else
			{
				request.setAttribute("message", "Wrong userName and password");
				jspName ="Login";
			}
				
			break;
		}
		case "Logout" :
		{
			HttpSession session = request.getSession(false); //if not having session then not make session
			session.invalidate();
			jspName ="Thanks";
			
			break;
		}
		}
		dispatcher =request.getRequestDispatcher(prefix+jspName+postfix);
		dispatcher.forward(request, response);

		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	private String getCommand(String url)
	{
	//ServJSP070_MVC/HomePage.hr
		int idxSlash=url.lastIndexOf("/");
		int idxDot = url.lastIndexOf(".");
		if(idxDot<0)
		{
			return "HomePage ";
		}
		else {
		return url.substring(idxSlash+1,idxDot );
		}
		
}
}
