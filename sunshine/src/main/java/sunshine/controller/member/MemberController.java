package sunshine.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.member.MemberJoinService;
import sunshine.command.MemberCommand;

@Controller
@RequestMapping("register")
public class MemberController {

	@Autowired
	MemberJoinService memberJoinService;
	
//	@RequestMapping("agree")
//	public String agree() {
//		return "member/agree";
//	}
	
	@RequestMapping(value = "regist", method = RequestMethod.POST)
	public String regist(Model model) {
		model.addAttribute("memberCommand",new MemberCommand());
		return "member/memberForm";
	}
	
//	@RequestMapping(value = "memberJoin")
//	public String memberJoin(MemberCommand memberCommand,
//			   Errors errors, Model model) {
//		
//		if(errors.hasErrors()) {
//			return "member/memberForm";
//		}
//		memberJoinService.execute(memberCommand);
//		return "member/memberWelcome";
//	}
}
