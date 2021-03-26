package sunshine.service.Auth;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.command.LoginCommand;
import sunshine.mapper.LoginMapper;
import sunshine.mapper.MemberMapper;
import sunshine.model.LoginInfo;
@Component
@Service
public class AuthService {
	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	LoginMapper loginMapper;  
	
	@Autowired
	PasswordEncoder passwordEncoder;
	LoginInfo loginInfo;
    
	//로그인 
	public String authenticate(LoginCommand loginCommand, // id, pw (관리자/회원)
			HttpSession session, Model model) throws Exception{
		String location;
		loginInfo = loginMapper.loginUser(loginCommand.getLoginId());
		
		if (loginInfo == null) {
			model.addAttribute( "userFail","일치하지 않는 아이디");
			location = "member/login";
		}else {
			System.out.println( loginInfo.getUserId());
			if (passwordEncoder.matches(loginCommand.getLoginPw(), loginInfo.getUserPw())) {
				session.setAttribute("loginInfo", loginInfo);
				location = "redirect:/";
			} else {
				model.addAttribute( "pwFail" , "비밀번호가 틀렸습니다.");
				location = "member/login";
	
			}
		}
		return location;
	}
	
	//비밀번호 확인 로직
	public String authenticateLogin(LoginCommand loginCommand,
			HttpSession session,Model model)throws Exception{
	String location;
	
	
	if(passwordEncoder.matches(loginCommand.getLoginPw(),
			loginInfo.getUserPw())) {
			session.setAttribute("loginInfo", loginInfo);
	location = "member/modifyPro";
	}else {
		model.addAttribute("pwFail","비밀번호가 틀렸습니다.");
		location = "member/modify";
	}
	System.out.println("location:" + location);
	return location;
	
		
	
	
	}
	
}
