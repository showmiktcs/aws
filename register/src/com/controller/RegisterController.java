package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DbTransaction;
import com.pojo.RegisterDetails;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("confirmpassword");
		String email=request.getParameter("email");
		
		RegisterDetails rd=new RegisterDetails();
		rd.setUsername(username);
		rd.setPassword(password);
		rd.setConfirmpassword(confirmpassword);
		rd.setEmail(email);
		
		DbTransaction db=new DbTransaction();
		
		int i=db.insert(rd);
		if (i > 0) {
			response.sendRedirect("http://ec2-35-154-30-193.ap-south-1.compute.amazonaws.com/RegisterSuccess.jsp");

		} else {
			
			response.sendRedirect("http://ec2-35-154-30-193.ap-south-1.compute.amazonaws.com/RegisterFailure.jsp");

		
		}
	}

}
