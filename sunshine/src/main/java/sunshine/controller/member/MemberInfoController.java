
package sunshine.controller.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sunshine.command.LoginCommand;
import sunshine.command.MemberPwCommand;
import sunshine.service.Auth.AuthService;
import sunshine.service.member.MemberInfoService;
import sunshine.service.member.MemberPwModifyService;

@Controller
@RequestMapping("mem")
public class MemberInfoController {

	@Autowired
	MemberInfoService memberInfoService;

	@Autowired
	AuthService authService;

	@Autowired
	MemberPwModifyService memberPwModifyService;

	@RequestMapping("detail")
	public String memDetail(HttpSession session, Model model) {
		memberInfoService.execute(session, model);
		return "member/detail";

	}

	@RequestMapping("memberModify")
	public String memberModify(HttpSession session, Model model) {
		memberInfoService.execute(session, model);
		return "member/modify";
	}

	@RequestMapping("memberModifyPro")
	public String memberModifyPro(LoginCommand loginCommand, HttpSession session, Model model) throws Exception {
		String location = authService.authenticateLogin(loginCommand, session, model);

		return location;
	}

	@RequestMapping("memberModifyPro2")
	public String memberPwModifyPro2(MemberPwCommand memberPwCommand,
			HttpSession session) {
		memberPwModifyService.execute(memberPwCommand, session);

		return "member/detail";
	}

}
