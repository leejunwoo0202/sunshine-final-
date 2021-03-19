package sunshine.service.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sunshine.command.MemberPwCommand;
import sunshine.mapper.MemberMapper;
import sunshine.model.AuthInfo;
import sunshine.model.DTO.MemberDTO;

@Component
@Service
public class MemberPwModifyService {
    @Autowired
    MemberMapper memberMapper;
    @Autowired
    PasswordEncoder passwordEncoder;

    public void execute(MemberPwCommand memberPwCommand,
    		HttpSession session) {
    	MemberDTO memberDTO = new MemberDTO();
    	AuthInfo authInfo = 
    			(AuthInfo)session.getAttribute("authInfo");
    	System.out.println("loginInfo"+authInfo.getUserId());
    	
    	memberDTO.setMemId(authInfo.getUserId());
    	memberDTO = memberMapper.selectByMemberPw(memberDTO);
    	if(!passwordEncoder.matches(
    			memberPwCommand.getOldPw(),
    			memberDTO.getMemPw())){
    	}else {
    		memberDTO.setMemPw(
    				passwordEncoder.encode(
    						memberPwCommand.getNewPw()));
         memberMapper.pwUpdate(memberDTO);    		
    }
}
}
