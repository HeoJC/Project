package com.mustacchio.briiiqtt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LikeItServlet")
public class LikeItServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LikeItServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String memberID = request.getParameter("memberID");
		String productID = request.getParameter("productID");
		
		LikeIt likeIt = new LikeIt();
		likeIt.setId(productID);
		likeIt.setWhoLikesIt(memberID);
		
		LikeItDAO dao = new LikeItDAO();
		boolean liked = dao.isLikeItAlreadyPressed(likeIt);
		if(liked) {
			out.print(1);
		} else {
			out.print(-1);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
