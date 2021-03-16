package service.Auth;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import command.LoginCommand;
import model.AuthInfo;
import model.DTO.MemberDTO;

@Service
public class AuthService {      
   
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	BCryptPasswordEncoder bcryptPasswordEncoder;
	
	private AuthInfo authInfo;
	public void authenticate(
			LoginCommand loginCommand,Errors errors,
			    HttpSession session) {

		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setUserId(loginCommand.getLoginId());
		memberDTO = memberRepository.selectByMember(memberDTO);
		
		if(memberDTO == null) {
			errors.rejectValue("loginId", "notId");
		}else {
			if(bcryptPasswordEncoder.matches(loginCommand.getLoginPw(),
					memberDTO.getUserPw())) {
				authInfo = new AuthInfo(memberDTO.getUserId(),
						memberDTO.getUserEmail(),memberDTO.getUserName());
				session.setAttribute("authInfo", authInfo);
		}else {
			errors.rejectValue("loginPw","wrong");
		}
	}
}   
}

