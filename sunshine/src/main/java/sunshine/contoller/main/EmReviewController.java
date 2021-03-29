package sunshine.contoller.main;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sunshine.command.EmployeeCommand;
import sunshine.command.MemberPwCommand;
import sunshine.model.DTO.ReplyCommand;
import sunshine.service.emReview.EmReviewInsertService;

@Controller
@RequestMapping("reviewEm")
public class EmReviewController {
	
	@Autowired
	EmReviewInsertService emReviewInsertService;
	
	@RequestMapping("emAnswer")
	public String emAnswer(
			
			ReplyCommand replyCommand,HttpSession session
			,MemberPwCommand memberPwCommand) {
		    emReviewInsertService.reviewInsert(
		    		replyCommand,
		    		session,memberPwCommand);
		    		
		return "redirect:/review/reviewList";
	}
	


	
}
