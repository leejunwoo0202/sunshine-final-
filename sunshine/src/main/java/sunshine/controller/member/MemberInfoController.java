/*
 * package sunshine.controller.member;
 * 
 * import javax.servlet.http.HttpSession;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * import sunshine.service.member.MemberInfoService;
 * 
 * @Controller
 * 
 * @RequestMapping("mem") public class MemberInfoController {
 * 
 * @Autowired MemberInfoService memberInfoService;
 * 
 * 
 * 
 * 
 * @RequestMapping("memberPwModify") public String memberPwModify(
 * 
 * @RequestParam(value = "memPw") String memPw, HttpSession session, Model
 * model) { String path = memberInfoService.pwUpdate( memPw,session,model);
 * return path;
 * 
 * }
 * 
 * }
 */
