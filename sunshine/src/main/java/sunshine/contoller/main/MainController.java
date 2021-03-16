package sunshine.contoller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}
	
//<<<<<<< HEAD
	/*
	 * @RequestMapping(value = "signUp") public String main() { return "signUp"; }
	 */
//=======
	@RequestMapping(value = "signUp")
	public String main() {
		return "member/signUp";
	}
	
//>>>>>>> branch 'master' of https://github.com/leejunwoo0202/sunshine-final-.git
}

//주석은 ctrl + shift + c