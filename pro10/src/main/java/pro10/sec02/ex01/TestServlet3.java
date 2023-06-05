package pro10.sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class TestServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String context =request.getContextPath();
		String url =request.getRequestURL().toString();
		String mapping = request.getServletPath();
		String uri = request.getRequestURI();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Test Servlet</title>");
		out.println("</head>");
		out.println("<body bgcolor='red'>");
		out.println("<b>TestServlet1입니다.</b><br>");
		out.println("<b>컨텍스트 이름: " + context + "</b><br>");
		out.println("<b>전체 경로 : " + url + "<b><br>");
		out.println("<b>매핑 이름 : " +mapping+ "<b><br>");
		out.println("<b>URI : " + uri + "<b>");
		out.println("</body>");
		out.println("<html>");
		out.close();
		
	}

}
