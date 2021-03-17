package sunshine.service.login;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.command.LoginCommand;
import sunshine.mapper.MemberMapper;
import sunshine.model.AuthInfo;
import sunshine.model.DTO.MemberDTO;

@Component
@Service
public class LoginService {

	@Autowired
	MemberMapper memberMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	
	AuthInfo authInfo;
	
	public String login(LoginCommand loginCommand,
			HttpSession session,Model model)throws Exception{
		String location = "";
		MemberDTO member = new MemberDTO();
		member.setMemId(loginCommand.getLoginId());
		List<MemberDTO> lists = null;
		lists = memberMapper.selectByMember(member);
		
		if(lists.size() == 0) {
			model.addAttribute("valid_mem","아이디가 존재하지 않습니다.");
			location = "member/index";
		
			
			if(passwordEncoder.matches(loginCommand.getLoginPw(),
					lists.get(0).getMemPw())) {
				authInfo = new AuthInfo(lists.get(0).getMemId(),
						lists.get(0).getMemEmail(),
						lists.get(0).getMemName());
				session.setAttribute("authInfo", authInfo);
				location = "redirect:/";
		}else {
			model.addAttribute("valid_pw","비밀번호가 틀립니다.");
			location = "member/index";
		}
		
	}

return location;
		
		
		
		
	}
}
