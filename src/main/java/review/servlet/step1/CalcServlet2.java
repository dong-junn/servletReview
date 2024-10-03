package review.servlet.step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc2.do")
public class CalcServlet2 extends HttpServlet {

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
		
		HttpSession session = rq.getSession();
		session.setAttribute("resultData", result);
		RequestDispatcher dispatcher = rq.getRequestDispatcher("CalcResult.jsp");
		dispatcher.forward(rq, rp);
	}

}
