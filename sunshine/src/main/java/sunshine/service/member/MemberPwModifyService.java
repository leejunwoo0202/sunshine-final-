package sunshine.service.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sunshine.command.MemberPwCommand;
import sunshine.mapper.MemberMapper;
import sunshine.model.LoginInfo;
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
    	LoginInfo loginInfo = 
    			(LoginInfo)session.getAttribute("loginInfo");
    	// 내정보 보기
    	memberDTO = memberMapper.selectByMember(loginInfo.getUserId());
    	if(!passwordEncoder.matches(
    			memberPwCommand.getOldPw(),memberDTO.getMemPw())){
    		// 패스워드가 일치 하지 않은 경우
    		
    	}else {
    		// 패스워드가 일치 한 경우해 야할 코드 삭정
    		memberDTO.setMemPw(
    				passwordEncoder.encode(
    						memberPwCommand.getNewPw()));
    		memberMapper.pwUpdate(memberDTO);    		
    }
}
}
