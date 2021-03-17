package sunshine.contoller.main;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sunshine.command.LoginCommand;
import sunshine.command.MemberCommand;
import sunshine.service.login.LoginService;

@Controller
@RequestMapping(value = "/")
public class LoginController {
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("loginCommand", new LoginCommand());
		return "member/login";
	}

	@RequestMapping(value = "loginPro", method = RequestMethod.POST)
	public String submit(LoginCommand loginCommand, 
			HttpSession session, Model model) throws Exception {
		String location = loginService.login(loginCommand, session, model);
		return location;

	}

}
