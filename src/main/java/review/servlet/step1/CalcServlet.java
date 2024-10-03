package review.servlet.step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc.do")
public class CalcServlet extends HttpServlet {

	protected void doGet(HttpServletRequest reqruest, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest rq, HttpServletResponse rp) throws ServletException, IOException {
		int n1 = Integer.parseInt(rq.getParameter("num1"));
		int n2 = Integer.parseInt(rq.getParameter("num2"));
		String op = rq.getParameter("operator");
		int result = 0;
		
		if (op.equals("+")) {
			result = n1 + n2;
		} else if (op.equals("-")) {
			result = n1 - n2;
		} else if (op.equals("*")) {
			result = n1 * n2;
		} else if (op.equals("/")) {
			result = n1 / n2;
		}
		
		System.out.println("결과값 : "+result);
		
		rp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = rp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> 결과 </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> 계산 결과값 : " + result + " 입니다.</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
