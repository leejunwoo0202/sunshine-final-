package sunshine.service.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.MemberMapper;
import sunshine.model.LoginInfo;
import sunshine.model.DTO.MemberDTO;

@Component
@Service
public class MemberDeleteService {

	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public String execute(String userPw,HttpSession session,
			Model model) {
		MemberDTO memberDTO = new MemberDTO();
		LoginInfo loginInfo =
				(LoginInfo)session.getAttribute("loginInfo");
		memberDTO.setMemId(loginInfo.getUserId());
		memberDTO = memberMapper.selectByMember(memberDTO.getMemId());
		if(passwordEncoder.matches(userPw,memberDTO.getMemPw())){
			memberMapper.deleteMember(memberDTO.getMemId());
			session.invalidate();
			return "redirect:/";
		}else {
			model.addAttribute("err","비밀번호가 틀렸습니다.");
			return "member/delete";
		}
				
		
		
	}
}
