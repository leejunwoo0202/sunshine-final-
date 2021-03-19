package sunshine.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sunshine.command.MemberCommand;
import sunshine.mapper.MemberMapper;
import sunshine.model.DTO.MemberDTO;

@Component   
@Service
public class MemberJoinService {

	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	MemberMapper memberMapper;
	
	@SuppressWarnings("deprecation")
	public void execute(MemberCommand memberCommand) {
		MemberDTO memberDTO = new MemberDTO();
		Integer result = null;
		//정보 받아오기
		memberDTO.setMemName(memberCommand.getMemName());
		memberDTO.setMemId(memberCommand.getMemId());
		memberDTO.setMemPhone(memberCommand.getMemPhone());
		memberDTO.setMemEmail(memberCommand.getMemEmail());
		memberDTO.setMemAddr(memberCommand.getMemAddr());
		memberDTO.setMemRegist((memberCommand.getMemRegist()));
		memberDTO.setMemResidentNum(memberCommand.getMemResidentNum());
		//비밀번호 받아오기
		String pw = passwordEncoder.encode(memberCommand.getMemPw());
		memberDTO.setMemPw(pw);
		
		result = memberMapper.insertMember(memberDTO);
	}
}

