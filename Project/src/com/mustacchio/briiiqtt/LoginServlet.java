package com.mustacchio.briiiqtt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charSet=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String memberID = request.getParameter("memberID");
		String memberPW = request.getParameter("memberPW");
		MemberDAO dao = new MemberDAO();
		Member loggedIn = dao.login(memberID,memberPW);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		if (loggedIn == null) {
			 request.setAttribute("loginRequest", "logInError");
			 dispatcher.forward(request, response);
		} else {
			request.setAttribute("loginRequest", "loggedIn");
			request.setAttribute("sessionID", loggedIn.getMemberID());
			request.setAttribute("sessionPW", loggedIn.getMemberPW());
			request.setAttribute("sessionName", loggedIn.getMemberName());
			request.setAttribute("sessionEMail", loggedIn.getMemberEMail());
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
