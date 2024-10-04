package review.step2.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import review.servlet.step2.common.Controller;

public class JoinController implements Controller {
	
	@Override	
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		String name = request.getParameter("name");
		String role = request.getParameter("role");

		MemberDto mDto = new MemberDto();
		mDto.setId(id);
		mDto.setPassword(pw);
		mDto.setName(name);
		mDto.setRole(role);		
		
		MemberDao mDao = new MemberDao();	
		boolean insertCheck = mDao.memberInsert(mDto);

	    if(insertCheck){
	    	request.setAttribute("joinResult", insertCheck);
			HttpSession session = request.getSession();
			session.setAttribute("idKey", id);
			return "Index";

		}else{
	    	request.setAttribute("joinResult", 0);
	    	return "Register";
		}		
		
		
	}
	
		
	
}
