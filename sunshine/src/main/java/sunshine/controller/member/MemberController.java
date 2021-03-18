package sunshine.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sunshine.command.MemberCommand;
import sunshine.service.member.MemberJoinService;

@Controller
@RequestMapping("register")
public class MemberController {

	@Autowired
	MemberJoinService memberJoinService;
	
	@RequestMapping(value = "regist", method = RequestMethod.GET)
	public String regist(Model model) {
		model.addAttribute("memberCommand",new MemberCommand());
		return "member/signUp";
	}
	
    @RequestMapping(value = "memberSignUpComplete", method = RequestMethod.POST)
    public String memberJoin(
    		MemberCommand memberCommand,
    		 Model model ) {
        	   
        	   memberJoinService.execute(memberCommand);
        	   return "member/memberSignUpComplete";
           }
    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String memberMain() {
    	return "member/main";
    }
    
}
