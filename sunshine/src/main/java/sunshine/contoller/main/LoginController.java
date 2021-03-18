package sunshine.contoller.main;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sunshine.command.LoginCommand;
import sunshine.service.Auth.AuthService;

@Controller
@RequestMapping(value = "/")
public class LoginController {

	@Autowired
	AuthService authService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("loginCommand", new LoginCommand());
		return "member/login";
	}

	@RequestMapping(value = "loginPro", method = RequestMethod.POST)
	public String submit(LoginCommand loginCommand, HttpSession session, Model model) throws Exception {
		String location = authService.authenticate(loginCommand,session,model);
		
			return location;
	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

}
