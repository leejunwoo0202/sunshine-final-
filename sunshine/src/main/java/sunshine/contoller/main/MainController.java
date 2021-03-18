package sunshine.contoller.main;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@Controller
public class MainController {
	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = "main")
	public String main() {
		return "index";
	}
//<<<<<<< HEAD
	/*
	 * @RequestMapping(value = "signUp") public String main() { return "signUp"; }
	 */
//=======
	@RequestMapping(value = "signUp")
	public String signUp() {
		return "member/signUp";
	}
	
//>>>>>>> branch 'master' of https://github.com/leejunwoo0202/sunshine-final-.git
}

