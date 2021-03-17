package sunshine.service.member;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sunshine.command.MemberCommand;
import sunshine.model.DTO.MemberDTO;
import sunshine.repository.member.MemberRepository;

@Component
@Service
public class MemberJoinService {

//	@Autowired
//	BCryptPasswordEncoder bcryptPasswordEncoder;
	@Autowired
	MemberRepository memberRepository;
	
	
	public Integer numUpdate(String receiver, String userId) {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setUserId(receiver);
		memberDTO.setUserId(userId);
		return memberRepository.joinOkUpdate(memberDTO);
	}
	
	@SuppressWarnings("deprecation")
	public void execute(MemberCommand memberCommand) {
		MemberDTO memberDTO = new MemberDTO();
		Integer result = null;
		//정보 받아오기
		memberDTO.setUserName(memberCommand.getUserName());
		memberDTO.setUserId(memberCommand.getUserId());
		memberDTO.setUserPhone(memberCommand.getUserPhone());
		memberDTO.setUserEmail(memberCommand.getUserEmail());
		memberDTO.setUserAddr(memberCommand.getUserAddr());
		memberDTO.setUserRegist((memberCommand.getUserRegist()));
		memberDTO.setUserResidentNum(memberCommand.getUserResidentNum());
		//비밀번호 받아오기
//		String pw = bcryptPasswordEncoder.encode(memberCommand.getUserPw());
//		memberDTO.setUserPw(pw);
		
		result = memberRepository.insertMember(memberDTO);
		if(result != null) {
			SimpleDateFormat dateForm = new SimpleDateFormat("yyyyMMddHHmmss");
			String num = dateForm.format(new Date());
			String subject = "가입환영인사";
			String content = "안녕하세요. '" 
					+  memberDTO.getUserName()
					+ "'님 가입을 환영합니다.<br />"
					+ "<a href='http://192.168.0.90:8080/SpringMybatisMVCProject/"
					+ "register/memberMail?num="+ num +"&receiver="
					+ memberDTO.getUserEmail() +"&userId="
					+ memberDTO.getUserId()+ "'>"
					+ "가입을 완료하시려면 여기를 눌러주세요.</a>";
			String content1 = "안녕하세요. '" 
					+  memberDTO.getUserName()
					+ "'님 가입을 환영합니다.\n"
					+ "http://192.168.0.90:8080/SpringMybatisMVCProject/"
					+ "register/memberMail?num="+ num +"&receiver="
					+ memberDTO.getUserEmail() +"&userId="
					+ memberDTO.getUserId() + "\n"
					+ "가입을 완료하시려면 위 주소를 눌러주세요.";
			
			
			
		}
	}

		
		
		
	}

