package sunshine.service.Auth;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.command.LoginCommand;
import sunshine.mapper.LoginMapper;
import sunshine.model.LoginInfo;
@Component
@Service
public class AuthService {
	@Autowired
	LoginMapper loginMapper;  
	@Autowired
	PasswordEncoder passwordEncoder;
	LoginInfo loginInfo;

	public String authenticate(LoginCommand loginCommand, // id, pw (관리자/회원)
			HttpSession session, Model model) throws Exception{
		String location;
		loginInfo = loginMapper.loginUser(loginCommand.getLoginId());
		if (loginInfo == null) {
			model.addAttribute("일치하지 않는 아이디", loginInfo);
			location = "main";
		}

		if (passwordEncoder.matches(loginCommand.getLoginId(), loginInfo.getUserId())) {
			session.setAttribute("로그인 성공", loginInfo);
			location = "redirect:/";
		} else {
			model.addAttribute("로그인 실패", loginInfo);
			location = "index";

		}
		return location;

	}
}
