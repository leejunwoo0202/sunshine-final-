package sunshine.service.emReview;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import sunshine.command.MemberPwCommand;
import sunshine.mapper.EmployeeMapper;
import sunshine.mapper.MemberMapper;
import sunshine.mapper.ReviewMapper;
import sunshine.model.LoginInfo;
import sunshine.model.DTO.EmployeeDTO;
import sunshine.model.DTO.MemberDTO;
import sunshine.model.DTO.ReplyCommand;
import sunshine.model.DTO.ReplyDTO;

@Service
public class EmReviewInsertService {

	@Autowired
	ReviewMapper reviewMapper;

	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired 
	EmployeeMapper employeeMapper;
	
	
	public void reviewInsert(
			
			ReplyCommand replyCommand, HttpSession session,
			MemberPwCommand memberPwCommand) {
		
		MemberDTO memberDTO = new MemberDTO();
    	LoginInfo loginInfo = 
    			(LoginInfo)session.getAttribute("loginInfo");

    	System.out.println(memberPwCommand.getOldPw());
    	System.out.println(memberDTO.getMemPw());
    	System.out.println(loginInfo.getUserId());
    	EmployeeDTO employeeDTO = new EmployeeDTO();
    	String emId = loginInfo.getUserId();
    	employeeDTO = employeeMapper.selectByEmployee(emId);
    	
    	if(!passwordEncoder.matches(
    			memberPwCommand.getOldPw(),employeeDTO.getEmPw())){
    		// 패스워드가 일치 하지 않은 경우
    		System.out.println("패스워드 불일치");
    	}else {
    		// 패스워드가 일치 한 경우 해야할 코드 삭정
    		System.out.println("패스워드 일치");   
    		ReplyDTO replyDTO = new ReplyDTO();
    		replyDTO.setBoardNo(replyCommand.getBoardNo());
    		replyDTO.setEmId(replyCommand.getEmId());
    		replyDTO.setReplyContent(replyCommand.getReplyContent());
    		
    		System.out.println("1"+replyCommand.getBoardNo());
    		System.out.println("2"+replyCommand.getEmId());
    		System.out.println("3"+replyCommand.getReplyContent());
    		
    		reviewMapper.insertReviewEm(replyDTO);
    		
    		
    				
    }
	}
	

}
