package review.servlet.step2.common;

import java.util.HashMap;
import java.util.Map;

import com.servlet.second.user.JoinController;
import com.servlet.second.user.LoginController;
import com.servlet.second.user.LogoutController;


public class HandlerMapping {
	private Map<String, Controller> mappings;

	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		
		
		
		mappings.put("/login.do", new LoginController());
		mappings.put("/logout.do", new LogoutController());	
		mappings.put("/register.do", new JoinController());	
	}

	public Controller getController(String path) {  //"/login.do"
		return mappings.get(path);
	}
}

