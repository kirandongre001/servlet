package com.demo.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyCalculator")
public class MyCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		
		String choice= request.getParameter("s1");
		int result=0;
		RequestDispatcher rd=request.getRequestDispatcher("Calculate.html");
		switch(choice)
		{
		case "+":
			result=num1+num2;
			out.println("The sum of 2 Numbers is:"+" "+result);
			rd.include(request, response);
			break;
		case "-":
			result=num1-num2;
			out.println("The sub of 2 Numbers is:"+" "+result);
			rd.include(request, response);
			break;
		case "/":
			result=num1/num2;
			out.println("The division of 2 Numbers is:"+" "+result);
			rd.include(request, response);
			break;
		case "*":
			result=num1*num2;
			out.println("The Multiplication of 2 Numbers is:"+" "+result);
			rd.include(request, response);
			break;
		case "%":
			result=num1%num2;
			out.println("The Modulus of 2 Numbers is:"+" "+result);
			rd.include(request, response);
			break;
			
		}
		
//		
//		
	}

}
