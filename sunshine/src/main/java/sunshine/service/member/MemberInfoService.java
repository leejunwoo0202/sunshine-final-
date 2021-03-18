
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
public class MemberInfoService {

	@Autowired
	MemberMapper memberMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
    
	public void execute(HttpSession session, Model model) {
		MemberDTO memberDTO = new MemberDTO();
		LoginInfo loginInfo = (LoginInfo) session.getAttribute("loginInfo");
		System.out.println(loginInfo.getUserId());
		MemberDTO dto = memberMapper.selectByMember(loginInfo.getUserId());
		System.out.println(dto.getMemId());
		model.addAttribute("memDto", dto);
	}
}







