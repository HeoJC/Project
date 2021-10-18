package com.mustacchio.briiiqtt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Gson gson = new GsonBuilder().create();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charSet=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String memberID = request.getParameter("memberID");
		String memberPW = request.getParameter("memberPW");
		MemberDAO dao = new MemberDAO();
		Member loggedIn = dao.login(memberID,memberPW);
		
		if (loggedIn == null) {
			System.out.println("쿼리결과 없음");
			out.println(gson.toJson(0));
			response.addCookie(new Cookie("memberID", null));
			response.addCookie(new Cookie("memberName", null));
			response.addCookie(new Cookie("memberEMail", null));
		} else {
			System.out.println(loggedIn.getMemberID()+"로 로그인");
			out.println(gson.toJson(1));
			response.addCookie(new Cookie("memberID", loggedIn.getMemberID()));
			response.addCookie(new Cookie("memberName", loggedIn.getMemberName()));
			response.addCookie(new Cookie("memberEMail", loggedIn.getMemberEMail()));
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
