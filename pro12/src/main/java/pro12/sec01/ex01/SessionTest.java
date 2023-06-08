package pro12.sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sess")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("name", "이순신");
		pw.println("<html><body>");
		pw.println("<h1>세션에 이름을 바인딩합니다.</ht>");
		pw.println("<a href='/pro12/Test01/session1.jsp'>첫 번째 페이지로 이동하기 </a>");
		pw.println("<body><html>");
		
	}
}